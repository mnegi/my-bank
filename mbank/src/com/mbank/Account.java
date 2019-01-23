package com.mbank;

import java.io.Serializable;

public class Account implements Serializable {

    long id;
    Customer customer;
    Branch branch;
    double balance;
    String type;

    public Account(long id, Customer customer, Branch branch, double balance, String type) {
        this.id = id;
        this.customer = customer;
        this.branch = branch;
        this.balance = balance;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", branch=" + branch +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }
}
