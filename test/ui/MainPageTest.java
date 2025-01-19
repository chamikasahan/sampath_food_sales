/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.BspTableLoad;
import code.CustomerTableLoad;
import code.ProductSalesSummary;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sahan
 */
public class MainPageTest {
    
    public MainPageTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class MainPage.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of loadBestSellingProducts method, of class MainPage.
     */
    @Test
    public void testLoadBestSellingProducts() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2022-01-01";
    String toDate = "2023-12-31";
    
    // Call the method
    ArrayList<BspTableLoad> productList = mainPage.loadBestSellingProducts(fromDate, toDate);

    // Assertions
    assertNotNull(productList);
    assertTrue(productList.size() >= 0);
    }


    @Test
    public void testLoadBestSellingProductsInvalidDate() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2042-01-01";
    String toDate = "2030-12-31";
    
    // Call the method
    ArrayList<BspTableLoad> productList = mainPage.loadBestSellingProducts(fromDate, toDate);

    // Assertions
    assertNull(productList);
    assertFalse(productList.size() >= 0);
    }

    
        @Test
    public void testloadTopCustomer() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2022-01-01";
    String toDate = "2023-12-31";
    
  ArrayList<CustomerTableLoad> Topcustomer = mainPage.loadTopCustomer(fromDate, toDate);
    // Assertions
    assertNotNull(Topcustomer);
    assertTrue(Topcustomer.size() >= 0);
    }

        @Test
    public void testloadTopCustomerInvalidDate() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2032-01-01";
    String toDate = "2023-12-31";
    
  ArrayList<CustomerTableLoad> Topcustomer = mainPage.loadTopCustomer(fromDate, toDate);
    // Assertions
    assertNull(Topcustomer);
    assertFalse(Topcustomer.size() >= 0);
    }

    
    @Test
    public void loadSalesSummary() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2022-01-01";
    String toDate = "2023-12-31";
    
  ArrayList<ProductSalesSummary> saleSummery = mainPage.loadSalesSummary( fromDate, toDate);
    // Assertions
    assertNotNull(saleSummery);
    assertTrue(saleSummery.size() >= 0);
    }
        @Test
    public void loadSalesSummaryInvalidDate() {
    
    MainPage mainPage = new MainPage();
    
    String fromDate = "2032-01-01";
    String toDate = "2023-12-31";
    
  ArrayList<ProductSalesSummary> saleSummery = mainPage.loadSalesSummary( fromDate, toDate);
    // Assertions
    assertNull(saleSummery);
    assertFalse(saleSummery.size() >= 0);
    }
    
    
    
    
    
    
    
}
