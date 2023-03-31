/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;
import java.io.IOException; 
/**
 *
 * @author jackc20
 */


import java.util.ArrayList;


public class Person
{
    String firstName; 
    String lastName; 
    int age;

    
    static ArrayList<Integer> ageList = new ArrayList<>(); 
    
    public Person() 
    {
           if(ageList.contains(0))
            {
                throw new PersonDuplicateKeyException("Person with age=" +age+ " already exists"); 
            }
           
    }
    
    public Person(String firstName, String lastName, int age) 
    {
        
            if(ageList.contains(age))
            {
                 throw new PersonDuplicateKeyException("Person with age=" +age+ " already exists"); 
            }
            else
            {
            ageList.add(age);  
            this.firstName = firstName; 
            this.lastName = lastName; 
            this.age = age; 
            }
    }
    

   public String getPersons()
   {
       return (firstName+ " " +lastName+ " (" +age+ ")");
   }
   
   public int getAge()
   {
       return age; 
   }
   
 
}
