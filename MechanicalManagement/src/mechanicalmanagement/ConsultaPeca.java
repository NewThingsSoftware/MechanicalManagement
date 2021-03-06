/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import tableModel.PecaTableModel;
import dao.PecaDAO;
import entidades.Peca;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaPeca extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaVeiculo
     */
    private CadastroDePecas cadastroDePecas;
    private CadastroDeOrdemServico cadastroDeOrdemServico;

    public ConsultaPeca() {
        initComponents();
    }

    public ConsultaPeca(CadastroDePecas cadastroDePecas) {
        this.cadastroDePecas = cadastroDePecas;
        initComponents();
    }

    public ConsultaPeca(CadastroDeOrdemServico cadastroDeOrdemServico) {
        this.cadastroDeOrdemServico = cadastroDeOrdemServico;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGconsulta = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTFbusca = new javax.swing.JTextField();
        jBprocurar = new javax.swing.JButton();
        jRBcodigo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRBtodos = new javax.swing.JRadioButton();
        jRBmarca = new javax.swing.JRadioButton();
        jRBdescricao = new javax.swing.JRadioButton();
        jBselecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new PecaTableModel(PecaDAO.obterTodos()));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 231));
        getContentPane().add(jTFbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, -1));

        jBprocurar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBprocurar.setText("Procurar");
        jBprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprocurarActionPerformed(evt);
            }
        });
        getContentPane().add(jBprocurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, -1));

        jRBcodigo.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBcodigo);
        jRBcodigo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRBcodigo.setText("Código");
        getContentPane().add(jRBcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Selecione a linha desejada e clique em \"selecionar\".");

        jRBtodos.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBtodos);
        jRBtodos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRBtodos.setSelected(true);
        jRBtodos.setText("Todos");
        jRBtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtodosActionPerformed(evt);
            }
        });

        jRBmarca.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBmarca);
        jRBmarca.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRBmarca.setText("Marca");

        jRBdescricao.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBdescricao);
        jRBdescricao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jRBdescricao.setText("Descrição");
        jRBdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBdescricaoActionPerformed(evt);
            }
        });

        jBselecionar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBselecionar.setText("Selecionar");
        jBselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBselecionar)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jRBmarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRBdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBtodos)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBtodos)
                    .addComponent(jRBmarca)
                    .addComponent(jRBdescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBselecionar))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        setSize(new java.awt.Dimension(408, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselecionarActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            int codigo = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Peca peca = PecaDAO.obterPorCodigo(codigo).get(0);
            if (cadastroDePecas != null) {
                cadastroDePecas.consultaDePeca(peca);
            }
            if (cadastroDeOrdemServico != null) {
                cadastroDeOrdemServico.consultaPeca(peca);
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_jBselecionarActionPerformed

    private void jBprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprocurarActionPerformed
        if (jRBmarca.isSelected()) {
            List<Peca> pecas = PecaDAO.obterPorMarca(jTFbusca.getText());
            jTable1.setModel(new PecaTableModel(pecas));
        }

        if (jRBcodigo.isSelected()) {
            List<Peca> pecas = PecaDAO.obterPorCodigo(Integer.parseInt(jTFbusca.getText()));
            jTable1.setModel(new PecaTableModel(pecas));
        }

        if (jRBdescricao.isSelected()) {
            List<Peca> mecanicos = PecaDAO.obterPorDescricao(jTFbusca.getText());
            jTable1.setModel(new PecaTableModel(mecanicos));
        }

        if (jRBtodos.isSelected()) {
            List<Peca> mecanicos = PecaDAO.obterTodos();
            jTable1.setModel(new PecaTableModel(mecanicos));
        }
    }//GEN-LAST:event_jBprocurarActionPerformed

    private void jRBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtodosActionPerformed

    private void jRBdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBdescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPeca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaPeca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup jBGconsulta;
    private javax.swing.JButton jBprocurar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBcodigo;
    private javax.swing.JRadioButton jRBdescricao;
    private javax.swing.JRadioButton jRBmarca;
    private javax.swing.JRadioButton jRBtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbusca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
