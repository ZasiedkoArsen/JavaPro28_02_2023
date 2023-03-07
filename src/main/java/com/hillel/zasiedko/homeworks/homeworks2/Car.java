package com.hillel.zasiedko.homeworks.homeworks2;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity turns on");
    }
    private void startCommand() {
        System.out.println("Command starts");
    }
    private void startFuelSystem() {
        System.out.println("Fuel system turns on");
    }
}


