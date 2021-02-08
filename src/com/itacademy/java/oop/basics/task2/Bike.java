package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("mountain"), ROAD("road");

    private String displayValue;

    Bike(String defaultValue) {
        this.displayValue = defaultValue;
    }

}
