package com.gustavopeiretti.noncomplying.ISPBad;


// Interface segregation violation
interface Vehicle {
    void start();

    void accelerate();

    void brake();

    void fly();
}
