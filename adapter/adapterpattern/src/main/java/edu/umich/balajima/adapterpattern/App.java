package edu.umich.balajima.adapterpattern;
public class App 
{
    public static void main(String args[]) 
    { 
        Sparrow sparrow = new Sparrow(); 
        ToyDuck toyDuck = new PlasticToyDuck(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.print("Sparrow is "); 
        sparrow.fly(); 
        sparrow.makeSound(); 
  
        System.out.print("; ToyDuck is "); 
        toyDuck.squeak(); 
        // toy duck behaving like a bird  
        birdAdapter.squeak(); 
    } 
}
