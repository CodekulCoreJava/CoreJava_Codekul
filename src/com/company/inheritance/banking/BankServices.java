package com.company.inheritance.banking;

public class BankServices implements InternetBanking{

    @Override
    public void NFT() {
        System.out.println("Transfer money to any bank account. ");
        System.out.println("");
    }

    @Override
    public void mobile() {
        System.out.println("Internet banking through mobile.");
    }

    @Override
    public void web() {
        System.out.println("Internet banking through web.");
    }

    public void getDetails () {
        System.out.println("Enter the customer name : ");
        System.out.println("Enter the Bank's name : ");
        System.out.println("Enter the customer's account number : ");

    }
}
