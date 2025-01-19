/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import db.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author sahan
 */
public class AddNewData {

    Connection conn;
    PreparedStatement pst;

    /*
    -- Constructor for the Admin dasboard Sales dataset page Add data function  
     */
 public AddNewData(int customerId, int productId, String productName, int productQty, float PricepUnit, Date productDate, float pTotal, String Region) {
        if (customerId == 0 || productId == 0 || productName == null || productName.trim().isEmpty() || productQty == 0 ||
            PricepUnit == 0 || productDate == null || pTotal == 0 || Region == null || Region.trim().isEmpty()) {
            throw new IllegalArgumentException("All fields are required and must be valid!");
        }

        try {
            conn = database.connect();
            String sql = "INSERT INTO supermarket_sales(CustomerID, ProductID, ProductName, Quantity, PriceperUnit, Date, TotalPrice, Region) VALUES(?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setInt(1, customerId);
            pst.setInt(2, productId);
            pst.setString(3, productName);
            pst.setInt(4, productQty);
            pst.setFloat(5, PricepUnit);
            pst.setDate(6, new java.sql.Date(productDate.getTime()));
            pst.setFloat(7, pTotal);
            pst.setString(8, Region);

            pst.executeUpdate();
               JOptionPane.showMessageDialog(null, "Succesfully Added Data!");
        } catch (Exception e) {
            throw new RuntimeException("Error adding data: " + e.getMessage(), e);
        }
    }
}
