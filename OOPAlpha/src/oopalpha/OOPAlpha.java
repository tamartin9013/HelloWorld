/* 9/30/2018
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


public class OOPAlpha extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Run");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println(Product.MANUFACTURER);
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
