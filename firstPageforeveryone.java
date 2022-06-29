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
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class firstPageforeveryone extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
                    stage=primaryStage;

      
        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:lavender;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("Welcome To our Library");
        greetings.setFill(Color.DARKCYAN);
        greetings.setFont(Font.font("Monotype Corsiva", FontWeight.BOLD, 70));
        grid.add(greetings, 0, 1);

   
        Button ab = new Button("Employee Login");
        ab.setPrefSize(200, 50);
         ab.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
        
        VBox a = new VBox(50);
        a.getChildren().add(ab);
        a.setAlignment(Pos.CENTER);
        
        grid.add(a, 0, 3);


        ab.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               
             EmployeeLogin emi=new  EmployeeLogin();
               emi.start(stage);
            
            }
            
        });
        
        
               
        
        Button studentlog = new Button("Student Login");
        studentlog.setPrefSize(200, 50);
         studentlog.setStyle("-fx-background-color:peachpuff; -fx-text-fill: black;");
        
        VBox sl = new VBox(50);
        sl.getChildren().add(studentlog);
        sl.setAlignment(Pos.CENTER);
        
        grid.add(sl, 0, 5);

      
        studentlog.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               
               MemberLogin ml=new  MemberLogin();
               ml.start(stage);
            
            }
            
        });

     
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

