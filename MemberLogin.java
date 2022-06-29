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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class MemberLogin extends Application {
    
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
        grid.setStyle("-fx-background-color:papayawhip ;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.TOP_CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);
        
        
        GridPane grid2 = new GridPane();
        grid2.setStyle("-fx-background-color:linen;");
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
        
        grid2.add(an, 0, 9);

        Text greetings = new Text("Login Page For Members");
        greetings.setFill(Color.DARKRED);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text(" Enter Username");
        phead1.setFill(Color.DARKRED);
        phead1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(phead1, 0, 2);
        
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
        grid.add(qhead1, 0, 3);
        
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
            
            
             Text qhead3 = new Text("Member ID");
        qhead3.setFill(Color.DARKRED);
        qhead3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead3, 0, 1);
        
         VBox pr3[];
        pr3 = new VBox[1];
        TextField p3[];
        p3 = new TextField[1];
        
        pr3[0] = new VBox();
            pr3[0].setAlignment(Pos.TOP_LEFT);
            
            p3[0] = new TextField();
            p3[0].setPrefSize(120, 30);
            
            p3[0].setPromptText("");
            pr3[0].getChildren().add(p3[0]);
            
            

        
        
        
           String ID[]=new String[1];
              //  String pass[]=new String[1];
                String name[]=new String[1];
                String pass[]=new String[1];
                String wh[]=new String[1];
                String ot[]=new String[1];
                String sl[]=new String[1];
                String jd[]=new String[1];
                         
                  
                    
                     Button a = new Button("LOGIN");
                     a.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
                     Button b=new Button("Back");
                     a.setPrefSize(90, 40);
                     b.setPrefSize(90, 40);

        VBox ab = new VBox(500);
        ab.getChildren().add(a);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 1, 9);
       
      Button f1= new Button("FIRSTPAGE");
        f1.setPrefSize(100,40);
        f1.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        f1.setAlignment(Pos.CENTER_LEFT);
        
        VBox om1 = new VBox(50);
        om1.getChildren().add(f1);
        om1.setAlignment(Pos.CENTER);
        
        grid.add(om1,1,11);
      
        
         f1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                firstPageforeveryone b2=new firstPageforeveryone();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
            Button f9= new Button("Send Request to become Member");
        f9.setPrefSize(220,40);
        f9.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
     
        f9.setAlignment(Pos.CENTER_LEFT);
        
        VBox om9 = new VBox(50);
        om9.getChildren().add(f9);
        om9.setAlignment(Pos.CENTER);
        
        grid.add(om9,1,12);
      
        
         f9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MEM_REQUEST b2=new MEM_REQUEST();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
       
        
        
           


        grid.add(pr[0], 1, 2);
         grid.add(pr1[0], 1, 3);
          grid.add(pr3[0], 1, 1);
        
       
           
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                       name[0]=p[0].getText();
                      // System.out.println(ID[0]);
                       pass[0]=p1[0].getText();
                       ID[0]=p3[0].getText();
                       System.out.println(name[0]);
                       System.out.println(pass[0]);
                       
                       
                       //String sql="SELECT * FROM BOOKS where BOOK_NAME='Aleph' ";
                    
                                         
                 String sql="SELECT * FROM LOGIN_STUDENT";
                
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                   ResultSet rs = pst.executeQuery();
            
                     while (rs.next()) {
                         
                         //s3=rs.getString(1);
                         s1=rs.getString(2);
                         
     
                         s2=rs.getString(3);
                        // s3=rs.getString(3);
                        // s4=rs.getString(4);
                           // s5=rs.getString(5);
                              // s6=rs.getString(6);
                                 // s7=rs.getString(7);
                         
                         
                          System.out.println(rs.getString(2));
                          
                  System.out.println(rs.getString(3));
                  //System.out.println(rs.getString(3));
                  //System.out.println(rs.getString(4));
                  //System.out.println(rs.getString(5));
                  //System.out.println(rs.getString(6));
                  //System.out.println(rs.getString(7));
                   if(name[0].contains(s1))
                {
                    
                    System.out.println("yes");
                    if(pass[0].contains(s2))
                    {  
                        
                         System.out.println("yessspass");
                       String sql1="INSERT INTO STORE_MEM(MEMBER_ID,MEMBER_NAME)" 
                               +"VALUES("+ID[0]+",'"+name[0]+"')";
                        
                        PreparedStatement pst1= con.prepareStatement(sql1);
                         System.out.println(sql1);
                    
                   int rs1 = pst1.executeUpdate();
                   
                   if(rs1!=0)
                   {   System.out.println("value inserted");}
                   else{}
            
                   
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
             
            }   
        });
        
          abc.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // try{
           /* Connection con = new OracleDBMS().getConnection(); 
             // PreparedStatement pst1 = con.prepareStatement(sql1);
                String sql1="INSERT INTO STORE_MEM(MEMBER_ID,MEMBER_NAME)" 
                               +"VALUES("+pass[0]+",'"+name[0]+"')";
                        
                        PreparedStatement pst1= con.prepareStatement(sql1);
                         System.out.println(sql1);
                    
                   int rs1 = pst1.executeUpdate();
                   
                   if(rs1!=0)
                   {   System.out.println("value inserted");}
                   else{}
           */
               MemOption emi=new  MemOption();
               emi.start(stage);
            
            }   /*catch (SQLException ex) {
                    Logger.getLogger(MemberLogin1.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            
        });
         
                
          stage=primaryStage;
       
        stage.setScene(openwindow);
        stage.show();

    }
        
        
   
    public static void main(String[] args) {
        launch(args);
    }
    
}