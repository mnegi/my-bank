package com.mbank;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.HashMap;

public class Bank implements Serializable {
    long id;
    String name;

    private static final String filepath="/Users/mnegi/mybank";

    HashMap<Long, Customer> customers; // get started with the collections framework
    // there is an issue with array list - filter out from the collection
    HashMap<Long,Branch> branches;
    HashMap<Long,Account> accounts;
    HashMap<Long,Transaction> transactions;

    // by default when an object is created
    // what values will these members get id, name??
    // id  = 0
    // name = null
    // default values

    public Bank() {
        this.id = 1;//generate from somewhere;
        this.name = "My Bank";
        customers = new HashMap<>();
        branches = new HashMap<>();
        accounts = new HashMap<>();
        transactions = new HashMap<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Long, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Long, Customer> customers) {
        this.customers = customers;
    }

    public HashMap<Long, Branch> getBranches() {
        return branches;
    }

    public void setBranches(HashMap<Long, Branch> branches) {
        this.branches = branches;
    }

    public HashMap<Long, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<Long, Account> accounts) {
        this.accounts = accounts;
    }

    public HashMap<Long, Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(HashMap<Long, Transaction> transactions) {
        this.transactions = transactions;
    }


    public static void writeObject(Bank bank){
        // write bank object to a file
        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(bank);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static Bank readObject(){
        Bank bank = null;
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            bank = (Bank) objectIn.readObject();
            objectIn.close();
            System.out.println("The Object  was succesfully read from a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(bank == null){
            bank = new Bank();
        }
        return bank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customers=" + customers +
                ", branches=" + branches +
                ", accounts=" + accounts +
                ", transactions=" + transactions +
                '}';
    }
}
