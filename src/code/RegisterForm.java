/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import db.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

            String sql = "insert into signup_details (username, role, email, password, confirm_password) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            /*
            ** check fileds are empty or not
             */
            if (!userName.equals(" ") && !userEmail.equals(" ") && userRole != 0 && !userPassword.equals(" ") && !cUserPassword.equals(" ")) {

                /*
            ** check password Length
                 */
                if (userPassword.length() > 6) {

                    /*
            ** check password and confirm password match or not
                     */
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
                            pst.setString(5, cUserPassword);
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

        } catch (SQLException ex) {
            Logger.getLogger(Set1stAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
