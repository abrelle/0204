package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughCreditException;

public abstract class Card {
    private String cardHolderName;
    private String cardNumber;
    private double balance;

    public Card(String cardHolderName, String cardNumber, double balance) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }

    public abstract void debit(double amount) throws NotEnoughBalanceException, NotEnoughCreditException;

    @Override
    public String toString() {
        return "Card{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
