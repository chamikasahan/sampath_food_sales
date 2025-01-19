/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import db.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ui.LoginPage;
import ui.MainPage;

/**
 *
 * @author sahan
 */
public class LoginForm {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
public String loginStatus;
    /*
    
    ** constructor for Login Validation
    
     */
    public LoginForm(String username, String role, String password, LoginPage loginPage) {
        
       if (username == null || username.trim().isEmpty() || role == null || role.trim().isEmpty() || password == null || password.trim().isEmpty()) {
        loginStatus = "All fields are required";
        throw new IllegalArgumentException(loginStatus);
    }
        try {
            conn = database.connect();
            String sql = "select * from signup_details where username=? and password=? and role=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, role);
            rs = pst.executeQuery();

//             checking fields are Empty or not
            if (!username.equals(" ") && !password.equals(" ") && !role.equalsIgnoreCase("login as")) {

                if (rs.next()) {
//                when role is Admin//
                    if (role.equalsIgnoreCase("Admin")) {
                        JOptionPane.showMessageDialog(null, "Logged as Admin", "Success", JOptionPane.PLAIN_MESSAGE);
                         loginStatus = "Admin Login Successful";
                        MainPage mp = new MainPage();
                        mp.Adminheader();
                        mp.setVisible(true);
                        loginPage.dispose();
                        conn.close();
                    } //                when role is Employee//
                    else {
                        JOptionPane.showMessageDialog(null, "Logged as employee", "Success", JOptionPane.PLAIN_MESSAGE);
                         loginStatus = "Employee Login Successful";
                        MainPage main = new MainPage();
                        main.Empheader();
                        main.setVisible(true);
                        loginPage.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username  Password or Role", "Invalid", JOptionPane.ERROR_MESSAGE);
                    loginStatus = "Invalid Username, Password, or Role";
                }
            } else {
                JOptionPane.showMessageDialog(null, "All fIelds are required", "Error ", JOptionPane.ERROR_MESSAGE);
                loginStatus = "All fields are required";
            }
        } catch (SQLException e) {
           loginStatus = "Database Error: " + e.getMessage();
            throw new RuntimeException(loginStatus, e);
        }
    }

}
