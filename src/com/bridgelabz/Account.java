package com.bridgelabz;

import java.util.Scanner;

public class Account {
    int accountBalance = 60000;

    public static void main(String[] args) {
        Account obj = new Account();
        obj.debit();
    }

    void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You Want To Debit");
        int amount = sc.nextInt();
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Your account is debited by RS " + amount + " and Available Balance is RS " +accountBalance);
        } else {
            System.out.println("Debit amount exceeded account Balance and Available Balance is RS" + accountBalance);
        }

    }

}

