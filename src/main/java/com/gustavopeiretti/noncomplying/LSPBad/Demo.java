package com.gustavopeiretti.noncomplying.LSPBad;

public class Demo {

    public static void main(String[] args) {

        CombustionVehicle vehicle = new CombustionVehicle("Suv Nissan");
        vehicle.startMotor();
        vehicle.accelerate();
        vehicle.stop();

        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla");
        electricVehicle.startMotor();
        electricVehicle.accelerate();
        electricVehicle.stop();

        // LSP violation
        // Subtypes must be substitutable for their base types.
        Bicycle bicycle = new Bicycle("BMX Bike");
        bicycle.startMotor(); // This will throw an error. (The subtype is not substitutable by its base class)
        bicycle.accelerate();
        bicycle.stop();

    }

}
