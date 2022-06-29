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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class EmpOption0 extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
                    
        
        stage=primaryStage;

        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:peachpuff;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("Welcome to work page");
        greetings.setFill(Color.SADDLEBROWN);
        greetings.setFont(Font.font(" Corsiva", FontWeight.BOLD,30));
        grid.add(greetings, 0, 0, 6, 1);

   
        Button ab = new Button("BookLend");
        ab.setPrefSize(100, 40);
        VBox a = new VBox(50);
        a.getChildren().add(ab);
        a.setAlignment(Pos.CENTER_LEFT);
        
        grid.add(a, 0, 1);
        
         Button onemem = new Button("Member Details");
        ab.setPrefSize(100, 40);
        VBox om = new VBox(50);
        om.getChildren().add(onemem);
        om.setAlignment(Pos.CENTER);
        
        grid.add(om, 1, 1);

        Button memInsert = new Button("Member Insert");
        memInsert.setPrefSize(100, 40);
        VBox bb = new VBox(50);
        bb.getChildren().add(memInsert);
        bb.setAlignment(Pos.CENTER);
        grid.add(bb, 0, 2);
        
         Button onebook = new Button("Book Details");
        ab.setPrefSize(100, 40);
        VBox ob = new VBox(50);
        ob.getChildren().add(onebook);
        ob.setAlignment(Pos.CENTER);
        
        grid.add(ob,0,6);
        
        
        Button bookInsert = new Button("Book Insert");
        bookInsert.setPrefSize(100, 40);
        VBox bk = new VBox(50);
        bk.getChildren().add(bookInsert);
        bk.setAlignment(Pos.CENTER);
        grid.add(bk, 0, 3);
        
        
        Button oneemp = new Button("Employee Details");
        ab.setPrefSize(100, 40);
        VBox oe = new VBox(50);
        oe.getChildren().add(onebook);
        oe.setAlignment(Pos.CENTER);
        
        grid.add(oe, 1, 3);
        
        
        Button empInsert = new Button("Employee Insert");
        empInsert.setPrefSize(100, 40);
        VBox emp = new VBox(50);
        emp.getChildren().add(empInsert);
        emp.setAlignment(Pos.CENTER);
        grid.add(emp, 0, 4);
        
        Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid.add(backemp,1,10);
        
        
         back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                EmployeeLogin bl=new EmployeeLogin();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 


        ab.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
               BookLend emi=new  BookLend();
               emi.start(stage);
            
            }
            
        });
        
        memInsert.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

            
                MemberInsert sn=new MemberInsert();
                sn.start(stage);
            }
        });
        

        onemem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneMemberDetailsEmp omd=new oneMemberDetailsEmp();
                omd.start(stage);
            }
        });
        
            onebook.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneBookDetailsEmp obd=new oneBookDetailsEmp();
                obd.start(stage);
            }
        });
        
        bookInsert.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                BookInsert bi=new BookInsert();
                bi.start(stage);
            }
        });
        empInsert.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

              
                EmployeeInsert ei=new EmployeeInsert();
                ei.start(stage);
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

