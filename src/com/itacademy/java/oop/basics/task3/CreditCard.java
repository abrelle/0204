package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughCreditException;

public class CreditCard extends Card {
    private double interest;
    private double credit;

    public CreditCard(String cardHolderName, String cardNumber, double balance, double interest, double credit) {
        super(cardHolderName, cardNumber, balance);

        this.interest = interest;
        this.credit = credit;

        if(interest <= 0 ){
            this.interest = 1;
            System.out.println("Interest must be positive. Interest is set to default 1%.");
        }

        if(credit <= 0 ){
            this.credit = 200;
            System.out.println("Credit must be positive. Credit is set to default 200.");
        }
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void debit(double amount) throws NotEnoughCreditException {
        double amountWithInterest = amount * (1 + interest/100);
        double balance = super.getBalance();
        if ((balance - amountWithInterest) >= (-1 * credit)) {
            super.setBalance(super.getBalance() - amountWithInterest);
        }
        else{
            throw new NotEnoughCreditException("Amount exceeds the credit of credit card!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "CreditCard{" +
                "interest=" + interest +
                ", credit=" + credit +
                '}';
    }
}
