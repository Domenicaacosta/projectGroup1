/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.view;

import ec.espe.edu.GeographicInnformationSystem.controller.GeographicCoordenateController;
import ec.espe.edu.GeographicInnformationSystem.controller.ScaleController;
import ec.espe.edu.GeographicInnformationSystem.controller.UtmCoordenateController;
import ec.espe.edu.GeographicInnformationSystem.model.GeographicCoordenate;
import ec.espe.edu.GeographicInnformationSystem.model.Scale;
import ec.espe.edu.GeographicInnformationSystem.model.UtmCoordenate;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica
 */
public class frmCoordenates extends javax.swing.JFrame {

    /**
     * Creates new form frmCoordenates
     */
    public frmCoordenates() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitude = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLatitude = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaShowGeographicCoordinates = new javax.swing.JTextArea();
        btnShowGeographicCoordinate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMeridian = new javax.swing.JTextField();
        txtParalel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMeridianCm = new javax.swing.JTextField();
        txtParalelCm = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaShowUtmCoordenates = new javax.swing.JTextArea();
        btnShowUtmCoordenate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtScale = new javax.swing.JTextField();
        btnCalculateScale = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaShowScale = new javax.swing.JTextArea();
        btnShowScale = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 14)); // NOI18N
        jLabel1.setText("GET COORDENATES");

        jLabel2.setText("Enter longitude in cm:");

        jLabel3.setText("Enter latitude in cm:");

        jButton1.setText("Calculate Geographic Coordenates");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AreaShowGeographicCoordinates.setColumns(20);
        AreaShowGeographicCoordinates.setRows(5);
        jScrollPane1.setViewportView(AreaShowGeographicCoordinates);

        btnShowGeographicCoordinate.setText("Show Geographic Coordenates");
        btnShowGeographicCoordinate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowGeographicCoordinateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jLabel4.setText("UTM Coordenates");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jLabel5.setText("Geographic Coordenates");

        jLabel6.setText("Enter UTM Meridian: ");

        jLabel7.setText("Enter UTM Paralel: ");

        jLabel8.setText("Enter UTM Meridian Cm: ");

        jLabel9.setText("Enter UTM Paralel Cm: ");

        jButton2.setText("Calculate UTM coordenates");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        AreaShowUtmCoordenates.setColumns(20);
        AreaShowUtmCoordenates.setRows(5);
        jScrollPane2.setViewportView(AreaShowUtmCoordenates);

        btnShowUtmCoordenate.setText("Show UTM Coordenates");

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        jLabel10.setText("Scale Transformation");

        jLabel11.setText("Enter Scale: ");

        btnCalculateScale.setText("Calculate Scale");
        btnCalculateScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateScaleActionPerformed(evt);
            }
        });

        AreaShowScale.setColumns(20);
        AreaShowScale.setRows(5);
        jScrollPane3.setViewportView(AreaShowScale);

        btnShowScale.setText("jButton3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLongitude)
                            .addComponent(txtLatitude, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(txtMeridian)
                            .addComponent(txtParalel)
                            .addComponent(txtMeridianCm)
                            .addComponent(txtParalelCm)
                            .addComponent(txtScale))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowUtmCoordenate)
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCalculateScale)
                                                .addGap(81, 81, 81))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(174, 174, 174)
                                        .addComponent(btnShowGeographicCoordinate)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnShowScale)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowGeographicCoordinate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMeridian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtParalel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtMeridianCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtParalelCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowUtmCoordenate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculateScale))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowScale)
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float longitude;
        float latitude;
        int longitudeGrade = 78;
        float minutesLongitude;
        float decimalPartLongitude;
        float wholePartLongitude;
        float secondsLongitude;
        float latitudeGrade = 0;
        float minutesLatitude;
        float decimalPartLatitude;
        float wholePartLatitude;
        float secondsLatitude;
        GeographicCoordenateController geographicCoordenateController = new GeographicCoordenateController();
        GeographicCoordenate geographicCoordenate;

        longitude = Float.parseFloat(txtLongitude.getText());
        latitude = Float.parseFloat(txtLatitude.getText());

        geographicCoordenate = new GeographicCoordenate(longitude, latitude);
        geographicCoordenateController.save(geographicCoordenate);
        minutesLongitude = geographicCoordenateController.calculateMinutesLongitude(longitude);
        decimalPartLongitude = geographicCoordenateController.calculateDecimalPartLongitude(minutesLongitude);

        wholePartLongitude = geographicCoordenateController.calculateWholePartLongitude(minutesLongitude, decimalPartLongitude);
        secondsLongitude = geographicCoordenateController.calculateSecondsLongitude(decimalPartLongitude);
        minutesLatitude = geographicCoordenateController.calculateMinutesLatitude(latitude);
        decimalPartLatitude = geographicCoordenateController.calculateDecimalPartLatitude(minutesLatitude);
        secondsLatitude = geographicCoordenateController.calculateSecondsLatitude(decimalPartLatitude);
        wholePartLatitude = geographicCoordenateController.calculateWholaPartLatitude(minutesLatitude, decimalPartLatitude);
        JOptionPane.showMessageDialog(rootPane, "longitude is --> " + longitudeGrade + "° " + secondsLongitude + "' " + wholePartLongitude + "'' " + "O" + "\n" + "latitude is --> " + latitudeGrade + "° " + wholePartLatitude + "' " + secondsLatitude + "'' " + "S");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnShowGeographicCoordinateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowGeographicCoordinateActionPerformed
        GeographicCoordenateController geographicCoordenateController = new GeographicCoordenateController();
        btnShowGeographicCoordinate.setText(geographicCoordenateController.read());
    }//GEN-LAST:event_btnShowGeographicCoordinateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UtmCoordenate utmCoordenate;

        float utmMeridian;
        float utmParalel;
        float utmMeridianCm;
        float utmParalelCm;
        float meridian;
        float paralel;
        float meridianCm;
        float paralelCm;
        float meridianCoordenate;
        float paralelCoordenate;

        UtmCoordenateController utmCoordenateController = new UtmCoordenateController();

        utmMeridian = Float.parseFloat(txtMeridian.getText());
        utmParalel = Float.parseFloat(txtParalel.getText());
        utmMeridianCm = Float.parseFloat(txtMeridianCm.getText());
        utmParalelCm = Float.parseFloat(txtParalelCm.getText());

        meridian = utmCoordenateController.calculateUtmMeridian(utmMeridian);
        paralel = utmCoordenateController.calculateUtmParalel(utmParalel);
        meridianCm = utmCoordenateController.calculateUtmMeridianCm(utmMeridianCm);
        paralelCm = utmCoordenateController.calculateUtmParalelCm(utmParalelCm);
        meridianCoordenate = meridian + meridianCm;
        paralelCoordenate = paralel + paralelCm;

        JOptionPane.showMessageDialog(rootPane, meridianCoordenate + " X" + "\n" + paralelCoordenate + " Y");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCalculateScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateScaleActionPerformed
        int finalScale;
        int scaleTransformation;
        Scale scale;

        ScaleController scaleController = new ScaleController();

        finalScale = Integer.parseInt(txtScale.getText());

        scaleTransformation = scaleController.calculateScale(finalScale);

        JOptionPane.showMessageDialog(rootPane, "The scale 1: " + finalScale + " means 1cm in the map is " + scaleTransformation + " m in the reality ");
    }//GEN-LAST:event_btnCalculateScaleActionPerformed

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
            java.util.logging.Logger.getLogger(frmCoordenates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCoordenates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCoordenates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCoordenates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCoordenates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaShowGeographicCoordinates;
    private javax.swing.JTextArea AreaShowScale;
    private javax.swing.JTextArea AreaShowUtmCoordenates;
    private javax.swing.JButton btnCalculateScale;
    private javax.swing.JButton btnShowGeographicCoordinate;
    private javax.swing.JButton btnShowScale;
    private javax.swing.JButton btnShowUtmCoordenate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtLatitude;
    private javax.swing.JTextField txtLongitude;
    private javax.swing.JTextField txtMeridian;
    private javax.swing.JTextField txtMeridianCm;
    private javax.swing.JTextField txtParalel;
    private javax.swing.JTextField txtParalelCm;
    private javax.swing.JTextField txtScale;
    // End of variables declaration//GEN-END:variables
}
