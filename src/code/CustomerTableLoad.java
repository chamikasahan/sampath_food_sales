/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

public class CustomerTableLoad {
    private int customerId, transactions;

    public CustomerTableLoad(int customerId, int transactions, float totalSpending) {
        this.customerId = customerId;
        this.transactions = transactions;
        this.totalSpending = totalSpending;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public float getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(float totalSpending) {
        this.totalSpending = totalSpending;
    }
    private float totalSpending;
}
