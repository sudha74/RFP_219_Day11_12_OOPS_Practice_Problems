package com.bridgelabz.stock_account_management;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        StockPortfolio stockPortfolio = new StockPortfolio();
        account.debit(stockPortfolio.totalValue);
    }
    }

