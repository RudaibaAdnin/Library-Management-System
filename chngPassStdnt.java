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
public class chngPassStdnt extends Application {
    
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
        grid.setStyle("-fx-background-color:cornsilk;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.TOP_CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);
        
        
            GridPane grid2 = new GridPane();
        grid2.setStyle("-fx-background-color:aliceblue;");
        grid2.setHgap(30);
        grid2.setVgap(20);
        grid2.setAlignment(Pos.TOP_CENTER);
        
        Scene scene2 = new Scene(grid2, 1000, 650 + (i / 5) * 100);

        Text greetings = new Text("Change Password");
        greetings.setFill(Color.DARKRED);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text(" Enter Member ID");
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
            
             Text phead2 = new Text(" Enter Current Password");
        phead2.setFill(Color.DARKRED);
        phead2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(phead2, 0, 2);
        
         VBox pr1[];
        pr1 = new VBox[1];
        TextField p1[];
        p1= new TextField[1];
        
        pr1[0] = new VBox();
            pr1[0].setAlignment(Pos.TOP_LEFT);
            
            p1[0] = new TextField();
            p1[0].setPrefSize(120, 30);
            
            p1[0].setPromptText("");
            pr1[0].getChildren().add(p1[0]);
           
            Text phead3 = new Text(" Enter New Password");
        phead3.setFill(Color.DARKRED);
        phead3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(phead3, 0, 3);
        
         VBox pr2[];
        pr2 = new VBox[1];
        TextField p2[];
        p2= new TextField[1];
        
        pr2[0] = new VBox();
            pr2[0].setAlignment(Pos.TOP_LEFT);
            
            p2[0] = new TextField();
            p2[0].setPrefSize(120, 30);
            
            p2[0].setPromptText("");
            pr2[0].getChildren().add(p2[0]);
           
               Text phead4 = new Text(" Retype New Password");
        phead4.setFill(Color.DARKRED);
        phead4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(phead4, 0, 4);
        
         VBox pr3[];
        pr3 = new VBox[1];
        TextField p3[];
        p3= new TextField[1];
        
        pr3[0] = new VBox();
            pr3[0].setAlignment(Pos.TOP_LEFT);
            
            p3[0] = new TextField();
            p3[0].setPrefSize(120, 30);
            
            p3[0].setPromptText("");
            pr3[0].getChildren().add(p3[0]);
           
             
             
           
                  String n[]=new String[1];
                n[0]=p[0].getText();
        System.out.println(n[0]);

        
        int f=0;
        
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
                    
                     Button a = new Button("Change Password");
                     Button b=new Button("Back");
                     a.setPrefSize(150, 40);
                     b.setPrefSize(150, 40);

        VBox ab = new VBox(500);
        ab.getChildren().add(a);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 1, 9);
       
       Button f1= new Button("Back");
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
             

                
                MemOption b2=new MemOption();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 


        grid.add(pr[0], 1, 1);
        grid.add(pr1[0], 1, 2);
        grid.add(pr2[0], 1, 3);
        grid.add(pr3[0], 1, 4);
        
        
        
       
           
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                int g=0;
                if (go_for_more) {
                       ID[0]=p[0].getText();
                       name[0]=p1[0].getText();
                       DB[0]=p2[0].getText();
                       wh[0]=p3[0].getText();
                     
                       System.out.println(ID[0]);
                                         
                 String sql="SELECT * FROM LOGIN_STUDENT where STUDENT_ID = "
                    + ""+ID[0]+"";
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                   ResultSet rs = pst.executeQuery();
            
                     while (rs.next()) {
                         
                         
                         s1=rs.getString(1);
                         
     
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                        /* s4=rs.getString(4);
                            s5=rs.getString(5);
                               s6=rs.getString(6);
                                  s7=rs.getString(7);*/
                         
                         
                          System.out.println(rs.getString(1));
                          
                  System.out.println(rs.getString(2));
                  System.out.println(rs.getString(3));
                 /* System.out.println(rs.getString(4));
                  System.out.println(rs.getString(5));
                  System.out.println(rs.getString(6));
                  System.out.println(rs.getString(7));*/
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
                
                if(s3.equals(name[0]))
                {
                    
                 if(DB[0].equals(wh[0]))
                 {
                     g=1;
                     String sql="UPDATE LOGIN_STUDENT\n" +
"SET PASSWORD_STUDENT = "
                    + ""+wh[0]+""+"WHERE STUDENT_ID="+""+ID[0]+"" ;
                             
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                   ResultSet rs = pst.executeQuery();
            
                     while (rs.next()) {
                         
                         
                                       }
                     
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("INVALID");
           /* final Stage dialog = new Stage();
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
                dialog.show();*/
                
        }
                
         
                     
                     System.out.println("Your passpord has been updated..thank you");
                 }
                 else{
                     g=2;
                     System.out.println("please type new password carefully..thank you");
                     
                 }
                }
                else
                {
                    g=3;
                    System.out.println("The current password you entered is incorrect..please try again");   
                }
                if(g==1)
                {
                       Text t1 = new Text("YOUR PASSWORD HAVE BEEN UPDATED SUCCESSFULLY");
        t1.setFill(Color.DARKRED);
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t1, 1, 2);
                                   Text r1 = new Text("THANK YOU");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r1, 1, 3);
         Button f1= new Button("Back");
        f1.setPrefSize(100,40);
       
        f1.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        f1.setAlignment(Pos.CENTER_LEFT);
        
        VBox om1 = new VBox(50);
        om1.getChildren().add(f1);
        om1.setAlignment(Pos.CENTER);
        
        grid2.add(om1,1,11);
      
        
         f1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemOption b2=new MemOption();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

                }
                  if(g==2)
                {
                       Text t1 = new Text("PLEASE TYPE NEW PASSWORD CAREFULLY");
        t1.setFill(Color.DARKRED);
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t1, 1, 2);
                                   Text r1 = new Text("THANK YOU");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r1, 1, 3);
         Button f1= new Button("Back");
        f1.setPrefSize(100,40);
       
        f1.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        f1.setAlignment(Pos.CENTER_LEFT);
        
        VBox om1 = new VBox(50);
        om1.getChildren().add(f1);
        om1.setAlignment(Pos.CENTER);
        
        grid2.add(om1,1,11);
      
        
         f1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemOption b2=new MemOption();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

                }
               if(g==3)
                {
                       Text t1 = new Text("CURRENT PASSWORD THAT YOU TYPED IS WRONG");
        t1.setFill(Color.DARKRED);
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t1, 1, 2);
                                   Text r1 = new Text("PLEASE TYPE CURRENT PASSWORD CAREFULLY");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r1, 1, 3);
         Button f1= new Button("Back");
        f1.setPrefSize(100,40);
       
        f1.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        f1.setAlignment(Pos.CENTER_LEFT);
        
        VBox om1 = new VBox(50);
        om1.getChildren().add(f1);
        om1.setAlignment(Pos.CENTER);
        
        grid2.add(om1,1,11);
      
        
         f1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemOption b2=new MemOption();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

                }     
         /*Text greetings1 = new Text("Employee Details of Employee Id : " + ID[0]);
        greetings1.setFill(Color.DARKRED);
        greetings1.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid2.add(greetings1, 0, 0, 5, 1);
                                 Text t1 = new Text(s1);
        t1.setFill(Color.DARKRED);
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t1, 1, 2);
                                   Text r1 = new Text("EMPLOYEE ID :");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r1, 0, 2);
        
                                   Text r2 = new Text("EMPLOYEE NAME :");
        r2.setFill(Color.DARKRED);
        r2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r2, 0, 3);
        System.out.println("thissssssssssss one"+s1);
        
                                   Text r3 = new Text("DATE OF BIRTH :");
        r3.setFill(Color.DARKRED);
        r3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r3, 0, 4);
        
                                   Text r4 = new Text("WORKING HOUR :");
        r4.setFill(Color.DARKRED);
        r4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r4, 0, 5);
        
                                   Text r5 = new Text("OVER TIME :");
        r5.setFill(Color.DARKRED);
        r5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r5, 0, 6);
        
                                   Text r6 = new Text("SALARY :");
        r6.setFill(Color.DARKRED);
        r6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r6, 0, 7);
        
                                   Text r7 = new Text("JOINING DATE :");
        r7.setFill(Color.DARKRED);
        r7.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(r7, 0, 8);
                            Text t2 = new Text(s2);
        t2.setFill(Color.DARKRED);
        t2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t2, 1, 3);
      
                            Text t3 = new Text(s3);
        t3.setFill(Color.DARKRED);
        t3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t3, 1, 4);
        System.out.println("thissssssssssss one"+s1);
                            Text t4= new Text(s4);
        t4.setFill(Color.DARKRED);
        t4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t4, 1, 5);
        
        
         Text t5 = new Text(s5);
        t5.setFill(Color.DARKRED);
        t5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t5, 1, 6);
        
           Text t6=new Text(s6);
        t6.setFill(Color.DARKRED);
        t6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t6, 1, 7);
        
           Text t7 = new Text(s7);
        t7.setFill(Color.DARKRED);
        t7.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid2.add(t7, 1, 8);*/
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