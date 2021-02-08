package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.*;


public interface Atm {
    void withdraw (Card card ,double amount) throws InsuficientAtmFundsException, NotEnoughBalanceException, NotEnoughCreditException;
}
