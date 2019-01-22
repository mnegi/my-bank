package com.mbank.dao;

import com.mbank.Account;
import com.mbank.Bank;

public class AccountDAO {
    Account account;
    Bank bank;

    // create
    // list
    // get
    // update


    public AccountDAO(Bank bank) {
        this.bank = bank;
    }

    public int create(Account account){
        this.bank.getAccounts().put(account.getId(), account);
        return 1;
    }

    public Account get(long id){
        return this.bank.getAccounts().get(id);
    }
}
