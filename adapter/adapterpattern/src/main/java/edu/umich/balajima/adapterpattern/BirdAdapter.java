package edu.umich.balajima.adapterpattern;
class BirdAdapter implements ToyDuck 
{ 
    // You need to implement the interface your client expects to use. 
    Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
        // translate the methods appropriately 
        bird.makeSound(); 
    } 
}