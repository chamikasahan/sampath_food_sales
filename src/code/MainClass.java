/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import db.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.LoginPage;
import ui.Set1stAdmin;

public class MainClass {

    public static void main(String[] args) {

        Connection conn;
        Statement stm;
        try {

            conn = database.connect();

            stm = conn.createStatement();
            String sql = "select * from signup_details";
            ResultSet rs = stm.executeQuery(sql);

            // check the signup details table empty or not
            int count = 0;
            while (rs.next()) {
                count++;
            }

            if (count == 0) {
                // if any users are not exsist, run the register 1st admin
                Set1stAdmin newAdmin = new Set1stAdmin();
                newAdmin.setVisible(true);
                conn.close();
                stm.close();

            } else {

                // if any users are  exsist, run the login page for login to the system
                LoginPage loginpage = new LoginPage();
                loginpage.setVisible(true);
                conn.close();
                stm.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
