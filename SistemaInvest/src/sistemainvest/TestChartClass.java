package sistemainvest;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.data.xy.DefaultHighLowDataset;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;

public class TestChartClass extends javax.swing.JFrame {
public static JFrame frame = new JFrame("Gráfico Candlestick");
private static final DecimalFormat formatoDecimal = new DecimalFormat("##.00"); 
public static int idInvest;
    public static void newCandleChart() {
        SwingUtilities.invokeLater(() -> {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            
            JPanel buttonPanel = createButtonPanel();
            JPanel chartPanel = createChartPanel();
            
            frame.add(chartPanel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            
//            frame.pack();
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    
     public static JPanel createChartPanel() {
        int monthsCounter = InterfaceEscolhas.meses;
        int year = 2024;
        int month = 0;
        double high[] = new double[InterfaceEscolhas.meses];
        double low[] = new double[InterfaceEscolhas.meses];
        double open[] = new double[InterfaceEscolhas.meses];
        double close[] = new double[InterfaceEscolhas.meses];
        double volume[] = new double[InterfaceEscolhas.meses];
        // Dados fictícios
        Date[] dates = new Date[InterfaceEscolhas.meses];   
        while (monthsCounter > 0) {
            dates[monthsCounter - 1] = new Date(year - 1900, month, 1);
            low[monthsCounter - 1] = Calcs.valorMesInicial[monthsCounter - 1] - 500;
            high[monthsCounter - 1] = Calcs.valorMesFinal[monthsCounter - 1] + 500;
            open[monthsCounter - 1] = Calcs.valorMesInicial[monthsCounter - 1];
            close[monthsCounter - 1] = Calcs.valorMesFinal[monthsCounter - 1];
            volume[monthsCounter - 1] = (((Calcs.valorMesFinal[monthsCounter - 1] + Calcs.valorMesInicial[monthsCounter - 1]) / 2) * 2) + InterfaceEscolhas.incremento;
            if (month != 11) {
                month++;
            } else {
                month = 0;
                year++;
            }
            monthsCounter--;
        }

        DefaultHighLowDataset dataset = new DefaultHighLowDataset("Ações XYZ", dates, high, low, open, close, volume );

        // Criando o gráfico
        JFreeChart candlestickChart = createCandlestickChart(dataset);
        return new ChartPanel(candlestickChart);
    }
     
     public static JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();

        JButton saveButton = new JButton("Guardar Simulação");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AdmDataBase.insertUser(InterfaceEscolhas.nome, Integer.parseInt(InterfaceEscolhas.codigo));
                } catch (SQLException ex) {
                    System.out.println("Erro ao inserir usuário: " + ex.getMessage());
                }
                try {
                    idInvest = AdmDataBase.insertInves(Integer.parseInt(InterfaceEscolhas.codigo),InterfaceEscolhas.meses, InterfaceEscolhas.inicial, InterfaceEscolhas.incremento, InterfaceEscolhas.resultado.investimentoFinal);
                } catch (SQLException ex) {
                    System.out.println("Erro ao inserir dados da simulação: " + ex.getMessage());
                }
                try {
                    AdmDataBase.variacoes (Integer.parseInt(InterfaceEscolhas.codigo), idInvest, InterfaceEscolhas.resultado.porcentagens);
                } catch (SQLException ex) {
                    System.out.println("Erro ao inserir variações da simulação: " + ex.getMessage());
                }
            }
        });

        buttonPanel.add(saveButton);
        return buttonPanel;
    }
     
     public static JFreeChart createCandlestickChart(DefaultHighLowDataset dataset) {
        NumberAxis yAxis = new NumberAxis("Preço");
        yAxis.setAutoRangeIncludesZero(false); // Evita incluir zero no gráfico

        DateAxis xAxis = new DateAxis("Data");
        xAxis.setDateFormatOverride(new SimpleDateFormat("dd-MMM-yyyy"));

        CandlestickRenderer renderer = new CandlestickRenderer();
        renderer.setCandleWidth(8);
        renderer.setAutoWidthMethod(CandlestickRenderer.WIDTHMETHOD_AVERAGE); // Largura média
        renderer.setAutoWidthGap(50); // Define o espaço entre as velas
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);

        return new JFreeChart("Gráfico Candlestick - Ações XYZ", JFreeChart.DEFAULT_TITLE_FONT, plot, false);
    }
}

