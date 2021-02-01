package edu.umich.balajima.builderpattern;

class StandardCar extends VehicleBuilder {
    private Vehicle Vehicle = new Vehicle();
    @Override
    public void BuildFrame()
    {
        Vehicle.Add("Frame: Standard");
    }
    
    @Override
    public void BuildEngine()
    {
        Vehicle.Add("Engine: Inline");
    }
    
    @Override
    public void BuildWheels()
    {
        Vehicle.Add("Wheels: FWD");
    }

    @Override
    public void BuildDashboard()
    {
        Vehicle.Add("Dashboard: Standard");
    }

    @Override
    public void BuildEnergy()
    {
        Vehicle.Add("Energy: Standard");
    }
    
    @Override
    public Vehicle GetResult()
    {
        return Vehicle;
    }
}