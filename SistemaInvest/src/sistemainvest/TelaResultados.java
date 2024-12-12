package sistemainvest;

import java.text.DecimalFormat;

public class TelaResultados extends javax.swing.JFrame {
    private final DecimalFormat formatoDecimal = new DecimalFormat("##.00"); 
    public TelaResultados() {
        initComponents();
    }
    
    public void setValues () {
        labelTitulo.setText("Resultados da Simulação");
        labelValorInicial.setText("Valor Inicial:");
        labelIncremento.setText("Valor dos Incrementos:");
        labelMeses.setText("Número de Meses:");
        labelRisco.setText("Faixa de Risco:");
        labelFinal.setText("Valor Final:");
        labelRendimento.setText("Valor Rendido:");
        labelInvestido.setText("Valor Investido:");
        
        labelValorInicial.setText (labelValorInicial.getText() + " R$ " + formatoDecimal.format(InterfaceEscolhas.inicial));
        labelIncremento.setText (labelIncremento.getText() + " R$ " + formatoDecimal.format(InterfaceEscolhas.incremento));
        labelMeses.setText (labelMeses.getText() + " " + InterfaceEscolhas.meses);
        switch (InterfaceEscolhas.opt) {
            case 1: labelRisco.setText (labelRisco.getText() + " Faixa Segura"); break;
            case 2: labelRisco.setText (labelRisco.getText() + " Faixa Intermediária"); break;
            case 3: labelRisco.setText (labelRisco.getText() + " Faixa Arriscada"); break;}
        double investido = InterfaceEscolhas.inicial + (InterfaceEscolhas.incremento * (double)InterfaceEscolhas.meses);
        labelInvestido.setText (labelInvestido.getText() + " R$ " + formatoDecimal.format(investido));
        labelFinal.setText (labelFinal.getText() + " R$ " + formatoDecimal.format(InterfaceEscolhas.resultado.investimentoFinal));
        double rendimento = InterfaceEscolhas.resultado.investimentoFinal - investido;
        labelRendimento.setText (labelRendimento.getText() + " R$ " + formatoDecimal.format(rendimento));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelValorInicial = new javax.swing.JLabel();
        labelIncremento = new javax.swing.JLabel();
        labelMeses = new javax.swing.JLabel();
        labelRisco = new javax.swing.JLabel();
        labelFinal = new javax.swing.JLabel();
        labelRendimento = new javax.swing.JLabel();
        labelInvestido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setText("Resultados da Simulação");

        labelValorInicial.setText("Valor Inicial:");

        labelIncremento.setText("Valor dos Incrementos:");

        labelMeses.setText("Número de Meses:");

        labelRisco.setText("Faixa de Risco:");

        labelFinal.setText("Valor Final:");

        labelRendimento.setText("Valor Rendido:");

        labelInvestido.setText("Valor Investido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValorInicial)
                    .addComponent(labelMeses)
                    .addComponent(labelIncremento)
                    .addComponent(labelFinal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelRendimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelRisco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelInvestido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIncremento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMeses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRisco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInvestido)
                .addGap(8, 8, 8)
                .addComponent(labelFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRendimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelFinal;
    private javax.swing.JLabel labelIncremento;
    private javax.swing.JLabel labelInvestido;
    private javax.swing.JLabel labelMeses;
    private javax.swing.JLabel labelRendimento;
    private javax.swing.JLabel labelRisco;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValorInicial;
    // End of variables declaration//GEN-END:variables
}
