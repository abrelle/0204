package com.itacademy.java.oop.basics.task3.exceptions;

public class NotEnoughCreditException extends Exception{
    public NotEnoughCreditException(String errorMessage) {
        super(errorMessage);
    }
}
