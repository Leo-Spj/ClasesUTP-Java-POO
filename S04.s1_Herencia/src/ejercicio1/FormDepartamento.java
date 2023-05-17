package ejercicio1;

public class FormDepartamento extends javax.swing.JFrame {

    public FormDepartamento() {
        initComponents();
        mostrarItems();
    }

    public void mostrarItems(){
        for(int i=1; i<=50; i++)
            cbxPiso.addItem(i+"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        cbxPiso = new javax.swing.JComboBox<>();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Area");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Piso");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Cochera");

        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cbxPiso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        buttonGroup1.add(rbtSi);
        rbtSi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtSi.setText("Si");

        buttonGroup1.add(rbtNo);
        rbtNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtNo.setText("No");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtNo)
                            .addComponent(rbtSi))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxPiso, 0, 156, Short.MAX_VALUE)
                            .addComponent(txtArea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtSi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtNo)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Departamento d = new Departamento();
        d.setArea(Double.parseDouble(txtArea.getText()));
        d.setPiso(cbxPiso.getSelectedIndex()+1);
        if(rbtSi.isSelected())
            d.setCochera("Si");
        else
            d.setCochera("No");
        d.calcularPrecio();
        d.calcularAdicional();
        d.calcularDescuento();
        d.calcularMontoFinal();
        txtSalida.append("Area "+d.getArea());
        txtSalida.append("Precio "+d.getPrecio());
        txtSalida.append("Piso "+d.getPiso());
        txtSalida.append("Descuento "+d.getDescuento());        
        txtSalida.append("Cochera "+d.getCochera());
        txtSalida.append("Adicional "+d.getAdicional());
        txtSalida.append("Monto final "+d.getMontoFinal());
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(FormDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDepartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDepartamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxPiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
