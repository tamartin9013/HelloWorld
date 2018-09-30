/*
 * 9/30/2018
 * Author: T. Martin
 * Description: Item interface to store the maufacturer constant and various
 * accessor and mutator methods.
 */
package oopalpha;


import java.util.Date;



public interface Item {
        
        //constants
        String MANUFACTURER = "Oracle Production";
        
        
        //methods
        public void setProductionNumber(int productionNumber);
        
        public void setName(String name);
        
        public String getName();
        
        public Date getManufactureDate();
        
        public int getSerialNumber();
    }
