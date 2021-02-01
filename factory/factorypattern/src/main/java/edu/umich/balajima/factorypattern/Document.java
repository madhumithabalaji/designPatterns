package edu.umich.balajima.factorypattern;


import java.util.*;
abstract class Document {
    public ArrayList Pages = new ArrayList();
       
    // Constructor calls abstract Factory method 
    public Document()
    {
        this.CreatePages();
    }
    public abstract void GetDocName();
    
    // Factory Method 
    public abstract void CreatePages();
}