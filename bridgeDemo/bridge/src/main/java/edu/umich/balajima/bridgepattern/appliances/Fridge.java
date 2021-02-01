package edu.umich.balajima.bridgepattern.appliances;

public class Fridge implements Appliance {
    private boolean on = false;
    private int temp = 10;

    @Override
    public boolean isPowerOn() {
        return on;
    }

    @Override
    public void powerOn() {
        on = true;
    }

    @Override
    public void powerOff() {
        on = false;
    }

    @Override
    public int getTemp() {
        return temp;
    }

    @Override
    public void setTemp(int temp) {
        if (temp > 40) {
            this.temp = 40;
        } else if (temp < 0) {
            this.temp = 0;
        } else {
            this.temp = temp;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("Appliance Stats: Refrigerator");
        System.out.println("Power:" + (on ? "ON" : "OFF"));
        System.out.println("Current Temperature:" + temp + " C");
        System.out.println("-----------------------------\n");
    }
}
