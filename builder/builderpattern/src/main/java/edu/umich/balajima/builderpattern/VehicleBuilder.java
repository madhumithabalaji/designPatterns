package edu.umich.balajima.builderpattern;

abstract class VehicleBuilder {
    public abstract void BuildFrame();
    public abstract void BuildEngine();
    public abstract void BuildWheels();
    public abstract void BuildDashboard();
    public abstract void BuildEnergy();
    public abstract Vehicle GetResult();
}