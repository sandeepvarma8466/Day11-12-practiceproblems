package com.blz.account.service.impl;

import com.blz.account.dto.AccountDetails;
import com.blz.account.service.AccountService;
import com.blz.account.utils.UserInputs;

import java.util.ArrayList;
public class AccountServiceImpl implements AccountService {
    AccountDetails details = new AccountDetails();
    @Override
    public void accOpen() {
        System.out.println("Enter Account Name: ");
        details.setName(UserInputs.strVal());
        System.out.println("Enter a Acc Number:");
        details.setAccNo(UserInputs.longVal());
        System.out.println("Enter a Balance you want to Add: ");
        details.setBalance(UserInputs.longVal());
    }
    @Override
    public void creditAcc() {
        System.out.println("Enter a Amount you want to Add:");
        long amount= UserInputs.longVal();
        long balance = details.getBalance()+amount;
        System.out.println("Account is Credited Current balance is: " +balance);
    }
    @Override
    public void debitAcc() {
        System.out.println("Enter a Amount you want to Withdraw: ");
        long amount= UserInputs.longVal();
        if(details.getBalance()>amount) {
            long balance=details.getBalance()-amount;
            System.out.println("Account is debited: " +amount+ " Current balance is: " +balance);
        }
        else
            System.out.println("Debit Amount exceeded Account balance ");
    }
}
