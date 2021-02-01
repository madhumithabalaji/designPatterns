package edu.umich.balajima.factorypattern;

import java.util.*;
// Second Concrete Creator 
class Resume extends Document
{
    // Factory Method implementation 
    public void CreatePages()
    {
        Pages.add(new ConcreteResumeSkillsPage());
        Pages.add(new ConcreteResumeEducationPage());
        Pages.add(new ConcreteResumeExperiencePage());
    }
    
    public void GetDocName()
    {  
        System.out.println("Resume--"); 
    }
} 