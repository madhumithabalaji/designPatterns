package edu.umich.balajima.factorypattern;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Document[] documents = new Document[2];
        documents[0] = new Resume();
        documents[1] = new Report();
        for (Document document : documents){
            document.GetDocName();
            for (Object page : document.Pages){                
                System.out.println(page.getClass().getName().split("Concrete")[1]);
            }
        }
    }
}
