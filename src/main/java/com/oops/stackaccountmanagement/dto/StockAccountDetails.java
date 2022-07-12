package com.oops.stackaccountmanagement.dto;

public class StockAccountDetails {
    private String stockName;
    private int noOfShares;
    private double sharePrices;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getSharePrices() {
        return sharePrices;
    }

    public void setSharePrices(double sharePrices) {
        this.sharePrices = sharePrices;
    }
}
