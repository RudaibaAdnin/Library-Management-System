/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class empshow1 extends Application{

    String id;
    TableView<emp> table;
    Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {

      
           stage=primaryStage;
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
  
 TableColumn<emp,Integer> empid=new TableColumn<>("EMPLOYEE_ID");
          empid.setMinWidth(100);
          empid.setCellValueFactory(new PropertyValueFactory<>("EMP_ID"));
          
          
          
        TableColumn<emp,Integer> name=new TableColumn<>("NAME");
          name.setMinWidth(100);
          name.setCellValueFactory(new PropertyValueFactory<>("Name"));
          
          
        TableColumn<emp,String> total=new TableColumn<>("Designation");
          total.setMinWidth(150);
          total.setCellValueFactory(new PropertyValueFactory<>("Db"));
          
                  TableColumn<emp,Float> price=new TableColumn<>("WORKING_HOUR");
          price.setMinWidth(100);
          price.setCellValueFactory(new PropertyValueFactory<>("Wh"));
          
          
                  TableColumn<emp,Float> p=new TableColumn<>("OVER_TIME");
          p.setMinWidth(100);
          p.setCellValueFactory(new PropertyValueFactory<>("Ot"));
          
          
                  TableColumn<emp,Float> Q=new TableColumn<>("SALARY");
          Q.setMinWidth(100);
          Q.setCellValueFactory(new PropertyValueFactory<>("Sl"));
          
          
                  TableColumn<emp,String> R=new TableColumn<>("JOINING_DATE");
          R.setMinWidth(150);
          R.setCellValueFactory(new PropertyValueFactory<>("Jd"));
          
          table=new TableView<>();
          table.setItems(getmemo());
          table.getColumns().addAll(empid,name,total,price,p,Q,R);
          VBox vbox=new VBox();
          vbox.getChildren().addAll(table);
        /*  
          Button back=new Button();
          back.setLayoutX(12);
        back.setLayoutY(400);
        back.setMinSize(80, 50);
          root.getChildren().addAll(vbox,back);
          Scene scene=new Scene(root,600,400);
          
          */
          grid5.add(vbox,10,20);
          
          Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid5.add(backemp, 0,15);
        
        
         back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                EmployeeInsert bl=new EmployeeInsert();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         });
          
                   Scene scene=new Scene(grid5,900,600);

          
          stage.setScene(scene);
          stage.show();
          
     }
    
    public ObservableList<emp> getmemo(){
        ObservableList<emp> mm=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
                //"SELECT PRODUCT_ID , QUANTITY ,TOTAL , PRICE\n" +
                //"FROM CASHMEMO\n" +
                //"WHERE PRODUCT_ID=12";
        
                 "SELECT *" +
                "FROM EMPLOYEE\n";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                    //   total=rs.getFloat(1);
                    //   novat=rs.getFloat(2);
    mm.add(new emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getString(7)));
     System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getFloat(5)+" "+rs.getFloat(6)+" "+rs.getString(7));
                  
                }
                
                
                
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
         
        
        
        
        
        return mm;
        
        
    }
     
      public static void main(String[] args) {
        launch(args);
    }

     

    }
    

