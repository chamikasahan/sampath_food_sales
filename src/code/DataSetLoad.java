/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.sql.Date;

/**
 *
 * @author sahan
 */
public class DataSetLoad {
    private int transactionId, CustomerID,ProductID, Quantity;
    private String ProductName, Region;
    private float PriceperUnit, TotalPrice;
    private Date Date;

    public DataSetLoad(int transactionId, int CustomerID, int ProductID,  String ProductName,int Quantity,  float PriceperUnit , Date Date, float TotalPrice, String Region ) {
        this.transactionId = transactionId;
        this.CustomerID = CustomerID;
        this.ProductID = ProductID;
        this.Quantity = Quantity;
        this.ProductName = ProductName;
        this.Region = Region;
        this.PriceperUnit = PriceperUnit;
        this.TotalPrice = TotalPrice;
        this.Date = Date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public float getPriceperUnit() {
        return PriceperUnit;
    }

    public void setPriceperUnit(float PriceperUnit) {
        this.PriceperUnit = PriceperUnit;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    
    
}
