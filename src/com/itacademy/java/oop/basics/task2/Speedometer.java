package com.itacademy.java.oop.basics.task2;

public class Speedometer {
    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike){
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed){
        if(roadBikeSpeed > mountainBikeSpeed){
            return Bike.ROAD;
        }
        else if (mountainBikeSpeed > roadBikeSpeed){
            return Bike.MOUNTAIN;
        }
        else {
            return null;
        }
    }
}
