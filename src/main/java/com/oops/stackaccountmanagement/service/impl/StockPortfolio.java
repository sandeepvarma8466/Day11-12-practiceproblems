package com.oops.stackaccountmanagement.service.impl;

//import com.oops.day11_12.StockAccountDetails;
import com.oops.stackaccountmanagement.dto.StockAccountDetails;
import com.oops.stackaccountmanagement.service.StockProvider;
import com.oops.stackaccountmanagement.utils.UserInputs;

import java.util.ArrayList;

public class StockPortfolio implements StockProvider {
    static ArrayList<StockAccountDetails> portfolio = new ArrayList<>();
    int count = 0;
    int totalValue;

    public void setStockInfo() {
        StockAccountDetails accountDetails = new StockAccountDetails();
        System.out.println("Enter Stock details you want to purchase: ");
        System.out.println("Enter Name of Stock: ");
        accountDetails.setStockName(UserInputs.strVal());
        System.out.println("Enter Number of shares want to purchase: ");
        accountDetails.setNoOfShares(UserInputs.intVal());
        System.out.println("Enter Share Price : ");
        accountDetails.setSharePrices(UserInputs.doubleVal());

        portfolio.add(accountDetails);
        System.out.println();
        System.out.println("Stock Added");
        count++;
    }

    public void setStocks() {
        System.out.println("Enter the number of stock accounts you want to have: ");
        int number = UserInputs.intVal();
        for (int i = 0; i < number; i++) {
            setStockInfo();
        }
    }

    public void totalStock() {
        for (StockAccountDetails stock : portfolio) {
            totalValue += stock.getNoOfShares() * stock.getSharePrices();
        }
        System.out.println(totalValue);
    }
}
