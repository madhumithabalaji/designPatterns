package edu.umich.balajima.builderpattern;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
    {
        //Get user input
        try{
            System.out.println("Enter Car Type:" );
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
            String carType = reader.readLine(); 
            System.out.println("---- " + carType + " ----");
            
            // Create Showroom and VehicleBuilders
            Showroom Showroom = new Showroom();
            switch (carType) {
                case "Standard Car":
                    VehicleBuilder bStandardCar = new StandardCar();
                    Showroom.Construct(bStandardCar);
                    Vehicle pStandardCar = bStandardCar.GetResult();
                    pStandardCar.Show();
                    break;
                case "Sport Car":
                    VehicleBuilder bSportsCar = new SportCar();
                    Showroom.Construct(bSportsCar);
                    Vehicle pSportsCar = bSportsCar.GetResult();
                    pSportsCar.Show();
                    break;
                case "Electronic Car":
                    VehicleBuilder bElectronicCar = new ElectronicCar();
                    Showroom.Construct(bElectronicCar);
                    Vehicle pbElectronicCar = bElectronicCar.GetResult();
                    pbElectronicCar.Show();
                    break;
                default: 
                    System.out.println("Invalid Option! Please try again!"); break;

                }
            }
        catch(IOException e) {
			e.printStackTrace();
        }
    }
}
