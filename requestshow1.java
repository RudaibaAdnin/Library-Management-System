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



public class requestshow1 extends Application{

    String id;
    TableView<req> table;
    Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {

      
           stage=primaryStage;
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
  
 TableColumn<req,Integer> bookidcol=new TableColumn<>("BOOK_ID");
          bookidcol.setMinWidth(100);
         
          bookidcol.setCellValueFactory(new PropertyValueFactory<>("Book_id"));
          
          
          
        TableColumn<req,Integer> booknamecol=new TableColumn<>("BOOK_NAME");
          booknamecol.setMinWidth(100);
          
          booknamecol.setCellValueFactory(new PropertyValueFactory<>("Book_name"));
          
          
        TableColumn<req,String> catidcol=new TableColumn<>("Member_ID");
          catidcol.setMinWidth(100);
          
          catidcol.setCellValueFactory(new PropertyValueFactory<>("Cat_id"));
          
                  TableColumn<req,String> amntcol=new TableColumn<>("REQUEST DATE");
          amntcol.setMinWidth(100);
          amntcol.setCellValueFactory(new PropertyValueFactory<>("Amnt"));
          
        /*  TableColumn<req,String> amntcol5=new TableColumn<>("JOINING_DATE");
          amntcol5.setMinWidth(200);
          amntcol5.setCellValueFactory(new PropertyValueFactory<>("JD"));
          
           /*TableColumn<mem,String> col6=new TableColumn<>("BIRTH_DATE");
          col6.setMinWidth(100);
          col6.setCellValueFactory(new PropertyValueFactory<>("BD"));*/
          
          table=new TableView<>();
          table.setItems(getmem());
          table.getColumns().addAll(bookidcol,booknamecol,catidcol,amntcol);
          VBox vbox=new VBox();
          vbox.getChildren().addAll(table);
       
          grid5.add(vbox, 10,30);
          
          Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid5.add(backemp, 0,15);
        
        
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
          
                 
        
        
        
        Scene scene=new Scene(grid5,800,800);

          
          stage.setScene(scene);
          stage.show();
          
     }
    
     
    
    
    
    public ObservableList<req> getmem(){
        ObservableList<req> mm=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
     
        
                 "SELECT *" +
                "FROM BOOK_REQUEST\n";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                
                    mm.add(new req(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
                  
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
