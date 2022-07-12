package com.blz.account.dto;

public class AccountDetails {
    private String name;
    private long accNo;
    private long balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "AccountDetails{" +
                "name='" + name + '\'' +
                ", accNo=" + accNo +
                ", balance=" + balance +
                '}';
    }
}
