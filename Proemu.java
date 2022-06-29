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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class Proemu extends Application {
    
    
     Group design=new Group();
     String s1;
       String s2;
         String s3;
         String[] s=new String[100];
    @Override
    public void start(Stage primaryStage) {
        
        
       
        
        
       // Button btn = new Button();
       // btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            
           // @Override
           // public void handle(ActionEvent event) {
                
                boolean success = false;
        String sql = "SELECT * FROM EMPLOYEE";
        
        try{
            Connection con = new OracleDBMS().getConnection();

            PreparedStatement pst = con.prepareStatement(sql);
                                    System.out.println("hello fklrjmglfd");

            //pst.setString(1, userName);
            //pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            int i=1;
            
             
            while (rs.next())
            {     
                  System.out.println(rs.getString(1));
                  // String s[i]=rs.next();
                //  System.out.println(rs.);
                
                 //System.out.println(rs.getString(1));
                //System.out.println(rs.getString(2));
                s[i]=rs.getString(i);
                
                //System.out.println();
                 //System.out.println(s[i]);
               Text t1=new Text(100*i,100,s[i]);
               /* Text t2=new Text(100*(i+1,100,s[i+1]);
                 Text t3=new Text(100*i,100,s[i+2]);
                  Text t4=new Text(100*i,100,s[i+3]);
                  Text t5=new Text(100*i,100,s[i+4]);
                  Text t6=new Text(100*i,100,s[i+5]);*/
               
               i=i+1;
               
                //  Text t2=new Text(100,5008,rs.getString(1));
                  for(int j=0;j<6;j++)
                  {
                      i=50;
                      String s1=rs.getString(1);
                      String s2=rs.getString(2);
                      String s3=rs.getString(3);
                      String s4=rs.getString(4);
                      String s5=rs.getString(5);
                      String s6=rs.getString(6);
                      String s7=rs.getString(7);
                     // String s8=rs.getString(8);
                      
                      
                      Text t2=new Text(100,50,s1);
                       Text t9=new Text(10,50,      "Emp No.      :");
                      Text t3=new Text(100,50+i,s2);
                      Text t10=new Text(10,50+i,    "Emp Name     :");
                      Text t4=new Text(100,50+i*2,s3);
                      Text t11=new Text(10,50+i*2,  "Birth Date   :");
                      Text t5=new Text(100,50+i*3,s4);
                      Text t12=new Text(10,50+i*3, "Working Hour :");
                      Text t6=new Text(100,50+i*4,s5);
                      Text t13=new Text(10,50+i*4,  "Over Time    :");
                      
                      Text t7=new Text(100,50+i*5,s6);
                      Text t14=new Text(10,50+i*5,  "Salary       :");
                      
                      Text t8=new Text(100,50+i*6,s7);
                      Text t15=new Text(10,50+i*6, "Join Date     :");
                   //   Text t9=new Text(10+i*8,50,s8);
                      
                //  t2.setX(60*j);
                
                  
                  //j++;
               design.getChildren().add(t2);
               design.getChildren().add(t9);
               design.getChildren().add(t3);
               design.getChildren().add(t10);
                design.getChildren().add(t4);
                design.getChildren().add(t11);
               design.getChildren().add(t5);
               design.getChildren().add(t12);
               design.getChildren().add(t6);
               design.getChildren().add(t13);
               design.getChildren().add(t7);
               design.getChildren().add(t14);
               
               
              design.getChildren().add(t8);
              design.getChildren().add(t15);
             //   design.getChildren().add(t9);
              
                  }
               /*design.getChildren().add(t2);
               design.getChildren().add(t3);
               design.getChildren().add(t4);
               design.getChildren().add(t5);
               design.getChildren().add(t6);
               /* s1=rs.getString(1);
                s2=rs.getString(2);
                s3=rs.getString(3);
                      
                      System.out.println(s1);
                            System.out.println(s3);
                            
                             Text t2=new Text(10,500,s1);
        Text t3=new Text(200,500,s2);
        Text t4=new Text(400,500,s3);
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                
                 System.out.println(rs.getString(3));
                   System.out.println(rs.getString(4));
                    System.out.println(rs.getString(5));
                      System.out.println(rs.getString(6));
                       System.out.println(rs.getString(7));
                       
                        design.getChildren().add(t2);
                      design.getChildren().add(t3);
                                 design.getChildren().add(t4);*/
              

            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
                System.out.println("Hello World!");
            //}
      //  });
        
       Text t1=new Text(10,635,"HIT");
       
   ///   Text t2=new Text(10,500,rs.getString(1));
       // Text t3=new Text(200,500,s2);
       // Text t4=new Text(400,500,s3);
        //StackPane root = new StackPane();
       // design.getChildren().add(btn);
           design.getChildren().add(t1);
           //design.getChildren().add(t2);
                     // design.getChildren().add(t3);
                                 //design.getChildren().add(t4);
        Scene scene = new Scene(design,1400,1400);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
