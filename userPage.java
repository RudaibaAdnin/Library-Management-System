/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
public class userPage extends Application {
    
     int i = 0;
     Stage window;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;
     Group design=new Group();
     String s1;
       String s2;
         String s3;
         String s4;
       String s5;
         String s6;
         String s7;
      
         String[] s=new String[100];
    @Override
    public void start(Stage primaryStage) {
        
        
        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:ghostwhite;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.TOP_CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);
        
        
            GridPane grid2 = new GridPane();
        grid2.setStyle("-fx-background-color:lavenderblush;");
        grid2.setHgap(30);
        grid2.setVgap(20);
        grid2.setAlignment(Pos.TOP_CENTER);
        
         GridPane grid3= new GridPane();
        grid3.setStyle("-fx-background-color:wheat;");
        grid3.setHgap(30);
        grid3.setVgap(20);
        grid3.setAlignment(Pos.TOP_CENTER);
        
        Scene scene2 = new Scene(grid2, 1000, 650 + (i / 5) * 100);
         Scene scene3 = new Scene(grid3, 1000, 650 + (i / 5) * 100);
         
         
         Button abc = new Button("WorkPage");
        abc.setPrefSize(80, 40);
        VBox an = new VBox(50);
        an.getChildren().add(abc);
        an.setAlignment(Pos.CENTER);
        
        grid2.add(an, 0, 6);

        Text greetings = new Text("Login Page");
        greetings.setFill(Color.DARKRED);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text(" Enter Username");
        phead1.setFill(Color.DARKRED);
        phead1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(phead1, 0, 1);
        
         VBox pr[];
        pr = new VBox[1];
        TextField p[];
        p = new TextField[1];
        
        pr[0] = new VBox();
            pr[0].setAlignment(Pos.TOP_LEFT);
            
            p[0] = new TextField();
            p[0].setPrefSize(120, 30);
            
            p[0].setPromptText("");
            pr[0].getChildren().add(p[0]);
        
        
                    
          Text qhead1 = new Text("User Password");
        qhead1.setFill(Color.DARKRED);
        qhead1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead1, 0, 2);
        
         VBox pr1[];
        pr1 = new VBox[1];
        TextField p1[];
        p1 = new TextField[1];
        
        pr1[0] = new VBox();
            pr1[0].setAlignment(Pos.TOP_LEFT);
            
            p1[0] = new TextField();
            p1[0].setPrefSize(120, 30);
            
            p1[0].setPromptText("");
            pr1[0].getChildren().add(p1[0]);
            
            

        
        
        
           String ID[]=new String[1];
              //  String pass[]=new String[1];
                String name[]=new String[1];
                String pass[]=new String[1];
                String wh[]=new String[1];
                String ot[]=new String[1];
                String sl[]=new String[1];
                String jd[]=new String[1];
                         
                  
                    
                     Button a = new Button("CLICK");
                     Button b=new Button("Back");
                     a.setPrefSize(90, 40);
                     b.setPrefSize(90, 40);

        VBox ab = new VBox(500);
        ab.getChildren().add(a);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 1, 9);
       
        //    grid.add()
           
       
        
       
           


        grid.add(pr[0], 1, 1);
          grid.add(pr1[0], 1, 2);
        
       
           
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                       name[0]=p[0].getText();
                      // System.out.println(ID[0]);
                       pass[0]=p1[0].getText();
                       System.out.println(name[0]);
                       System.out.println(pass[0]);
                       
                       
                       //String sql="SELECT * FROM BOOKS where BOOK_NAME='Aleph' ";
                    
                                         
                 String sql="SELECT * FROM BOOKS";
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                   ResultSet rs = pst.executeQuery();
            
                     while (rs.next()) {
                         
                         
                         s1=rs.getString(1);
                         
     
                         s2=rs.getString(2);
                        // s3=rs.getString(3);
                        // s4=rs.getString(4);
                           // s5=rs.getString(5);
                              // s6=rs.getString(6);
                                 // s7=rs.getString(7);
                         
                         
                          System.out.println(rs.getString(1));
                          
                  System.out.println(rs.getString(2));
                  //System.out.println(rs.getString(3));
                  //System.out.println(rs.getString(4));
                  //System.out.println(rs.getString(5));
                  //System.out.println(rs.getString(6));
                  //System.out.println(rs.getString(7));
                   if(name[0].contains(s2))
                {
                    
                    System.out.println("yes");
                    if(pass[0].contains(s1))
                    {
                        Text t1 = new Text("LogIn Succeedded");
                        t1.setFill(Color.PURPLE);
                         t1.setFont(Font.font("Corsiva", FontWeight.LIGHT,26));
                      grid2.add(t1, 0, 5);
                     System.out.println("yess");
                     
                       stage=primaryStage;
       
                     stage.setScene(scene2);
                     stage.show();

                    }
                }
                         
                  else 
                       {
                         Text t2 = new Text("LogIn Denied");
                        t2.setFill(Color.PURPLE);
                         t2.setFont(Font.font("Corsiva", FontWeight.LIGHT,26));
                      grid.add(t2, 0, 5);
                     System.out.println("No");
                     //stage=primaryStage;
       
                     //stage.setScene(scene3);
                     //stage.show();

                                 }
                     }
                     
                     
                   /*  if(name[0].equals(s1))
                {
                    
                    System.out.println("yes");
                    if(pass[0].equals(s2))
                    {
                        System.out.println("yess");
                    }
                }*/
                     
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                
                    
                }
             
            }   
        });
        
          abc.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                   
                    // ekhane login er code ta call kora lagbe
                  
                }
               EmpOption emi=new  EmpOption();
               emi.start(stage);
            
            }
            
        });
         
                
          stage=primaryStage;
       
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