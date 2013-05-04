package mechanicalmanagement;

import dao.ClienteDAO;
import dao.MecanicoDAO;
import dao.OrdemServicoDAO;
import dao.VeiculoDAO;
import entidades.Cliente;
import entidades.OrdemServico;
import entidades.Veiculo;
import javax.swing.JOptionPane;
import tableModel.OrdemServicoTableModelo;

/**
 *
 * @author ctb03
 */
public class ConsultaOrdemServico extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaOrdemServico
     */
    private CadastroDeOrdemServico cadastroDeOrdemServico;

    public ConsultaOrdemServico() {
        initComponents();
    }

    public ConsultaOrdemServico(CadastroDeOrdemServico cadastroDeOrdemServico) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBconsultar = new javax.swing.JButton();
        jTFconsulta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBselecionar = new javax.swing.JButton();
        jRBnomeCliente = new javax.swing.JRadioButton();
        jRBplacaVeiculo = new javax.swing.JRadioButton();
        jRBnomeMecanico = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Ordem de Serviço");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBconsultar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBconsultar.setText("Consultar");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jBconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 11, -1, -1));
        getContentPane().add(jTFconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 494, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new OrdemServicoTableModelo(OrdemServicoDAO.obterTodos()));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 587, 217));

        jBselecionar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBselecionar.setText("Selecionar");
        jBselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBselecionarActionPerformed(evt);
            }
        });
        getContentPane().add(jBselecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 289, -1, -1));

        buttonGroup1.add(jRBnomeCliente);
        jRBnomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRBnomeCliente.setText("Nome do Cliente");
        getContentPane().add(jRBnomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, -1, -1));

        buttonGroup1.add(jRBplacaVeiculo);
        jRBplacaVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRBplacaVeiculo.setText("Placa do Veiculo");
        getContentPane().add(jRBplacaVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 36, -1, -1));

        buttonGroup1.add(jRBnomeMecanico);
        jRBnomeMecanico.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRBnomeMecanico.setText("Nome do Mecânico");
        getContentPane().add(jRBnomeMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 36, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBselecionarActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            String codigo = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            cadastroDeOrdemServico.consultaOrdemServico(OrdemServicoDAO.obterPorCodigo(Integer.parseInt(codigo)).get(0));
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_jBselecionarActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        if (jRBnomeCliente.isSelected()) {
            jTable1.setModel(new OrdemServicoTableModelo(OrdemServicoDAO.obterPorVeiculo(
                    VeiculoDAO.obterPorCliente(ClienteDAO.obterPorNome(jTFconsulta.getText()).isEmpty() ? null
                    : ClienteDAO.obterPorNome(jTFconsulta.getText()).get(0)).isEmpty() ? null
                    : VeiculoDAO.obterPorCliente(ClienteDAO.obterPorNome(jTFconsulta.getText()).isEmpty() ? null
                    : ClienteDAO.obterPorNome(jTFconsulta.getText()).get(0)).get(0))));
        }
        if (jRBnomeMecanico.isSelected()) {
            jTable1.setModel(new OrdemServicoTableModelo(OrdemServicoDAO.obterPorMecanico(
                    MecanicoDAO.obterPorNome(jTFconsulta.getText()).isEmpty()?null:
                    MecanicoDAO.obterPorNome(jTFconsulta.getText()).get(0))));
        }
        if (jRBplacaVeiculo.isSelected()) {
            jTable1.setModel(new OrdemServicoTableModelo(OrdemServicoDAO.obterPorVeiculo(
                    VeiculoDAO.obterPorPlaca(jTFconsulta.getText()).isEmpty()?null:
                    VeiculoDAO.obterPorPlaca(jTFconsulta.getText()).get(0))));
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaOrdemServico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBselecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBnomeCliente;
    private javax.swing.JRadioButton jRBnomeMecanico;
    private javax.swing.JRadioButton jRBplacaVeiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFconsulta;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
