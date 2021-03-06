/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fig_Geometricas;

/**
 *
 * @author Oscar
 */
public class Frame_Figuras extends javax.swing.JFrame {

    public Frame_Figuras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_Triangulo = new javax.swing.JButton();
        B_Cuadrado = new javax.swing.JButton();
        B_Circulo = new javax.swing.JButton();
        B_Rectangulo = new javax.swing.JButton();
        Tx_1 = new javax.swing.JTextField();
        Tx_2 = new javax.swing.JTextField();
        Tx_3 = new javax.swing.JTextField();
        Tx_4 = new javax.swing.JTextField();
        Tx_5 = new javax.swing.JTextField();
        Tx_6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_salida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        B_Triangulo.setText("Triangulo");
        B_Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TrianguloActionPerformed(evt);
            }
        });

        B_Cuadrado.setText("Cuadrado");
        B_Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CuadradoActionPerformed(evt);
            }
        });

        B_Circulo.setText("circulo");
        B_Circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CirculoActionPerformed(evt);
            }
        });

        B_Rectangulo.setText("Rectangulo");
        B_Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RectanguloActionPerformed(evt);
            }
        });

        Tx_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_1ActionPerformed(evt);
            }
        });

        Tx_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_2ActionPerformed(evt);
            }
        });

        Tx_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_3ActionPerformed(evt);
            }
        });

        Tx_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_4ActionPerformed(evt);
            }
        });

        Tx_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_5ActionPerformed(evt);
            }
        });

        Tx_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tx_6ActionPerformed(evt);
            }
        });

        T_salida.setColumns(20);
        T_salida.setRows(5);
        jScrollPane1.setViewportView(T_salida);

        jLabel1.setText("Base");

        jLabel2.setText("Altura");

        jLabel3.setText("Lado");

        jLabel4.setText("Lado 1");

        jLabel5.setText("Lado 2");

        jLabel6.setText("Radio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(B_Rectangulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tx_1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tx_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(B_Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tx_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tx_5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tx_6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tx_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_Triangulo)
                            .addComponent(Tx_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tx_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Cuadrado)
                            .addComponent(Tx_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Circulo)
                    .addComponent(Tx_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Rectangulo)
                    .addComponent(Tx_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tx_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tx_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_2ActionPerformed

    private void B_TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TrianguloActionPerformed
        // TODO add your handling code here:

        int num1;
        int num2;
        if (Tx_5.getText().length() > 0 && Tx_6.getText().length() > 0) {
            num1 = Integer.parseInt(Tx_5.getText());
            num2 = Integer.parseInt(Tx_6.getText());
            Triangulo triangulo = new Triangulo(num1, num2);
            T_salida.setText("??rea: " + triangulo.area() + "\n" + "Perimetro: " + triangulo.perimetro());

        }


    }//GEN-LAST:event_B_TrianguloActionPerformed

    private void B_CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CuadradoActionPerformed
        // TODO add your handling code here:
        int num1;
        if (Tx_3.getText().length() > 0) {
            num1 = Integer.parseInt(Tx_3.getText());
            Cuadrado cuadrado = new Cuadrado(num1);
            T_salida.setText("??rea: " + cuadrado.area() + "\n" + "Perimetro: " + cuadrado.perimetro());

        }

    }//GEN-LAST:event_B_CuadradoActionPerformed

    private void Tx_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Tx_1ActionPerformed

    private void Tx_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_3ActionPerformed

    private void Tx_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_4ActionPerformed

    private void Tx_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_5ActionPerformed

    private void Tx_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tx_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tx_6ActionPerformed

    private void B_CirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CirculoActionPerformed
        // TODO add your handling code here:
        int num1;
        if (Tx_4.getText().length() > 0) {
            num1 = Integer.parseInt(Tx_4.getText());
            Circulo circulo = new Circulo(num1);
            T_salida.setText("??rea: " + circulo.area() + "\n" + "Perimetro: " + circulo.perimetro());

        }
    }//GEN-LAST:event_B_CirculoActionPerformed

    private void B_RectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RectanguloActionPerformed
        // TODO add your handling code here:
        int num1;
        int num2;
        if (Tx_1.getText().length() > 0 && Tx_2.getText().length() > 0) {
            num1 = Integer.parseInt(Tx_1.getText());
            num2 = Integer.parseInt(Tx_1.getText());
            Rectangulo rectangulo = new Rectangulo(num1, num2);
            T_salida.setText("??rea: " + rectangulo.area() + "\n" + "Perimetro: " + rectangulo.perimetro());

        }
    }//GEN-LAST:event_B_RectanguloActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Circulo;
    private javax.swing.JButton B_Cuadrado;
    private javax.swing.JButton B_Rectangulo;
    private javax.swing.JButton B_Triangulo;
    private javax.swing.JTextArea T_salida;
    private javax.swing.JTextField Tx_1;
    private javax.swing.JTextField Tx_2;
    private javax.swing.JTextField Tx_3;
    private javax.swing.JTextField Tx_4;
    private javax.swing.JTextField Tx_5;
    private javax.swing.JTextField Tx_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
