/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import tableModel.MecanicoTableModel;
import dao.MecanicoDAO;
import entidades.Mecanico;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaMecanico extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaVeiculo
     */
    private CadastroDeMecanicos cadastroDeMecanicos;
    private CadastroDeOrdemServico cadastroDeOrdemServico;

    public ConsultaMecanico() {
        initComponents();
    }

    public ConsultaMecanico(CadastroDeMecanicos cadastroDeMecanicos) {
        this.cadastroDeMecanicos = cadastroDeMecanicos;
        initComponents();
    }

    public ConsultaMecanico(CadastroDeOrdemServico cadastroDeOrdemServico) {
        this.cadastroDeOrdemServico = cadastroDeOrdemServico;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGconsulta = new javax.swing.ButtonGroup();
        jBselecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTFbusca = new javax.swing.JTextField();
        jBprocurar = new javax.swing.JButton();
        jRBnome = new javax.swing.JRadioButton();
        jRBcpf = new javax.swing.JRadioButton();
        jRBEspecialidade = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRBtodos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBselecionar.setText("Selecionar");
        jBselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselecionarActionPerformed(evt);
            }
        });
        getContentPane().add(jBselecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jTable1.setModel(new MecanicoTableModel(MecanicoDAO.obterTodos()));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 231));
        getContentPane().add(jTFbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, -1));

        jBprocurar.setText("Procurar");
        jBprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprocurarActionPerformed(evt);
            }
        });
        getContentPane().add(jBprocurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, -1));

        jRBnome.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBnome);
        jRBnome.setText("Nome");
        getContentPane().add(jRBnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jRBcpf.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBcpf);
        jRBcpf.setText("CPF");
        getContentPane().add(jRBcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jRBEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBEspecialidade);
        jRBEspecialidade.setText("especialidade");
        jRBEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jRBEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Selecione a linha desejada e clique em \"selecionar\".");

        jRBtodos.setBackground(new java.awt.Color(255, 255, 255));
        jBGconsulta.add(jRBtodos);
        jRBtodos.setSelected(true);
        jRBtodos.setText("Todos");
        jRBtodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRBtodos)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jRBtodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        setSize(new java.awt.Dimension(408, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselecionarActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            String nome = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            Mecanico mecanico = MecanicoDAO.obterPorNome(nome).get(0);
            if (cadastroDeMecanicos != null) {
                cadastroDeMecanicos.consultaMecanico(mecanico);
            }
            if (cadastroDeOrdemServico != null) {
                cadastroDeOrdemServico.consultaMecanico(mecanico);
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_jBselecionarActionPerformed

    private void jBprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprocurarActionPerformed
        if (jRBcpf.isSelected()) {
            List<Mecanico> mecanicos = MecanicoDAO.obterPorCpf(jTFbusca.getText());
            jTable1.setModel(new MecanicoTableModel(mecanicos));
        }

        if (jRBnome.isSelected()) {
            List<Mecanico> mecanicos = MecanicoDAO.obterPorNome(jTFbusca.getText());
            jTable1.setModel(new MecanicoTableModel(mecanicos));
        }

        if (jRBEspecialidade.isSelected()) {
            List<Mecanico> mecanicos = MecanicoDAO.obterPorEspecialidade(jTFbusca.getText());
            jTable1.setModel(new MecanicoTableModel(mecanicos));
        }

        if (jRBtodos.isSelected()) {
            List<Mecanico> mecanicos = MecanicoDAO.obterTodos();
            jTable1.setModel(new MecanicoTableModel(mecanicos));
        }
    }//GEN-LAST:event_jBprocurarActionPerformed

    private void jRBtodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtodosActionPerformed

    private void jRBEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBEspecialidadeActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaMecanico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup jBGconsulta;
    private javax.swing.JButton jBprocurar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEspecialidade;
    private javax.swing.JRadioButton jRBcpf;
    private javax.swing.JRadioButton jRBnome;
    private javax.swing.JRadioButton jRBtodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFbusca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}