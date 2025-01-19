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
import ui.MainPage;

/**
 *
 * @author sahan
 */
public class ChangePassword {
    Connection conn;
    PreparedStatement pst, pst1;
    ResultSet rs;

    public ChangePassword(String userName, String currentPassword, String newPassword, String confirmNewPassword) {
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
                                 throw new IllegalArgumentException("New password and Confirm Password Does not match");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password should be more than 6 digits");
                             throw new IllegalArgumentException("Password should be more than 6 digits");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Enter correct old Password");
                         throw new IllegalArgumentException("Enter correct old Password");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username");
                     throw new IllegalArgumentException("Invalid Username");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fields are required !");
                 throw new IllegalArgumentException("Fields are required !");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
