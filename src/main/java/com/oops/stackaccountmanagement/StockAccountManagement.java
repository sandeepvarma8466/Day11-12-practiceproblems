package com.oops.stackaccountmanagement;

import com.oops.stackaccountmanagement.service.StockProvider;
import com.oops.stackaccountmanagement.service.impl.StockPortfolio;
import com.oops.stackaccountmanagement.utils.UserInputs;

public class StockAccountManagement{
    public static void main(String[] args) {
        int choice = 0;
        while (choice < 4) {
            StockProvider sp = new StockPortfolio();
            System.out.println("Enter your choice \n1.SetStockInfo \n2.SetStocks \n3.Display Total Value of stocks \n4.Exit");
            choice = UserInputs.intVal();
            switch (choice) {
                case 1:
                    sp.setStockInfo();
                    break;
                case 2:
                    sp.setStocks();
                    break;
                case 3:
                    System.out.println("Total value of Stack is: ");
                    sp.totalStock();
                    break;
                case 4:
                    System.out.println("Bye!!");
                default:
                    System.out.println("Enter correct choice");
            }
        }
    }
}
