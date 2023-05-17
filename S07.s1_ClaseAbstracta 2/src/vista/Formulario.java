package vista;

import ejercicio1.PorCredito;
import ejercicio1.Regular;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    int indTipo;
    
    public Formulario() {
        initComponents();
        ocultarComponentes(false, false);
        definirColumnas();
    }
    
    private void definirColumnas(){
        modelo.addColumn("Tipo");
        modelo.addColumn("P.Mensual");
        modelo.addColumn("P.Inglés");
        modelo.addColumn("P.Carnet/Seguro");
        modelo.addColumn("P.Total");
        tblSalida.setModel(modelo);
    }

    private void ocultarComponentes(boolean valor1, boolean valor2){
        pnlRegular.setVisible(valor1);
        pnlPorCredito.setVisible(valor2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        pnlRegular = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        rbtSiSeguro = new javax.swing.JRadioButton();
        rbtNoSeguro = new javax.swing.JRadioButton();
        pnlPorCredito = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tipo de matricula");

        cbxTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Regular", "Por crédito" }));
        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Leva inglés?");

        buttonGroup1.add(rbtSi);
        rbtSi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtSi.setText("Si");

        buttonGroup1.add(rbtNo);
        rbtNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtNo.setText("No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Categoría");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Tiene seguro?");

        cbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));

        buttonGroup2.add(rbtSiSeguro);
        rbtSiSeguro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtSiSeguro.setText("Si");

        buttonGroup2.add(rbtNoSeguro);
        rbtNoSeguro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbtNoSeguro.setText("No");

        javax.swing.GroupLayout pnlRegularLayout = new javax.swing.GroupLayout(pnlRegular);
        pnlRegular.setLayout(pnlRegularLayout);
        pnlRegularLayout.setHorizontalGroup(
            pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegularLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(182, 182, 182)
                .addGroup(pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRegularLayout.createSequentialGroup()
                        .addComponent(rbtSiSeguro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtNoSeguro)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlRegularLayout.setVerticalGroup(
            pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(pnlRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtNoSeguro)
                        .addComponent(rbtSiSeguro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Cantidad de créditos");

        txtCreditos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlPorCreditoLayout = new javax.swing.GroupLayout(pnlPorCredito);
        pnlPorCredito.setLayout(pnlPorCreditoLayout);
        pnlPorCreditoLayout.setHorizontalGroup(
            pnlPorCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorCreditoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(126, 126, 126)
                .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlPorCreditoLayout.setVerticalGroup(
            pnlPorCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPorCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPorCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblSalida);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtSi)
                                .addGap(36, 36, 36)
                                .addComponent(rbtNo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAceptar)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtSi)
                        .addComponent(rbtNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPorCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        indTipo = cbxTipo.getSelectedIndex();
        switch(indTipo){
            case 0: ocultarComponentes(false, false);
                    break;
            case 1: ocultarComponentes(true, false);
                    break;
            case 2: ocultarComponentes(false, true);
                    break;
        }
    }//GEN-LAST:event_cbxTipoItemStateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        switch(indTipo){
            case 1: Regular r = new Regular();
                    r.setCategoria(cbxCategoria.getSelectedItem().toString());
                    if(rbtSi.isSelected())
                        r.setIngles("Si");
                    else
                        r.setIngles("No");
                    if(rbtSiSeguro.isSelected())
                        r.setSeguro("Si");
                    else
                        r.setSeguro("No");
                    r.calcularPagoMensual();
                    r.calcularAdicional();
                    r.calcularIncrementoSegCar();
                    r.calcularPagoTotal();
                    Object[] data = {"Regular", r.getPagoMensual(), r.getAdicional(),
                        r.getIncSegCar(), r.getTotalPago()};
                    modelo.addRow(data);
                    break;
            case 2: PorCredito c = new PorCredito();
                    c.setCantCreditos(Integer.parseInt(txtCreditos.getText()));
                    if(rbtSi.isSelected())
                        c.setIngles("Si");
                    else
                        c.setIngles("No");                    
                    c.calcularPagoMensual();
                    c.calcularAdicional();
                    c.calcularIncrementoSegCar();
                    c.calcularPagoTotal();
                    Object[] data1 = {"Por crédito", c.getPagoMensual(), c.getAdicional(),
                        c.getIncSegCar(), c.getTotalPago()};
                    modelo.addRow(data1);
                    break;
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indFila;
        indFila = tblSalida.getSelectedRow();
        if(indFila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else
            modelo.removeRow(indFila);
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlPorCredito;
    private javax.swing.JPanel pnlRegular;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtNoSeguro;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JRadioButton rbtSiSeguro;
    private javax.swing.JTable tblSalida;
    private javax.swing.JTextField txtCreditos;
    // End of variables declaration//GEN-END:variables
}
