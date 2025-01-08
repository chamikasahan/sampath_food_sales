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
import ui.Set1stAdmin;

public class RegisterForm {

    Connection conn;
    PreparedStatement pst;

    /*
    
    ** constructor for Login Validation
    
     */
    public RegisterForm(String userName, String userEmail, int userRole, String userPassword, String cUserPassword, String textRole) {
        try {
            conn = database.connect();
            
            
               // Check if the username already exists
    String checkUserSql = "SELECT username FROM signup_details WHERE username = ?";
    pst = conn.prepareStatement(checkUserSql);
    pst.setString(1, userName);
    ResultSet rs = pst.executeQuery();

    if (rs.next()) {
        // Username already exists
        JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    else {
        
            String sql = "insert into signup_details (username, role, email, password) values(?,?,?,?)";
            pst = conn.prepareStatement(sql);

           
            if (!userName.equals(" ") && !userEmail.equals(" ") && userRole != 0 && !userPassword.equals(" ") && !cUserPassword.equals(" ")) {

             
                if (userPassword.length() > 6) {

              
                    if (userPassword.equals(cUserPassword)) {

                        /*
            ** check puserRole is employee or admin
                         */
                        if (userRole == 1) {
                            textRole = "Employee";
                        } else {
                            textRole = "Admin";

                        }
                        if (userEmail.contains("@") && userEmail.contains(".com")) {

                            pst.setString(1, userName);
                            pst.setString(2, textRole);
                            pst.setString(3, userEmail);
                            pst.setString(4, userPassword);
                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null, "success", "User Registered Successfully !", JOptionPane.PLAIN_MESSAGE);

                            conn.close();


                        } else {
                            JOptionPane.showMessageDialog(null, "Enter valid email.", " Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Password does not match", " Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Password should be more than 6 digit", " Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "All fields are required", " Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    


        } catch (SQLException ex) {
            Logger.getLogger(Set1stAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
