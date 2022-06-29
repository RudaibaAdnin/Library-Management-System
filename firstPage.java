/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

/**
 *
 * @author Hp
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package databaseprojectsample;

import javafx.application.Application;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author JOHN
 */
public class firstPage extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
                    stage=primaryStage;

        //linr number 77 porjnto tor dekhar dorkar nai.
        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: lightblue;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("Welcome");
        greetings.setFill(Color.DODGERBLUE);
        greetings.setFont(Font.font("Monotype Corsiva", FontWeight.BOLD, 70));
        grid.add(greetings, 0, 0, 6, 1);

   
        Button ab = new Button("LOGIN");
        ab.setPrefSize(100, 40);
        VBox a = new VBox(50);
        a.getChildren().add(ab);
        a.setAlignment(Pos.CENTER);
        
        grid.add(a, 0, 1);

        Button cd = new Button("SIGN UP");
        cd.setPrefSize(100, 40);
        VBox bb = new VBox(50);
        bb.getChildren().add(cd);
        bb.setAlignment(Pos.CENTER);
        grid.add(bb, 0, 2);

        ab.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                   
                    // ekhane login er code ta call kora lagbe
                  
                }
               Login_page emi=new  Login_page();
               emi.start(stage);
            
            }
            
        });

        cd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                if(go_for_more) {
                    go_for_more = false;
                    i++;
                    //ekhane sign up er function call kora lagbe
                }
                EmployeeInsert sn=new EmployeeInsert();
                sn.start(stage);
            }
        });

      
        // ei sadia er jaigai ekta string hobe jekhane total calculated amount ta likhbo.
       //stage.setTitle("Super Shob Database MAnagement System");
        stage.setScene(openwindow);
        stage.show();
    }
    
    
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
