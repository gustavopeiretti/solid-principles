package com.gustavopeiretti.noncomplying.OCPBad;

public class Demo {

    public static void main(String[] args) {

        Car carCoupe = new Car();
        carCoupe.accelerate(false);
        carCoupe.stop();

        Car raceCar = new Car();
        raceCar.accelerate(true);
        raceCar.stop();

    }

}
