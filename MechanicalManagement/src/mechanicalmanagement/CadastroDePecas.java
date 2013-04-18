/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import entidades.Peca;
import interfaces.IJanela;

/**
 *
 * @author Marihelly
 */
public class CadastroDePecas extends javax.swing.JFrame implements IJanela{

    /**
     * Creates new form CadastroDePecas
     */
    public CadastroDePecas() {
        initComponents();
        jBalterar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBcancelar = new javax.swing.JButton();
        jBsalvar = new javax.swing.JButton();
        jBalterar = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jTFcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFdescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBstatus = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTFmarca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFTFvalor_compra = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jBvoltar = new javax.swing.JButton();
        jFTFvalor_venda = new javax.swing.JFormattedTextField();
        jFTFquantidade = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Peças");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cadastro de Peças");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 160, -1));

        jBcancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBcancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBcancelar.setForeground(new java.awt.Color(102, 102, 102));
        jBcancelar.setMnemonic('a');
        jBcancelar.setText("Cancelar");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, -1));

        jBsalvar.setBackground(new java.awt.Color(255, 255, 255));
        jBsalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBsalvar.setForeground(new java.awt.Color(102, 102, 102));
        jBsalvar.setMnemonic('a');
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jBsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 110, -1));

        jBalterar.setBackground(new java.awt.Color(255, 255, 255));
        jBalterar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBalterar.setForeground(new java.awt.Color(102, 102, 102));
        jBalterar.setMnemonic('g');
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });
        jPanel2.add(jBalterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 110, -1));

        jBconsultar.setBackground(new java.awt.Color(255, 255, 255));
        jBconsultar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBconsultar.setForeground(new java.awt.Color(102, 102, 102));
        jBconsultar.setMnemonic('a');
        jBconsultar.setText("Consultar");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jBconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));

        jTFcodigo.setEnabled(false);
        jPanel2.add(jTFcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, -1));

        jLabel3.setText("Código:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));
        jPanel2.add(jTFdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 460, -1));

        jLabel4.setText("Marca:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setText("Quantidade:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jCBstatus.setBackground(new java.awt.Color(255, 255, 255));
        jCBstatus.setText("Inativo");
        jCBstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBstatusActionPerformed(evt);
            }
        });
        jPanel2.add(jCBstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, 20));

        jLabel8.setText("Status do produto:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 260, 20));

        jLabel7.setText("Descrição da peça:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));
        jPanel2.add(jTFmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 360, -1));

        jLabel9.setText("Valor de compra:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 10));

        jFTFvalor_compra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        jFTFvalor_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFvalor_compraActionPerformed(evt);
            }
        });
        jPanel2.add(jFTFvalor_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, -1));

        jLabel10.setText("Valor de venda:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 10));

        jBvoltar.setBackground(new java.awt.Color(255, 255, 255));
        jBvoltar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBvoltar.setForeground(new java.awt.Color(102, 102, 102));
        jBvoltar.setMnemonic('a');
        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jBvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 100, -1));

        jFTFvalor_venda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        jFTFvalor_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFvalor_vendaActionPerformed(evt);
            }
        });
        jPanel2.add(jFTFvalor_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, -1));

        jFTFquantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.000"))));
        jPanel2.add(jFTFquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 80, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Opções", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 600, 60));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Dados da Peça", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 600, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(642, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jCBstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBstatusActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
           
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        dispose(); /* Marihelly: Volta para a Tela Central. */

    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jFTFvalor_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFvalor_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFvalor_compraActionPerformed

    private void jFTFvalor_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFvalor_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFvalor_vendaActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDePecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDePecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDePecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDePecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDePecas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JCheckBox jCBstatus;
    private javax.swing.JFormattedTextField jFTFquantidade;
    private javax.swing.JFormattedTextField jFTFvalor_compra;
    private javax.swing.JFormattedTextField jFTFvalor_venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFcodigo;
    private javax.swing.JTextField jTFdescricao;
    private javax.swing.JTextField jTFmarca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limparCampos() {
        jTFcodigo.setText("");
        jTFdescricao.setText("");
        jTFmarca.setText("");
        jCBstatus.setSelected(false);
        jFTFvalor_compra.setText("");
        jFTFvalor_venda.setText("");
        jFTFquantidade.setText("");
    }

    @Override
    public Object obterCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prencherCampos(Object object) {
        Peca peca = (Peca) object;
        jTFdescricao.setText(peca.getDescricao());
        jTFmarca.setText(peca.getMarca());
        jCBstatus.setSelected(peca.isStatus());
        jFTFvalor_compra.setText(String.valueOf(peca.getPrecoCompra()));
        jFTFvalor_venda.setText(String.valueOf(peca.getPrecoVenda()));
        jFTFquantidade.setText(String.valueOf(peca.getQuantidade()));
        
    }

    @Override
    public boolean camposPreenchidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
