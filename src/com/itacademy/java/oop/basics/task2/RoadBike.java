package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;
    private static final int MAXIMUM_SPEED = 50;
    private static final int LOWEST_GEAR = 0;
    private static final int HIGHEST_GEAR = 10;

    public RoadBike(int gear, int speed) {
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
        if (newGear < -2) {
            System.out.println("This gear change value is not allowed. Try using -2.");
            return;
        } else if (newGear == 0) {
            System.out.println("This gear change value is not allowed. Try using -1 or 1.");
            return;
        } else if (newGear > 2) {
            System.out.println("This gear change value is not allowed. Try using 2.");
            return;
        }

        if ((gear + newGear) > HIGHEST_GEAR) {
            System.out.println("Gear has already reached the highest value - " + HIGHEST_GEAR);
            return;
        }

        if ((gear + newGear) < LOWEST_GEAR) {
            System.out.println("Gear has already reached the lowest value - " + LOWEST_GEAR);
            return;
        }

        gear += newGear;
        System.out.println("Road bike's new gear is " + gear);

    }


    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Speed value is negative. Use only positive numbers.");
            return;
        }

        if ((speed + increment) > MAXIMUM_SPEED) {
            System.out.println("Speed is too high. Highest possible increase of speed value is " + (MAXIMUM_SPEED - speed));
            return;
        }

        speed += increment;
        System.out.println("Road bike's new speed is " + speed);

    }

    public void applyBrakes(int decrement) {
        if (decrement >= 0) {
            System.out.println("Brakes can only be applied using negative values.");
            return;
        }
        if ((speed + decrement) < 0) {
            System.out.println("Road bike speed cannot be negative.");
            return;
        }

        speed += decrement;
        System.out.println("Road bike's new speed is " + speed);

    }
}
