package com.gustavopeiretti.solid.OCP;

public class RaceCar implements ICar {

    public void accelerate() {
        System.out.println("accelerate race car");
        injectExtraGas();
    }

    public void stop() {
        System.out.println("stop race car");
    }

    private void injectExtraGas() {
        System.out.println("inject extra gas race car");
    }

}
