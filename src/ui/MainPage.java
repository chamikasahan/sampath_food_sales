/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.AddNewData;
import code.DataSetLoad;
import code.EmployeeTableLoad;
import code.RegisterForm;
import code.UpdateData;
import code.UpdateUserPassword;
import db.database;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        loadTable();

        showuserDetails();
        showDataset();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabb = new javax.swing.JTabbedPane();
        panelBSP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panelCustomer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelProduct = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelBranch = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelSales = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        txtCurrentPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        panelDataset = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        supdatasetTable = new javax.swing.JTable();
        btnClearData = new javax.swing.JButton();
        txtRegion = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        dateChoose = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        txtPperUnit = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPQuantity = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPId = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCusId = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtTransacId = new javax.swing.JTextField();
        btnAddData = new javax.swing.JButton();
        btnUpdateData = new javax.swing.JButton();
        btnDeleteData = new javax.swing.JButton();
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

        jPanel6.setBackground(new java.awt.Color(53, 53, 53));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 1860, 40));

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
                        .addGap(2348, 2348, 2348)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBSPLayout.setVerticalGroup(
            panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBSPLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jTabb.addTab("tab1", panelBSP);

        panelCustomer.setBackground(new java.awt.Color(51, 51, 51));
        panelCustomer.setForeground(new java.awt.Color(255, 255, 255));

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

        panelProduct.setBackground(new java.awt.Color(51, 51, 51));
        panelProduct.setForeground(new java.awt.Color(255, 255, 255));

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

        panelBranch.setBackground(new java.awt.Color(51, 51, 51));
        panelBranch.setForeground(new java.awt.Color(255, 255, 255));

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

        panelSales.setBackground(new java.awt.Color(51, 51, 51));
        panelSales.setForeground(new java.awt.Color(255, 255, 255));

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

        panelManageUsers.setBackground(new java.awt.Color(51, 51, 51));
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

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirm Password");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "register as", "Employee", "Admin" }));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Register as: ");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
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

        employeeTable.setBackground(new java.awt.Color(255, 255, 255));
        employeeTable.setForeground(new java.awt.Color(51, 51, 51));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Username", "role", "email"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
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

        btnClear.setBackground(new java.awt.Color(51, 0, 204));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        panelManageUsersLayout.setVerticalGroup(
            panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelManageUsersLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(9, 9, 9)
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFIndEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelManageUsersLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
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
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelManageUsersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGroup(panelManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
        );

        jTabb.addTab("tab7", panelManageUsers);

        panelChangepwd.setBackground(new java.awt.Color(51, 51, 51));
        panelChangepwd.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Change Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(51, 102, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jButton6.setBackground(new java.awt.Color(0, 193, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Update Password");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Username");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Old Password");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("New Password");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirm New Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCurrentPassword)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNewPassword)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelChangepwdLayout = new javax.swing.GroupLayout(panelChangepwd);
        panelChangepwd.setLayout(panelChangepwdLayout);
        panelChangepwdLayout.setHorizontalGroup(
            panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChangepwdLayout.createSequentialGroup()
                .addContainerGap(861, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(599, 599, 599))
        );
        panelChangepwdLayout.setVerticalGroup(
            panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangepwdLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabb.addTab("tab8", panelChangepwd);

        panelDataset.setBackground(new java.awt.Color(51, 51, 51));
        panelDataset.setForeground(new java.awt.Color(255, 255, 255));

        supdatasetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TransactionID", "CustomerID", "ProductID", "ProductName", "Quantity", "PriceperUnit", "Date", "TotalPrice", "Region"
            }
        ));
        supdatasetTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supdatasetTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(supdatasetTable);

        btnClearData.setBackground(new java.awt.Color(103, 178, 255));
        btnClearData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearData.setForeground(new java.awt.Color(255, 255, 255));
        btnClearData.setText("Clear data");
        btnClearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDataActionPerformed(evt);
            }
        });

        txtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegionActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Region");

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total Price");

        dateChoose.setBackground(new java.awt.Color(51, 51, 51));
        dateChoose.setForeground(new java.awt.Color(51, 51, 51));
        dateChoose.setDateFormatString("yyyy-MM-dd");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date");

        txtPperUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPperUnitActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Product Per Unit");

        txtPQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPQuantityActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Quantity");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Product Name");

        txtPId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPIdActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Product Id");

        txtCusId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIdActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Customer Id");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Transaction Id");

        txtTransacId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransacIdActionPerformed(evt);
            }
        });

        btnAddData.setBackground(new java.awt.Color(51, 0, 204));
        btnAddData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddData.setForeground(new java.awt.Color(255, 255, 255));
        btnAddData.setText("Add Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        btnUpdateData.setBackground(new java.awt.Color(0, 193, 0));
        btnUpdateData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdateData.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateData.setText("Update Data");
        btnUpdateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDataActionPerformed(evt);
            }
        });

        btnDeleteData.setBackground(new java.awt.Color(201, 0, 0));
        btnDeleteData.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteData.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteData.setText("Delete Data");
        btnDeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatasetLayout = new javax.swing.GroupLayout(panelDataset);
        panelDataset.setLayout(panelDatasetLayout);
        panelDatasetLayout.setHorizontalGroup(
            panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasetLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatasetLayout.createSequentialGroup()
                        .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20)
                        .addComponent(txtCusId)
                        .addComponent(jLabel21)
                        .addComponent(txtPId)
                        .addComponent(jLabel22)
                        .addComponent(txtPName)
                        .addGroup(panelDatasetLayout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24))
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(txtTotalPrice)
                        .addComponent(jLabel27)
                        .addComponent(txtRegion)
                        .addComponent(dateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addComponent(txtTransacId)
                        .addGroup(panelDatasetLayout.createSequentialGroup()
                            .addComponent(txtPQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPperUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnClearData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        panelDatasetLayout.setVerticalGroup(
            panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatasetLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatasetLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(9, 9, 9)
                .addComponent(txtTransacId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(9, 9, 9)
                .addComponent(txtCusId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(9, 9, 9)
                .addComponent(txtPId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(9, 9, 9)
                .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(9, 9, 9)
                .addGroup(panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPperUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(9, 9, 9)
                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(10, 10, 10)
                .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnClearData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDatasetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jTabb.addTab("tab6", panelDataset);

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
        updatePassword();

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

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void txtCusIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusIdActionPerformed

    private void txtPIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPIdActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtPQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPQuantityActionPerformed

    private void txtPperUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPperUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPperUnitActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegionActionPerformed

    private void btnClearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDataActionPerformed
clearFields();
        
    }//GEN-LAST:event_btnClearDataActionPerformed

    private void txtTransacIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransacIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransacIdActionPerformed

    private void supdatasetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supdatasetTableMouseClicked


        getSelecDatatRow();




    }//GEN-LAST:event_supdatasetTableMouseClicked

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
       addData();
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        updateDataset();
    }//GEN-LAST:event_btnUpdateDataActionPerformed

    private void btnDeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDataActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteDataActionPerformed

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
    ********************************************************************************************************************************************
                                            Admin Dataset page functions
    ********************************************************************************************************************************************
     */
 /*
    -------------------  load dataset to table
     */
    ArrayList<DataSetLoad> loadDataset() {
        Connection conn;
        Statement st;
        ResultSet rs;
        ArrayList<DataSetLoad> loadDatasetTable = new ArrayList<>();

        try {

            conn = database.connect();
            st = conn.createStatement();
            String sql = "select TransactionID, CustomerID, ProductID, ProductName, Quantity, PriceperUnit, Date, TotalPrice, Region from supermarket_sales";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                DataSetLoad dataLoad = new DataSetLoad(
                        rs.getInt("TransactionID"),
                        rs.getInt("CustomerID"),
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getInt("Quantity"),
                        rs.getFloat("PriceperUnit"),
                        rs.getDate("Date"),
                        rs.getFloat("TotalPrice"),
                        rs.getString("Region")
                );
                loadDatasetTable.add(dataLoad);
            }
        } catch (SQLException e) {

        }
        return loadDatasetTable;
    }

    public void showDataset() {
        ArrayList<DataSetLoad> loaddb = loadDataset();
        DefaultTableModel tb = (DefaultTableModel) supdatasetTable.getModel();
        

        tb.setRowCount(0);
        Object[] row = new Object[9];
        for (int i = 0; i < loaddb.size(); i++) {

            row[0] = loaddb.get(i).getTransactionId();
            row[1] = loaddb.get(i).getCustomerID();
            row[2] = loaddb.get(i).getProductID();
            row[3] = loaddb.get(i).getProductName();
            row[4] = loaddb.get(i).getQuantity();
            row[5] = loaddb.get(i).getPriceperUnit();
            row[6] = loaddb.get(i).getDate();
            row[7] = loaddb.get(i).getTotalPrice();
            row[8] = loaddb.get(i).getRegion();
            tb.addRow(row);
        }
    }

    /*
    -------------------  Add dataset to mysql
     */
    public void addData() {

        if (txtCusId.getText().isEmpty() || txtPId.getText().isEmpty() || txtPName.getText().isEmpty() || txtPQuantity.getText().isEmpty() || txtPperUnit.getText().isEmpty() || dateChoose.getDate() == null || txtTotalPrice.getText().isEmpty() || txtRegion.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Fields are required!", " Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int customerId, productId, productQty;
        String productName, Region;
        float PricepUnit, pTotal;

        Date productDate;
        customerId = Integer.parseInt(txtCusId.getText());
        productId = Integer.parseInt(txtPId.getText());
        productName = txtPName.getText();
        productQty = Integer.parseInt(txtPQuantity.getText());
        PricepUnit = Float.parseFloat(txtPperUnit.getText());
        productDate = dateChoose.getDate();


        pTotal = Float.parseFloat(txtTotalPrice.getText());
        Region = txtRegion.getText();

        new AddNewData(customerId, productId, productName, productQty, PricepUnit, productDate, pTotal, Region);
        showDataset();

        
    }
    
        
    /*
    -------------------  Delete dataset frrom mysql
     */
    public void deleteData(){
        Connection conn;
        PreparedStatement pst;
                String transactionId = txtTransacId.getText();

        try {
            conn = database.connect();
          pst = conn.prepareStatement("Delete from supermarket_sales where TransactionID=?");

            if (transactionId.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID Cannot be Empty", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                pst.setString(1, transactionId);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Dataset Deleted !");
                           showDataset();
            }

        } catch (SQLException e) {
            
        }
    }
    
    /*
    -------------------  Update dataset frrom mysql
     */

    public void updateDataset(){
          if (txtTransacId.getText().isEmpty() || txtCusId.getText().isEmpty() || txtPId.getText().isEmpty() || txtPName.getText().isEmpty() || txtPQuantity.getText().isEmpty() || txtPperUnit.getText().isEmpty() || dateChoose.getDate() == null || txtTotalPrice.getText().isEmpty() || txtRegion.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Fields are required!", " Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
          
                  int transacId, customerId, productId, productQty;
        String productName, Region;
        float PricepUnit, pTotal;

        Date productDate;
        
        transacId = Integer.parseInt(txtTransacId.getText());
        customerId = Integer.parseInt(txtCusId.getText());
        productId = Integer.parseInt(txtPId.getText());
        productName = txtPName.getText();
        productQty = Integer.parseInt(txtPQuantity.getText());
        PricepUnit = Float.parseFloat(txtPperUnit.getText());
        productDate = dateChoose.getDate();


        pTotal = Float.parseFloat(txtTotalPrice.getText());
        Region = txtRegion.getText();
        
                new UpdateData(transacId, customerId, productId, productName, productQty, PricepUnit, productDate, pTotal, Region);
                        showDataset();
    
    }
    
    
        /*
    -------------------  get sekected row and set it to fields
     */
    public void getSelecDatatRow() {
        DefaultTableModel tb = (DefaultTableModel) supdatasetTable.getModel();

int transacId, cusId, prodId,pQty;
String pName, prodRegion;
float pPerUnit, prodTotal;
Date prodDate;



transacId = (int) tb.getValueAt(supdatasetTable.getSelectedRow(), 0);
cusId = (int) tb.getValueAt(supdatasetTable.getSelectedRow(), 1);
prodId = (int) tb.getValueAt(supdatasetTable.getSelectedRow(), 2);
pName = (String) tb.getValueAt(supdatasetTable.getSelectedRow(), 3);
pQty = (int) tb.getValueAt(supdatasetTable.getSelectedRow(), 4);
pPerUnit = (float) tb.getValueAt(supdatasetTable.getSelectedRow(), 5);
prodDate = (Date) tb.getValueAt(supdatasetTable.getSelectedRow(), 6);
prodTotal = (float) tb.getValueAt(supdatasetTable.getSelectedRow(), 7);
prodRegion = (String) tb.getValueAt(supdatasetTable.getSelectedRow(), 8);



txtTransacId.setText(String.valueOf(transacId));
txtCusId.setText(String.valueOf(cusId));
txtPId.setText(String.valueOf(prodId));
txtPName.setText(pName);
txtPQuantity.setText(String.valueOf(pQty));
txtPperUnit.setText(String.valueOf(pPerUnit));
dateChoose.setDate(prodDate);
txtTotalPrice.setText(String.valueOf(prodTotal));
txtRegion.setText(prodRegion);
    }
    
    
        
        /*
    -------------------  Clear All fields
     */
    
    public void clearFields(){
        txtTransacId.setText(" ");
txtCusId.setText(" ");
txtPId.setText(" ");
txtPName.setText(" ");
txtPQuantity.setText(" ");
txtPperUnit.setText(" ");
dateChoose.setDate(null);
txtTotalPrice.setText(" ");
txtRegion.setText(" ");
        
    }
    
    /*
    ********************************************************************************************************************************************
                                            Update password page function
    ********************************************************************************************************************************************
     */
    public void updatePassword() {

        Connection conn;
        PreparedStatement pst, pst1;
        ResultSet rs;

        String userName = txtUsername.getText();
        String currentPassword = txtCurrentPassword.getText();
        String newPassword = txtNewPassword.getText();
        String confirmNewPassword = txtConfirmPassword.getText();

        try {

            conn = database.connect();
            String sql = "select * from signup_details where username =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, userName);
            rs = pst.executeQuery();

            if (!currentPassword.isEmpty() && !newPassword.isEmpty() && !confirmNewPassword.isEmpty()) {

                if (rs.next()) {

                    if (rs.getString("password").equals(currentPassword)) {

                        if (newPassword.length() > 6) {
                            if (newPassword.equals(confirmNewPassword)) {

                                try {

                                    String sql1 = "update signup_details set password=? where username=?";
                                    pst1 = conn.prepareStatement(sql1);
                                    pst1.setString(1, newPassword);
                                    pst1.setString(2, userName);
                                    pst1.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "Password Changed Successfully!");
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, e);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "New password and Confirm Password Does not match");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password should be more than 6 digits");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Enter correct old Password");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fields are required !");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*
    ********************************************************************************************************************************************
                                                           Admin Manage Users page functions
    ********************************************************************************************************************************************
     */
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
        
        ** method for load employee table
     */
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

    public void showuserDetails() {
        ArrayList<EmployeeTableLoad> show = loadTable();
        DefaultTableModel tb = (DefaultTableModel) employeeTable.getModel();
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
    ********************************************************************************************************************************************
                                                       End of  Admin Manage Users page functions
    ********************************************************************************************************************************************
     */

 /*
    *****************************************************************************************************************  
    Admin Header Side Menu
    ***************************************************************************************************************
     */
    public void Adminheader() {

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

    /*
         **   Employee Header Side Menu
    
     */
    public void Empheader() {

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
                .separator(220, Color.white)
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
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearData;
    private javax.swing.JButton btnDeleteData;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JComboBox<String> comboRole;
    private com.toedter.calendar.JDateChooser dateChoose;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JTable supdatasetTable;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JTextField txtCusId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFIndEmployee;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtPId;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPQuantity;
    private javax.swing.JTextField txtPperUnit;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtTransacId;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
