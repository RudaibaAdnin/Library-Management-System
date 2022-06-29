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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package databaseprojectsample;

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



public class overtimeshow extends Application{

    String id;
    TableView<ovrtime> table;
    Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
      
           stage=primaryStage;
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
  
 TableColumn<ovrtime,Integer> proidcol=new TableColumn<>("EMPLOYEE_ID");
          proidcol.setMinWidth(200);
          proidcol.setCellValueFactory(new PropertyValueFactory<>("po_id"));
          
          
          
        TableColumn<ovrtime,Integer> qua=new TableColumn<>("SALARY");
          qua.setMinWidth(200);
          qua.setCellValueFactory(new PropertyValueFactory<>("quan"));
          
          
        TableColumn<ovrtime,Float> total=new TableColumn<>("OVER_TIME");
          total.setMinWidth(200);
          total.setCellValueFactory(new PropertyValueFactory<>("to_bill"));
          
                  TableColumn<ovrtime,Float> price=new TableColumn<>("NEW_SALARY");
          price.setMinWidth(200);
          price.setCellValueFactory(new PropertyValueFactory<>("vat_bill"));
          
          table=new TableView<>();
          table.setItems(getmemo());
          table.getColumns().addAll(proidcol,qua,total,price);
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
          grid5.add(vbox, 0, 0);
          
          Button back= new Button("Back");
        VBox backemp5 = new VBox(50);
        back.setPrefSize(100, 30);
        backemp5.setAlignment(Pos.CENTER_LEFT);
        backemp5.getChildren().add(back);
        grid5.add(backemp5, 0, 1);
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
        
        
                   Scene scene=new Scene(grid5);

          
          stage.setScene(scene);
          stage.show();
          
     }
    
    public ObservableList<ovrtime> getmemo(){
        ObservableList<ovrtime> mm=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
                //"SELECT PRODUCT_ID , QUANTITY ,TOTAL , PRICE\n" +
                //"FROM CASHMEMO\n" +
                //"WHERE PRODUCT_ID=12";
        
                 "SELECT *" +
                "FROM OVER_TIME\n";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                    //   total=rs.getFloat(1);
                    //   novat=rs.getFloat(2);
                    mm.add(new ovrtime(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4)));
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getFloat(3)+" "+rs.getFloat(4));
                  
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
    

