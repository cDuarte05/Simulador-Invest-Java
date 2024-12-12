package sistemainvest;
import java.text.ParseException;
import java.text.*;
import javax.swing.*;
public class InterfaceEscolhas extends javax.swing.JFrame {
    private final SpinnerNumberModel modeloInicial = new SpinnerNumberModel(0d, 0d, 100000000d,0.01d);
    private final SpinnerNumberModel modeloIncremento = new SpinnerNumberModel(0d, -100000000d, 100000000d,0.01d);
    private final SpinnerNumberModel modeloMeses = new SpinnerNumberModel (0, 0, 2400,1);
    private final DecimalFormat formatoDecimal = new DecimalFormat("#.##"); 
    private final TestChartClass chart = new TestChartClass();
    
    public static String nome = InterfaceIdent.nomeUsuario;
    public static String codigo = InterfaceIdent.idUsuario;
    public static int meses;
    public static double inicial;
    public static double incremento;
    public static int opt;
    public static boolean tracker = false;
        
    public InterfaceEscolhas() throws ParseException {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        nomeUsuario.setText("Ola! " + nome);
        idUsuario.setText("Codigo: " + codigo);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRisco = new javax.swing.ButtonGroup();
        botaoContinuar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoContinuar.setText("Continuar");
        botaoContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
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

        nomeUsuario.setText("Olá!  [usuário]");

        idUsuario.setText("Código: [código]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(opcaoSeguro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opcaoIntermediario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(opcaoArriscado))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labemIncremento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelValorInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(labelFaixaRisco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(botaoCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoContinuar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoMeses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerIncremento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFaixaRisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcaoSeguro)
                    .addComponent(opcaoIntermediario)
                    .addComponent(opcaoArriscado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoContinuar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        if (chart.frame != null) {
            chart.frame.dispose();
        }
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        System.out.println("Nome - " + nome);
        System.out.println("ID - " + codigo);
        System.out.println("Meses: " + campoMeses.getValue().toString());
        System.out.println("Valor Inicial: R$ " + spinnerInicial.getValue());
        System.out.println("Valor de Incremento: R$ " + spinnerIncremento.getValue());
        meses = Integer.parseInt(campoMeses.getValue().toString());
        inicial = Double.parseDouble(spinnerInicial.getValue().toString());
        incremento = Double.parseDouble(spinnerIncremento.getValue().toString());
        
        ResultadoSimulacao resultado = new ResultadoSimulacao();        
        if (opcaoSeguro.isSelected()) {opt = 1;}        
        if (opcaoIntermediario.isSelected()) {opt = 2;}     
        if (opcaoArriscado.isSelected()) {opt = 3;}
        
        resultado = Calcs.runCalcs(opt,meses,incremento,inicial); 
        System.out.println ("Valor Final: R$ " + formatoDecimal.format(resultado.investimentoFinal));
        for (int i = 0; i < meses; i++) {
            System.out.println ("Variacao Mes " + (i + 1) + " - " + formatoDecimal.format(((resultado.porcentagens[i] - 1) * 100))+ "%");
        }
        if (tracker) {
            chart.frame.dispose();
            chart.newCandleChart();
        } else {
            chart.newCandleChart();
            tracker = false;
        }
    }//GEN-LAST:event_botaoContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton botaoCancelar;
    private static javax.swing.JButton botaoContinuar;
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
