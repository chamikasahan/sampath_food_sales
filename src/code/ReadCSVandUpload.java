/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import db.database;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sahan
 */
public class ReadCSVandUpload extends javax.swing.JFrame {

    public ReadCSVandUpload() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Read & Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select CSV File and Upload to Database");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jButton1)
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReadCSVAndUpload();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReadCSVAndUpload(){
           Connection conn;
        PreparedStatement pst;

        try {
            conn = database.connect();
            JFileChooser jFile = new JFileChooser();
            jFile.setDialogTitle("Select CSV file");
            
            int userSelected = jFile.showOpenDialog(null);
            
            if (userSelected == JFileChooser.APPROVE_OPTION) {
                File filePath = jFile.getSelectedFile();
                String file = filePath.getAbsolutePath();

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    boolean fstLine = true;
                    String sql = "insert into supermarket_sales (CustomerID, ProductID, ProductName, Quantity, PriceperUnit, Date, TotalPrice, Region) values(?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);

                    while ((line = br.readLine()) != null) {
                        if (fstLine) {
                            fstLine = false;
                            continue;
                        }
                        String[] val = line.split(",");
                        if (val.length == 9) {
                            pst.setString(1, val[1].trim()); // customer id
                            pst.setString(2, val[2].trim()); // p id
                            pst.setString(3, val[3].trim()); // p name
                            pst.setString(4, val[4].trim()); // quantity
                            Float price = Float.parseFloat(val[5].toString().trim()); 
                            pst.setFloat(5, price);// p p unit
                            
                            // convert the date
                            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                            java.util.Date javaDate = sdf.parse(val[6]);
                            long j1 = javaDate.getTime();
                            java.sql.Date date = new java.sql.Date(j1);
                            pst.setDate(6, date);  // date
                            Float total = Float.parseFloat(val[7].toString().trim());
                            pst.setFloat(7, total);   //total
                            pst.setString(8, val[8]);  //region
                            pst.executeUpdate();
                        }
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e);
                } catch (SQLException ex) {
                    Logger.getLogger(ReadCSVandUpload.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(ReadCSVandUpload.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "invalid file");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
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
            java.util.logging.Logger.getLogger(ReadCSVandUpload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadCSVandUpload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadCSVandUpload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadCSVandUpload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadCSVandUpload().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
