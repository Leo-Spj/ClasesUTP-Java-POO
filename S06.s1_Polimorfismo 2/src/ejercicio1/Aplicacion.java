package ejercicio1;

public class Aplicacion extends javax.swing.JFrame {
    int indice, indTipo;
    
    public Aplicacion() {
        initComponents();
        todosInvisible();
    }
    
    private void todosInvisible(){
        lblLado1.setVisible(false);
        txtLado1.setVisible(false);
        lblLado2.setVisible(false);
        txtLado2.setVisible(false);
        lblLado3.setVisible(false);
        txtLado3.setVisible(false);
        lblTipo.setVisible(false);
        cbxTipo.setVisible(false);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        lblLado2 = new javax.swing.JLabel();
        cbxFigura = new javax.swing.JComboBox<>();
        lblLado3 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btnCalcuñar = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Elija figura geométrica");

        lblLado1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLado1.setText("Lado 1");

        lblLado2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLado2.setText("Lado 2");

        cbxFigura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuadrado", "Rectángulo", "Triángulo" }));
        cbxFigura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFiguraItemStateChanged(evt);
            }
        });

        lblLado3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLado3.setText("Lado 3");

        txtLado1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado1KeyPressed(evt);
            }
        });

        txtLado2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLado2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado2KeyPressed(evt);
            }
        });

        txtLado3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtLado3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLado3KeyPressed(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        btnCalcuñar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCalcuñar.setText("Calcular");
        btnCalcuñar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcuñarActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTipo.setText("Elija triángulo");

        cbxTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Conociendo sus 3 lados", "Conociendo un angulo", "Conociendo su base y altura" }));
        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTipo)
                            .addComponent(lblLado1)
                            .addComponent(lblLado2)
                            .addComponent(lblLado3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(btnCalcuñar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcuñar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTipo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLado1)
                        .addGap(18, 18, 18)
                        .addComponent(lblLado2)
                        .addGap(27, 27, 27)
                        .addComponent(lblLado3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFiguraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFiguraItemStateChanged
        indice = cbxFigura.getSelectedIndex();
        txtLado1.setText(null);
        txtLado2.setText(null);
        txtLado3.setText(null);
        txtSalida.setText(null);
        switch(indice){
            case 0: todosInvisible();
                    break;
            case 1: lblLado1.setVisible(true);
                    txtLado1.setVisible(true);
                    lblLado2.setVisible(false);
                    txtLado2.setVisible(false);
                    lblLado3.setVisible(false);
                    txtLado3.setVisible(false);
                    break;
            case 2: lblLado1.setVisible(true);
                    txtLado1.setVisible(true);
                    lblLado2.setVisible(true);
                    txtLado2.setVisible(true);
                    lblLado3.setVisible(false);
                    txtLado3.setVisible(false);
                    break;
            case 3: lblLado1.setVisible(false);
                    txtLado1.setVisible(false);
                    lblLado2.setVisible(false);
                    txtLado2.setVisible(false);
                    lblLado3.setVisible(false);
                    txtLado3.setVisible(false);
                    lblTipo.setVisible(true);
                    cbxTipo.setVisible(true);
                    break;
        }
    }//GEN-LAST:event_cbxFiguraItemStateChanged

    private void btnCalcuñarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcuñarActionPerformed
        switch(indice){
            case 1: Cuadrado c = new Cuadrado();
                    c.setLado1(Double.parseDouble(txtLado1.getText()));
                    c.calcularArea();
                    txtSalida.append("El area es "+c.getArea());
                    break;
            case 2: Rectangulo r = new Rectangulo();
                    r.setLado1(Double.parseDouble(txtLado1.getText()));
                    r.setLado2(Double.parseDouble(txtLado2.getText()));
                    r.calcularArea();
                    txtSalida.append("El area es "+r.getArea());
                    break;
            case 3: calcularAreaTriangulo();
                    break;
        }
    }//GEN-LAST:event_btnCalcuñarActionPerformed

    public void calcularAreaTriangulo(){
        Triangulo t = new Triangulo();
                    switch (indTipo) {
                        case 0: lblLado1.setVisible(false);
                                txtLado1.setVisible(false);
                                lblLado2.setVisible(false);
                                txtLado2.setVisible(false);
                                lblLado3.setVisible(false);
                                txtLado3.setVisible(false);
                                break;  
                        case 1: t.setLado1(Double.parseDouble(txtLado1.getText()));
                                t.setLado2(Double.parseDouble(txtLado2.getText()));
                                t.setLado3(Double.parseDouble(txtLado3.getText()));
                                t.calcularArea();
                                break;
                        case 2: t.setLado1(Double.parseDouble(txtLado1.getText()));
                                t.setLado2(Double.parseDouble(txtLado2.getText()));
                                double ang = Double.parseDouble(txtLado3.getText());
                                t.calcularArea(ang);
                                break;
                        case 3: double b = Double.parseDouble(txtLado1.getText());
                                double h = Double.parseDouble(txtLado2.getText());
                                t.calcularArea(b, h);
                                break;
                    }                    
                    txtSalida.append("El area es "+t.getArea());
    }
    
    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        indTipo = cbxTipo.getSelectedIndex();
        txtLado1.setText(null);
        txtLado2.setText(null);
        txtLado3.setText(null);
        txtSalida.setText(null);
        txtLado1.requestFocus();
        switch (indTipo) {
            case 0: lblLado1.setVisible(false);
                    txtLado1.setVisible(false);
                    lblLado2.setVisible(false);
                    txtLado2.setVisible(false);
                    lblLado3.setVisible(false);
                    txtLado3.setVisible(false);
                    break;
            case 1: lblLado1.setVisible(true);
                    txtLado1.setVisible(true);
                    lblLado2.setVisible(true);
                    txtLado2.setVisible(true);
                    lblLado3.setVisible(true);
                    txtLado3.setVisible(true);
                    break;
            case 2: lblLado1.setVisible(true);
                    txtLado1.setVisible(true);
                    lblLado2.setVisible(true);
                    txtLado2.setVisible(true);
                    lblLado3.setVisible(true);
                    lblLado3.setText("Angulo");
                    txtLado3.setVisible(true);                    
                    break;
            case 3: lblLado1.setVisible(true);
                    lblLado1.setText("Base");
                    txtLado1.setVisible(true);
                    lblLado2.setVisible(true);
                    lblLado2.setText("Altura");
                    txtLado2.setVisible(true);
                    lblLado3.setVisible(false);
                    txtLado3.setVisible(false);                    
                    break;
        }
    }//GEN-LAST:event_cbxTipoItemStateChanged

    private void txtLado1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado1KeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER)
            txtLado2.requestFocus();
    }//GEN-LAST:event_txtLado1KeyPressed

    private void txtLado2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado2KeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER)
            txtLado3.requestFocus();
    }//GEN-LAST:event_txtLado2KeyPressed

    private void txtLado3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLado3KeyPressed
        calcularAreaTriangulo();
    }//GEN-LAST:event_txtLado3KeyPressed

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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcuñar;
    private javax.swing.JComboBox<String> cbxFigura;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
