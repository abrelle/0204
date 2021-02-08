package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;
    private static final int MIN_SPEED_VALUE = -10;
    private static final int MAX_SPEED_VALUE = 100;
    private static final int LOWEST_GEAR = 0;
    private static final int HIGHEST_GEAR = 20;


    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void changeGear(int newGear) {
        if (!(newGear == 1 || newGear == -1)) {
            System.out.println("This gear change value is not allowed. Use 1 or -1.");
            return;
        }
        if ((gear + newGear) < LOWEST_GEAR) {
            System.out.println("Gear has already reached the lowest value - " + LOWEST_GEAR);
            return;
        }

        if ((gear + newGear) > HIGHEST_GEAR) {
            System.out.println("Gear has already reached the highest value - " + HIGHEST_GEAR);
            return;
        }

        gear += newGear;
        System.out.println("Mountain bike's new gear is " + gear);

    }

    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Speed value is negative. Use only positive numbers.");
            return;
        }
        if ((speed + increment) > MAX_SPEED_VALUE) {
            System.out.println("Speed is too high. Highest possible increment value is " + (MAX_SPEED_VALUE - speed));
            return;
        }
        speed += increment;
        System.out.println("Mountain bike's new speed is " + speed);

    }

    public void applyBrakes(int decrement) {
        if (decrement < 0) {
            System.out.println("Breaking value is negative. Use only non-negative numbers.");
            return;
        }
        if ((speed - decrement) < MIN_SPEED_VALUE) {
            System.out.println("Breaking value is too high. Highest possible decrement is " + (speed - MIN_SPEED_VALUE));
            return;
        }
        speed -= decrement;
        System.out.println("Mountain bike's new speed is " + speed);
    }
}
