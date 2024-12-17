/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.EmployeeTableLoad;
import code.RegisterForm;
import db.database;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainPage extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form RegisterPage
     */
    public MainPage() {
        initComponents();
        header();
        loadTable();
        //btnClear.hide();
        showuserDetails();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabb = new javax.swing.JTabbedPane();
        panelBSP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelProduct = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelBranch = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelSales = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelDataset = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelManageUsers = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        cPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtFIndEmployee = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        panelChangepwd = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jPasswordField5 = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 53, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("FMEconbld", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sampath Food sales Dashboard");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, 550, 70));

        jTabb.setBackground(new java.awt.Color(51, 51, 51));

        panelBSP.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("BSP");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(53, 53, 53));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Tab Title");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 110, -1));

        javax.swing.GroupLayout panelBSPLayout = new javax.swing.GroupLayout(panelBSP);
        panelBSP.setLayout(panelBSPLayout);
        panelBSPLayout.setHorizontalGroup(
            panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBSPLayout.createSequentialGroup()
                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 2330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBSPLayout.setVerticalGroup(
            panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBSPLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
        );

        jTabb.addTab("tab1", panelBSP);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Customer analysis");

        javax.swing.GroupLayout panelCustomerLayout = new javax.swing.GroupLayout(panelCustomer);
        panelCustomer.setLayout(panelCustomerLayout);
        panelCustomerLayout.setHorizontalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1320, Short.MAX_VALUE))
        );
        panelCustomerLayout.setVerticalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab2", panelCustomer);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("product performance");

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1320, Short.MAX_VALUE))
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab3", panelProduct);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Branch perofrmance");

        javax.swing.GroupLayout panelBranchLayout = new javax.swing.GroupLayout(panelBranch);
        panelBranch.setLayout(panelBranchLayout);
        panelBranchLayout.setHorizontalGroup(
            panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBranchLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1320, Short.MAX_VALUE))
        );
        panelBranchLayout.setVerticalGroup(
            panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBranchLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab4", panelBranch);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Sales");

        javax.swing.GroupLayout panelSalesLayout = new javax.swing.GroupLayout(panelSales);
        panelSales.setLayout(panelSalesLayout);
        panelSalesLayout.setHorizontalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1320, Short.MAX_VALUE))
        );
        panelSalesLayout.setVerticalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab5", panelSales);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Dataset");

        javax.swing.GroupLayout panelDatasetLayout = new javax.swing.GroupLayout(panelDataset);
        panelDataset.setLayout(panelDatasetLayout);
        panelDatasetLayout.setHorizontalGroup(
            panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasetLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1320, Short.MAX_VALUE))
        );
        panelDatasetLayout.setVerticalGroup(
            panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasetLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(554, Short.MAX_VALUE))
        );

        jTabb.addTab("tab6", panelDataset);

        panelManageUsers.setBackground(new java.awt.Color(255, 255, 255));
        panelManageUsers.setForeground(new java.awt.Color(255, 255, 255));
        panelManageUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelManageUsersMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(201, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Confirm Password");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Password");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Email");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "register as", "Employee", "Admin" }));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Register as: ");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Username");

        btnRegister.setBackground(new java.awt.Color(51, 0, 204));
        btnRegister.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register Employee");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 193, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update Employee");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Username", "role", "email", "password"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Find Employee using ID");

        txtFIndEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFIndEmployeeMouseClicked(evt);
            }
        });
        txtFIndEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFIndEmployeeActionPerformed(evt);
            }
        });
        txtFIndEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFIndEmployeeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFIndEmployeeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFIndEmployeeKeyTyped(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelManageUsersLayout = new javax.swing.GroupLayout(panelManageUsers);
        panelManageUsers.setLayout(panelManageUsersLayout);
        panelManageUsersLayout.setHorizontalGroup(
            panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManageUsersLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelManageUsersLayout.createSequentialGroup()
                        .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelManageUsersLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addGap(605, 605, 605))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelManageUsersLayout.createSequentialGroup()
                        .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboRole, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelManageUsersLayout.createSequentialGroup()
                        .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFIndEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        panelManageUsersLayout.setVerticalGroup(
            panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManageUsersLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(9, 9, 9)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFIndEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManageUsersLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );

        jTabb.addTab("tab7", panelManageUsers);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("New Password");

        jPasswordField3.setText("jPasswordField1");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("Confirm New Password");

        jPasswordField4.setText("jPasswordField1");

        jButton6.setText("Update Password");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPasswordField5.setText("jPasswordField1");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Old Password");

        javax.swing.GroupLayout panelChangepwdLayout = new javax.swing.GroupLayout(panelChangepwd);
        panelChangepwd.setLayout(panelChangepwdLayout);
        panelChangepwdLayout.setHorizontalGroup(
            panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangepwdLayout.createSequentialGroup()
                .addGroup(panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelChangepwdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelChangepwdLayout.createSequentialGroup()
                        .addGap(603, 603, 603)
                        .addGroup(panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(jLabel11)
                                .addComponent(jPasswordField4)
                                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(895, Short.MAX_VALUE))
        );
        panelChangepwdLayout.setVerticalGroup(
            panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangepwdLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        jTabb.addTab("tab8", panelChangepwd);

        jPanel1.add(jTabb, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1920, 940));

        jButton1.setBackground(new java.awt.Color(53, 53, 53));
        jButton1.setForeground(new java.awt.Color(198, 198, 198));
        jButton1.setText("| | |");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1910, 990));

        setBounds(0, 0, 1925, 1029);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (drawer.isShow()) {
            drawer.hide();

        } else {
            drawer.show();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        registerValidation();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtFIndEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFIndEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFIndEmployeeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtFIndEmployeeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFIndEmployeeKeyReleased
        findEmployee();
    }//GEN-LAST:event_txtFIndEmployeeKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearTable();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtFIndEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFIndEmployeeMouseClicked

    }//GEN-LAST:event_txtFIndEmployeeMouseClicked

    private void txtFIndEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFIndEmployeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_txtFIndEmployeeKeyPressed

    private void txtFIndEmployeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFIndEmployeeKeyTyped

    }//GEN-LAST:event_txtFIndEmployeeKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


    }//GEN-LAST:event_jButton3ActionPerformed

    private void panelManageUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelManageUsersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelManageUsersMouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    /*
         **   Method for register employee
     */
    public void registerValidation() {

        String userName = txtUserName.getText();
        String userEmail = txtEmail.getText();
        int userRole = comboRole.getSelectedIndex();
        String userPassword = password.getText();
        String cUserPassword = cPassword.getText();
        String textRole = " ";

        new RegisterForm(userName, userEmail, userRole, userPassword, cUserPassword, textRole);
        loadTable();

    }

    /*
         **   Method for Clear table
     */
    public void clearTable() {
        DefaultTableModel tb = (DefaultTableModel) employeeTable.getModel();
        tb.setRowCount(0);
        txtFIndEmployee.setText(" ");
        showuserDetails();

    }

    /*
        
        ** method for load table
     */
//        public void loadTable(){
//            
//            new EmployeeTableLoad(employeeTable);
//        }
    ArrayList<EmployeeTableLoad> loadTable() {
        Connection conn;
        Statement st;
        ResultSet rs;
        ArrayList<EmployeeTableLoad> loadtable = new ArrayList<>();
        try {
            conn = database.connect();
            st = conn.createStatement();
            String sql = "select id,username,role,email  from signup_details";
            rs = st.executeQuery(sql);

            while (rs.next()) {

                EmployeeTableLoad load = new EmployeeTableLoad(rs.getInt("id"), rs.getString("username"), rs.getString("role"), rs.getString("email"));

                loadtable.add(load);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return loadtable;

    }

//    Print table 
    /*
    try{
    employeeTable.print(jTable.printmMode.FIT_WIDTH)
    }
    catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);
    
    }
    
    
    
    
     */
    public void showuserDetails() {
        ArrayList<EmployeeTableLoad> show = loadTable();
        DefaultTableModel tb = (DefaultTableModel) employeeTable.getModel();
        System.out.println("dtdgdrfg");
        Object[] row = new Object[4];
        for (int i = 0; i < show.size(); i++) {

            row[0] = show.get(i).getId();
            row[1] = show.get(i).getUserName();
            row[2] = show.get(i).getUserEmail();
            row[3] = show.get(i).getUserRole();
            tb.addRow(row);
        }
    }

    /*
         **   Method for find employee details
     */
    public void findEmployee() {

        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        String id = txtFIndEmployee.getText();

        try {

            conn = database.connect();
            DefaultTableModel tb = (DefaultTableModel) employeeTable.getModel();
            tb.setRowCount(0);
            String sql = "select * from signup_details where id=  '" + id + " '  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));

                tb.addRow(v);

            }
            btnClear.show();
            conn.close();
            pst.close();

        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
         **   Method for Side bar 
    
     */
    public void header() {

        drawer = Drawer.newDrawer(this)
                .drawerBackground(Color.white)
                .background(Color.black)
                .headerHeight(160)
                .closeOnPress(true)
                //                .backgroundTransparent(0.3f)
                .leftDrawer(true)
                .header(new Header())
                .headerHeight(220)
                .itemHeight(70)
                .itemAlignLeft(true)
                .separator(30, Color.white)
                .addChild(new DrawerItem("Best Selling Products ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/product.png"))).build())
                .addChild(new DrawerItem("Customer Analysis ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/customer_analysis.png"))).build())
                .addChild(new DrawerItem("Product Performance ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/product_per.png"))).build())
                .addChild(new DrawerItem("Branch Performance ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/branch.png"))).build())
                .addChild(new DrawerItem("Sales ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/sales.png"))).build())
                .addChild(new DrawerItem("Dataset ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/dataset.png"))).build())
                .separator(100, Color.white)
                .addChild(new DrawerItem("Manage Users ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/manage_users.png"))).build())
                .addChild(new DrawerItem("Change Password ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/change_pwd.png"))).build())
                .addFooter(new DrawerItem("Log out ").effectColor(Color.blue).icon(new ImageIcon(getClass().getResource("/assets/exit.png"))).build())
                /*
                Action event for the drawerItems
                
                 */
                .event((int index, DrawerItem item) -> {

                    switch (index) {
                        case 0:
                            jTabb.setSelectedIndex(0);
                            drawer.hide();
                            break;
                        case 1:
                            jTabb.setSelectedIndex(1);
                            drawer.hide();
                            break;
                        case 2:
                            jTabb.setSelectedIndex(2);
                            drawer.hide();
                            break;
                        case 3:
                            jTabb.setSelectedIndex(3);
                            drawer.hide();
                            break;
                        case 4:
                            jTabb.setSelectedIndex(4);
                            drawer.hide();
                            break;
                        case 5:
                            jTabb.setSelectedIndex(5);
                            drawer.hide();
                            break;
                        case 6:
                            jTabb.setSelectedIndex(6);
                            drawer.hide();
                            break;
                        case 7:
                            jTabb.setSelectedIndex(7);
                            drawer.hide();
                            break;
                        default:

                            /*
                    code for the login confirmation
                    
                             */
                            int number = JOptionPane.showConfirmDialog(null, "Are you shure you want to logout ?  You will be returned to Login Screen", "Confirm Logout", JOptionPane.YES_NO_OPTION);
                            if (number == 0) {
                                LoginPage loginpage = new LoginPage();

                                loginpage.setVisible(true);
                                this.dispose();

                            } else {

                                drawer.hide();
                            }
                            break;
                    }
                })
                .build();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabb;
    private javax.swing.JPanel panelBSP;
    private javax.swing.JPanel panelBranch;
    private javax.swing.JPanel panelChangepwd;
    private javax.swing.JPanel panelCustomer;
    private javax.swing.JPanel panelDataset;
    private javax.swing.JPanel panelManageUsers;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JPanel panelSales;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFIndEmployee;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
