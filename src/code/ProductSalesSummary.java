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
public class ProductSalesSummary {
    private int productID;
    private String productName;
    private int totalQuantitySold;
    private float totalRevenue;
    private int totalTransactions;
    private float avgPricePerUnit;

 private float regionSales;

    public float getRegionSales() {
        return regionSales;
    }

    public void setRegionSales(float regionSales) {
        this.regionSales = regionSales;
    }

    public ProductSalesSummary(int productID, String productName, int totalQuantitySold, float totalRevenue, int totalTransactions, float avgPricePerUnit) {
        this.productID = productID;
        this.productName = productName;
        this.totalQuantitySold = totalQuantitySold;
        this.totalRevenue = totalRevenue;
        this.totalTransactions = totalTransactions;
        this.avgPricePerUnit = avgPricePerUnit;

        this.regionSales = regionSales;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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

    public float getAvgPricePerUnit() {
        return avgPricePerUnit;
    }

    public void setAvgPricePerUnit(float avgPricePerUnit) {
        this.avgPricePerUnit = avgPricePerUnit;
    }



    
}
