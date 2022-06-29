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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author JOHN
 */

public class Login_page extends Application{
    
    //public class Guifordbproject extends Application {

    // COMMENT GULA PORE PORE JAIS SADIA...
    int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {

        //linr number 77 porjnto tor dekhar dorkar nai.
        StackPane root = new StackPane();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color:lavenderblush;");
        grid.setHgap(100);
        grid.setVgap(30);
        grid.setAlignment(Pos.CENTER);
        Scene openwindow = new Scene(grid, 1000, 650 + (i / 6) * 100);

        Text greetings = new Text("WELCOME TO OUR LIBRARY");
        greetings.setFill(Color.INDIGO);
        greetings.setFont(Font.font("Corsiva", FontWeight.BOLD, 26));
        grid.add(greetings, 0, 0, 5, 1);

        Text phead1 = new Text("USER NAME");
        phead1.setFill(Color.INDIGO);
        phead1.setFont(Font.font("Constantia", FontWeight.LIGHT, 16));
        grid.add(phead1, 0, 1);
        
         VBox pr[];
        pr = new VBox[1];
        TextField p[];
        p = new TextField[1];
        
        pr[0] = new VBox();
            pr[0].setAlignment(Pos.CENTER_LEFT);
            
            p[0] = new TextField();
            p[0].setPrefSize(120, 40);
            
            p[0].setPromptText("");
            pr[0].getChildren().add(p[0]);
           


        Text qhead1 = new Text("PASSWORD");
        qhead1.setFill(Color.INDIGO);
        qhead1.setFont(Font.font("Constantia", FontWeight.LIGHT, 16));
        grid.add(qhead1, 0, 2);
        
         VBox pr1[];
        pr1 = new VBox[1];
        TextField p1[];
        p1 = new TextField[1];
        
        pr1[0] = new VBox();
            pr1[0].setAlignment(Pos.CENTER_LEFT);
            
            p1[0] = new TextField();
            p1[0].setPrefSize(120, 40);
            
            p1[0].setPromptText("");
            pr1[0].getChildren().add(p1[0]);
           


  /*      Text phead2 = new Text("Product ID(1-30)");
        phead2.setFill(Color.BLACK);
        phead2.setFont(Font.font("Constantia", FontWeight.LIGHT, 16));

        Text qhead2 = new Text("Quantity");
        qhead2.setFill(Color.BLACK);
        qhead2.setFont(Font.font("Constantia", FontWeight.LIGHT, 16));
        */

        ///
        /*  Text wv = new Text("Without VAT:");
        wv.setFill(Color.GREEN);
        wv.setFont(Font.font("Constantia", FontWeight.LIGHT, 20));
        grid.add(wv, 4, 10);

        Text tt = new Text("Total:");
        tt.setFill(Color.GREEN);
        tt.setFont(Font.font("Constantia", FontWeight.LIGHT, 20));
        grid.add(tt, 4, 11);

        Text wv_res = new Text();
        wv_res.setFill(Color.BLACK);
        wv_res.setFont(Font.font("Constantia", FontWeight.LIGHT, 20));
        grid.add(wv_res, 5, 10);
        //wv_res.setText("Farhan");
        // ei farhan er jaigai ekta string hobe jekhane without vat calculated amount ta likhbo.

        Text tt_res = new Text();
        tt_res.setFill(Color.BLACK);
        tt_res.setFont(Font.font("Constantia", FontWeight.LIGHT, 20));
        grid.add(tt_res, 5, 11);
        //tt_res.setText("Sadia");
        */
        ///
        
       /* VBox pro[];
        pro = new VBox[20];

        VBox pro2[];
        pro2 = new VBox[20];

        //ekhane text fiels er jei array ta nicce okhan theke 
        //ee amader data collect korte hobe.
        //pname theke product name and pquan theke product quantity.
        // i namok variable theke amra total number of products pabo.
        // mane koi dhoroner product order kora hoise emn kichu.
        TextField pname[];
        pname = new TextField[20];

        TextField pquan[];
        pquan = new TextField[20];

        for (int j = 0; j < 20; j++) {
            pro[j] = new VBox();
            pro[j].setAlignment(Pos.CENTER_LEFT);
            pro2[j] = new VBox();
            pro2[j].setAlignment(Pos.CENTER_LEFT);
            pname[j] = new TextField();
            pname[j].setPrefSize(200, 40);
            pquan[j] = new TextField();
            pquan[j].setPrefSize(70, 40);
            pname[j].setPromptText("Press Enter after giving name");
            pro[j].getChildren().add(pname[j]);
            pro2[j].getChildren().add(pquan[j]);
        }
*/
        grid.add(pr[0], 1, 1);
        grid.add(pr1[0], 1, 2);

      //  grid.add(pro2[0], 1, 2);

        Button addb = new Button("Login");
        addb.setPrefSize(120, 40);
        VBox ab = new VBox(50);
        ab.getChildren().add(addb);
        ab.setAlignment(Pos.CENTER);
        grid.add(ab, 2, 2);
        System.out.println(p[0].getText());
        System.out.println(p1[0].getText());
    /*   Button doneb = new Button("Done");
        doneb.setPrefSize(80, 40);
        VBox bb = new VBox(50);
        bb.getChildren().add(doneb);
        bb.setAlignment(Pos.CENTER);
        grid.add(bb, 5, 2);
        
*/
      String name[]=new String[1];
                String pass[]=new String[1];
              
        addb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (go_for_more) {
                    // yes r no er jaygay onno page call kora lagbe
                    
                    i++;
                   // if (i < 20) {
                     //   if (i < 10) {
                        //    grid.add(pro[i], 0, 2 + i);
                         //   grid.add(pro2[i], 1, 2 + i);
                       // } else if (i >= 10) {
                         //   if (new_head) {
                           //     new_head = false;
                               // grid.add(phead2, 2, 1);
                               // grid.add(qhead2, 3, 1);
                           // }
                         //   grid.add(pro[i], 2, 2 + i - 10);
                           // grid.add(pro2[i], 3, 2 + i - 10);
                       // }
                   // 
                   
                name[0]=p[0].getText();
                pass[0]=p1[0].getText();
                System.out.println(name[0]);
                System.out.println(pass[0]);
                 
                      Group design=new Group();
   
        boolean success = false;
        String sql = "SELECT * FROM EMPLOYEE";
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = new OracleDBMS().getConnection();

            PreparedStatement pst = con.prepareStatement(sql);
                                    System.out.println("hello");

            //pst.setString(1, userName);
            //pst.setString(2, password);
            String s[];
            String s1[];
            s=new String[10];
             s1=new String[10];
            ResultSet rs = pst.executeQuery();
            int i=0;
            while (rs.next())
            {
                
                
                //System.out.println(rs.getString(1));
                s[i]=rs.getString(1);
                System.out.println("dndnnsdcdsc");
                System.out.println(s[i]);
                s[i]=rs.getString(1);
                
                s1[i]=rs.getString(2);
                System.out.println("dndnnsdcsdhsnkdxhnsaklxdsc");
                System.out.println(s1[i]);
                i++;
                
             /*   System.out.println(rs.getString(2));
                
                 System.out.println(rs.getString(3)); //ei jaigai fx lagaite hbe
                   System.out.println(rs.getString(4));
                     System.out.println(rs.getString(5));
                       System.out.println(rs.getString(6));
                       System.out.println(rs.getString(7));
*/

            }
         int l;
            for(l=0;l<i;l++)
            {
                System.out.println("emu vncjvnkd adsbjbhfc");
                System.out.println(l);

                System.out.println(s[l]);
                System.out.println(s1[l]);

                
            }
            int fl=0;
            for(l=0;l<i;l++)
            {   System.out.println("in for ");
                System.out.println(name[0]);
                System.out.println(s[l]);
                if(name[0].equals(s1[l]))
                {
                    
                    System.out.println("yes");
                    if(pass[0].equals(s[l]))
                    {
                        System.out.println("yess");
                        fl=1;
                        
                         stage=primaryStage;
       stage.setTitle("Login Successful");
        stage.setScene(openwindow);
        stage.show();
                        
                    }
                    else 
                        System.out.println("no");
                }
                
            }
            
            if(fl==0)
            {
                System.out.println("nopes");
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        
        
       
                
                }
            }
        });
           stage=primaryStage;
       stage.setTitle("LIBRARY MANAGEMENT SYSTEM");
        stage.setScene(openwindow);
        stage.show();
        

      /*  doneb.setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent event) {
                String product_info="";
             

                if(go_for_more) {
                    go_for_more = false;
                    i++;
                }
                   String products2[]=new String[i];
                String productsquan2[]=new String[i];
                
                System.out.println("the value of i is "+i);
                for(int l =0;l<i;l++)
                {
                   // System.out.println("The nubmer is  "+l +"   "+pname[l].getText());
                //    products2[l]=pname[l].getText();
                   // System.out.println(products2[l]);
                    //System.out.println("Its L" +l);
                }
                
                System.out.println("now the quantities");
                for(int l =0;l<i;l++)
                {
                   // System.out.println(pquan[l].getText());
               //     productsquan2[l]=pquan[l].getText();         
                   // System.out.println(productsquan2[l]);
                }
                 for(int l =0;l<i;l++)
                {
               //    product_info=product_info.concat(pname[l].getText());
                   product_info=product_info.concat("-");
                //   product_info=product_info.concat(pquan[l].getText());
                   product_info=product_info.concat(";");
                }
                 System.out.println(product_info);
                 /*
                 for(int m=0;m<i;m++){
                     System.out.println(products2[m]+"  hello  "+productsquan2[m]);
                     
                 }
                 */
                 
                 
                 
               //  priceCal(product_info);
               //  MemoInfo memo=priceCal2(products2,productsquan2);
                 
                 
              //   int p=0;
        /*         String productsplited[];
                 productsplited=new String[i];
                
                     productsplited=product_info.split(";");
                 
                     for (int l = 0; l < productsplited.length; l++) {
                             System.out.println(productsplited[l]);
                      }
                     
                 
             //   wv_res.setText(Float.toString(memo.bill_without_vat));
               //tt_res.setText(Float.toString(memo.total_bill));
                
            }
        });

      */
        // ei sadia er jaigai ekta string hobe jekhane total calculated amount ta likhbo.
    /*     Group design=new Group();
   
        boolean success = false;
        String sql = "SELECT * FROM EMPLOYEE";
        
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = new OracleDBMS().getConnection();

            PreparedStatement pst = con.prepareStatement(sql);
                                    System.out.println("hello");

            //pst.setString(1, userName);
            //pst.setString(2, password);
            String s[];
            String s1[];
            s=new String[10];
             s1=new String[10];
            ResultSet rs = pst.executeQuery();
            int i=0;
            while (rs.next())
            {
                
                
                //System.out.println(rs.getString(1));
                s[i]=rs.getString(1);
                System.out.println("dndnnsdcdsc");
                System.out.println(s[i]);
                s[i]=rs.getString(1);
                
                s1[i]=rs.getString(2);
                System.out.println("dndnnsdcsdhsnkdxhnsaklxdsc");
                System.out.println(s1[i]);
                i++;
                
             /*   System.out.println(rs.getString(2));
                
                 System.out.println(rs.getString(3)); //ei jaigai fx lagaite hbe
                   System.out.println(rs.getString(4));
                     System.out.println(rs.getString(5));
                       System.out.println(rs.getString(6));
                       System.out.println(rs.getString(7));
*/

            }
   /*      int l;
            for(l=0;l<i;l++)
            {
                System.out.println("emu vncjvnkd adsbjbhfc");
                System.out.println(l);

                System.out.println(s[l]);
                System.out.println(s1[l]);

                
            }
            int fl=0;
            for(l=0;l<i;l++)
            {   System.out.println("in for ");
                System.out.println(name[0]);
                System.out.println(s[l]);
                if(name[0].equals(s1[l]))
                {
                    
                    System.out.println("yes");
                    if(pass[0].equals(s[l]))
                    {
                        System.out.println("yess");
                        fl=1;
                        
                    }
                    else 
                        System.out.println("no");
                }
                
            }
            
            if(fl==0)
            {
                System.out.println("nopes");
            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        
        
       
       
        stage=primaryStage;
       stage.setTitle("LIBRARY MANAGEMENT SYSTEM");
        stage.setScene(openwindow);
        stage.show();
        
        
        
        */
       
    

    
    
  /*    * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

   
}

