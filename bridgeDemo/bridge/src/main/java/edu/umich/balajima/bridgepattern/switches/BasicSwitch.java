package edu.umich.balajima.bridgepattern.switches;

import edu.umich.balajima.bridgepattern.appliances.Appliance;

public class BasicSwitch implements Switch {
    protected Appliance appliance;

    public BasicSwitch() {}

    public BasicSwitch(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void togglePower() {
        System.out.println("Button (!): Toggle Power");
        if (appliance.isPowerOn()) {
            appliance.powerOff();
        } else {
            appliance.powerOn();
        }
    }
    
    @Override
    public void tempIncrease() {
        System.out.println("Button (+) : Temperature Increase");
        appliance.setTemp(appliance.getTemp() + 10);
    }

    @Override
    public void tempDecrease() {
        System.out.println("Button (-) : Temperature Decrease");
        appliance.setTemp(appliance.getTemp() - 10);
    }
}