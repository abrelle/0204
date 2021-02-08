package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(19, 50);
        RoadBike roadBike = new RoadBike(8, 48);


//        mountainBike.speedUp(60);
//        mountainBike.applyBrakes(70);
//        mountainBike.changeGear(3);
//        mountainBike.changeGear(2);

        roadBike.speedUp(2);
        roadBike.applyBrakes(-50);

        roadBike.speedUp(14);
        mountainBike.speedUp(10);
        mountainBike.applyBrakes(1);
        roadBike.applyBrakes(-2);
        System.out.println("Winner bicycle is " + Speedometer.chooseWinner(mountainBike,roadBike));
    }

}
