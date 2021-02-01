package edu.umich.balajima.builderpattern;

// Director: "Showroom"
class Showroom
{
    // VehicleBuilder uses a complex series of steps
    public void Construct(VehicleBuilder VehicleBuilder)
    {
        VehicleBuilder.BuildFrame();
        VehicleBuilder.BuildEngine();
        VehicleBuilder.BuildWheels();
        VehicleBuilder.BuildDashboard();
        VehicleBuilder.BuildEnergy();
    }
}