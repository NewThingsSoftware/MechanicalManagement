/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicalmanagement;

import dao.MecanicoDAO;
import dao.OrdemServicoDAO;
import dao.VeiculoDAO;
import entidades.Mecanico;
import entidades.OrdemServico;
import entidades.Peca;
import entidades.Veiculo;
import interfaces.IJanela;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class CadastroDeOrdemServico extends javax.swing.JFrame implements IJanela {

    /**
     * Creates new form CadastroDeOrdemServico
     */
    public CadastroDeOrdemServico() {
        initComponents();
        limparCampos();
        desabitaCamposNovaOrdemServico();
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mecanica?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        veiculoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT v.placa FROM Veiculo v");
        veiculoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(veiculoQuery.getResultList());
        mecanicoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT m.nome FROM Mecanico m");
        mecanicoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(mecanicoQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        jPmanutencao_os = new javax.swing.JPanel();
        jFTFquantidade = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTpecas_vinculadas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTFdescricao_peca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jBpecas = new javax.swing.JButton();
        jBgravar = new javax.swing.JButton();
        jFTFvalor_unitario = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFcodigo_peca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPabertura = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTPdescricao_problema = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jTFcodigo_os = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFTFdata = new javax.swing.JFormattedTextField();
        jCBveiculo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFcliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCBmecanico = new javax.swing.JComboBox();
        jCBstatus = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jPpagamento_os = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jFTFvalor_pecas = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jFTFvalor_mao_obra = new javax.swing.JFormattedTextField();
        jFTFvalor_total = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jCBcondicao_parcelamento = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jBfinalizar_os = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBgravar_alteracoes = new javax.swing.JToggleButton();
        jBconfirmar_abertura = new javax.swing.JButton();
        jBvoltar = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordem de Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPmanutencao_os.setBackground(new java.awt.Color(255, 255, 255));
        jPmanutencao_os.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manutenção ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(51, 51, 51))); // NOI18N
        jPmanutencao_os.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPmanutencao_os.add(jFTFquantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 70, -1));

        jTpecas_vinculadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTpecas_vinculadas);

        jPmanutencao_os.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 410, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Descrição:");
        jPmanutencao_os.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTFdescricao_peca.setEnabled(false);
        jPmanutencao_os.add(jTFdescricao_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Quantidade:");
        jPmanutencao_os.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jBpecas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBpecas.setText("Peças");
        jBpecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpecasActionPerformed(evt);
            }
        });
        jPmanutencao_os.add(jBpecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 80, -1));

        jBgravar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBgravar.setText("Gravar");
        jPmanutencao_os.add(jBgravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 80, -1));

        jFTFvalor_unitario.setEnabled(false);
        jPmanutencao_os.add(jFTFvalor_unitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 70, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel11.setText("Valor Unitário:");
        jPmanutencao_os.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jTFcodigo_peca.setEnabled(false);
        jTFcodigo_peca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcodigo_pecaActionPerformed(evt);
            }
        });
        jPmanutencao_os.add(jTFcodigo_peca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, -1));

        jLabel16.setText("Código:");
        jPmanutencao_os.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel1.add(jPmanutencao_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 520, 180));

        jPabertura.setBackground(new java.awt.Color(255, 255, 255));
        jPabertura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Abertura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(51, 51, 51))); // NOI18N

        jScrollPane3.setViewportView(jTPdescricao_problema);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("OS:");

        jTFcodigo_os.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Data:");

        jFTFdata.setEnabled(false);

        jCBveiculo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCBveiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, veiculoQuery, eLProperty, jCBveiculo);
        bindingGroup.addBinding(jComboBoxBinding);

        jCBveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBveiculoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Veículo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Cliente:");

        jTFcliente.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("Descrição do problema:");

        javax.swing.GroupLayout jPaberturaLayout = new javax.swing.GroupLayout(jPabertura);
        jPabertura.setLayout(jPaberturaLayout);
        jPaberturaLayout.setHorizontalGroup(
            jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaberturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaberturaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5))
                    .addGroup(jPaberturaLayout.createSequentialGroup()
                        .addComponent(jTFcodigo_os, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jFTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCBveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaberturaLayout.setVerticalGroup(
            jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaberturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPaberturaLayout.createSequentialGroup()
                        .addGroup(jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(9, 9, 9)
                        .addGroup(jPaberturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFcodigo_os, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBveiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaberturaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPabertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 520, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acompanhamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Status da OS:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 20));

        jCBmecanico.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCBmecanico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${resultList}");
        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, mecanicoQuery, eLProperty, jCBmecanico);
        bindingGroup.addBinding(jComboBoxBinding);

        jPanel4.add(jCBmecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, -1));

        jCBstatus.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCBstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "P - Pendente", "E - Em andamento", "F - Finalizada", "C - Cancelada" }));
        jCBstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBstatusActionPerformed(evt);
            }
        });
        jPanel4.add(jCBstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("Mecânico responsável:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 350, 70));

        jPpagamento_os.setBackground(new java.awt.Color(255, 255, 255));
        jPpagamento_os.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(51, 51, 51))); // NOI18N
        jPpagamento_os.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Valor das peças:");
        jPpagamento_os.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));
        jPpagamento_os.add(jFTFvalor_pecas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("Mão de obra:");
        jPpagamento_os.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        try {
            jFTFvalor_mao_obra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0.00")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPpagamento_os.add(jFTFvalor_mao_obra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));
        jPpagamento_os.add(jFTFvalor_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("Total a pagar:");
        jPpagamento_os.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, -1));

        jCBcondicao_parcelamento.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCBcondicao_parcelamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 - A Vista", "2 - A Prazo" }));
        jPpagamento_os.add(jCBcondicao_parcelamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Condição de Pagamento:");
        jPpagamento_os.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 20));

        jBfinalizar_os.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBfinalizar_os.setText("Finalizar OS");
        jBfinalizar_os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizar_osActionPerformed(evt);
            }
        });
        jPpagamento_os.add(jBfinalizar_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, -1));

        jPanel1.add(jPpagamento_os, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 350, 180));

        jBconsultar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBconsultar.setText("Consulta OS");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jBconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 140, -1));

        jBgravar_alteracoes.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBgravar_alteracoes.setText("Gravar alterações");
        jPanel1.add(jBgravar_alteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 140, -1));

        jBconfirmar_abertura.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBconfirmar_abertura.setText("Confirmar Abertura");
        jBconfirmar_abertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmar_aberturaActionPerformed(evt);
            }
        });
        jPanel1.add(jBconfirmar_abertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, -1));

        jBvoltar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jBvoltar.setText("Voltar");
        jPanel1.add(jBvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 140, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Ordem de Serviço ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 260, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 430));

        bindingGroup.bind();

        setSize(new java.awt.Dimension(918, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBpecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpecasActionPerformed
        new ConsultaPeca().setVisible(true);
    }//GEN-LAST:event_jBpecasActionPerformed

    private void jBfinalizar_osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizar_osActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBfinalizar_osActionPerformed

    private void jCBstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBstatusActionPerformed

    private void jBconfirmar_aberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmar_aberturaActionPerformed
        /*MarihellySantini*/
        if (camposPreenchidos()) {
            OrdemServicoDAO.gravar(obterCampos());
            JOptionPane.showMessageDialog(rootPane, "Abertura da Ordem de Serviço realizada com sucesso!");
            habilitaCamposOrdemServicoAberta();
            jTFcodigo_os.setText(OrdemServicoDAO.obterMaxCodigo().toString().replace("[", "").replace("]",""));
        }
    }//GEN-LAST:event_jBconfirmar_aberturaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        /*MarihellySantini
         * Preenche automaticamente no campo "Data" a data atual do sistema*/
        jFTFdata.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        /*Fim MarihellySantini*/
    }//GEN-LAST:event_formWindowActivated

    private void jTFcodigo_pecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcodigo_pecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcodigo_pecaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /*Limpa os campos quando a janela é fechada no "X"*/
        limparCampos();
    }//GEN-LAST:event_formWindowClosing

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        new ConsultaOrdemServico().setVisible(true);
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jCBveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBveiculoActionPerformed
        if (jCBveiculo.getSelectedItem() != null) {
            jTFcliente.setText(VeiculoDAO.obterPorPlaca(
                    jCBveiculo.getSelectedItem().toString()).get(0).getCliente().getNome());
        }
    }//GEN-LAST:event_jCBveiculoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroDeOrdemServico().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jBconfirmar_abertura;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBfinalizar_os;
    private javax.swing.JButton jBgravar;
    private javax.swing.JToggleButton jBgravar_alteracoes;
    private javax.swing.JButton jBpecas;
    private javax.swing.JToggleButton jBvoltar;
    private javax.swing.JComboBox jCBcondicao_parcelamento;
    private javax.swing.JComboBox jCBmecanico;
    private javax.swing.JComboBox jCBstatus;
    private javax.swing.JComboBox jCBveiculo;
    private javax.swing.JFormattedTextField jFTFdata;
    private javax.swing.JFormattedTextField jFTFquantidade;
    private javax.swing.JFormattedTextField jFTFvalor_mao_obra;
    private javax.swing.JFormattedTextField jFTFvalor_pecas;
    private javax.swing.JFormattedTextField jFTFvalor_total;
    private javax.swing.JFormattedTextField jFTFvalor_unitario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPabertura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPmanutencao_os;
    private javax.swing.JPanel jPpagamento_os;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFcliente;
    private javax.swing.JTextField jTFcodigo_os;
    private javax.swing.JTextField jTFcodigo_peca;
    private javax.swing.JTextField jTFdescricao_peca;
    private javax.swing.JTextPane jTPdescricao_problema;
    private javax.swing.JTable jTpecas_vinculadas;
    private java.util.List<entidadesJPA.Mecanico> mecanicoList;
    private javax.persistence.Query mecanicoQuery;
    private java.util.List<entidadesJPA.Veiculo> veiculoList;
    private javax.persistence.Query veiculoQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    /*Metodo que limpa todos os campos da tela de cadastro de veiculo*/
    @Override
    public void limparCampos() {
        /*Marihelly Santini*/
        jFTFdata.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        jTFcodigo_os.setText("");
        jTFcliente.setText("");
        jTPdescricao_problema.setText("");
        jTFdescricao_peca.setText("");
        jFTFquantidade.setText("");
        jFTFvalor_unitario.setText("");
        jFTFvalor_mao_obra.setText("");
        jFTFvalor_pecas.setText("");
        jFTFvalor_total.setText("");
        jTpecas_vinculadas.removeAll();
        jCBcondicao_parcelamento.setSelectedIndex(0);
        jCBmecanico.setSelectedIndex(0);
        jCBstatus.setSelectedIndex(0);
        jCBveiculo.setSelectedIndex(0);
    }

    /*Metodo que pega as informações do campo e retorna um objeto de OrdemDeServico*/
    @Override
    public OrdemServico obterCampos() {
        /*MarihellySantini*/
        try {
            Veiculo veiculo = VeiculoDAO.obterPorPlaca((String) jCBveiculo.getSelectedItem()).get(0);
            char status = jCBstatus.getSelectedItem().toString().charAt(0);
            Mecanico mecanico = MecanicoDAO.obterPorNome((String) jCBmecanico.getSelectedItem()).get(0);
            String descricao = jTPdescricao_problema.getText();
            Date data = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(jFTFdata.getText());
            BigDecimal valorMaoObra = new BigDecimal(jFTFvalor_mao_obra.getText().replace(',', '.'));
            return new OrdemServico(veiculo, mecanico, data, descricao, status, valorMaoObra);
        } catch (ParseException ex) {
            return null;
        }
    }

    /*Metodo que recebe um objeto do tipo OrdemServico e preenche os campos*/
    @Override
    public void prencherCampos(Object objetc) {
        OrdemServico ordemServico = (OrdemServico) objetc;
        
    }

    /*Metodo que verifica se todos os campos estão preenchidos para finalizar a
     OrdemServico*/
    @Override
    public boolean camposPreenchidos() {
        if (jFTFdata.getText().isEmpty()
                || jTFcliente.getText().isEmpty()
                || jTPdescricao_problema.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
            return false;
        }
        return true;
    }

    /*Metodo que a consulta de peça seta os valores da peca selecionada*/
    public void consultaPeca(Peca peca) {
        jTFcodigo_peca.setText();
        
    }

    /*Metodo que seleciona o mecanico na jCBmecanico conforme a consulta*/
    public void consultaMecanico(Mecanico mecanico) {
        jCBmecanico.setSelectedItem(mecanico.getNome());
    }

    /*Metodo que selecioan o veiculo na JCBveiculo conforme a consulta*/
    public void consultaVeiculo(Veiculo veiculo) {
        jCBveiculo.setSelectedItem(veiculo.getPlaca());
    }

    /*Metodo que desabilita campos para nova OrdemServico*/
    public void desabitaCamposNovaOrdemServico() {
        /*MarihellySantini*/
        jFTFquantidade.setEnabled(false);
        jBgravar.setEnabled(false);
        jBpecas.setEnabled(false);
        jFTFvalor_mao_obra.setEnabled(false);
        jCBcondicao_parcelamento.setEnabled(false);
        jBfinalizar_os.setEnabled(false);
        jBgravar_alteracoes.setEnabled(false);
    }

    /*Metodo que habilita campos para OrdemServico já criada*/
    public void habilitaCamposOrdemServicoAberta() {
        /*MarihellySantini
         *Habilita os campos da "Manutenção" e "Pagamento" da OS: */
        jFTFquantidade.setEnabled(true);
        jBgravar.setEnabled(true);
        jBpecas.setEnabled(true);
        jFTFvalor_mao_obra.setEnabled(true);
        jCBcondicao_parcelamento.setEnabled(true);
        jBfinalizar_os.setEnabled(true);
        jBgravar_alteracoes.setEnabled(true);
        jTFcliente.setEnabled(false);
        jCBveiculo.setEnabled(false);
        jFTFdata.setEnabled(false);
        jTPdescricao_problema.setEnabled(false);
        jBconfirmar_abertura.setEnabled(false);
    }
}
