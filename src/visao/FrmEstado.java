/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.sun.javafx.geom.ConcentricShapePair;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import controle.ConectaBanco;
import controle.ModeloTabela;

import org.junit.BeforeClass;

/**
 *
 * @author mathe
 */
public class FrmEstado extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();
    /**
     * Creates new form FrmEstado
     */
    public FrmEstado() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from estado order by id_estado");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldUF = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("UF:");

        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jTextFieldUF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldUF.setEnabled(false);
        jTextFieldUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUFActionPerformed(evt);
            }
        });

        jButtonNovo.setText("NOVO");
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("ALTERAR");
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.setToolTipText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonSair.setText("O");
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstado);

        jButtonUltimo.setText(">>");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 337, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Fomulário de cadastro de estados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(619, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed
    @BeforeClass
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldUF.setText("");
        jTextFieldNome.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed
    @BeforeClass
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement pst = conecta.conn.prepareStatement("insert into estado(nome_estado, sigla_estado)values(?,?)");
            pst.setString(1,jTextFieldNome.getText());
            pst.setString(2,jTextFieldUF.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso");
            preencherTabela("select * from estado order by id_estado");
            
            jTextFieldCodigo.setText("");
            jTextFieldNome.setText("");
            jTextFieldUF.setText("");
            jTextFieldNome.setEnabled(false);
            jTextFieldUF.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonDeletar.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro na inserção" + ex);

        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    @BeforeClass
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update estado set nome_estado= ?, sigla_estado=? where id_estado=?");
            pst.setString(1, jTextFieldNome.getText());
            pst.setString(2, jTextFieldUF.getText());
            pst.setInt(3, Integer.parseInt(jTextFieldCodigo.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Alterado com sucesso");
            preencherTabela("select * from estado order by id_estado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao alterar" + ex);
            
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed
    @BeforeClass
    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            // TODO add your handling code here:
            //conecta.executaSQL("delete from estado where sigla_estado='"+jTextFieldUF.getText()+"'");
            //JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
            
            
            PreparedStatement pst = conecta.conn.prepareStatement("delete from estado where sigla_estado=?");
            pst.setString(1,jTextFieldUF.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
            preencherTabela("select * from estado order by id_estado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro na exclusão" + ex);
        }
        
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldUF.setText("");
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldUF.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed
    @BeforeClass
    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        try {
            conecta.executaSQL("select * from estado");
            conecta.rs.last();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldUF.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao mostrar dados" + ex);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed
    @BeforeClass
    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        try {
            conecta.executaSQL("select * from estado");
            conecta.rs.first();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldUF.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao mostrar dados" + ex);
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed
    @BeforeClass
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        try {
            // TODO add your handling code here:
            conecta.rs.previous();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldUF.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao mostrar dados" + ex);
        }
        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed
    @BeforeClass
    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        jButtonEditar.setEnabled(true);
        jButtonDeletar.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldUF.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        try {
            // TODO add your handling code here:
            conecta.rs.next();
            jTextFieldCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextFieldNome.setText(conecta.rs.getString("nome_estado"));
            jTextFieldUF.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao mostrar dados" + ex);
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jTextFieldUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUFActionPerformed
    @BeforeClass
    public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"ID","Nome","Sigla"};
        
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("id_estado"), conecta.rs.getString("nome_estado"), conecta.rs.getString("sigla_estado")});
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preemcher o ArrayList" + ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(135);
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(309);
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(135);
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado.getTableHeader().setReorderingAllowed(false);
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldUF;
    // End of variables declaration//GEN-END:variables
}
