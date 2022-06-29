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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class one_mem_fine extends Application{

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
    String id;
    TableView<fine> table;
    //Stage stage;
    
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {

      
           stage=primaryStage;
           
 StackPane root = new StackPane();
  GridPane grid5 = new GridPane();
   GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:ghostwhite;");
        grid.setHgap(30);
        grid.setVgap(20);
        grid.setAlignment(Pos.TOP_CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);
        
        
            GridPane grid2 = new GridPane();
        grid2.setStyle("-fx-background-color:lavenderblush;");
        grid2.setHgap(30);
        grid2.setVgap(20);
        grid2.setAlignment(Pos.TOP_CENTER);
        
        Scene scene2 = new Scene(grid2, 1000, 650 + (i / 5) * 100);

        Text greetings = new Text("Show Member Details");
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
               String ID[]=new String[1];
            
              Button a = new Button("CLICK");
                     Button b=new Button("Back");
                     a.setPrefSize(90, 40);
                     b.setPrefSize(90, 40);
                     
                      grid.add(pr[0], 1, 1);
      //  grid.add(pr1[0], 1, 2);
       
                     
               VBox ab = new VBox(500);
        ab.getChildren().add(a);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 1, 9);
        
                Button back = new Button("WorkPage");
        VBox backemp= new VBox(50);
        back.setPrefSize(100, 40);
        backemp.setAlignment(Pos.CENTER);
        backemp.getChildren().add(back);
        grid.add(backemp,1,7);
        
        
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
       
        
         a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                    ID[0]=p[0].getText();
      
 TableColumn<fine,Integer> bookidcol=new TableColumn<>("Fine_ID");
          bookidcol.setMinWidth(100);
         
          bookidcol.setCellValueFactory(new PropertyValueFactory<>("Book_id"));
          
          
          
        TableColumn<fine,Integer> booknamecol=new TableColumn<>("Issue_ID");
          booknamecol.setMinWidth(100);
          
          booknamecol.setCellValueFactory(new PropertyValueFactory<>("Book_name"));
          
          
        TableColumn<fine,String> catidcol=new TableColumn<>("Member_Id");
          catidcol.setMinWidth(100);
          
          catidcol.setCellValueFactory(new PropertyValueFactory<>("Cat_id"));
          
                  TableColumn<fine,String> amntcol=new TableColumn<>("Submission_Date");;
          amntcol.setMinWidth(100);
          amntcol.setCellValueFactory(new PropertyValueFactory<>("Amnt"));
          
          TableColumn<fine,String> amntcol5=new TableColumn<>("Amount_of_fine");
          amntcol5.setMinWidth(100);
          amntcol5.setCellValueFactory(new PropertyValueFactory<>("JD"));
          
          /* TableColumn<fine,String> col6=new TableColumn<>("Amount_of_fine");
          col6.setMinWidth(100);
          col6.setCellValueFactory(new PropertyValueFactory<>("BD"));*/
          
          table=new TableView<>();
          table.setItems(getmem());
          table.getColumns().addAll(bookidcol,booknamecol,catidcol,amntcol,amntcol5);
          VBox vbox=new VBox();
          vbox.getChildren().addAll(table);
       
          grid5.add(vbox, 10, 10);
          
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
          
                 
        
        
        
        Scene scene=new Scene(grid5,800,800);

          
          stage.setScene(scene);
          stage.show();
          
     }
                
    
     
        }   
       
    
    
    public ObservableList<fine> getmem(){
        ObservableList<fine> mm=FXCollections.observableArrayList();
        
        
        
        String sqlprice = 
     
        
                 "SELECT FINE_ID,ISSUE_ID,MEMBER_ID,SUBMISSION_DATE,AMOUNT_OF_FINE\n" +
                     "FROM FINES\n" 
                +
                    "WHERE MEMBER_ID="+ID[0]+"";
                
       float total = 0;
                    float novat = 0;
           try{
            Connection con = new OracleDBMS().getConnection(); 
            PreparedStatement pst = con.prepareStatement(sqlprice);
                
                ResultSet rs = pst.executeQuery();
                
                while (rs.next()){
                
                    mm.add(new fine(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));
                  
                }
                
                
                
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
           
         
        
        
        
        
        return mm;
        
        
    }
     });
         
                
          stage=primaryStage;
       
        stage.setScene(openwindow);
        stage.show();
    }
     
      public static void main(String[] args) {
        launch(args);
    }

     

    }
