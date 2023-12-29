package com.gustavopeiretti.noncomplying.ISPBad;

public class Demo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.accelerate();
        car.fly(); // car can't fly

        Vehicle airplane = new Airplane();
        airplane.start();
        airplane.accelerate();
        airplane.fly(); // ok

    }

}
