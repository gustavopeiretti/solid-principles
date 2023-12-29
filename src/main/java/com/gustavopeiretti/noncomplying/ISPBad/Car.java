package com.gustavopeiretti.noncomplying.ISPBad;

class Car implements Vehicle {

    // Implementation of methods specific to Cars
    public void start() {
        // Start the car
    }

    public void accelerate() {
        // Accelerate the car
    }

    public void brake() {
        // Brake the car
    }

    // Flying is not relevant to Cars, but still implemented due to the interface contract.
    public void fly() {
        // Fly the car? Doesn't make sense!
        throw new UnsupportedOperationException("I can't fly :(");
    }

}
