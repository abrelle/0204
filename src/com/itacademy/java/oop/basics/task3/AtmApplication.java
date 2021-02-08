package com.itacademy.java.oop.basics.task3;


public class AtmApplication {
    public static void main(String[] args) {
        Card creditCard = new CreditCard("steve", "jobs", 0.1, 1.1, 11);
        Card debitCard = new DebitCard("Gabriele", "Buivydaite", 100);
        Atm myBankAtm = new MyBankAtm(20);

        try {
            myBankAtm.withdraw(creditCard, 10);
            myBankAtm.withdraw(debitCard, 10);

            System.out.println(creditCard.toString());
            System.out.println(debitCard.toString());
            System.out.println(myBankAtm);

            creditCard.credit(20);
            debitCard.credit(1000);
            myBankAtm.withdraw(creditCard, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        myBankAtm = new MyBankAtm(2000);

        try {
            myBankAtm.withdraw(creditCard, 25);
            System.out.println(creditCard.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            myBankAtm.withdraw(debitCard, 1500);
            System.out.println(debitCard.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
