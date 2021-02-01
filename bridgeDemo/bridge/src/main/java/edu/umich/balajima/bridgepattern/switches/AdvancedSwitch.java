package edu.umich.balajima.bridgepattern.switches;

import edu.umich.balajima.bridgepattern.appliances.Appliance;

public class AdvancedSwitch extends BasicSwitch {

    public AdvancedSwitch(Appliance appliance) {
		super.appliance = appliance;
    }

    public void tempAdjust() {
        System.out.println("Button (@): Adjust Temperature");
        appliance.setTemp(0);
    }
}