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



public class memreqshow extends Application{

    String id;
    TableView<memreq> table;
    Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
      
           stage=primaryStage;
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
  
 TableColumn<memreq,Integer> bookidcol=new TableColumn<>("STUDENT_ID");
          bookidcol.setMinWidth(300);
         
          bookidcol.setCellValueFactory(new PropertyValueFactory<>("Book_id"));
          
          
          
        TableColumn<memreq,String> booknamecol=new TableColumn<>("STUDENT_NAME");
          booknamecol.setMinWidth(300);
          
          booknamecol.setCellValueFactory(new PropertyValueFactory<>("Book_name"));
          
          
        TableColumn<memreq,String> catidcol=new TableColumn<>("DEPARTMENT");
          catidcol.setMinWidth(300);
          
          catidcol.setCellValueFactory(new PropertyValueFactory<>("Cat_id"));
          
                  TableColumn<memreq,String> amntcol=new TableColumn<>("DATE_OF_BIRTH");
                  amntcol.setMinWidth(300);
          amntcol.setCellValueFactory(new PropertyValueFactory<>("Amnt"));
          
          table=new TableView<>();
          table.setItems(getbook());
          table.getColumns().addAll(bookidcol,booknamecol,catidcol,amntcol);
          VBox vbox=new VBox();
          vbox.getChildren().addAll(table);
       
          grid5.add(vbox, 0, 0);
          
 
          
         Button back1 = new Button("Member Insert Page");
        VBox backemp1= new VBox(50);
        back1.setPrefSize(200,60);
        backemp1.setAlignment(Pos.CENTER);
        backemp1.getChildren().add(back1);
        grid5.add(backemp1,0,2);
        
        
         back1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             
             

                
                MemberInsert bl=new MemberInsert();
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
    
     
    
    
    
    public ObservableList<memreq> getbook(){
        ObservableList<memreq> bb=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
     
        
                 "SELECT *" +
                "FROM MEMBERS_REQUEST\n";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                
                    bb.add(new memreq(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
                  
                }
                
                
                
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
         
        
        
        
        
        return bb;
        
        
    }
     
      public static void main(String[] args) {
        launch(args);
    }

     

    }
    


