/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author sahan
 */
public class BspTableLoad {
        private String productName;
    private int totalQuantitySold;
    private float totalRevenue;
    private int totalTransactions;
    private int customerCount;
  
    private float revenueContribution;

    
        /*
    -- Constructor for the load Best selling product Table  
    */
    public BspTableLoad(String productName, int totalQuantitySold, float totalRevenue, int totalTransactions,
                       int customerCount, float revenueContribution) {
        this.productName = productName;
        this.totalQuantitySold = totalQuantitySold;
        this.totalRevenue = totalRevenue;
        this.totalTransactions = totalTransactions;
        this.customerCount = customerCount;
        this.revenueContribution = revenueContribution;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotalQuantitySold() {
        return totalQuantitySold;
    }

    public void setTotalQuantitySold(int totalQuantitySold) {
        this.totalQuantitySold = totalQuantitySold;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTotalTransactions() {
        return totalTransactions;
    }

    public void setTotalTransactions(int totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }


    public float getRevenueContribution() {
        return revenueContribution;
    }

    public void setRevenueContribution(float revenueContribution) {
        this.revenueContribution = revenueContribution;
    }
    
}
