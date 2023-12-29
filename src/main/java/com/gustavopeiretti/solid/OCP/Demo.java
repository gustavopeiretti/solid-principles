package com.gustavopeiretti.solid.OCP;

public class Demo {

    public static void main(String[] args) {

        ICar carCoupe = new Car();
        carCoupe.accelerate();
        carCoupe.stop();

        ICar raceCar = new RaceCar();
        raceCar.accelerate();
        raceCar.stop();

    }

}
