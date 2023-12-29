package com.gustavopeiretti.solid.LSP;

class Demo {

    public static void main(String[] args) {

        CombustionVehicle vehicle = new CombustionVehicle("Suv Nissan");
        vehicle.startMotor();
        vehicle.accelerate();
        vehicle.stop();

        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla");
        electricVehicle.startMotor();
        electricVehicle.accelerate();
        electricVehicle.stop();

        // LSP now is satisfied
        // Subtypes must be substitutable for their base types.
        Bicycle bicycle = new Bicycle("BMX Bike");
        bicycle.accelerate();
        bicycle.stop();

    }

}
