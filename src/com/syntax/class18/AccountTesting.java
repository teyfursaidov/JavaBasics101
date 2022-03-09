package com.syntax.class18;

public class AccountTesting {
    public static void main(String[] args) {
        Account account=new Account();
       // System.out.println(account.username);
       // System.out.println(account.password);
       // System.out.println(account.balance);
        System.out.println(account.accountNumber);

        // accessing a field directly is different then accessing the same field with methods having
        // different access modifier

        account.printAccountNumber();
       // account.printUser();
        account.printPassword();
        account.printBalance();
    }
}
