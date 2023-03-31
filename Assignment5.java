/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;

import java.io.IOException; 
/**
 *
 * @author jackc20
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String[] test1={"Dog","Cat","Fish","Bird","Lizard","Cow","Horse"};
        Person [] test2 = 
        {
            new Person("Abbie","Ries",24),
            new Person("Charlotte","Ries",18),
            new Person("Jim","Ries",56),
            new Person("Laura","Ries",53),
            new Person("Cisco","Ries",11),
            new Person("Murphy","Ries",0),
        };
        
        CoolArray a1 = new CoolArray(test1);
        CoolArray a2 = new CoolArray(test2);
        
        
        
        DoTest("Test #1", a1);
        DoTest("Test #2", a2);
        DoTest("Test #1 again", a1);
        DoTest("Test #2 again", a2);
        
        
        try
        {
            Person test3 = new Person("David","Polly",56);
        }
        catch (PersonDuplicateKeyException err)
        {
            System.out.println("***Error: Duplicate age not allowed.***");
            System.out.println(err.getMessage());
            System.out.println();
        }

        
        try
        {
            Person test4 = new Person();
        }
        catch (PersonDuplicateKeyException err)
        {
            System.out.println("***Error: Duplicate age not allowed.***");
            System.out.println(err.getMessage());
            System.out.println();
            for (var trace : err.getStackTrace())
            {
                System.out.println(trace);
            }
        }
        
        System.out.println();
        System.out.println("*********** A5 Complete! ***********");
        
    }
    
  
    static void DoTest(String title, CoolArray a)
    {
        System.out.print("********************** ");
        System.out.print(title);
        System.out.println(" **********************");

        System.out.println("* As an array *");
        for (var v : a.AsArray())
        {
            System.out.println(v);
        }
        System.out.println();
        
        System.out.println("* As a reversed array *");
        for (var v : a.AsReversedArray())
        {
            System.out.println(v);
        }
        System.out.println();
        
        System.out.println("* As a sorted array *");
        for (var v : a.AsSortedArray(false))
        {
            System.out.println(v);
        }
        System.out.println();
        System.out.println();

    }
        
    }

   
