package edu.umich.balajima.builderpattern;

import java.util.ArrayList;

class Vehicle {
    ArrayList parts = new ArrayList();
    public void Add(String part)
    {
        parts.add(part);
    }
    
    public void Show(){
            for (Object part : parts) {
                System.out.println(part);
            }
        }
}