package edu.umich.balajima.adapterpattern;
class Sparrow implements Bird 
{ 
    // a concrete implementation of bird 
    public void fly() 
    { 
        System.out.print("Flying "); 
    } 
    public void makeSound() 
    { 
        System.out.print("Chirping "); 
    } 
} 