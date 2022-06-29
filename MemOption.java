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
import java.sql.CallableStatement;
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
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class MemOption extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;
     String st1;
    String s7;
    //String s3;
    String s1;
    String s2;
    String s3;
     String s4;
    String s5;
    String s6;

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

        Text greetings = new Text("Work Options ");
        greetings.setFill(Color.DARKCYAN);
        greetings.setFont(Font.font("monotype Corsiva", FontWeight.BOLD,40));
        grid.add(greetings,2,0);

 
/*         Button onemem = new Button("Member Details");
        onemem.setPrefSize(100,40);
         onemem.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
        VBox om = new VBox(50);
        om.getChildren().add(onemem);
        om.setAlignment(Pos.CENTER);
        
        grid.add(om, 0,7);
*/
        
        
         Button onebook = new Button("Book Details");
        onebook.setPrefSize(100,40);
         onebook.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
        VBox ob = new VBox(50);
        ob.getChildren().add(onebook);
        ob.setAlignment(Pos.CENTER);
        
        grid.add(ob,2,2);
        
        
         Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
         back.setStyle("-fx-background-color:cyan; -fx-text-fill: black;");
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid.add(backemp,2,10);
        
        
         back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                MemberLogin bl=new MemberLogin();
                             try{
                                 
            Connection con = new OracleDBMS().getConnection();
            
            
            String sql2="DELETE FROM STORE_MEM";
            PreparedStatement pst = con.prepareStatement(sql2);
                    
                    int rs2 = pst.executeUpdate();
            
                     if(rs2!=0) {
                         System.out.println("Value deleted");
                        
                         
                         
                     }else
                     {
                     
                     }
                     
                   
            pst.close();
           
            con.close();
            bl.start(stage);  
        }
              
            
  
              
              
              
        catch(Exception e)
        {     
            System.out.println(e);
              System.out.println("exception found");
               final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
            
                
                Text T1=new Text("INVALID ");
               T1.setFill(Color.BLACK);
               T1.setFont(Font.font(" Corsiva", FontWeight.LIGHT,22));
               
               
           
                dialogVbox.getChildren().add(T1);
                Scene dialogScene = new Scene(dialogVbox,200, 100);
                dialog.setScene(dialogScene);
                dialog.show();
                
            
        }
            }
        });  
         
         
          Button fi= new Button("Change Password ");
          fi.setStyle("-fx-background-color:lightblue; -fx-text-fill: black;");
        VBox f= new VBox(50);
        fi.setPrefSize(100,40);
        f.setAlignment(Pos.CENTER);
        f.getChildren().add(fi);
        grid.add(f,2,5);
        
        
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
         
         
           Button fs= new Button("Show Fine");
          fs.setStyle("-fx-background-color:lightblue; -fx-text-fill: black;");
        VBox f1= new VBox(50);
        fs.setPrefSize(100,40);
        f1.setAlignment(Pos.CENTER);
        f1.getChildren().add(fs);
        grid.add(f1,2,6);
        
        
         fs.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
                  onememfineshow bl=new onememfineshow();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
            
         
          Button is= new Button("Show issues");
          is.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
        VBox f11= new VBox(50);
        is.setPrefSize(100,40);
        f11.setAlignment(Pos.CENTER);
        f11.getChildren().add(is);
        grid.add(f11,2,7);
        
        
         is.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
                  onememissueshow bl=new onememissueshow();
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
        grid.add(backemp1,2,3);
        
        
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
          
         Button rs9 = new Button("RequestTable");
          rs9.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
       VBox backemp2= new VBox(50);
        rs9.setPrefSize(100, 40);
        backemp2.setAlignment(Pos.CENTER);
        backemp2.getChildren().add(rs9);
        grid.add(backemp2,2,4);
        
        
         rs9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
              onememrequestshow bl=new onememrequestshow();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
          
               
          
         /*Button fine = new Button("Show Fine");
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
            */
         Button last = new Button("LastSubmissionDAte");
          last.setStyle("-fx-background-color:lightsalmon; -fx-text-fill: black;");
        VBox f13= new VBox(50);
        last.setPrefSize(100, 40);
        f13.setAlignment(Pos.CENTER);
        f13.getChildren().add(last);
        grid.add(f13,2,8);
        
        
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
          
                 
        
     
        
         
     
        
        
        
        
        
        


     

      
        
            onebook.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneBookDetailsStudent obd=new oneBookDetailsStudent();
                obd.start(stage);
            }
        });
            
            
            
        /*  Button show= new Button("Details");
          show.setStyle("-fx-background-color:lightblue; -fx-text-fill: black;");
        VBox s= new VBox(50);
        show.setPrefSize(100,40);
        s.setAlignment(Pos.CENTER);
        s.getChildren().add(show);
        grid.add(s, 2, 8);*/
        
        
        // show.setOnAction(new EventHandler<ActionEvent>() {
         //   public void handle(ActionEvent event) {
                // String sql="SELECT MEMBER_ID FROM STORE_MEM";
                       // System.out.println(sql);
                        
                        
                 //String sql1="UPDATE MEMBERS SET FINE_AMOUNT =COUNT_FINE(MEMBER_ID)";
                   
                    
              try{
            Connection con = new OracleDBMS().getConnection();
            
             String sql="SELECT MEMBER_ID FROM STORE_MEM";
                        System.out.println(sql);
                        
            PreparedStatement pst = con.prepareStatement(sql);
                    
                    ResultSet rs = pst.executeQuery();
            
                     while(rs.next()) {
                         System.out.println("Value Selected");
                         st1=rs.getString(1);
                         System.out.println(st1);
                         
                         
                     }
                     
                     String sql1="Select * FROM MEMBERS WHERE MEMBER_ID="
                             +""+st1+"";
                      
                         System.out.println(sql1);
                         
                         PreparedStatement pst1 = con.prepareStatement(sql1);
                    
                    ResultSet rs1 = pst1.executeQuery();
            
                     while(rs1.next()) {
                         System.out.println("Value Selected");
                         s1=rs1.getString(1);
                         
     
                         s2=rs1.getString(2);
                         s3=rs1.getString(3);
                         s4=rs1.getString(4);
                         s5=rs1.getString(5);
                         s6=rs1.getString(6);
                          s7=rs1.getString(7);
                         
                         
                          System.out.println(s1);
                          
                  System.out.println(s2);
                  System.out.println(s3);
                  System.out.println(s4);
                  System.out.println(s5);
                  System.out.println(s6);
                  System.out.println(s7);
                         System.out.println("Value showed");
                         
                     }
                     

                   
                   
                   // System.out.println("PRRRRRRRRR");
                     
            pst.close();
           
            con.close();
        }
              
              
              
              
              
              
              
              
              
              
              
              
              
              
        catch(Exception e)
        {     
            System.out.println(e);
              System.out.println("exception found");
               final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
            
                
                Text T1=new Text("INVALID ");
               T1.setFill(Color.BLACK);
               T1.setFont(Font.font(" Corsiva", FontWeight.LIGHT,22));
               
               
           
                dialogVbox.getChildren().add(T1);
                Scene dialogScene = new Scene(dialogVbox,200, 100);
                dialog.setScene(dialogScene);
                dialog.show();
                
            
        }
              
              
               Text t1 = new Text(s1);
        t1.setFill(Color.DARKRED);
      
        t1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t1, 1, 2);
        
        System.out.println("thissssssssssss one"+s1);
                            Text t2 = new Text(s2);
        t2.setFill(Color.DARKRED);
        t2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t2, 1, 3);
      
                            Text t3 = new Text(s3);
        t3.setFill(Color.DARKRED);
        t3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t3, 1, 4);
        
                            Text t4= new Text(s4);
        t4.setFill(Color.DARKRED);
        t4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t4, 1, 5);
        
        
        Text t5 = new Text(s5);
        t5.setFill(Color.DARKRED);
        t5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t5, 1, 6);
        
           Text t6=new Text(s6);
        t6.setFill(Color.DARKRED);
        t6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t6, 1, 7);
        
        
        Text t7=new Text(s7);
        t7.setFill(Color.DARKRED);
        t7.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(t7, 1, 8);
        
        
        
        
        
          Text r1 = new Text("MEMBER ID :");
        r1.setFill(Color.DARKRED);
        r1.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r1, 0, 2);
        
                                   Text r2 = new Text("STUDENT ID :");
        r2.setFill(Color.DARKRED);
        r2.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r2, 0, 3);
        System.out.println("thissssssssssss one"+s1);
        
                                   Text r3 = new Text("NAME :");
        r3.setFill(Color.DARKRED);
        r3.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r3, 0, 4);
        
                                   Text r4 = new Text("DEPARTMENT :");
        r4.setFill(Color.DARKRED);
        r4.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r4, 0, 5);
        
                                   Text r5 = new Text("DATE OF BIRTH :");
        r5.setFill(Color.DARKRED);
        r5.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r5, 0, 6);
        
                                   Text r6 = new Text("JOINING DATE :");
        r6.setFill(Color.DARKRED);
        r6.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r6, 0, 7);
        
        
                Text r7 = new Text("Total Fine :");
        r7.setFill(Color.DARKRED);
        r7.setFont(Font.font("Corsiva", FontWeight.LIGHT, 16));
        grid.add(r7, 0,8);
         
                    
              //  }
       // });  
        
     

        
        
      
     
        stage.setScene(openwindow);
        stage.show();
    }
    
    
    

    public static void main(String[] args) {
        launch(args);
    }

}