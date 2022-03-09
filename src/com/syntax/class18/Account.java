package com.syntax.class18;

public class Account {
    private String username="Chelovek";
    private String password="kod";
    public String accountNumber="852741963";
    private double balance=-87523;

    private void printUser(){
        System.out.println(username);
    }
    protected void printPassword(){
        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public void printAccountNumber(){
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account=new Account();
        System.out.println(account.username);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accountNumber);
        account.printAccountNumber();
        account.printUser();
        account.printPassword();
        account.printBalance();
    }
}
