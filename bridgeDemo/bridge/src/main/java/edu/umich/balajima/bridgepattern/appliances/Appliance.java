package edu.umich.balajima.bridgepattern.appliances;

public interface Appliance {
    boolean isPowerOn();

    void powerOn();

    void powerOff();

    int getTemp();

    void setTemp(int degreeVal);

    void printStatus();
}