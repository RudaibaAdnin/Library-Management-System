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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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


public class MemberInsert0 extends Application{
        int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {

        //linr number 77 porjnto tor dekhar dorkar nai.
        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:cornsilk;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.TOP_CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("Add New Member");
        greetings.setFill(Color.DARKRED);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text("Member ID");
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


        Text qhead1 = new Text("Student ID");
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
            
            
          Text qhead2 = new Text("Name");
        qhead2.setFill(Color.DARKRED);
        qhead2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead2, 0, 3);
        
         VBox pr2[];
        pr2 = new VBox[1];
        TextField p2[];
        p2 = new TextField[1];
        
        pr2[0] = new VBox();
            pr2[0].setAlignment(Pos.TOP_LEFT);
            
            p2[0] = new TextField();
            p2[0].setPrefSize(120, 30);
            
            p2[0].setPromptText("");
            pr2[0].getChildren().add(p2[0]);
           
       
            Text qhead4 = new Text("Department");
        qhead4.setFill(Color.DARKRED);
        qhead4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead4, 0, 4);
        
         VBox pr4[];
        pr4 = new VBox[1];
        TextField p4[];
        p4 = new TextField[1];
        
        pr4[0] = new VBox();
            pr4[0].setAlignment(Pos.TOP_LEFT);
            
            p4[0] = new TextField();
            p4[0].setPrefSize(120,30);
            
            p4[0].setPromptText("");
            pr4[0].getChildren().add(p4[0]);
           
        Text qhead5 = new Text("Joining Date");
        qhead5.setFill(Color.DARKRED);
        qhead5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead5, 0, 5);
        
         VBox pr5[];
        pr5 = new VBox[1];
        TextField p5[];
        p5 = new TextField[1];
        
        pr5[0] = new VBox();
            pr5[0].setAlignment(Pos.TOP_LEFT);
            
            p5[0] = new TextField();
            p5[0].setPrefSize(120, 30);
            
            p5[0].setPromptText("");
            pr5[0].getChildren().add(p5[0]);
           
         Text qhead6 = new Text("Date of Birth");
        qhead6.setFill(Color.DARKRED);
        qhead6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(qhead6, 0, 6);
        
         VBox pr6[];
        pr6 = new VBox[1];
        TextField p6[];
        p6 = new TextField[1];
        
        pr6[0] = new VBox();
            pr6[0].setAlignment(Pos.TOP_LEFT);
            
            p6[0] = new TextField();
            p6[0].setPrefSize(120, 30);
            
            p6[0].setPromptText("");
            pr6[0].getChildren().add(p6[0]);
            
            /*
               Text qhead7 = new Text("Joining Date");
        qhead7.setFill(Color.DODGERBLUE);
        qhead7.setFont(Font.font("Constantia", FontWeight.LIGHT,16));
        grid.add(qhead7, 0, 7);
        
         VBox pr7[];
        pr7 = new VBox[1];
        TextField p7[];
        p7 = new TextField[1];
        
        pr7[0] = new VBox();
            pr7[0].setAlignment(Pos.TOP_LEFT);
            
            p7[0] = new TextField();
            p7[0].setPrefSize(120, 30);
            
            p7[0].setPromptText("");
            pr7[0].getChildren().add(p7[0]);*/
            
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
                    
                     Button a = new Button("INSERT");
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
             

                
                EmpOption bl=new EmpOption();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
          
           
       
        
       
           


        grid.add(pr[0], 1, 1);
        grid.add(pr1[0], 1, 2);
        grid.add(pr2[0], 1, 3);
        grid.add(pr4[0], 1, 4);
        grid.add(pr5[0], 1, 5);
         grid.add(pr6[0], 1, 6);
        // grid.add(pr7[0], 1, 7);

           /* String sql="INSERT INTO Employee (Employee_ID,Name,Date_of_birth,working_Hour,Over_time,Salary,Joining_DAte)"
                    + " VALUES ("+ID[0]+",'"+name[0]+"','"+DB[0]+"',"+wh[0]+","+ot[0]+","+sl[0]+",'"+jd[0]+"');";
            System.out.println(sql);

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                    int rs = pst.executeUpdate();
            
                     if (rs!=0) {
                         System.out.println("Value Inserted");
                     } else {
                         System.out.println("Value  Not Inserted");
                     }
                     
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
      */
           
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                       ID[0]=p[0].getText();
                       System.out.println(ID[0]);
                      name[0]=p1[0].getText();
                      System.out.println(name[0]);
                       DB[0]=p2[0].getText();
                       System.out.println(DB[0]);
                       wh[0]=p4[0].getText();
                     ot[0]=p5[0].getText();
                      sl[0]=p6[0].getText();
                    //jd[0]=p7[0].getText();
                    jd[0]="0";
                    
                 String sql="INSERT INTO Members(Member_ID,Student_ID,Member_Name,Department,Joining_Date,Date_of_birth,FINE_AMOUNT)"
                    + " VALUES ('"+ID[0]+"','"+name[0]+"','"+DB[0]+"','"+wh[0]+"','"+ot[0]+"','"+sl[0]+"',"+jd[0]+")";
            System.out.println(sql);
            // eita diye kal insert hoiche kintu aj hocche nah

              try{
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
                    
                    int rs = pst.executeUpdate();
            
                     if (rs!=0) {
                         System.out.println("Value Inserted");
                     } else {
                         System.out.println("Value  Not Inserted");
                     }
                     
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
