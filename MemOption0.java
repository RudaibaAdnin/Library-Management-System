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
public class MemOption0 extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {
        
        
        stage=primaryStage;

        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:honeydew ;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("Welcome to work page");
        greetings.setFill(Color.DARKCYAN);
        greetings.setFont(Font.font("monotype Corsiva", FontWeight.BOLD,40));
        grid.add(greetings, 0, 1);

   
      /*  Button ab = new Button("BookReturn");
        ab.setPrefSize(100,40);
        VBox a = new VBox(50);
        a.getChildren().add(ab);
        a.setAlignment(Pos.CENTER);
        
        grid.add(a, 0, 1);*/
        
         Button onemem = new Button("Member Details");
        onemem.setPrefSize(100,40);
         onemem.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
        VBox om = new VBox(50);
        om.getChildren().add(onemem);
        om.setAlignment(Pos.CENTER);
        
        grid.add(om, 0,7);

        
        
         Button onebook = new Button("Book Details");
        onebook.setPrefSize(100,40);
         onebook.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
        VBox ob = new VBox(50);
        ob.getChildren().add(onebook);
        ob.setAlignment(Pos.CENTER);
        
        grid.add(ob,0,3);
        
        
         Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
         back.setStyle("-fx-background-color:cyan; -fx-text-fill: black;");
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid.add(backemp, 0,9);
        
        
         back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemberLogin bl=new MemberLogin();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
         
         
          Button fi= new Button("Change Password ");
          fi.setStyle("-fx-background-color:lightblue; -fx-text-fill: black;");
        VBox f= new VBox(50);
        fi.setPrefSize(100,40);
        f.setAlignment(Pos.CENTER);
        f.getChildren().add(fi);
        grid.add(f, 0, 8);
        
        
         fi.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
                  chngPassStdnt bl=new chngPassStdnt();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
            
         
         Button back1 = new Button("Book Request");
          back1.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
        VBox backemp1= new VBox(50);
        back1.setPrefSize(100, 40);
        backemp1.setAlignment(Pos.CENTER);
        backemp1.getChildren().add(back1);
        grid.add(backemp1, 0,3);
        
        
         back1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
                RequestInsert bl=new RequestInsert();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
          
         Button rs = new Button("RequestTable");
          rs.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
       VBox backemp2= new VBox(50);
        rs.setPrefSize(100, 40);
        backemp2.setAlignment(Pos.CENTER);
        backemp2.getChildren().add(rs);
        grid.add(backemp2, 0,4);
        
        
         rs.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
              requestshow bl=new requestshow();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
          
               
          
         Button fine = new Button("Show Fine");
          fine.setStyle("-fx-background-color:darksalmon; -fx-text-fill: black;");
        VBox f2= new VBox(50);
        fine.setPrefSize(100,40);
        f2.setAlignment(Pos.CENTER);
        f2.getChildren().add(fine);
        grid.add(f2, 0, 5);
        
        
         fine.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
                  showFineUsingJoin bl=new showFineUsingJoin();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
            
         Button last = new Button("LastSubmissionDAte");
          last.setStyle("-fx-background-color:lightsalmon; -fx-text-fill: black;");
        VBox f1= new VBox(50);
        last.setPrefSize(100, 40);
        f1.setAlignment(Pos.CENTER);
        f1.getChildren().add(last);
        grid.add(f1, 0, 6);
        
        
         last.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
                  show_last_date_of_submission ld=new show_last_date_of_submission();
                try {
                    ld.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
          
                 
        
     
        
         
     
        
        
        
        
        
        


     /*   ab.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
               BookReturn emi=new  BookReturn();
               emi.start(stage);
            
            }
            
        });*/
        
        onemem.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneMemberDetailsStudent sn=new  oneMemberDetailsStudent();
                sn.start(stage);
            }
        });
        

      
        
            onebook.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneBookDetailsStudent obd=new oneBookDetailsStudent();
                obd.start(stage);
            }
        });
        
     

        
        
      
     
        stage.setScene(openwindow);
        stage.show();
    }
    
    
    

    public static void main(String[] args) {
        launch(args);
    }

}
