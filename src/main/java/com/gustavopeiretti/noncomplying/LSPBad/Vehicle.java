package com.gustavopeiretti.noncomplying.LSPBad;

class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void startMotor() {
        System.out.println("starting motor");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }

    public void stop() {
        System.out.println("stop");
    }

    public String getName() {
        return name;
    }
}
