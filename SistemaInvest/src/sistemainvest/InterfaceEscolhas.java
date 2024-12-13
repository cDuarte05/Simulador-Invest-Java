package sistemainvest;
import java.text.ParseException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.*;
import javax.swing.*;
public class InterfaceEscolhas extends javax.swing.JFrame {
    private final SpinnerNumberModel modeloInicial = new SpinnerNumberModel(0d, 0d, 100000000d,0.01d);
    private final SpinnerNumberModel modeloIncremento = new SpinnerNumberModel(0d, -100000000d, 100000000d,0.01d);
    private final SpinnerNumberModel modeloMeses = new SpinnerNumberModel (1, 1, 2400,1);
    private final DecimalFormat formatoDecimal = new DecimalFormat("##.00"); 
    private final TestChartClass chart = new TestChartClass();
    private final TelaResultados telaResultado = new TelaResultados();
    
    public static String nome;
    public static String codigo;
    public static ResultadoSimulacao resultado = new ResultadoSimulacao();
    public static int meses;
    public static double inicial;
    public static double incremento;
    public static int opt;
        
    public InterfaceEscolhas() throws ParseException {
        initComponents();
        setLocationRelativeTo(null);
        nome = InterfaceIdent.nomeUsuario;
        codigo = InterfaceIdent.idUsuario;
        nomeUsuario.setText("Título: " + nome);
        idUsuario.setText("Codigo: " + codigo);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRisco = new javax.swing.ButtonGroup();
        botaoContinuar = new javax.swing.JButton();
        labelMeses = new javax.swing.JLabel();
        labelValorInicial = new javax.swing.JLabel();
        labemIncremento = new javax.swing.JLabel();
        labelFaixaRisco = new javax.swing.JLabel();
        opcaoSeguro = new javax.swing.JRadioButton();
        opcaoIntermediario = new javax.swing.JRadioButton();
        opcaoArriscado = new javax.swing.JRadioButton();
        nomeUsuario = new javax.swing.JLabel();
        idUsuario = new javax.swing.JLabel();
        spinnerInicial = new javax.swing.JSpinner(modeloInicial);
        spinnerIncremento = new javax.swing.JSpinner(modeloIncremento);
        campoMeses = new javax.swing.JSpinner(modeloMeses);
        botaoHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoContinuar.setText("Gerar Gráfico");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        labelMeses.setText("Meses de simulacao:");

        labelValorInicial.setText("Valor Inicial:");

        labemIncremento.setText("Incrementos Mensais:");

        labelFaixaRisco.setText("Faixas de Risco:");

        grupoRisco.add(opcaoSeguro);
        opcaoSeguro.setText("Seguro");

        grupoRisco.add(opcaoIntermediario);
        opcaoIntermediario.setText("Intermediario");

        grupoRisco.add(opcaoArriscado);
        opcaoArriscado.setText("Arriscado");

        nomeUsuario.setText("Título: [título]");

        idUsuario.setText("Código: [código]");

        botaoHelp.setText("?");
        botaoHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labemIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(opcaoSeguro)
                                        .addGap(11, 11, 11)
                                        .addComponent(opcaoIntermediario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opcaoArriscado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(botaoHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFaixaRisco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMeses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerIncremento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoContinuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nomeUsuario)
                .addGap(2, 2, 2)
                .addComponent(idUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMeses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labemIncremento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFaixaRisco)
                    .addComponent(botaoHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoIntermediario)
                    .addComponent(opcaoArriscado)
                    .addComponent(opcaoSeguro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        System.out.println("Nome - " + nome);
        System.out.println("ID - " + codigo);
        System.out.println("Meses: " + campoMeses.getValue().toString());
        System.out.println("Valor Inicial: R$ " + spinnerInicial.getValue());
        System.out.println("Valor de Incremento: R$ " + spinnerIncremento.getValue());
        meses = Integer.parseInt(campoMeses.getValue().toString());
        inicial = Double.parseDouble(spinnerInicial.getValue().toString());
        incremento = Double.parseDouble(spinnerIncremento.getValue().toString());
                       
        if (opcaoSeguro.isSelected()) {opt = 1;}        
        if (opcaoIntermediario.isSelected()) {opt = 2;}     
        if (opcaoArriscado.isSelected()) {opt = 3;}
        
        resultado = Calcs.runCalcs(opt,meses,incremento,inicial); 
        System.out.println ("Valor Final: R$ " + formatoDecimal.format(resultado.investimentoFinal));
        for (int i = 0; i < meses; i++) {
            System.out.println ("Variacao Mes " + (i + 1) + " - " + formatoDecimal.format(((resultado.porcentagens[i] - 1) * 100))+ "%");
        }
        if (TestChartClass.frame == null) {
            chart.newCandleChart();
        } else {
            TestChartClass.frame.removeAll();
            TestChartClass.frame.dispose();
            chart.newCandleChart();
        }
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        setLocation(30, (int)(height/2) - (getSize().height / 4));
        telaResultado.setValues();
        telaResultado.setLocation (30,((int)(height/2) - getSize().height) + 10);
        telaResultado.setVisible(true);
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void botaoHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHelpActionPerformed
        JOptionPane.showMessageDialog(null, "As faixas de risco funcionam\nda seguinte maneira:\n"
                + "\nSegura: -2% -> 8%\n"
                + "Intermediária: -6 -> 12%\n"
                + "Arriscada: -15% -> 25%");
    }//GEN-LAST:event_botaoHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton botaoContinuar;
    private static javax.swing.JButton botaoHelp;
    private static javax.swing.JSpinner campoMeses;
    private static javax.swing.ButtonGroup grupoRisco;
    private static javax.swing.JLabel idUsuario;
    private static javax.swing.JLabel labelFaixaRisco;
    private static javax.swing.JLabel labelMeses;
    private static javax.swing.JLabel labelValorInicial;
    private static javax.swing.JLabel labemIncremento;
    private static javax.swing.JLabel nomeUsuario;
    private static javax.swing.JRadioButton opcaoArriscado;
    private static javax.swing.JRadioButton opcaoIntermediario;
    private static javax.swing.JRadioButton opcaoSeguro;
    private static javax.swing.JSpinner spinnerIncremento;
    private static javax.swing.JSpinner spinnerInicial;
    // End of variables declaration//GEN-END:variables
}
