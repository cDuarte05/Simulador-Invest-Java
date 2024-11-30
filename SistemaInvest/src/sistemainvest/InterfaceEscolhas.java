package sistemainvest;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.*;
import javax.swing.*;
public class InterfaceEscolhas extends javax.swing.JFrame {
    String nome = InterfaceIdent.nomeUsuario;
    String codigo = InterfaceIdent.idUsuario;
    SpinnerNumberModel modeloInicial = new SpinnerNumberModel(0d, 0d, 100000000d,0.01d);
    SpinnerNumberModel modeloIncremento = new SpinnerNumberModel(0d, -100000000d, 100000000d,0.01d);
    SpinnerNumberModel modeloMeses = new SpinnerNumberModel (0, 0, 100000,1);
    DecimalFormat formatoDecimal = new DecimalFormat("#.##"); 
    public static int meses;
    public static double inicial;
    public static double incremento;    
        
    public InterfaceEscolhas() throws ParseException {    
        initComponents();

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
                            .addComponent(labelMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spinnerIncremento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(spinnerInicial, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoMeses, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(botaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoContinuar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
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
        if (opcaoSeguro.isSelected()) {// variação 0.4% -> 1%
            System.out.println("Opcao segura");
            ResultadoSimulacao resultado = Calcs.option1(meses,incremento,inicial);
            System.out.println ("Valor Final: R$ " + formatoDecimal.format(resultado.investimentoFinal));
            for (int i = 0; i < meses; i++) {
                System.out.println ("Variacao Mes " + (i + 1) + " - " + formatoDecimal.format(((resultado.porcentagens[i] - 1) * 100))+ "%");
            }
        }
        if (opcaoIntermediario.isSelected()) {// variação 0% -> 2%
            System.out.println("Opcao intermediaria");
            ResultadoSimulacao resultado = Calcs.option2(meses,incremento,inicial);
            System.out.println ("Valor Final: R$ " + formatoDecimal.format(resultado.investimentoFinal));
            for (int i = 0; i < meses; i++) {
                System.out.println ("Variacao Mes " + (i + 1) + " - " + formatoDecimal.format(((resultado.porcentagens[i] - 1) * 100)) + "%");
            }            
            
        }
        if (opcaoArriscado.isSelected()) {// variação -10% -> 15%
            System.out.println("Opcao arriscada");
            ResultadoSimulacao resultado = Calcs.option3(meses,incremento,inicial);
            System.out.println ("Valor Final: R$ " + formatoDecimal.format(resultado.investimentoFinal));
            
            for (int i = 0; i < meses; i++) {
                System.out.println ("Variacao Mes " + (i + 1) + " - " + formatoDecimal.format(((resultado.porcentagens[i] - 1) * 100))+ "%");
            }
        }
        TestChartClass.newCandleChart();
//        dispose();
    }//GEN-LAST:event_botaoContinuarActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEscolhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfaceEscolhas().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(InterfaceEscolhas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

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
