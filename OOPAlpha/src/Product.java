/*
 * 10/1/2018
 * Author: T. Martin
 * Description: Combine the data into a single string to output
 */
import java.util.Date;

//The product information is gathered and turned into a string for output.
public abstract class Product implements Item {                 //You cannot make an object from an abstract class
    
    private int serialNumber;
    private String manufacturer = Item.MANUFACTURER;
    private String name;
    private Date manufacturedOn;
    
    private static int currentProductionNumber = 1;             //Start prodcution counter on 1
    
    public Product(String name) {
      this.name = name;
      serialNumber = currentProductionNumber++;
      manufacturedOn = new Date();
    }
    
   public void setProductionNumber(int productionNumber) {
     currentProductionNumber = productionNumber;
   } 
   
   public void setName(String name) {
     this.name = name;
   }
    
   public int currentProductionNumber(){
    return serialNumber; 
   }
   
    @Override
   public int getSerialNumber(){
       return serialNumber;
   }
   
    @Override
   public String getName(){
       return name;
   }
   
    @Override
   public Date getManufactureDate(){
       return manufacturedOn;
   }
   
   
   //All variables are gthered and used to construct on string with 
   // manufacturer, serial number, date, and name.
   public String toString() {
        String output = "Manufacturer   : " + manufacturer + "\n" +
            "Serial Number  : " + serialNumber + "\n" +
            "Date           : " + manufacturedOn + "\n" +
            "Name           : " + name + "\n";
        
        return output;
   }
   
   
}