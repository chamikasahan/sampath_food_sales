/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;




public class RegisterPage extends javax.swing.JFrame {

    private DrawerController drawer;

    /** Creates new form RegisterPage */
    public RegisterPage() {
        initComponents();
         drawer = Drawer.newDrawer(this)
                
                .background(new Color(90, 90, 90))
                .headerHeight(160)
                .closeOnPress(true)
                .backgroundTransparent(0.3f)
                .leftDrawer(false)
                .header(new Header())
                .space(5)
                  .itemHeight(80)
                 .itemAlignLeft(false)
                 .separator(60, Color.white)
                .addChild(new DrawerItem("Manage Users ").icon(new ImageIcon(getClass().getResource("/assets/manage_user.png"))).build())  
                
                 .addChild(new DrawerItem("Change Password ").icon(new ImageIcon(getClass().getResource("/assets/password_update.png"))).build())     
                 .addFooter(new DrawerItem("Log out ").icon(new ImageIcon(getClass().getResource("/assets/exit.png"))).build())
                .build();
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        navPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSales = new javax.swing.JButton();
        btnDataset = new javax.swing.JButton();
        btnBSP = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnPP = new javax.swing.JButton();
        btnBP = new javax.swing.JButton();
        jTabb = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/285655_user_icon.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 10, 50, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 1980, 90));

        navPanel.setBackground(new java.awt.Color(53, 53, 53));
        navPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        navPanel.setForeground(new java.awt.Color(88, 159, 255));
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sampath Food sales Dashboard");
        navPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 360, 70));

        btnSales.setBackground(new java.awt.Color(53, 53, 53));
        btnSales.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSales.setForeground(new java.awt.Color(198, 198, 198));
        btnSales.setText("Sales");
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalesMouseExited(evt);
            }
        });
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        navPanel.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 340, 60));

        btnDataset.setBackground(new java.awt.Color(53, 53, 53));
        btnDataset.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDataset.setForeground(new java.awt.Color(198, 198, 198));
        btnDataset.setText("Dataset");
        btnDataset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDatasetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDatasetMouseExited(evt);
            }
        });
        btnDataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatasetActionPerformed(evt);
            }
        });
        navPanel.add(btnDataset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 60));

        btnBSP.setBackground(new java.awt.Color(53, 53, 53));
        btnBSP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBSP.setForeground(new java.awt.Color(198, 198, 198));
        btnBSP.setText("Best Selling Products");
        btnBSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBSPMouseExited(evt);
            }
        });
        btnBSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBSPActionPerformed(evt);
            }
        });
        navPanel.add(btnBSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 340, 60));

        btnCA.setBackground(new java.awt.Color(53, 53, 53));
        btnCA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCA.setForeground(new java.awt.Color(198, 198, 198));
        btnCA.setText("Customer Analysis");
        btnCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCAMouseExited(evt);
            }
        });
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });
        navPanel.add(btnCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 340, 60));

        btnPP.setBackground(new java.awt.Color(53, 53, 53));
        btnPP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPP.setForeground(new java.awt.Color(198, 198, 198));
        btnPP.setText("Product Performance");
        btnPP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPPMouseExited(evt);
            }
        });
        btnPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPPActionPerformed(evt);
            }
        });
        navPanel.add(btnPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 340, 60));

        btnBP.setBackground(new java.awt.Color(53, 53, 53));
        btnBP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBP.setForeground(new java.awt.Color(198, 198, 198));
        btnBP.setText("Branch Performance");
        btnBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBPMouseExited(evt);
            }
        });
        btnBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBPActionPerformed(evt);
            }
        });
        navPanel.add(btnBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 340, 60));

        jPanel1.add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -17, 370, 1040));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Sales");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab1", jPanel7);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("BestProduct tab");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab2", jPanel8);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Customer analysis");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab3", jPanel9);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Product performance");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab4", jPanel10);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Brnch perfomance");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab5", jPanel11);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Dataset");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(950, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab6", jPanel12);

        jPanel1.add(jTabb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 1550, 940));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 990));

        setBounds(0, 0, 1925, 1029);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
  jTabb.setSelectedIndex(0);      
  
 
     
            
      
   
     
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseEntered
       
        
        btnSales.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnSalesMouseEntered

    private void btnSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseExited
               
                btnSales.setForeground(Color.lightGray);
               
    }//GEN-LAST:event_btnSalesMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (drawer.isShow()) {
            drawer.hide();
        }else {
            drawer.show();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnDatasetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatasetMouseEntered
       btnDataset.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnDatasetMouseEntered

    private void btnDatasetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatasetMouseExited
        btnDataset.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnDatasetMouseExited

    private void btnDatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatasetActionPerformed
         jTabb.setSelectedIndex(5);
    }//GEN-LAST:event_btnDatasetActionPerformed

    private void btnBSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBSPMouseEntered
        btnBSP.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnBSPMouseEntered

    private void btnBSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBSPMouseExited
        btnBSP.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnBSPMouseExited

    private void btnBSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBSPActionPerformed
        jTabb.setSelectedIndex(1);
    }//GEN-LAST:event_btnBSPActionPerformed

    private void btnCAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCAMouseEntered
        btnCA.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnCAMouseEntered

    private void btnCAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCAMouseExited
      btnCA.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnCAMouseExited

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
         jTabb.setSelectedIndex(2);
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnPPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPPMouseEntered
       btnPP.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnPPMouseEntered

    private void btnPPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPPMouseExited
        btnPP.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnPPMouseExited

    private void btnPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPPActionPerformed
          jTabb.setSelectedIndex(3);
    }//GEN-LAST:event_btnPPActionPerformed

    private void btnBPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBPMouseEntered
       btnBP.setForeground(Color.CYAN);
    }//GEN-LAST:event_btnBPMouseEntered

    private void btnBPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBPMouseExited
     btnBP.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnBPMouseExited

    private void btnBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBPActionPerformed
        jTabb.setSelectedIndex(4);
    }//GEN-LAST:event_btnBPActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBP;
    private javax.swing.JButton btnBSP;
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnDataset;
    private javax.swing.JButton btnPP;
    private javax.swing.JButton btnSales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabb;
    private javax.swing.JPanel navPanel;
    // End of variables declaration//GEN-END:variables

}
