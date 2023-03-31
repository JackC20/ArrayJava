/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author jackc20
 */
public class PersonDuplicateKeyException extends RuntimeException
{
    private String errorMessage; 
    
    public PersonDuplicateKeyException(String errorMessage)
    {
        super(errorMessage); 
    }
    
    
}
