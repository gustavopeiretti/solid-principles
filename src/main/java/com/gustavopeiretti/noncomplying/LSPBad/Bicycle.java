package com.gustavopeiretti.noncomplying.LSPBad;

class Bicycle extends Vehicle {

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void startMotor() {
        throw new UnsupportedOperationException("Invalid for Bicycle");
    }
}
