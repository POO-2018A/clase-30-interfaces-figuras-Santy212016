
package interfaces;

public class PrincipalFiguras extends javax.swing.JFrame {

   
    
    public PrincipalFiguras() {
        initComponents();
        this.setTitle("Interfaces");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbFiguraGeometrica = new javax.swing.JComboBox<>();
        lblFigura = new javax.swing.JLabel();
        JpanelCuadrado = new javax.swing.JPanel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();
        lblCuadrado = new javax.swing.JLabel();
        JpanelRectangulo = new javax.swing.JPanel();
        lblLadoRecA = new javax.swing.JLabel();
        lblLadoRecB = new javax.swing.JLabel();
        txtLadoRecA = new javax.swing.JTextField();
        txtLadoRecB = new javax.swing.JTextField();
        lblRectangulo = new javax.swing.JLabel();
        JpanelTriangulo = new javax.swing.JPanel();
        lblTriangulo = new javax.swing.JLabel();
        lblBaseT = new javax.swing.JLabel();
        lblAlturaT = new javax.swing.JLabel();
        txtBaseT = new javax.swing.JTextField();
        txtAlturaT = new javax.swing.JTextField();
        JpanelCirculo = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        lblCirculo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblAreaValor = new javax.swing.JLabel();
        lblPerimetroValor = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFiguraGeometrica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Triangulo", "Circulo" }));
        cmbFiguraGeometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiguraGeometricaActionPerformed(evt);
            }
        });

        lblFigura.setText("Elija la Figura :");

        JpanelCuadrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLadoC.setText("Lado");

        lblCuadrado.setText("CUADRADO");

        javax.swing.GroupLayout JpanelCuadradoLayout = new javax.swing.GroupLayout(JpanelCuadrado);
        JpanelCuadrado.setLayout(JpanelCuadradoLayout);
        JpanelCuadradoLayout.setHorizontalGroup(
            JpanelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelCuadradoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblCuadrado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLadoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        JpanelCuadradoLayout.setVerticalGroup(
            JpanelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelCuadradoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCuadrado)
                .addGap(33, 33, 33)
                .addGroup(JpanelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLadoC))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        JpanelRectangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLadoRecA.setText("Lado a");

        lblLadoRecB.setText("Lado b");

        txtLadoRecB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoRecBActionPerformed(evt);
            }
        });

        lblRectangulo.setText("RECTANGULO");

        javax.swing.GroupLayout JpanelRectanguloLayout = new javax.swing.GroupLayout(JpanelRectangulo);
        JpanelRectangulo.setLayout(JpanelRectanguloLayout);
        JpanelRectanguloLayout.setHorizontalGroup(
            JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLadoRecB)
                    .addComponent(lblLadoRecA))
                .addGap(30, 30, 30)
                .addGroup(JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRectangulo)
                    .addComponent(txtLadoRecA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLadoRecB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        JpanelRectanguloLayout.setVerticalGroup(
            JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelRectanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoRecA)
                    .addComponent(txtLadoRecA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoRecB)
                    .addComponent(txtLadoRecB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        JpanelTriangulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTriangulo.setText("TRIANGULO");

        lblBaseT.setText("Base");

        lblAlturaT.setText("Altura");

        javax.swing.GroupLayout JpanelTrianguloLayout = new javax.swing.GroupLayout(JpanelTriangulo);
        JpanelTriangulo.setLayout(JpanelTrianguloLayout);
        JpanelTrianguloLayout.setHorizontalGroup(
            JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTrianguloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlturaT)
                    .addComponent(lblBaseT))
                .addGap(20, 20, 20)
                .addGroup(JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTriangulo)
                    .addGroup(JpanelTrianguloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelTrianguloLayout.setVerticalGroup(
            JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseT)
                    .addComponent(txtBaseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JpanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaT)
                    .addComponent(txtAlturaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpanelCirculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRadio.setText("Radio");

        lblCirculo.setText("CIRCULO");

        javax.swing.GroupLayout JpanelCirculoLayout = new javax.swing.GroupLayout(JpanelCirculo);
        JpanelCirculo.setLayout(JpanelCirculoLayout);
        JpanelCirculoLayout.setHorizontalGroup(
            JpanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRadio)
                .addGroup(JpanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelCirculoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblCirculo))
                    .addGroup(JpanelCirculoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelCirculoLayout.setVerticalGroup(
            JpanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCirculo)
                .addGap(18, 18, 18)
                .addGroup(JpanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText(" AREA:");

        jLabel2.setText(" PERIMETRO :");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblAreaValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblPerimetroValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPerimetroValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAreaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAreaValor, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerimetroValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JpanelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(JpanelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFiguraGeometrica, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JpanelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JpanelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiguraGeometrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFigura))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JpanelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(JpanelCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JpanelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JpanelCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiguraGeometricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiguraGeometricaActionPerformed
     
            JpanelCirculo.setVisible(true);
            JpanelTriangulo.setVisible(true);
            JpanelRectangulo.setVisible(true);
            JpanelCuadrado.setVisible(true);
        
        
        if(cmbFiguraGeometrica.getSelectedItem().equals("Cuadrado")){
            JpanelCirculo.setVisible(false);
            JpanelTriangulo.setVisible(false);
            JpanelRectangulo.setVisible(false);
            
        }else if(cmbFiguraGeometrica.getSelectedItem().equals("Rectangulo")){
            JpanelCirculo.setVisible(false);
            JpanelTriangulo.setVisible(false);
            JpanelCuadrado.setVisible(false);
            
        }else if(cmbFiguraGeometrica.getSelectedItem().equals("Triangulo")){
            JpanelRectangulo.setVisible(false);
            JpanelCirculo.setVisible(false);
            JpanelCuadrado.setVisible(false);
            
        }else if(cmbFiguraGeometrica.getSelectedItem().equals("Circulo")){
            JpanelRectangulo.setVisible(false);
            JpanelTriangulo.setVisible(false);
            JpanelCuadrado.setVisible(false);
            
        }

        
    }//GEN-LAST:event_cmbFiguraGeometricaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
   
        if (cmbFiguraGeometrica.getSelectedItem().equals("Cuadrado")) {
            Figura f1 = new Cuadrado();
            double lado = Double.parseDouble(txtLadoC.getText());
            double cuadrado = f1.calcularArea(lado,0);
            String Cuadrado = String.valueOf(cuadrado);
            lblAreaValor.setText("El area del cuadrado es : "+Cuadrado+ "   m2");
            //perimetero
            double ladoP = Double.parseDouble(txtLadoC.getText());
            double cuadrado1 = f1.calcularPerimetro(ladoP,0,0);
            String CuadradoP = String.valueOf(cuadrado1);
            lblPerimetroValor.setText("El perimetro del cuadrado es : "+CuadradoP+ "   m");
            
            
        } else if (cmbFiguraGeometrica.getSelectedItem().equals("Rectangulo")) {
            Figura f1 = new Rectangulo();
            double lado1 = Double.parseDouble(txtLadoRecA.getText());
            double lado2 = Double.parseDouble(txtLadoRecB.getText());
            double rectangulo = f1.calcularArea(lado1,lado2);
            String Rectangulo = String.valueOf(rectangulo);
            lblAreaValor.setText("El area del rectangulo es : "+Rectangulo+ "   m2");
            //perimetro
            double lado1P = Double.parseDouble(txtLadoRecA.getText());
            double lado2P = Double.parseDouble(txtLadoRecB.getText());
            double rectanguloP = f1.calcularPerimetro(lado1P,lado2P,1);
                String RectanguloP = String.valueOf(rectanguloP);
            lblPerimetroValor.setText("El perimetro del rectangulo es : "+RectanguloP+ "   m");
            
            
        } else if (cmbFiguraGeometrica.getSelectedItem().equals("Triangulo")) {
            Figura f1 = new Triangulo();
            double baseT = Double.parseDouble(txtBaseT.getText());
            double alturaT = Double.parseDouble(txtAlturaT.getText());
            double triangulo = f1.calcularArea(baseT,alturaT);
            String Triangulo = String.valueOf(triangulo);
            lblAreaValor.setText("El area del triangulo es : "+Triangulo+ "   m2");
            //perimetro
            double base = Double.parseDouble(txtBaseT.getText());
            double trianguloP = f1.calcularPerimetro(base,base,base);
            String TrianguloP = String.valueOf(trianguloP);
            lblPerimetroValor.setText("El perimetro del triangulo es : "+TrianguloP+ "   m");
            
            
        } else if (cmbFiguraGeometrica.getSelectedItem().equals("Circulo")) {
            Figura f1 = new Circulo();
            double radio = Double.parseDouble(txtRadio.getText());
            double circulo = f1.calcularArea(radio,0);
            String Circulo = String.valueOf(circulo);
            lblAreaValor.setText("El area del circulo es : "+Circulo+ "   m2");
            //perimetro
            double radioP = Double.parseDouble(txtRadio.getText());
            double circuloP = f1.calcularPerimetro(radioP,0,0);
            String CirculoP = String.valueOf(circuloP);
            lblPerimetroValor.setText("El perimetro del circulo es : "+CirculoP+ "   m");
           
            
        } 
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLadoRecBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoRecBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoRecBActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFiguras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFiguras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelCirculo;
    private javax.swing.JPanel JpanelCuadrado;
    private javax.swing.JPanel JpanelRectangulo;
    private javax.swing.JPanel JpanelTriangulo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbFiguraGeometrica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlturaT;
    private javax.swing.JLabel lblAreaValor;
    private javax.swing.JLabel lblBaseT;
    private javax.swing.JLabel lblCirculo;
    private javax.swing.JLabel lblCuadrado;
    private javax.swing.JLabel lblFigura;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblLadoRecA;
    private javax.swing.JLabel lblLadoRecB;
    private javax.swing.JLabel lblPerimetroValor;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRectangulo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JTextField txtAlturaT;
    private javax.swing.JTextField txtBaseT;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtLadoRecA;
    private javax.swing.JTextField txtLadoRecB;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
