package com.gustavopeiretti.solid.ISP;

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();

        Airplane airplane = new Airplane();
        airplane.start();
        airplane.accelerate();
        airplane.fly();

    }

}
