package com.blz.account;

import com.blz.account.service.AccountService;
import com.blz.account.service.impl.AccountServiceImpl;
import com.blz.account.utils.UserInputs;

public class Account {
    public static void choice() {
        AccountService acc1 = new AccountServiceImpl();
        int choice = 0;
        while (choice < 5) {
            System.out.println("Enter your Choice: \n 1:aaOpen \n 2:creditAcc \n 3:debitAcc \n \n 4:exit");
            choice = UserInputs.intVal();

            switch (choice) {
                case 1:
                    acc1.accOpen();
                    break;
                case 2:
                    acc1.creditAcc();
                    break;
                case 3:
                    acc1.debitAcc();
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Enter correct option");
            }
        }
    }

    public static void main(String[] args) {
        choice();
    }
}
