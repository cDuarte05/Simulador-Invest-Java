package sistemainvest;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.*;

public class InterfaceIdent extends javax.swing.JFrame {
    public static String nomeUsuario;
    public static String idUsuario;
    MaskFormatter formatter = new MaskFormatter("########");
     
    public InterfaceIdent() throws ParseException {
        formatter.setPlaceholderCharacter('-');
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoContinuar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoID = new javax.swing.JFormattedTextField(formatter);
        labelID1 = new javax.swing.JLabel();
        acessarRegistros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("Título");

        labelTitulo.setText("Bem Vindo ao nosso programa!");

        labelDesc.setText("Insira aqui um título e uma chave de identificação, de sua escolha:");

        labelID.setText("Identificação:");

        campoNome.setText("Escreva aqui um título...");
        campoNome.setToolTipText("");
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });

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

        labelID1.setText("OBS: A identificação deve conter 8 digitos.");

        acessarRegistros.setText("Ver Registros");
        acessarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNome))
                    .addComponent(labelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acessarRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoContinuar))
                    .addComponent(labelID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDesc)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuar)
                    .addComponent(botaoCancelar)
                    .addComponent(acessarRegistros))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarActionPerformed
        nomeUsuario = campoNome.getText();
        idUsuario = campoID.getText();
        
        if ("Escreva aqui um título...".equals(nomeUsuario)) {
            JOptionPane.showMessageDialog(null,"Por favor, insira um título!");
        } else {
            try {
                if ("--------".equals(idUsuario)) {
                    JOptionPane.showMessageDialog(null,"Por favor, insira 8 digitos no código!");
                } else {
                    new InterfaceEscolhas().setVisible(true);
                    dispose();  
                }
            } catch (ParseException ex) {
                System.out.println("Erro ao transicionar telas: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_botaoContinuarActionPerformed

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        if (campoNome.getText().equals("Escreva aqui um título...")) {
            campoNome.setText("");
        }
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        if (campoNome.getText().isEmpty()) {
            campoNome.setText("Escreva aqui um título...");
        }
    }//GEN-LAST:event_campoNomeFocusLost

    private void acessarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarRegistrosActionPerformed
        new RegistrosBanco().setVisible(true);
        removeAll();
        dispose();
    }//GEN-LAST:event_acessarRegistrosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton acessarRegistros;
    private static javax.swing.JButton botaoCancelar;
    private static javax.swing.JButton botaoContinuar;
    private static javax.swing.JFormattedTextField campoID;
    private static javax.swing.JTextField campoNome;
    private static javax.swing.JLabel labelDesc;
    private static javax.swing.JLabel labelID;
    private static javax.swing.JLabel labelID1;
    private static javax.swing.JLabel labelNome;
    private static javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
