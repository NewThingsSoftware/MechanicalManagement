/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import dao.MecanicoDAO;
import entidades.Mecanico;
import interfaces.IJanela;
import javax.swing.JOptionPane;

/**
 *
 * @author Francis
 */
public class CadastroDeMecanicos extends javax.swing.JFrame implements IJanela {

    /**
     * Creates new form CadastordeClientes
     */
    public CadastroDeMecanicos() {
        initComponents();
        jBalterar.setEnabled(false);
        limparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFTFcpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFTFtelefone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBstatus = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jFTFrg = new javax.swing.JFormattedTextField();
        jBvoltar = new javax.swing.JButton();
        jTFEspecialidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBsalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jBalterar = new javax.swing.JButton();
        jBcancelar = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Cadastro de Clientes"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Cadastro de Mecanicos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        try {
            jFTFcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jFTFcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, -1));

        jLabel5.setText("CPF:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTFcodigo.setEditable(false);
        jPanel2.add(jTFcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, -1));

        jLabel3.setText("Código:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));
        jPanel2.add(jTFnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 420, -1));

        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel6.setText("RG:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 50, -1));

        try {
            jFTFtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jFTFtelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 170, -1));

        jLabel2.setText("Telefone:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 70, -1));

        jCBstatus.setBackground(new java.awt.Color(255, 255, 255));
        jCBstatus.setText("Ativo");
        jCBstatus.setActionCommand("");
        jCBstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBstatusActionPerformed(evt);
            }
        });
        jPanel2.add(jCBstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 110, -1));

        jLabel8.setText("Status:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 290, 20));

        try {
            jFTFrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jFTFrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

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
        jPanel2.add(jBvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 100, -1));
        jPanel2.add(jTFEspecialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 330, -1));

        jLabel9.setText("Especialidade");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

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
        jPanel2.add(jBsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 600, 210));

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
        jPanel2.add(jBalterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 110, -1));

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
        jPanel2.add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 100, -1));

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
        jPanel2.add(jBconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, -1));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Opções", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 600, 60));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 630, 420);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(635, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBstatusActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        if (camposPreenchidos()) {
            MecanicoDAO.gravar(obterCampos());
            limparCampos();

        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        if (camposPreenchidos()) {
            Mecanico mecanico = MecanicoDAO.obterPorCodigo(Integer.parseInt(jTFcodigo.getText())).get(0);
            mecanico.setNome(obterCampos().getNome());
            mecanico.setCpf(obterCampos().getCpf());
            mecanico.setRg(obterCampos().getRg());
            mecanico.setTelefone(obterCampos().getTelefone());
            mecanico.setStatus(obterCampos().isStatus());
            MecanicoDAO.alterar(mecanico);
            jBsalvar.setEnabled(true);
            jBalterar.setEnabled(false);
            limparCampos();
        }
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        jBsalvar.setEnabled(false);
        jBalterar.setEnabled(true);
        new ConsultaMecanico(this).setVisible(true);
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        limparCampos();
        jBsalvar.setEnabled(true);
        jBalterar.setEnabled(false);
        dispose(); /* Marihelly: Volta para a Tela Central. */
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        limparCampos();
        jBsalvar.setEnabled(true);
        jBalterar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(CadastroDeMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeMecanicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroDeMecanicos().setVisible(true);
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
    private javax.swing.JFormattedTextField jFTFcpf;
    private javax.swing.JFormattedTextField jFTFrg;
    private javax.swing.JFormattedTextField jFTFtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFEspecialidade;
    private javax.swing.JTextField jTFcodigo;
    private javax.swing.JTextField jTFnome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limparCampos() {
        //Kaue
        jTFcodigo.setText("");
        jTFnome.setText("");
        jFTFcpf.setText("");
        jFTFrg.setText("");
        jFTFtelefone.setText("");
        jTFEspecialidade.setText("");
        jCBstatus.setSelected(false);
        jBconsultar.requestFocus();
    }

    @Override
    public Mecanico obterCampos() {
        String nome = jTFnome.getText();
        String cpf = jFTFcpf.getText();
        String rg = jFTFrg.getText();
        String telefone = jFTFtelefone.getText();
        String especialidade = jTFEspecialidade.getText();
        boolean status = jCBstatus.isSelected();
        return new Mecanico(nome, rg, cpf, telefone, especialidade, status);

    }

    @Override
    public void prencherCampos(Object objetc) {
        Mecanico mecanico = (Mecanico) objetc;
        jTFcodigo.setText(mecanico.getIdMecanico().toString());
        jTFnome.setText(mecanico.getNome());
        jFTFcpf.setText(String.valueOf(mecanico.getCpf()));
        jFTFrg.setText(String.valueOf(mecanico.getRg()));
        jFTFtelefone.setText(mecanico.getTelefone());
        jTFEspecialidade.setText(mecanico.getEspecialidade());
        jCBstatus.setSelected(mecanico.isStatus());
    }

    @Override
    public boolean camposPreenchidos() {
        if (jTFnome.getText().isEmpty()
                || jFTFcpf.getText().isEmpty()
                || jFTFrg.getText().isEmpty()
                || jFTFtelefone.getText().isEmpty()
                || jTFEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor preencher todos os campos");
            return false;
        }
        return true;
    }

    public void consultaMecanico(Mecanico mecanico) {
        prencherCampos(mecanico);
    }
}
