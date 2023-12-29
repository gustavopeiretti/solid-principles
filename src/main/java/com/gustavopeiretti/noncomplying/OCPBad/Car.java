package com.gustavopeiretti.noncomplying.OCPBad;

class Car {

    void accelerate(boolean isCarRace) {
        if (isCarRace) {
            injectExtraGas();
        }
        // accelerate car
    }

    void stop() {
        // stop car
    }

    private void injectExtraGas() {
        // only for Race Car
    }

}
