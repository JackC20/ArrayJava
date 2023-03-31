/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays; 
/**
 *
 * @author jackc20
 */
public class CoolArray implements ICoolArray
{
   
   ArrayList<String> list;

   ArrayList<Person> PersonList; 
   
   String object = "hello"; 
   
   public CoolArray()
   {
       list = new ArrayList<String>();
   }
   
   public CoolArray(String [] string)
   {
       
       this.list = new ArrayList<String>(); 
       
       for(var v : string)
       {
           list.add(v); 
       }
   }
    
   public CoolArray(Person [] object)
   {
     this.list = new ArrayList<String>();
     this.PersonList = new ArrayList<Person>(); 
     
     for(var v : object)
     {
         list.add(v.getPersons());  
         PersonList.add(v); 
     }
     
     this.object = "Person"; 
   }
   
   @Override
   public Object ValueAt(int index)
   {
       Person yes = new Person("Jack", "Carroll", 19);
       
       return yes; 
   }
   
   
   @Override
   public void AddValue(Object o)
   {
      
       
   }
   
   
   
   @Override
   public Object [] AsArray()
   {
      Object [] array = list.toArray();
      
      return array; 
   }
   
   @Override
   public Object [] AsReversedArray()
   {
       Object [] array = list.toArray(); 
       
       Object [] array2 = new Object[array.length]; 
       
       int c = 0; 
       
       for(int i = array.length-1; i >= 0; i--)
       {
           array2[c] = array[i];
           c++; 
       }
       
       return array2; 
   }
   
   @Override
   public Object []AsSortedArray(boolean fAscending)
   {
       Object [] array = list.toArray(); 
       
       Arrays.sort(array);
        
       
       if(object.equals("Person"))
       {
           Object [] array2 = new Object[array.length];
           int [] ageArray = new int[array.length]; 
           int j = 0;
           for(var v : PersonList)
           {
               ageArray[j] = v.getAge(); 
               j++; 
           }
           
           Arrays.sort(ageArray);
      
           for(int i = 0; i<array.length; i++)
           {
               for(var v : PersonList)
               {
                   if(ageArray[i] == v.getAge())
                   {
                       array2[i] = v.getPersons(); 
                   }
               }
           }
           
           
           return array2; 
       }
        return array; 
       
   }
}
