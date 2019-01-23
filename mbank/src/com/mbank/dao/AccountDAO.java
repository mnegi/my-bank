package com.mbank.dao;

import com.mbank.Account;
import com.mbank.Bank;

import java.util.ArrayList;
import java.util.HashMap;

public class AccountDAO {
    Account account;
    Bank bank;

    public AccountDAO(Bank bank) {
        this.bank = bank;
    }

    public HashMap<Long,Account> list(){
        return this.bank.getAccounts();
    }

    public int create(Account account){
        this.bank.getAccounts().put(account.getId(), account);
        Bank.writeObject(this.bank);
        return 1;
    }

    public void update(long accountId, Account account){
        this.bank.getAccounts().put(accountId,account);
    }

    public void delete(long accountId){
        this.bank.getAccounts().remove(accountId);
    }

    public Account get(long id){
        return this.bank.getAccounts().get(id);
    }
}
