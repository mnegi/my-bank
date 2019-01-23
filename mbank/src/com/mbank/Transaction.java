package com.mbank;

import java.io.Serializable;
import java.util.Date;

public class Transaction  implements Serializable {
    long id;
    double amount;
    Date date;
    String type;
    Account account;

    public Transaction(long id, double amount, Date date, String type, Account account) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                ", type='" + type + '\'' +
                ", account=" + account +
                '}';
    }
}
