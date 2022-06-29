/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class oneBookDetailsStudent extends Application {
    
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
        grid2.setStyle("-fx-background-color:thistle;");
        grid2.setHgap(30);
        grid2.setVgap(20);
        grid2.setAlignment(Pos.TOP_CENTER);
        
        Scene scene2 = new Scene(grid2, 1000, 650 + (i / 5) * 100);

        Text greetings = new Text("Show Book Details");
        greetings.setFill(Color.DARKRED);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text(" Enter Book Name");
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
           
                  String n[]=new String[1];
                n[0]=p[0].getText();
        System.out.println(n[0]);

        
        
        
           String ID[]=new String[1];
              //  String pass[]=new String[1];
                String name[]=new String[1];
                String DB[]=new String[1];
                String wh[]=new String[1];
                String ot[]=new String[1];
                String sl[]=new String[1];
                String jd[]=new String[1];
                         
                   System.out.println();
              /*     ID[0]=p[0].getText();
                      name[0]=p1[0].getText();
                       DB[0]=p2[0].getText();
                       wh[0]=p4[0].getText();
                      ot[0]=p5[0].getText();
                       sl[0]=p6[0].getText();
                    jd[0]=p7[0].getText();
                    System.out.println("ndjkwwfnsdkajshfnkjasdfcjsdfkjSDjkf");
                              System.out.println(p[0]);
                   System.out.println(p[0]);

                   
                   System.out.println(p[0]);
                                      System.out.println(p[0]);

                    System.out.println(p[0]);
                   */
                    
                     Button a = new Button("CLICK");
                     Button b=new Button("Back");
                     a.setPrefSize(90, 40);
                     b.setPrefSize(90, 40);

        VBox ab = new VBox(500);
        ab.getChildren().add(a);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 1, 9);
       
             
           
       
        
       
            Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid.add(backemp,1,10);
        
        
         back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemOption bl=new MemOption();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
         
                  Button back1 = new Button("Back");
        VBox backemp1= new VBox(50);
        back1.setPrefSize(100, 40);
        backemp1.setAlignment(Pos.CENTER);
        backemp1.getChildren().add(back1);
        grid2.add(backemp1,1,10);
        
        
         back1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemOption bl=new MemOption();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

           


        grid.add(pr[0], 1, 1);
        
       
           
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                       ID[0]=p[0].getText();
                       System.out.println(ID[0]);
                       
                       //String sql="SELECT * FROM BOOKS where BOOK_NAME='Aleph' ";
                    
                                         
                 String sql="SELECT * FROM BOOKS where BOOK_NAME= "
                    + "'"+ID[0]+"'";
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                   ResultSet rs = pst.executeQuery();
            
                     while (rs.next()) {
                         
                         
                         s1=rs.getString(1);
                         
     
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                           // s5=rs.getString(5);
                              // s6=rs.getString(6);
                                 // s7=rs.getString(7);
                         
                         
                          System.out.println(rs.getString(1));
                          
                  System.out.println(rs.getString(2));
                  System.out.println(rs.getString(3));
                  System.out.println(rs.getString(4));
                  //System.out.println(rs.getString(5));
                  //System.out.println(rs.getString(6));
                  //System.out.println(rs.getString(7));
                         System.out.println("Value showed");
                     }
                     
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
           System.out.println("INVALID");
            final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
            
                
                Text T1=new Text(
                       "     INVALID    ");
               T1.setFill(Color.BLACK);
               T1.setFont(Font.font(" Corsiva", FontWeight.LIGHT,16));
               
               
           
                dialogVbox.getChildren().add(T1);
                Scene dialogScene = new Scene(dialogVbox,200, 100);
                dialog.setScene(dialogScene);
                dialog.show();
                
        }
                
                    
                }
         Text greetings1 = new Text("Book Details of Book Id : " + ID[0]);
        greetings1.setFill(Color.DARKRED);
        greetings1.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid2.add(greetings1, 0, 0, 5, 1);
        
        
        if(s1==null)
        {
         Text t1 = new Text("No Book Available");
        t1.setFill(Color.DARKGREEN);
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 30));
        grid2.add(t1, 0, 4);
        }
        else
        {
                                 Text t1 = new Text(s1);
        t1.setFill(Color.DARKRED);
      
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t1, 1, 2);
        
        System.out.println("thissssssssssss one"+s1);
                            Text t2 = new Text(s2);
        t2.setFill(Color.DARKRED);
        t2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t2, 1, 3);
      
                            Text t3 = new Text(s3);
        t3.setFill(Color.DARKRED);
        t3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t3, 1, 4);
        
                            Text t4= new Text(s4);
        t4.setFill(Color.DARKRED);
        t4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t4, 1, 5);
        
        
                          Text r1 = new Text("BOOK ID :");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r1, 0, 2);
        
                                   Text r2 = new Text("BOOK NAME :");
        r2.setFill(Color.DARKRED);
        r2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r2, 0, 3);
        System.out.println("thissssssssssss one"+s1);
        
                                   Text r3 = new Text("CATAGORY ID :");
        r3.setFill(Color.DARKRED);
        r3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r3, 0, 4);
        
                                   Text r4 = new Text("NUMBER OF AVAILABLE COPIES :");
        r4.setFill(Color.DARKRED);
        r4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r4, 0, 5);
        
                                 
        
        /* Text t5 = new Text(s5);
        t5.setFill(Color.DARKRED);
        t5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t5, 0, 6);
        
           Text t6=new Text(s6);
        t6.setFill(Color.DARKRED);
        t6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t6, 0, 7);
        
           Text t7 = new Text(s7);
        t7.setFill(Color.DARKRED);
        t7.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t7, 0, 8);*/
        }
               stage=primaryStage;
       
        stage.setScene(scene2);
        stage.show();

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