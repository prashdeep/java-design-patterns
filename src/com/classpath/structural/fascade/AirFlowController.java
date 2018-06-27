package com.classpath.structural.fascade;

public class AirFlowController {

    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        System.out.println("Air provided!");
    }

    public void off() {
        System.out.println("Air controller switched off.");
    }
}
