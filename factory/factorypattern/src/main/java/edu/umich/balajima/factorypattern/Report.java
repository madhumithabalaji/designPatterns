package edu.umich.balajima.factorypattern;

import java.util.*;
// First Concrete Creator 
class Report extends Document
{
    // Factory Method implementation 
    public void CreatePages()
    {
        Pages.add(new ConcreteReportSummaryPage());
        Pages.add(new ConcreteReportIntroPage());
        Pages.add(new ConcreteReportResultPage());
    }
    
    public void GetDocName()
    {  
        System.out.println("Report--"); 
    }
} 