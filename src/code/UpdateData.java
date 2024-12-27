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
public class UpdateData {

    
    Connection conn;
    PreparedStatement pst;
    
    public UpdateData(int transacId, int customerId, int productId, String productName, int productQty, float PricepUnit, Date productDate, float pTotal, String Region) {
        
                    try {
                conn = database.connect();
                String sql = "UPDATE supermarket_sales set CustomerID=?, ProductID=?, ProductName=?, Quantity=?, PriceperUnit=?, Date=?, TotalPrice=?, Region=? where TransactionID=?";

                pst = conn.prepareStatement(sql);
                
                                pst.setInt(1, customerId);
                pst.setInt(2, productId);
                pst.setString(3, productName);
                pst.setInt(4, productQty);
                pst.setFloat(5, PricepUnit);
            pst.setDate(6, new java.sql.Date(productDate.getTime()));
                        pst.setFloat(7, pTotal);
            pst.setString(8, Region);
            pst.setInt(9, transacId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Succesflly added Data!");
        
    } catch(Exception e){
        
    }
    
}
}
