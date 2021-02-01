package edu.umich.balajima.builderpattern;

class ElectronicCar extends VehicleBuilder {
    private Vehicle Vehicle = new Vehicle();
    @Override
    public void BuildFrame()
    {
        Vehicle.Add("Frame: X-Frame");
    }
    
    @Override
    public void BuildEngine()
    {
        Vehicle.Add("Engine: Brushless");
    }
    
    @Override
    public void BuildWheels()
    {
        Vehicle.Add("Wheels: RWD");
    }

    @Override
    public void BuildDashboard()
    {
        Vehicle.Add("Dashboard: Digital");
    }

    @Override
    public void BuildEnergy()
    {
        Vehicle.Add("Energy: Battery");
    }
    
    @Override
    public Vehicle GetResult()
    {
        return Vehicle;
    }
}