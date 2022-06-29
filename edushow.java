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



public class edushow extends Application{

    String id;
    TableView<edu> table;
    Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {

      
           stage=primaryStage;
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
  
 TableColumn<edu,Integer> bookidcol=new TableColumn<>("Employee_ID");
          bookidcol.setMinWidth(100);
         
          bookidcol.setCellValueFactory(new PropertyValueFactory<>("Book_id"));
          
          
          
        TableColumn<edu,Integer> booknamecol=new TableColumn<>("Designation");
          booknamecol.setMinWidth(100);
          
          booknamecol.setCellValueFactory(new PropertyValueFactory<>("Book_name"));
          
          
        TableColumn<edu,String> catidcol=new TableColumn<>("Mailing_info");
          catidcol.setMinWidth(100);
          
          catidcol.setCellValueFactory(new PropertyValueFactory<>("Cat_id"));
          
                  TableColumn<edu,String> amntcol=new TableColumn<>("Address");
          amntcol.setMinWidth(100);
          amntcol.setCellValueFactory(new PropertyValueFactory<>("Amnt"));
          
          TableColumn<edu,String> amntcol5=new TableColumn<>("JobExpInYear");
          amntcol5.setMinWidth(100);
          amntcol5.setCellValueFactory(new PropertyValueFactory<>("JD"));
          
           TableColumn<edu,String> col6=new TableColumn<>("SSCPASSYEAR");
          col6.setMinWidth(100);
          col6.setCellValueFactory(new PropertyValueFactory<>("BD"));
          
          TableColumn<edu,String> col7=new TableColumn<>("SSCGRADE");
          col7.setMinWidth(100);
          col7.setCellValueFactory(new PropertyValueFactory<>("FA"));
          
           TableColumn<edu,String> col8=new TableColumn<>("HSCPASSYEAR");
          col8.setMinWidth(100);
          col8.setCellValueFactory(new PropertyValueFactory<>("SG"));
          
           TableColumn<edu,String> col9=new TableColumn<>("HSCGRADE");
          col9.setMinWidth(100);
          col9.setCellValueFactory(new PropertyValueFactory<>("HY"));
          
           TableColumn<edu,String> col10=new TableColumn<>("GRADUATIONYEAR");
          col10.setMinWidth(100);
          col10.setCellValueFactory(new PropertyValueFactory<>("HG"));
          
          
           TableColumn<edu,String> col11=new TableColumn<>("GRADUATIONGRADE");
          col11.setMinWidth(100);
          col11.setCellValueFactory(new PropertyValueFactory<>("GY"));
          
          table=new TableView<>();
          table.setItems(getmem());
          table.getColumns().addAll(bookidcol,booknamecol,catidcol,amntcol,amntcol5,col6,col7,col8,col9,col10,col11);
          VBox vbox=new VBox();
          vbox.getChildren().addAll(table);
       
          grid5.add(vbox,0,0);
          
          Button back = new Button("Back");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid5.add(backemp, 0, 15);
        
        
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
    
     
    
    
    
    public ObservableList<edu> getmem(){
        ObservableList<edu> mm=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
     
        
                 "SELECT *" +
                "FROM EMP_EDUCATION\n";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                
           mm.add(new edu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)));
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

