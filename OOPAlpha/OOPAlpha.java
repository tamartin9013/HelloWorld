/*
 * Author: T. Martin
 * Description: Outputthe manufacturer, serial number manufacturing date
 * and product name.
 * 
 */
package oopalpha;

import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Enum to store item types
enum ItemType{
    Audio, Visual, AudioMobile, VisualMobile;
}


interface Item {
        
        //constants
        String MANUFACTURER = "Oracle Production";
        
        
        //methods
        public void setProductionNumber(int productionNumber);
        
        public void setName(String name);
        
        public String getName();
        
        public Date getManufactureDate();
        
        public int getSerialNumber();
    }
    
     
//The product information assembly and output
abstract class Product implements Item {
    
    String manufacturer;
    String name;
    Date manufacturedOn;
    int serialNumber;
    
    
   public int currentProductionNumber(){
    return serialNumber++; 
   }
   
   public int getSerialNumber(){
       return serialNumber;
   }
   
   public String getName(){
       return name;
   }
   
   public Date getManufactureDate(){
       return manufacturedOn;
   }
   
   
   public String toString() {
        return "Manufacturer   : " + Item.MANUFACTURER + "\n" +
               "Serial Number  : " + serialNumber + "\n" +
               "Date           : " + manufacturedOn + "\n" +
               "Name           : " + name + "\n";
   }
   
}

public class OOPAlpha extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Run");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println(toString());
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("OOP Alpha");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}