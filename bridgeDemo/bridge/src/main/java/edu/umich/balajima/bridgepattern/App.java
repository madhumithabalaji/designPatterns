package edu.umich.balajima.bridgepattern;

import edu.umich.balajima.bridgepattern.appliances.Appliance;
import edu.umich.balajima.bridgepattern.appliances.Fridge;
import edu.umich.balajima.bridgepattern.appliances.Oven;
import edu.umich.balajima.bridgepattern.switches.AdvancedSwitch;
import edu.umich.balajima.bridgepattern.switches.BasicSwitch;
 
public class App 
{
    public static void main(String[] args) {
        testAppliance(new Oven());
        testAppliance(new Fridge());
    }

    public static void testAppliance(Appliance appliance) {
        System.out.println("-----------------------------");
        System.out.println("Testing basic functionalities");
        BasicSwitch basicswitch = new BasicSwitch(appliance);
        basicswitch.togglePower();
        appliance.printStatus();
        System.out.println("-----------------------------");
        System.out.println("Testing advanced functionality");
        AdvancedSwitch advancedSwitch = new AdvancedSwitch(appliance);
        advancedSwitch.togglePower();
        advancedSwitch.tempAdjust();
        appliance.printStatus();
    }
}
