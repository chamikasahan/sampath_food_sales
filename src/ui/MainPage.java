/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.AddNewData;
import code.BspTableLoad;
import code.CustomerTableLoad;
import code.DataSetLoad;

import code.EmployeeTableLoad;
import code.ProductSalesSummary;
import org.jfree.data.category.DefaultCategoryDataset;

import code.RegisterForm;
import code.UpdateData;

import db.database;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.chart.ModelPieChart;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.ui.TextAnchor;

public class MainPage extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form RegisterPage
     */
    public MainPage() {
        initComponents();

        //load the employee table
        loadTable();

        showuserDetails();
        // show  dataset on the table
        showDataset();

        // showYear in combo boxes
        showYear();

        // show best selling product pie chart 
        showBestSellingProduct();

        // show Customer Analysis  pie chart 
        showCustomerSegmentation();
        // show Product Performance  Linechart 
        showProductPerformanceChart();
        // show Branch  Performance  Bar chart
        showBranchTransactionsBarChart();

        // show summery of the analytics on sale report page
        populateSalesReportSummary();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabb = new javax.swing.JTabbedPane();
        panelSales = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblBSP = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        comboFromMonthSum = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        comboFromDateSum = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        comboToMonthSum = new javax.swing.JComboBox<>();
        comboFromYearSum = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        comboToDateSum = new javax.swing.JComboBox<>();
        comboToYearSum = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        lblTotalRevenue = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblTotalQuantity = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblTotalTransactions = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblCustomerSegmentation = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableSummery = new javax.swing.JTable();
        panelBSP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboFromDate = new javax.swing.JComboBox<>();
        comboFromYear = new javax.swing.JComboBox<>();
        comboFromMonth = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pieChart1 = new javaswingdev.chart.PieChart();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BSPTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        comboToYear = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        comboToMonth = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        comboToDate = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        bsCount = new javax.swing.JLabel();
        pieTitle = new javax.swing.JLabel();
        pieTitle2 = new javax.swing.JLabel();
        dtRange = new javax.swing.JLabel();
        pieTitle3 = new javax.swing.JLabel();
        panelCustomer = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        comboFromDateCustom = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        comboFromYearCustom = new javax.swing.JComboBox<>();
        comboToYearCustom = new javax.swing.JComboBox<>();
        comboFromMonthCustom = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        comboToMonthCustom = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        comboToDateCustom = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        pieChart2 = new javaswingdev.chart.PieChart();
        pieTitle1 = new javax.swing.JLabel();
        pieTitle4 = new javax.swing.JLabel();
        dtDateRange = new javax.swing.JLabel();
        pieTitle5 = new javax.swing.JLabel();
        lblLargestSeg = new javax.swing.JLabel();
        pieTitle6 = new javax.swing.JLabel();
        lblCusCount = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableCustomSeg = new javax.swing.JTable();
        panelProduct = new javax.swing.JPanel();
        comboToMonthProductP = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        comboToDateProductP = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        comboFromDateProductP = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        comboFromYearProductP = new javax.swing.JComboBox<>();
        comboToYearProductP = new javax.swing.JComboBox<>();
        comboFromMonthProductP = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        panelProductPerformance = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTotalRev = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTotalQtyy = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        panelBranch = new javax.swing.JPanel();
        comboToDateBP = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        comboFromDateBP = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        comboToMonthBP = new javax.swing.JComboBox<>();
        comboFromYearBP = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        comboToYearBP = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        comboFromMonthBP = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        panelBranchP = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTotalTransac = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        jButton1.setBackground(new java.awt.Color(53, 53, 53));
        jButton1.setForeground(new java.awt.Color(198, 198, 198));
        jButton1.setText("        |  |   |      ");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        jPanel6.setBackground(new java.awt.Color(53, 53, 53));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 1860, 90));

        jTabb.setBackground(new java.awt.Color(51, 51, 51));

        panelSales.setBackground(new java.awt.Color(51, 51, 51));
        panelSales.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBSP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBSP.setForeground(new java.awt.Color(255, 255, 255));
        lblBSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBSP.setText("0");

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Best Selling Product");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(lblBSP)
                .addGap(24, 24, 24))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel62)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Year");

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Day");

        jButton11.setBackground(new java.awt.Color(0, 200, 0));
        jButton11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Filter");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setBorderPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        comboFromMonthSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromMonthSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromMonthSumActionPerformed(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Month");

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Month");

        jLabel67.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Sales Summery");

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("From");

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("To");

        comboFromDateSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromDateSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromDateSumActionPerformed(evt);
            }
        });

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Year");

        comboToMonthSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToMonthSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToMonthSumActionPerformed(evt);
            }
        });

        comboFromYearSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromYearSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromYearSumActionPerformed(evt);
            }
        });

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Day");

        comboToDateSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToDateSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToDateSumActionPerformed(evt);
            }
        });

        comboToYearSum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToYearSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToYearSumActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalRevenue.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalRevenue.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalRevenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalRevenue.setText("0");

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Total Revenue");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lblTotalRevenue)
                .addGap(24, 24, 24))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel72)
                    .addContainerGap(111, Short.MAX_VALUE)))
        );

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalQuantity.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalQuantity.setText("0");

        jLabel73.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Total Quantity");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(lblTotalQuantity)
                .addGap(24, 24, 24))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel73)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalTransactions.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalTransactions.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTransactions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTransactions.setText("0");

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Total Transactions");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lblTotalTransactions)
                .addGap(24, 24, 24))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel74)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCustomerSegmentation.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCustomerSegmentation.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerSegmentation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerSegmentation.setText("0");

        jLabel75.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Customer Segmentation");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCustomerSegmentation, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblCustomerSegmentation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel75)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );

        tableSummery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Total Quantity Sold", "Total Revenue", "Total Transactions", "Avg Price per Unit", "Total Sales"
            }
        ));
        jScrollPane5.setViewportView(tableSummery);

        javax.swing.GroupLayout panelSalesLayout = new javax.swing.GroupLayout(panelSales);
        panelSales.setLayout(panelSalesLayout);
        panelSalesLayout.setHorizontalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalesLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalesLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSalesLayout.createSequentialGroup()
                        .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromYearSum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel65)
                                .addGap(18, 18, 18)
                                .addComponent(comboFromMonthSum, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromDateSum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel68)
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToYearSum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel66)
                                .addGap(18, 18, 18)
                                .addComponent(comboToMonthSum, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToDateSum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addGap(540, 540, 540)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        panelSalesLayout.setVerticalGroup(
            panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalesLayout.createSequentialGroup()
                        .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboFromDateSum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboFromMonthSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboFromYearSum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboToDateSum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboToMonthSum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboToYearSum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSalesLayout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(panelSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelSalesLayout.createSequentialGroup()
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabb.addTab("tab5", panelSales);

        panelBSP.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Best Selling Products");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("From");

        comboFromDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromDateActionPerformed(evt);
            }
        });

        comboFromYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromYearActionPerformed(evt);
            }
        });

        comboFromMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromMonthActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Year");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Day");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Month");

        jButton5.setBackground(new java.awt.Color(51, 118, 222));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/9004720_printer_print_office_device_icon.png"))); // NOI18N
        jButton5.setText("Print Report");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        BSPTable.setForeground(new java.awt.Color(51, 51, 51));
        BSPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Total Quantity Sold", "Total Revenue", "Total Transactions", "Customer Count", "Revenue Contribution (%)"
            }
        ));
        jScrollPane3.setViewportView(BSPTable);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("To");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Year");

        comboToYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToYearActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Month");

        comboToMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToMonthActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Day");

        comboToDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToDateActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 200, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Filter");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        bsCount.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        bsCount.setForeground(new java.awt.Color(51, 255, 0));
        bsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bsCount.setText("0 items");

        pieTitle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle.setText("Top products sold by quantity during the selected period.");

        pieTitle2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle2.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle2.setText("Total Products Sold: ");

        dtRange.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        dtRange.setForeground(new java.awt.Color(255, 255, 255));
        dtRange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dtRange.setText("26-04-2022 To 26-04-2022 ");

        pieTitle3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle3.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle3.setText("Date Range:");

        javax.swing.GroupLayout panelBSPLayout = new javax.swing.GroupLayout(panelBSP);
        panelBSP.setLayout(panelBSPLayout);
        panelBSPLayout.setHorizontalGroup(
            panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBSPLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addComponent(pieTitle2)
                        .addGap(18, 18, 18)
                        .addComponent(bsCount)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBSPLayout.createSequentialGroup()
                        .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBSPLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBSPLayout.createSequentialGroup()
                                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBSPLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboToYear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel32)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboToMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pieTitle)
                                    .addGroup(panelBSPLayout.createSequentialGroup()
                                        .addComponent(pieTitle3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dtRange))
                                    .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBSPLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(540, 540, 540)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60))
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelBSPLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(comboFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBSPLayout.setVerticalGroup(
            panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(338, 338, 338))
                    .addGroup(panelBSPLayout.createSequentialGroup()
                        .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBSPLayout.createSequentialGroup()
                                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboFromDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboFromMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboFromYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboToDate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboToMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboToYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(pieTitle)
                        .addGap(23, 23, 23)
                        .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pieTitle3)
                            .addComponent(dtRange))
                        .addGap(7, 7, 7)
                        .addComponent(pieChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelBSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsCount)
                    .addComponent(pieTitle2))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabb.addTab("tab1", panelBSP);

        panelCustomer.setBackground(new java.awt.Color(51, 51, 51));
        panelCustomer.setForeground(new java.awt.Color(255, 255, 255));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("From");

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("To");

        comboFromDateCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromDateCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromDateCustomActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Year");

        comboFromYearCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromYearCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromYearCustomActionPerformed(evt);
            }
        });

        comboToYearCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToYearCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToYearCustomActionPerformed(evt);
            }
        });

        comboFromMonthCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromMonthCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromMonthCustomActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Month");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Year");

        comboToMonthCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToMonthCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToMonthCustomActionPerformed(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Day");

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Day");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Month");

        comboToDateCustom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToDateCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToDateCustomActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 200, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Filter");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Customer Analysis");

        pieTitle1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle1.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle1.setText("Date Range:");

        pieTitle4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle4.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle4.setText("Customer segmentation by region based on the selected date range");

        dtDateRange.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        dtDateRange.setForeground(new java.awt.Color(255, 255, 255));
        dtDateRange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dtDateRange.setText("01-01-2022 To 01-01-2022");

        pieTitle5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle5.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle5.setText("Largest Segment: ");

        lblLargestSeg.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblLargestSeg.setForeground(new java.awt.Color(51, 255, 0));
        lblLargestSeg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLargestSeg.setText("100");

        pieTitle6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        pieTitle6.setForeground(new java.awt.Color(255, 255, 255));
        pieTitle6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pieTitle6.setText("Total Customers:");

        lblCusCount.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblCusCount.setForeground(new java.awt.Color(51, 255, 0));
        lblCusCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCusCount.setText("100");

        tableCustomSeg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Transactions", "Total Spending"
            }
        ));
        jScrollPane4.setViewportView(tableCustomSeg);

        javax.swing.GroupLayout panelCustomerLayout = new javax.swing.GroupLayout(panelCustomer);
        panelCustomer.setLayout(panelCustomerLayout);
        panelCustomerLayout.setHorizontalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustomerLayout.createSequentialGroup()
                        .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addGroup(panelCustomerLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCustomerLayout.createSequentialGroup()
                                        .addComponent(pieTitle5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblLargestSeg))
                                    .addGroup(panelCustomerLayout.createSequentialGroup()
                                        .addComponent(pieTitle6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCusCount))))
                            .addGroup(panelCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromYearCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(comboFromMonthCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromDateCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35)
                            .addGroup(panelCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(540, 540, 540)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCustomerLayout.createSequentialGroup()
                        .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCustomerLayout.createSequentialGroup()
                                .addComponent(pieTitle1)
                                .addGap(18, 18, 18)
                                .addComponent(dtDateRange))
                            .addComponent(pieTitle4)
                            .addComponent(pieChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCustomerLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToYearCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(comboToMonthCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToDateCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        panelCustomerLayout.setVerticalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel43)
                .addGap(51, 51, 51)
                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCustomerLayout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboFromDateCustom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboFromMonthCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboFromYearCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustomerLayout.createSequentialGroup()
                        .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboToDateCustom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboToMonthCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboToYearCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(pieTitle4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pieTitle1)
                            .addComponent(dtDateRange))
                        .addGap(33, 33, 33)
                        .addComponent(pieChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pieTitle6)
                    .addComponent(lblCusCount))
                .addGap(18, 18, 18)
                .addGroup(panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pieTitle5)
                    .addComponent(lblLargestSeg))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabb.addTab("tab2", panelCustomer);

        panelProduct.setBackground(new java.awt.Color(51, 51, 51));
        panelProduct.setForeground(new java.awt.Color(255, 255, 255));

        comboToMonthProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToMonthProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToMonthProductPActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Day");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Day");

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Month");

        comboToDateProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToDateProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToDateProductPActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 200, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Filter");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Product Performance");

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("From");

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("To");

        comboFromDateProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromDateProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromDateProductPActionPerformed(evt);
            }
        });

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Year");

        comboFromYearProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromYearProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromYearProductPActionPerformed(evt);
            }
        });

        comboToYearProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToYearProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToYearProductPActionPerformed(evt);
            }
        });

        comboFromMonthProductP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromMonthProductP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromMonthProductPActionPerformed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Month");

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Year");

        panelProductPerformance.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalRev.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalRev.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalRev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalRev.setText("0");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total Revenue");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalRev, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(lblTotalRev)
                .addGap(41, 41, 41))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel4)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalQtyy.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTotalQtyy.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalQtyy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalQtyy.setText("0");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Total Quantity");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalQtyy, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalQtyy)
                .addGap(41, 41, 41))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel34)
                    .addContainerGap(151, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromYearProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(comboFromMonthProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromDateProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48))
                        .addContainerGap(1319, Short.MAX_VALUE))
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(540, 540, 540)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToYearProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel51)
                                .addGap(18, 18, 18)
                                .addComponent(comboToMonthProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToDateProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelProductPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel47)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelProductLayout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboFromDateProductP, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboFromMonthProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(comboFromYearProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboToDateProductP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboToMonthProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboToYearProductP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelProductLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(panelProductPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabb.addTab("tab3", panelProduct);

        panelBranch.setBackground(new java.awt.Color(51, 51, 51));
        panelBranch.setForeground(new java.awt.Color(255, 255, 255));

        comboToDateBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToDateBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToDateBPActionPerformed(evt);
            }
        });

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Year");

        jButton10.setBackground(new java.awt.Color(0, 200, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Filter");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setBorderPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Branch Performance");

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("From");

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("To");

        comboFromDateBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromDateBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromDateBPActionPerformed(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Year");

        comboToMonthBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToMonthBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToMonthBPActionPerformed(evt);
            }
        });

        comboFromYearBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromYearBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromYearBPActionPerformed(evt);
            }
        });

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Day");

        comboToYearBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboToYearBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboToYearBPActionPerformed(evt);
            }
        });

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Day");

        comboFromMonthBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFromMonthBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFromMonthBPActionPerformed(evt);
            }
        });

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Month");

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Month");

        panelBranchP.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalTransac.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTotalTransac.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTransac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTransac.setText("0");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Tansactions");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTotalTransac, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(lblTotalTransac)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel3)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelBranchLayout = new javax.swing.GroupLayout(panelBranch);
        panelBranch.setLayout(panelBranchLayout);
        panelBranchLayout.setHorizontalGroup(
            panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBranchLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBranchLayout.createSequentialGroup()
                        .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(panelBranchLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromYearBP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel60)
                                .addGap(18, 18, 18)
                                .addComponent(comboFromMonthBP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFromDateBP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel55)
                            .addGroup(panelBranchLayout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addGap(540, 540, 540)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(1184, Short.MAX_VALUE))
                    .addGroup(panelBranchLayout.createSequentialGroup()
                        .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBranchLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToYearBP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel61)
                                .addGap(18, 18, 18)
                                .addComponent(comboToMonthBP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboToDateBP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBranchP, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
        );
        panelBranchLayout.setVerticalGroup(
            panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBranchLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel54)
                .addGap(51, 51, 51)
                .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBranchLayout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboFromDateBP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboFromMonthBP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboFromYearBP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBranchP, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBranchLayout.createSequentialGroup()
                        .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboToDateBP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboToMonthBP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboToYearBP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabb.addTab("tab4", panelBranch);

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
            .addGroup(panelChangepwdLayout.createSequentialGroup()
                .addGap(692, 692, 692)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(768, Short.MAX_VALUE))
        );
        panelChangepwdLayout.setVerticalGroup(
            panelChangepwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangepwdLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
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
                        .addComponent(jLabel28)
                        .addComponent(txtTransacId)
                        .addGroup(panelDatasetLayout.createSequentialGroup()
                            .addComponent(txtPQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(txtPperUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dateChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        addData();
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnUpdateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDataActionPerformed
        updateDataset();
    }//GEN-LAST:event_btnUpdateDataActionPerformed

    private void btnDeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDataActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteDataActionPerformed

    private void comboFromYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromYearActionPerformed

        String selectedYear = (String) comboFromYear.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }

    }//GEN-LAST:event_comboFromYearActionPerformed

    private void comboFromMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromMonthActionPerformed
        String selectedYear = (String) comboFromYear.getSelectedItem();
        String selectedMonth = (String) comboFromMonth.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboFromMonthActionPerformed

    private void comboFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromDateActionPerformed

    }//GEN-LAST:event_comboFromDateActionPerformed

    private void supdatasetTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supdatasetTableMouseClicked

        getSelecDatatRow();

    }//GEN-LAST:event_supdatasetTableMouseClicked

    private void comboToYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToYearActionPerformed
        String selectedYear = (String) comboToYear.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboToYearActionPerformed

    private void comboToMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToMonthActionPerformed
        String selectedYear = (String) comboToYear.getSelectedItem();
        String selectedMonth = (String) comboToMonth.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboToMonthActionPerformed

    private void comboToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToDateActionPerformed

    }//GEN-LAST:event_comboToDateActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showBestSellingProduct();
        String fromDate = comboFromYear.getSelectedItem() + "-" + comboFromMonth.getSelectedItem() + "-" + comboFromDate.getSelectedItem();
        String toDate = comboToYear.getSelectedItem() + "-" + comboToMonth.getSelectedItem() + "-" + comboToDate.getSelectedItem();

        showBSPTable(fromDate, toDate);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void comboFromDateCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromDateCustomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFromDateCustomActionPerformed

    private void comboFromYearCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromYearCustomActionPerformed
        String selectedYear = (String) comboFromYearCustom.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboFromYearCustomActionPerformed

    private void comboToYearCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToYearCustomActionPerformed
        String selectedYear = (String) comboToYearCustom.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboToYearCustomActionPerformed

    private void comboFromMonthCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromMonthCustomActionPerformed
        String selectedYear = (String) comboFromYearCustom.getSelectedItem();
        String selectedMonth = (String) comboFromMonthCustom.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboFromMonthCustomActionPerformed

    private void comboToMonthCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToMonthCustomActionPerformed
        String selectedYear = (String) comboToYearCustom.getSelectedItem();
        String selectedMonth = (String) comboToMonthCustom.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboToMonthCustomActionPerformed

    private void comboToDateCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToDateCustomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboToDateCustomActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        showCustomerSegmentation();
        String fromDate = comboFromYearCustom.getSelectedItem() + "-" + comboFromMonthCustom.getSelectedItem() + "-" + comboFromDateCustom.getSelectedItem();
        String toDate = comboToYearCustom.getSelectedItem() + "-" + comboToMonthCustom.getSelectedItem() + "-" + comboToDateCustom.getSelectedItem();
        showTopCustomerTable(fromDate, toDate);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void comboToMonthProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToMonthProductPActionPerformed
        String selectedYear = (String) comboToYearProductP.getSelectedItem();
        String selectedMonth = (String) comboToMonthProductP.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboToMonthProductPActionPerformed

    private void comboToDateProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToDateProductPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboToDateProductPActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        showProductPerformanceChart();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void comboFromDateProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromDateProductPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFromDateProductPActionPerformed

    private void comboFromYearProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromYearProductPActionPerformed
        String selectedYear = (String) comboFromYearProductP.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboFromYearProductPActionPerformed

    private void comboToYearProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToYearProductPActionPerformed
        String selectedYear = (String) comboToYearProductP.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboToYearProductPActionPerformed

    private void comboFromMonthProductPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromMonthProductPActionPerformed
        String selectedYear = (String) comboFromYearProductP.getSelectedItem();
        String selectedMonth = (String) comboFromMonthProductP.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboFromMonthProductPActionPerformed

    private void comboToDateBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToDateBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboToDateBPActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        showBranchTransactionsBarChart();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void comboFromDateBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromDateBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFromDateBPActionPerformed

    private void comboToMonthBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToMonthBPActionPerformed
        String selectedYear = (String) comboToYearBP.getSelectedItem();
        String selectedMonth = (String) comboToMonthBP.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboToMonthBPActionPerformed

    private void comboFromYearBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromYearBPActionPerformed
        String selectedYear = (String) comboFromYearBP.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboFromYearBPActionPerformed

    private void comboToYearBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToYearBPActionPerformed
        String selectedYear = (String) comboToYearBP.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboToYearBPActionPerformed

    private void comboFromMonthBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromMonthBPActionPerformed
        String selectedYear = (String) comboFromYearBP.getSelectedItem();
        String selectedMonth = (String) comboFromMonthBP.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboFromMonthBPActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        populateSalesReportSummary();

        String fromDate = comboFromYearSum.getSelectedItem() + "-" + comboFromMonthSum.getSelectedItem() + "-" + comboFromDateSum.getSelectedItem();
        String toDate = comboToYearSum.getSelectedItem() + "-" + comboToMonthSum.getSelectedItem() + "-" + comboToDateSum.getSelectedItem();

        showSalesSummaryTable(fromDate, toDate);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void comboFromMonthSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromMonthSumActionPerformed
               String selectedYear = (String) comboFromYearSum.getSelectedItem();
        String selectedMonth = (String) comboFromMonthSum.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboFromMonthSumActionPerformed

    private void comboFromDateSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromDateSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFromDateSumActionPerformed

    private void comboToMonthSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToMonthSumActionPerformed
               String selectedYear = (String) comboToYearSum.getSelectedItem();
        String selectedMonth = (String) comboToMonthSum.getSelectedItem();
        if (selectedYear != null && selectedMonth != null) {
            loadDays(selectedYear, selectedMonth);

        }
    }//GEN-LAST:event_comboToMonthSumActionPerformed

    private void comboFromYearSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFromYearSumActionPerformed
              String selectedYear = (String) comboFromYearSum.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboFromYearSumActionPerformed

    private void comboToDateSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToDateSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboToDateSumActionPerformed

    private void comboToYearSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboToYearSumActionPerformed
            String selectedYear = (String) comboToYearSum.getSelectedItem();
        if (selectedYear != null) {
            showMonth(selectedYear);

        }
    }//GEN-LAST:event_comboToYearSumActionPerformed

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
                                             Best Selling Product  page functions
    ********************************************************************************************************************************************
     */
    // ** Get Year from mysql to  FromYear Combobox
    private void showYear() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();
            String sql = "SELECT DISTINCT YEAR(Date) as Year FROM supermarket_sales ORDER BY Year";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            // List of all year combo boxes
            JComboBox<String>[] yearComboBoxes = new JComboBox[]{
                comboFromYear, comboToYear,
                comboFromYearCustom, comboToYearCustom,
                comboFromYearProductP, comboToYearProductP,
                comboFromYearBP, comboToYearBP,
                comboFromYearSum, comboToYearSum
            };

            // Clear all combo boxes
            clearComboBoxes(yearComboBoxes);

            // Populate combo boxes with available years
            while (rs.next()) {
                int year = rs.getInt("Year");
                addYearToComboBoxes(yearComboBoxes, year);
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearComboBoxes(JComboBox<String>[] comboBoxes) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.removeAllItems();
        }
    }

    private void addYearToComboBoxes(JComboBox<String>[] comboBoxes, int year) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.addItem(String.valueOf(year));
        }
    }

    // ** Get Month from mysql to  FromMonth Combobox
    private void showMonth(String selectedYear) {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();
            String sql = "SELECT DISTINCT MONTH(Date) as Month FROM supermarket_sales WHERE YEAR(Date) = ? ORDER BY Month";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(selectedYear));
            rs = pst.executeQuery();

            // List of all month combo boxes
            JComboBox<String>[] monthComboBoxes = new JComboBox[]{
                comboFromMonth, comboToMonth,
                comboFromMonthCustom, comboToMonthCustom,
                comboFromMonthProductP, comboToMonthProductP,
                comboFromMonthBP, comboToMonthBP,
                comboFromMonthSum, comboToMonthSum
            };

            // Clear all combo boxes
            clearComboBoxes(monthComboBoxes);

            // Populate combo boxes with available months
            while (rs.next()) {
                int month = rs.getInt("Month");
                addMonthToComboBoxes(monthComboBoxes, month);
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addMonthToComboBoxes(JComboBox<String>[] comboBoxes, int month) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.addItem(String.format("%02d", month));
        }
    }

    // ** Get Day  from mysql to  From Day  Combobox
    private void loadDays(String selectedYear, String selectedMonth) {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();
            String sql = "SELECT DISTINCT DAY(Date) as Day FROM supermarket_sales WHERE YEAR(Date) = ? AND MONTH(Date) = ? ORDER BY Day";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(selectedYear));
            pst.setInt(2, Integer.parseInt(selectedMonth));
            rs = pst.executeQuery();

            // List of all day combo boxes
            JComboBox<String>[] dayComboBoxes = new JComboBox[]{
                comboFromDate, comboToDate,
                comboFromDateCustom, comboToDateCustom,
                comboFromDateProductP, comboToDateProductP,
                comboFromDateBP, comboToDateBP,
                comboFromDateSum, comboToDateSum

            };

            // Clear all combo boxes
            clearComboBoxes(dayComboBoxes);

            // Populate combo boxes with available days
            while (rs.next()) {
                int dayNumber = rs.getInt("Day");
                addDayToComboBoxes(dayComboBoxes, dayNumber);
            }

            rs.close();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addDayToComboBoxes(JComboBox<String>[] comboBoxes, int day) {
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.addItem(String.format("%02d", day));  // Ensure two-digit format
        }
    }

//** Method for show details on the Pie chart
    private void showBestSellingProduct() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();

            // Get selected "From" and "To" dates
            String fromYear = (String) comboFromYear.getSelectedItem();
            String fromMonth = (String) comboFromMonth.getSelectedItem();
            String fromDay = (String) comboFromDate.getSelectedItem();

            String toYear = (String) comboToYear.getSelectedItem();
            String toMonth = (String) comboToMonth.getSelectedItem();
            String toDay = (String) comboToDate.getSelectedItem();

            if (fromYear == null || toYear == null) {
                return;
            }

            String fromDateString = fromYear + "-01-01";
            if (fromMonth != null) {
                fromDateString = fromYear + "-" + fromMonth + "-01";
                if (fromDay != null) {
                    fromDateString = fromYear + "-" + fromMonth + "-" + fromDay;
                }
            }

            String toDateString = toYear + "-12-31";
            if (toMonth != null) {
                toDateString = toYear + "-" + toMonth + "-31";
                if (toDay != null) {
                    toDateString = toYear + "-" + toMonth + "-" + toDay;
                }
            }

            if (fromDateString.compareTo(toDateString) > 0) {
                JOptionPane.showMessageDialog(null, "Invalid date range: 'From' date must be earlier than 'To' date.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // SQL query for the best-selling products
            String sql = "SELECT ProductName, SUM(Quantity) as TotalQuantity, "
                    + "SUM(TotalPrice) as TotalRevenue, AVG(PriceperUnit) as AvgPrice "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY ProductName "
                    + "ORDER BY TotalQuantity DESC";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDateString);
            pst.setString(2, toDateString);
            rs = pst.executeQuery();

            // Clear the existing pie chart data
            pieChart1.clearData();

            boolean hasData = false;

            int totalCount = 0;
            while (rs.next()) {
                String productName = rs.getString("ProductName");
                int totalQuantity = rs.getInt("TotalQuantity");

                // Add data to pie chart
                Color pieColor = new Color((int) (Math.random() * 0x1000000));
                pieChart1.addData(new ModelPieChart(productName, totalQuantity, pieColor));
                hasData = true;
                totalCount += totalQuantity;
            }

            if (!hasData) {
                JOptionPane.showMessageDialog(null, "No data found for the selected date range.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

            String title = " " + fromDay + "-" + fromMonth + "-" + fromYear + " To " + toDay + "-" + toMonth + "-" + toYear;
            dtRange.setText(title);

            bsCount.setText("" + totalCount + " Items");

            rs.close();
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// **  Load BSP on the array 
    ArrayList<BspTableLoad> loadBestSellingProducts(String fromDate, String toDate) {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        ArrayList<BspTableLoad> bestSellingProducts = new ArrayList<>();

        try {
            conn = database.connect();
            String sql = "SELECT ProductName, "
                    + "SUM(Quantity) AS TotalQuantitySold, "
                    + "SUM(TotalPrice) AS TotalRevenue, "
                    + "COUNT(TransactionID) AS TotalTransactions, "
                    + "COUNT(DISTINCT CustomerID) AS CustomerCount, "
                    + "(SUM(TotalPrice) / (SELECT SUM(TotalPrice) FROM supermarket_sales)) * 100 AS RevenueContribution "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY ProductName "
                    + "ORDER BY TotalRevenue DESC";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            while (rs.next()) {
                BspTableLoad product = new BspTableLoad(
                        rs.getString("ProductName"),
                        rs.getInt("TotalQuantitySold"),
                        rs.getFloat("TotalRevenue"),
                        rs.getInt("TotalTransactions"),
                        rs.getInt("CustomerCount"),
                        rs.getFloat("RevenueContribution")
                );
                bestSellingProducts.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bestSellingProducts;
    }

//** show BSP on the table
    public void showBSPTable(String fromDate, String toDate) {
        ArrayList<BspTableLoad> productList = loadBestSellingProducts(fromDate, toDate);
        DefaultTableModel tableModel = (DefaultTableModel) BSPTable.getModel();

        tableModel.setRowCount(0); // Clear existing rows
        Object[] row = new Object[7];

        for (BspTableLoad product : productList) {
            row[0] = product.getProductName();
            row[1] = product.getTotalQuantitySold();
            row[2] = product.getTotalRevenue();
            row[3] = product.getTotalTransactions();
            row[4] = product.getCustomerCount();

            row[5] = String.format("%.2f", product.getRevenueContribution()); // Format to 2 decimal places
            tableModel.addRow(row);

        }

    }

    /*
    ********************************************************************************************************************************************
                                             Customer Analysis  page functions
    ********************************************************************************************************************************************
     */
    private void showCustomerSegmentation() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();

            // Get selected "From" and "To" dates
            String fromYear = (String) comboFromYearCustom.getSelectedItem();
            String fromMonth = (String) comboFromMonthCustom.getSelectedItem();
            String fromDay = (String) comboFromDateCustom.getSelectedItem();

            String toYear = (String) comboToYearCustom.getSelectedItem();
            String toMonth = (String) comboToMonthCustom.getSelectedItem();
            String toDay = (String) comboToDateCustom.getSelectedItem();

            if (fromYear == null || toYear == null) {
                return;
            }

            String fromDateString = fromYear + "-01-01";
            if (fromMonth != null) {
                fromDateString = fromYear + "-" + fromMonth + "-01";
                if (fromDay != null) {
                    fromDateString = fromYear + "-" + fromMonth + "-" + fromDay;
                }
            }

            String toDateString = toYear + "-12-31";
            if (toMonth != null) {
                toDateString = toYear + "-" + toMonth + "-31";
                if (toDay != null) {
                    toDateString = toYear + "-" + toMonth + "-" + toDay;
                }
            }

            if (fromDateString.compareTo(toDateString) > 0) {
                JOptionPane.showMessageDialog(null, "Invalid date range: 'From' date must be earlier than 'To' date.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // SQL query for customer segmentation by region
            String sql = "SELECT Region, COUNT(DISTINCT CustomerID) as CustomerCount "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY Region "
                    + "ORDER BY CustomerCount DESC";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDateString);
            pst.setString(2, toDateString);
            rs = pst.executeQuery();

            // Clear existing pie chart data
            pieChart2.clearData();

            boolean hasData = false;

            int totalCustomer = 0;
            String largestSegment = "";
            int maxCustomerCount = 0;
            while (rs.next()) {
                String region = rs.getString("Region");
                int customerCount = rs.getInt("CustomerCount");

                // Add data to pie chart
                Color pieColor = new Color((int) (Math.random() * 0x1000000));
                pieChart2.addData(new ModelPieChart(region, customerCount, pieColor));
                hasData = true;

                totalCustomer += customerCount;

                if (customerCount > maxCustomerCount) {

                    maxCustomerCount = customerCount;
                    largestSegment = region;
                }
            }

            if (!hasData) {
                JOptionPane.showMessageDialog(null, "No data found for customer segmentation in the selected date range.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

            String title = " " + fromDay + "-" + fromMonth + "-" + fromYear + " To " + toDay + "-" + toMonth + "-" + toYear;
            dtDateRange.setText(title);

            lblLargestSeg.setText("" + totalCustomer);

            lblLargestSeg.setText(largestSegment + " (" + maxCustomerCount + " customers) ");

            rs.close();
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ArrayList<CustomerTableLoad> loadTopCustomer(String fromDate, String toDate) {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        ArrayList<CustomerTableLoad> topCustomer = new ArrayList<>();

        try {
            conn = database.connect();
            String sql = "SELECT CustomerID, "
                    + "COUNT(TransactionID) AS TotalTransactions, "
                    + "SUM(TotalPrice) AS TotalSpending "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY CustomerID "
                    + "ORDER BY TotalSpending DESC "
                    + "LIMIT 10";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            while (rs.next()) {
                CustomerTableLoad ctl = new CustomerTableLoad(
                        rs.getInt("CustomerID"),
                        rs.getInt("TotalTransactions"),
                        rs.getFloat("TotalSpending")
                );
                topCustomer.add(ctl);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return topCustomer;
    }

    public void showTopCustomerTable(String fromDate, String toDate) {
        ArrayList<CustomerTableLoad> customerList = loadTopCustomer(fromDate, toDate);
        DefaultTableModel tb = (DefaultTableModel) tableCustomSeg.getModel();
        tb.setRowCount(0);

        Object[] row = new Object[3];
        for (CustomerTableLoad customer : customerList) {
            row[0] = customer.getCustomerId();
            row[1] = customer.getTransactions();
            row[2] = customer.getTotalSpending();
            tb.addRow(row);
        }

    }


    /*
    ********************************************************************************************************************************************
                                            Product Performance page functions
    ********************************************************************************************************************************************
     */
 /*
    -------------------  Chart function
     */
    private void showProductPerformanceChart() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();

            // Get selected "From" and "To" dates
            String fromDate = comboFromYearProductP.getSelectedItem() + "-" + comboFromMonthProductP.getSelectedItem() + "-" + comboFromDateProductP.getSelectedItem();
            String toDate = comboToYearProductP.getSelectedItem() + "-" + comboToMonthProductP.getSelectedItem() + "-" + comboToDateProductP.getSelectedItem();

            String sql = "SELECT ProductName, SUM(TotalPrice) AS TotalRevenue, SUM(Quantity) AS TotalQuantity "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY ProductName "
                    + "ORDER BY TotalRevenue DESC";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            double setTotalRev = 0;
            int setTotalQtyy = 0;
            while (rs.next()) {
                String productName = rs.getString("ProductName");
                double totalRevenue = rs.getDouble("TotalRevenue");
                int totalQuantity = rs.getInt("TotalQuantity");

                setTotalRev += totalRevenue;
                setTotalQtyy += totalQuantity;

                // Add data to dataset for both metrics
                dataset.addValue(totalRevenue, "Total Revenue", productName);
                dataset.addValue(totalQuantity, "Total Quantity", productName);
            }

            lblTotalRev.setText("" + setTotalRev);
            lblTotalQtyy.setText("" + setTotalQtyy);
            JFreeChart chart = ChartFactory.createLineChart(
                    "Product Performance", // Chart title

                    "Products", // X-axis Label
                    "Values", // Y-axis Label
                    dataset // Dataset
            );

            // Add a subtitle
            chart.addSubtitle(new TextTitle("Analyze the performance of products over the selected date range."));

// Customize the plot
            CategoryPlot plot = chart.getCategoryPlot();
            plot.setRangeGridlinesVisible(true);
            plot.setBackgroundPaint(Color.LIGHT_GRAY);

            // Remove the previous chart
            panelProductPerformance.removeAll();

            // Add chart panel to  Product Performance tab
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(800, 400));
            panelProductPerformance.add(chartPanel, BorderLayout.CENTER);

            // Refresh the panel
            panelProductPerformance.revalidate();
            panelProductPerformance.repaint();

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
    ********************************************************************************************************************************************
                                            Branch Performance page functions
    ********************************************************************************************************************************************
     */
 /*
    -------------------  Bar Chart function
     */
    private void showBranchTransactionsBarChart() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();

            // SQL Query to fetch the number of transactions grouped by region
            String sql = "SELECT Region, COUNT(`TransactionID`) AS TransactionCount "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY Region";

            // Get selected date range
            String fromDate = comboFromYearBP.getSelectedItem() + "-"
                    + comboFromMonthBP.getSelectedItem() + "-"
                    + comboFromDateBP.getSelectedItem();
            String toDate = comboToYearBP.getSelectedItem() + "-"
                    + comboToMonthBP.getSelectedItem() + "-"
                    + comboToDateBP.getSelectedItem();

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            int totalTsCount = 0;
            while (rs.next()) {
                String region = rs.getString("Region");
                int transactionCount = rs.getInt("TransactionCount");
                dataset.addValue(transactionCount, "Transactions", region);

                totalTsCount += transactionCount;
            }

            // set total transaction count on the label
            lblTotalTransac.setText("" + totalTsCount);

            // Create Bar Chart
            JFreeChart chart = ChartFactory.createBarChart(
                    "Transactions by Region",
                    "Region",
                    "Number of Transactions",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false
            );

            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setRangeGridlinePaint(Color.GRAY);

            NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
            yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

            // Refresh panel before adding new chart
            panelBranchP.removeAll();
            panelBranchP.setLayout(new BorderLayout());

            // Add chart to panel
            ChartPanel chartPanel = new ChartPanel(chart);
            panelBranchP.add(chartPanel, BorderLayout.CENTER);
            panelBranchP.validate();

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    ********************************************************************************************************************************************
                                            Sales Report  page functions
    ********************************************************************************************************************************************
     */
    private void populateSalesReportSummary() {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;

        try {
            conn = database.connect();

            // Get selected date range
            String fromDate = comboFromYearSum.getSelectedItem() + "-"
                    + comboFromMonthSum.getSelectedItem() + "-"
                    + comboFromDateSum.getSelectedItem();
            String toDate = comboToYearSum.getSelectedItem() + "-"
                    + comboToMonthSum.getSelectedItem() + "-"
                    + comboToDateSum.getSelectedItem();

            // Query for Best Selling Product
            String bestProductSQL = "SELECT ProductName, SUM(Quantity) AS TotalQuantity "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY ProductName "
                    + "ORDER BY TotalQuantity DESC LIMIT 1";

            pst = conn.prepareStatement(bestProductSQL);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();
            if (rs.next()) {
                String bestProduct = rs.getString("ProductName");
                int bestProductQty = rs.getInt("TotalQuantity");
                lblBSP.setText(bestProduct + " (" + bestProductQty + " units)"); // Set Best Selling Product
            }
            rs.close();
            pst.close();

            // Query for Total Revenue and Total Quantity
            String revenueQtySQL = "SELECT SUM(TotalPrice) AS TotalRevenue, SUM(Quantity) AS TotalQuantity "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ?";
            pst = conn.prepareStatement(revenueQtySQL);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();
            if (rs.next()) {
                double totalRevenue = rs.getDouble("TotalRevenue");
                int totalQuantity = rs.getInt("TotalQuantity");
                lblTotalRevenue.setText("$" + totalRevenue); // Set Total Revenue
                lblTotalQuantity.setText(totalQuantity + " units"); // Set Total Quantity
            }
            rs.close();
            pst.close();

            // Query for Total Transactions
            String transactionSQL = "SELECT COUNT(`TransactionID`) AS TotalTransactions "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ?";
            pst = conn.prepareStatement(transactionSQL);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();
            if (rs.next()) {
                int totalTransactions = rs.getInt("TotalTransactions");
                lblTotalTransactions.setText(totalTransactions + " transactions"); // Set Total Transactions
            }
            rs.close();
            pst.close();

            // Query for Customer Segmentation (if segmentation exists)
            String customerSQL = "SELECT Region, COUNT(CustomerID) AS CustomerCount "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY Region";
            pst = conn.prepareStatement(customerSQL);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            StringBuilder customerSegments = new StringBuilder("<html>");
            while (rs.next()) {
                String region = rs.getString("Region");
                int count = rs.getInt("CustomerCount");
                customerSegments.append(region).append(": ").append(count).append(" customers<br>");
            }
            customerSegments.append("</html>");
            lblCustomerSegmentation.setText(customerSegments.toString()); // Set Customer Segmentation

            rs.close();
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    ------***  show data summery
     */
    // Method to load sales summary with total sales and region-based sales
    public ArrayList<ProductSalesSummary> loadSalesSummary(String fromDate, String toDate) {
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        ArrayList<ProductSalesSummary> salesData = new ArrayList<>();

        try {
            conn = database.connect();

            // Query to fetch the sales summary for each product (with total sales and region sales)
            String sql = "SELECT ProductID, ProductName, "
                    + "SUM(Quantity) AS TotalQuantitySold, "
                    + "SUM(TotalPrice) AS TotalRevenue, "
                    + "COUNT(DISTINCT TransactionID) AS TotalTransactions, "
                    + "AVG(PriceperUnit) AS AvgPricePerUnit, "
                    + "Region "
                    + "FROM supermarket_sales "
                    + "WHERE Date BETWEEN ? AND ? "
                    + "GROUP BY ProductID, ProductName, Region "
                    + "ORDER BY TotalRevenue DESC";

            pst = conn.prepareStatement(sql);
            pst.setString(1, fromDate);
            pst.setString(2, toDate);
            rs = pst.executeQuery();

            // Process each result row
            while (rs.next()) {
                ProductSalesSummary summary = new ProductSalesSummary(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getInt("TotalQuantitySold"),
                        rs.getFloat("TotalRevenue"),
                        rs.getInt("TotalTransactions"),
                        rs.getFloat("AvgPricePerUnit"),
                        rs.getFloat("TotalRevenue") // Use TotalRevenue for TotalSales if needed
                );
                salesData.add(summary);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return salesData;
    }
    // Method to show the sales summary data in the table

    public void showSalesSummaryTable(String fromDate, String toDate) {
        ArrayList<ProductSalesSummary> salesList = loadSalesSummary(fromDate, toDate);
        DefaultTableModel tb = (DefaultTableModel) tableSummery.getModel();
        tb.setRowCount(0); // Clear existing rows

        Object[] row = new Object[7]; // Now 7 columns in total (no region column)
        for (ProductSalesSummary sales : salesList) {
            row[0] = sales.getProductID();
            row[1] = sales.getProductName();
            row[2] = sales.getTotalQuantitySold();
            row[3] = sales.getTotalRevenue();
            row[4] = sales.getTotalTransactions();
            row[5] = sales.getAvgPricePerUnit();
            row[6] = sales.getTotalRevenue(); // Use TotalRevenue for TotalSales column

            tb.addRow(row);
        }
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
    public void deleteData() {
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
    public void updateDataset() {
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

        int transacId, cusId, prodId, pQty;
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
    public void clearFields() {
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

        System.out.println(jTabb.getTabCount());
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
                            jTabb.setSelectedIndex(1);

                            drawer.hide();
                            break;
                        case 1:
                            jTabb.setSelectedIndex(2);

                            drawer.hide();
                            break;
                        case 2:
                            jTabb.setSelectedIndex(3);

                            drawer.hide();
                            break;
                        case 3:
                            jTabb.setSelectedIndex(4);

                            drawer.hide();
                            break;
                        case 4:
                            jTabb.setSelectedIndex(0);

                            drawer.hide();
                            break;
                        case 5:
                            jTabb.setSelectedIndex(7);

                            drawer.hide();
                            break;
                        case 6:
                            jTabb.setSelectedIndex(5);

                            drawer.hide();
                            break;
                        case 7:
                            jTabb.setSelectedIndex(6);

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

                    if (index == 0) { // Best Selling Products
                        jTabb.setSelectedIndex(1);
                    } else if (index == 1) { // Customer Analysis
                        jTabb.setSelectedIndex(2);
                    } else if (index == 2) { // Product Performance
                        jTabb.setSelectedIndex(3);
                    } else if (index == 3) { // Branch Performance
                        jTabb.setSelectedIndex(4);
                    } else if (index == 4) { // Sales
                        jTabb.setSelectedIndex(0);
                    } else if (index == 5) { // Change Password
                        jTabb.setSelectedIndex(6);
                    } else if (index == 6) { // Logout
                        int number = JOptionPane.showConfirmDialog(null,
                                "Are you sure you want to logout? You will be returned to the Login Screen",
                                "Confirm Logout", JOptionPane.YES_NO_OPTION);
                        if (number == JOptionPane.YES_OPTION) {
                            new LoginPage().setVisible(true);
                            this.dispose();
                        } else {
                            drawer.hide();
                        }
                    }
                    drawer.hide();
                })
                .build();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BSPTable;
    private javax.swing.JLabel bsCount;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearData;
    private javax.swing.JButton btnDeleteData;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdateData;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JComboBox<String> comboFromDate;
    private javax.swing.JComboBox<String> comboFromDateBP;
    private javax.swing.JComboBox<String> comboFromDateCustom;
    private javax.swing.JComboBox<String> comboFromDateProductP;
    private javax.swing.JComboBox<String> comboFromDateSum;
    private javax.swing.JComboBox<String> comboFromMonth;
    private javax.swing.JComboBox<String> comboFromMonthBP;
    private javax.swing.JComboBox<String> comboFromMonthCustom;
    private javax.swing.JComboBox<String> comboFromMonthProductP;
    private javax.swing.JComboBox<String> comboFromMonthSum;
    private javax.swing.JComboBox<String> comboFromYear;
    private javax.swing.JComboBox<String> comboFromYearBP;
    private javax.swing.JComboBox<String> comboFromYearCustom;
    private javax.swing.JComboBox<String> comboFromYearProductP;
    private javax.swing.JComboBox<String> comboFromYearSum;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JComboBox<String> comboToDate;
    private javax.swing.JComboBox<String> comboToDateBP;
    private javax.swing.JComboBox<String> comboToDateCustom;
    private javax.swing.JComboBox<String> comboToDateProductP;
    private javax.swing.JComboBox<String> comboToDateSum;
    private javax.swing.JComboBox<String> comboToMonth;
    private javax.swing.JComboBox<String> comboToMonthBP;
    private javax.swing.JComboBox<String> comboToMonthCustom;
    private javax.swing.JComboBox<String> comboToMonthProductP;
    private javax.swing.JComboBox<String> comboToMonthSum;
    private javax.swing.JComboBox<String> comboToYear;
    private javax.swing.JComboBox<String> comboToYearBP;
    private javax.swing.JComboBox<String> comboToYearCustom;
    private javax.swing.JComboBox<String> comboToYearProductP;
    private javax.swing.JComboBox<String> comboToYearSum;
    private com.toedter.calendar.JDateChooser dateChoose;
    private javax.swing.JLabel dtDateRange;
    private javax.swing.JLabel dtRange;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabb;
    private javax.swing.JLabel lblBSP;
    private javax.swing.JLabel lblCusCount;
    private javax.swing.JLabel lblCustomerSegmentation;
    private javax.swing.JLabel lblLargestSeg;
    private javax.swing.JLabel lblTotalQtyy;
    private javax.swing.JLabel lblTotalQuantity;
    private javax.swing.JLabel lblTotalRev;
    private javax.swing.JLabel lblTotalRevenue;
    private javax.swing.JLabel lblTotalTransac;
    private javax.swing.JLabel lblTotalTransactions;
    private javax.swing.JPanel panelBSP;
    private javax.swing.JPanel panelBranch;
    private javax.swing.JPanel panelBranchP;
    private javax.swing.JPanel panelChangepwd;
    private javax.swing.JPanel panelCustomer;
    private javax.swing.JPanel panelDataset;
    private javax.swing.JPanel panelManageUsers;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JPanel panelProductPerformance;
    private javax.swing.JPanel panelSales;
    private javax.swing.JPasswordField password;
    private javaswingdev.chart.PieChart pieChart1;
    private javaswingdev.chart.PieChart pieChart2;
    private javax.swing.JLabel pieTitle;
    private javax.swing.JLabel pieTitle1;
    private javax.swing.JLabel pieTitle2;
    private javax.swing.JLabel pieTitle3;
    private javax.swing.JLabel pieTitle4;
    private javax.swing.JLabel pieTitle5;
    private javax.swing.JLabel pieTitle6;
    private javax.swing.JTable supdatasetTable;
    private javax.swing.JTable tableCustomSeg;
    private javax.swing.JTable tableSummery;
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
