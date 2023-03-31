/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package assignment5;

/**
 *
 * @author jackc20
 */
public interface ICoolArray 
{
    Object ValueAt(int index);
    void AddValue(Object o);
    Object [] AsArray();
    Object [] AsReversedArray();
    Object [] AsSortedArray(boolean fAscending);
}
