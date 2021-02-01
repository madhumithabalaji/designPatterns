package edu.umich.balajima.builderpattern;

class SportCar extends VehicleBuilder {
    private Vehicle Vehicle = new Vehicle();
    @Override
    public void BuildFrame()
    {
        Vehicle.Add("Frame: Aerodynamic");
    }
    
    @Override
    public void BuildEngine()
    {
        Vehicle.Add("Engine: V-Engine");
    }
    
    @Override
    public void BuildWheels()
    {
        Vehicle.Add("Wheels: AWD");
    }

    @Override
    public void BuildDashboard()
    {
        Vehicle.Add("Dashboard: Premium");
    }

    @Override
    public void BuildEnergy()
    {
        Vehicle.Add("Energy: Enhanced");
    }
    
    @Override
    public Vehicle GetResult()
    {
        return Vehicle;
    }
}