/*
 * 9/30/2018
 * Author: T. Martin
 * Description: Combine the data into a single string to output
 */
package oopalpha;

import java.util.Date;

/**
 *
 * @author Gamer
 */
//The product information assembly and output
abstract class Product implements Item {
    
    
    
    String manufacturer;
    String name;
    Date manufacturedOn;
    int serialNumber;
    
    
    
   public int currentProductionNumber(){
    return serialNumber; 
   }
   
    @Override
   public int getSerialNumber(){
       return serialNumber++;
   }
   
    @Override
   public String getName(){
       return name;
   }
   
    @Override
   public Date getManufactureDate(){
       return manufacturedOn;
   }
   
   
    
   public String tesString() {
        return "Manufacturer   : " + Item.MANUFACTURER + "\n" +
               "Serial Number  : " + serialNumber + "\n" +
               "Date           : " + manufacturedOn + "\n" +
               "Name           : " + name + "\n";
   }
   
}
