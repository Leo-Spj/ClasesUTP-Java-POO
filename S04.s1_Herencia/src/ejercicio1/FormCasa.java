/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio1;

public class FormCasa extends javax.swing.JFrame {

    public FormCasa() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        cbxUbicacion = new javax.swing.JComboBox<>();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Area");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Ubicación");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Está amoblada?");

        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cbxUbicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avenida", "Jiron", "Pasaje" }));

        buttonGroup1.add(rbtSi);
        rbtSi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtSi.setText("Si");

        buttonGroup1.add(rbtNo);
        rbtNo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rbtNo.setText("No");

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
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
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArea)
                            .addComponent(cbxUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtNo)
                            .addComponent(rbtSi))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtSi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Casa c = new Casa();
        c.setArea(Double.parseDouble(txtArea.getText()));
        c.setUbicacion(cbxUbicacion.getSelectedItem().toString());
        if(rbtSi.isSelected())
            c.setAmoblado("Si");
        else
            c.setAmoblado("No");
        c.calcularPrecio();
        c.calcularAdicional();
        c.calcularIncremento();
        c.calcularMontoFinal();
        txtSalida.append("Area "+c.getArea());
        txtSalida.append("Precio "+c.getPrecio());
        txtSalida.append("Ubicación "+c.getUbicacion());
        txtSalida.append("Incremento "+c.getIncremento());        
        txtSalida.append("Amoblado "+c.getAmoblado());
        txtSalida.append("Adicional "+c.getAdicional());
        txtSalida.append("Monto final "+c.getMontoFinal());
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxUbicacion;
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
