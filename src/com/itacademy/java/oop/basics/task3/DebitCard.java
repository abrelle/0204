package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {

    public DebitCard(String cardHolderName, String cardNumber, double balance) {
        super(cardHolderName, cardNumber, balance);
        if(balance < 0){
            super.setBalance(0);
            System.out.println("Balance cannot be non-positive. Balance is set to default 0.");
        }
    }

    @Override
    public void debit(double amount) throws NotEnoughBalanceException{
        if (amount <= super.getBalance()) {
            super.setBalance(super.getBalance() - amount);
        }
        else{
            throw new NotEnoughBalanceException("Amount exceeds the balance of debit card!");
        }
    }



}
