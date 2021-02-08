package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.*;


public class MyBankAtm implements Atm{
    private double balance; //default 0

    public MyBankAtm(double balance) {
        if(balance > 0){
            this.balance = balance;
        }
        else{
            System.out.println("Balance must be non-negative number. Balance is set to zero.");
        }
    }

    @Override
    public void withdraw(Card card, double amount) throws InsuficientAtmFundsException, NotEnoughBalanceException, NotEnoughCreditException {

        if(amount <= balance){
           card.debit(amount);
           balance -= amount;
        }
        else{
            throw new InsuficientAtmFundsException("Amount exceeds atm balance!");
        }
    }

    @Override
    public String toString() {
        return "MyBankAtm{" +
                "balance=" + balance +
                '}';
    }

}
