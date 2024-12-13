package sistemainvest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.*;

public class RegistrosBanco extends javax.swing.JFrame {
    private final TestChartClass chart = new TestChartClass();
    private double variacoes[];
    public DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    Connection connection;
    public RegistrosBanco() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            retrieveData();
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        botaoVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltar)
                .addContainerGap(747, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        try {
            dispose();
            new InterfaceIdent().setVisible(true);
        } catch (ParseException ex) {
            System.out.println("Erro ao voltar para o menu inicial: " + ex.getMessage());
        }
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() >= 2 && !evt.isConsumed()) {
            evt.consume();
            int linhaClickada = table.getSelectedRow();
            if (linhaClickada != -1) {
                try {
                    connection = DatabaseConnection.getConnection();
                    String SQL = "select nome, id, id_investimento, valor_inicial, incremento, meses, valor_final from usuario inner join investimentos on id = id_usuario where id = ?";
                    PreparedStatement statement = connection.prepareStatement(SQL);
                    int id = Integer.parseInt(modelo.getValueAt(linhaClickada, 1).toString());
                    statement.setInt(1, id);
                    var dados = statement.executeQuery();
                    dados.next();
                    variacoes = new double [dados.getInt("meses")];
                    String SQL2 = "select variacao, id_investimento, meses from variacoes where id_investimento = ? order by meses asc";
                    PreparedStatement statement2 = connection.prepareStatement(SQL2);
                    statement2.setInt(1,dados.getInt("id_investimento"));
                    var dados2 = statement2.executeQuery();
                    int i = 0;
                    while (dados2.next()) {
                        variacoes[i] = dados2.getDouble("variacao");
                        i++;
                    }
                    Calcs.acessandoTabela(dados.getInt("meses"), variacoes, dados.getDouble("incremento"), dados.getDouble("valor_inicial"));
                    chart.newCandleChartNoButton();
                    dispose();
                } catch (SQLException ex) {
                    System.out.println ("Erro ao acessar o banco !! :  " + ex.getMessage());
                } finally {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ex) {
                            System.out.println ("Erro ao tentar fechar conexão com o banco?: " + ex.getMessage());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_tableMouseClicked
        
    private void retrieveData () throws SQLException {
        try {
            connection = DatabaseConnection.getConnection();
            String SQL = "select nome, id, id_investimento, valor_inicial, incremento, meses, valor_final from usuario inner join investimentos on id = id_usuario order by nome;";
            PreparedStatement statement = connection.prepareStatement(SQL);
            var dados = statement.executeQuery();         
            
            DecimalFormat formatoDecimal = new DecimalFormat("##.00"); 
            table.setModel(modelo);
            
            modelo.addColumn("Título");
            modelo.addColumn("ID");
            modelo.addColumn("ID Investimento");
            modelo.addColumn("Valor Inicial");
            modelo.addColumn("Incremento");
            modelo.addColumn("Meses Simulados");
            modelo.addColumn("Valor Final");              
                    
            while (dados.next()) {
                modelo.addRow (new Object [] {
                    dados.getString("nome"),
                    dados.getString("id"),
                    dados.getString("id_investimento"),
                    "R$ " + dados.getString("valor_inicial"),
                    "R$ " + dados.getString("incremento"),
                    dados.getString("meses"),
                    "R$ " + formatoDecimal.format(dados.getDouble("valor_final"))
                });          
            }
            table.setFocusable(false);
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
