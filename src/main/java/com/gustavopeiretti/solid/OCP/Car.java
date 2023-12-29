package com.gustavopeiretti.solid.OCP;

class Car implements ICar {

    @Override
    public void accelerate() {
        System.out.println("accelerate car");
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }

}
