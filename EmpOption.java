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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class EmpOption extends Application {
     int i = 0;
    boolean go_for_more = true;
    boolean new_head = true;
    Stage stage;
    Scene scene;
    Group group=new Group();

    @Override
    public void start(Stage primaryStage) {
        
        
        
        Text t1=new Text("Employee Work Page ");
       
      t1.setX(450);
       t1.setY(80);
          t1.setFill(Color.DARKCYAN);
       
        t1.setFont(Font.font ("monotype corsiva",36));
       
       group.getChildren().add(t1);
        
        
            //scene.setFill(Color.SEASHELL);
        
        stage=primaryStage;
        
        
        
         Text t2=new Text("Book Borrow and Lend Works ");
       
      t2.setX(50);
       t2.setY(200);
          t2.setFill(Color.DARKCYAN);
       
        t2.setFont(Font.font ("monotype corsiva",20));
       
       group.getChildren().add(t2);
   
       
   
        Button ab = new Button("Book Lend");
        ab.setPrefSize(100,40);
        ab.setLayoutX(150);
        ab.setLayoutY(250);
        ab.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        ab.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ab);
        
          ab.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
               BookLend emi=new  BookLend();
               emi.start(stage);
            
            }
            
        });
        
        
        Button br= new Button("Book Return");
        br.setPrefSize(100,40);
        br.setLayoutX(150);
        br.setLayoutY(310);
       br.setStyle("-fx-background-color:lavender; -fx-text-fill: black;");
     
        br.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(br);
        
         br.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
               BookReturn emi1=new  BookReturn();
               emi1.start(stage);
            
            }
            
        });
        
        
        Button sf= new Button("Fine Collect");
        sf.setPrefSize(100,40);
        sf.setLayoutX(150);
        sf.setLayoutY(370);
       sf.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        sf.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(sf);
        
        
         sf.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
               submitfine emi2=new  submitfine();
               emi2.start(stage);
            
            }
            
        });
        
        
        Button bk= new Button("Back");
        bk.setPrefSize(100,40);
        bk.setLayoutX(350);
        bk.setLayoutY(600);
        bk.setStyle("-fx-background-color:lightgrey; -fx-text-fill: black;");
     
        bk.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(bk);
         bk.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                EmployeeLogin bl=new EmployeeLogin();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
         
         
          Button rq= new Button("Request Table");
        rq.setPrefSize(100,40);
        rq.setLayoutX(150);
        rq.setLayoutY(430);
        rq.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
     
        rq.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(rq);
        
        
                rq.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                requestshow1 b2=new requestshow1();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });


      
       
        
       
        
       
         
         
           Text t3=new Text("Adding new Members,Books,Employees ");
       
      t3.setX(330);
       t3.setY(200);
          t3.setFill(Color.DARKCYAN);
       
        t3.setFont(Font.font ("monotype corsiva",20));
       
       group.getChildren().add(t3);
        
         Button mI= new Button("Member Insert");
        mI.setPrefSize(100,40);
        mI.setLayoutX(400);
        mI.setLayoutY(310);
        mI.setStyle("-fx-background-color:lavender; -fx-text-fill: black;");
     
        mI.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(mI);
        
        
        
        
         Button ei= new Button("Employee Insert");
        ei.setPrefSize(100,40);
        ei.setLayoutX(400);
        ei.setLayoutY(370);
        ei.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        ei.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ei);
        
        
        Button bi= new Button("Book Insert");
        bi.setPrefSize(100,40);
        bi.setLayoutX(400);
        bi.setLayoutY(250);
        bi.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
     
        ei.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(bi);
        
        
        
                bi.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               
             

                BookInsert bi1=new BookInsert();
                bi1.start(stage);
            }
        });
        
         mI.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

            
                MemberInsert sn=new MemberInsert();
                sn.start(stage);
            }
        });
        
        
        
        
        
        ei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
             

              
                EmployeeInsert ei1=new EmployeeInsert();
                ei1.start(stage);
            }
        });
         
        
                 
           Text t4=new Text("Details of Members,Books,Employees ");
       
      t4.setX(630);
       t4.setY(200);
          t4.setFill(Color.DARKCYAN);
       
        t4.setFont(Font.font ("monotype corsiva",20));
       
       group.getChildren().add(t4);
        
        Button md= new Button("Member Details");
        md.setPrefSize(100,40);
        md.setLayoutX(650);
        md.setLayoutY(310);
        md.setStyle("-fx-background-color:wheat; -fx-text-fill: black;");
     
        md.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(md);
        
        
        
        
        
        Button ed= new Button("Employee Details");
        ed.setPrefSize(100,40);
        ed.setLayoutX(650);
        ed.setLayoutY(370);
        ed.setStyle("-fx-background-color:violet; -fx-text-fill: black;");
     
        ed.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ed);
        
        
        
     
        
        Button bd= new Button("Book Details");
        bd.setPrefSize(100,40);
        bd.setLayoutX(650);
        bd.setLayoutY(250);
        bd.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        bd.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(bd);
        
        
                 bd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
             

              
                bookshow ei1=new bookshow();
                try {
                    ei1.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(EmpOption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       md.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
             

              
                memshow ei2=new memshow();
                try {
                    ei2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(EmpOption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
       ed.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              
             

              
                empshow ei3=new empshow();
                try {
                    ei3.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(EmpOption.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
     
       
         Button cpe= new Button("Change Password");
        cpe.setPrefSize(150,40);
        cpe.setLayoutX(550);
        cpe.setLayoutY(600);
        cpe.setStyle("-fx-background-color:cyan; -fx-text-fill: black;");
     
        cpe.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(cpe);
        
                 cpe.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                chngPassEmp b2=new chngPassEmp();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
                 
                         
           Text t5=new Text("Search Members,Books,Employees");
       
      t5.setX(940);
       t5.setY(200);
          t5.setFill(Color.DARKCYAN);
       
        t5.setFont(Font.font ("monotype corsiva",20));
       
       group.getChildren().add(t5);
        
         
                 
           Button obd= new Button("Book Search");
        obd.setPrefSize(100,40);
        obd.setLayoutX(1000);
        obd.setLayoutY(250);
        obd.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        obd.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(obd);
        
        
         Button oed= new Button("Employee Search");
        oed.setPrefSize(100,40);
        oed.setLayoutX(1000);
        oed.setLayoutY(370);
        oed.setStyle("-fx-background-color:lavender; -fx-text-fill: black;");
     
       // oed.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(oed);
        
        
         Button omd= new Button("Member Search");
        omd.setPrefSize(100,40);
        omd.setLayoutX(1000);
        omd.setLayoutY(310);
        omd.setStyle("-fx-background-color:orchid; -fx-text-fill: black;");
     
        omd.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(omd);      
                 
        
        
               omd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneMemberDetailsEmp omd1=new oneMemberDetailsEmp();
                omd1.start(stage);
            }
        });
        
            obd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneBookDetailsEmp obd1=new oneBookDetailsEmp();
                obd1.start(stage);
            }
        });
        
            oed.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                 oneEmpDetails obd1=new oneEmpDetails();
                obd1.start(stage);
            }
        });
            
            
                     
        Button ou= new Button("OverTimeUpdate");
        ou.setPrefSize(150,40);
        ou.setLayoutX(800);
        ou.setLayoutY(600);
        ou.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        ou.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ou);
        
        
         ou.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                overtimeupdate b2=new overtimeupdate();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
            
         
          Button ees= new Button("OneMemberFine");
        ees.setPrefSize(100,40);
        ees.setLayoutX(650);
        ees.setLayoutY(370);
        ees.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        ees.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ees);
        
        
         ees.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                one_mem_fine b2=new one_mem_fine();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
         
       
         Button eei= new Button("Request Delete");
        eei.setPrefSize(100,40);
        eei.setLayoutX(150);
        eei.setLayoutY(490);
        eei.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        eei.setAlignment(Pos.CENTER_LEFT);
        
          group.getChildren().add(eei);
        
        
         eei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                delreq bl=new delreq();
                try {
                    bl.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
       
        
       
        
       /* 
        
         Button eei= new Button("EmpQualification");
        eei.setPrefSize(100,40);
        eei.setLayoutX(450);
        eei.setLayoutY(270);
        eei.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        eei.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(eei);
             
        
      
        
        
         Button id= new Button("Issue Details");
        id.setPrefSize(100,40);
        id.setLayoutX(150);
        id.setLayoutY(450);
        id.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        id.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(id);
        
        
        Button fd= new Button("Fine Details");
        fd.setPrefSize(100,40);
        fd.setLayoutX(300);
        fd.setLayoutY(450);
        fd.setStyle("-fx-background-color:lightcyan; -fx-text-fill: black;");
     
        fd.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(fd);
        
        
       
        
        
        
        
        Button cpe= new Button("ChangePassword");
        cpe.setPrefSize(100,40);
        cpe.setLayoutX(450);
        cpe.setLayoutY(330);
        cpe.setStyle("-fx-background-color:cyan; -fx-text-fill: black;");
     
        cpe.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(cpe);
        
        
        Button ot= new Button("OverTimeShow");
        ot.setPrefSize(100,40);
        ot.setLayoutX(450);
        ot.setLayoutY(390);
        ot.setStyle("-fx-background-color:wheat; -fx-text-fill: black;");
     
        ot.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ot);
        
        
         
        Button ou= new Button("OverTimeUpdate");
        ou.setPrefSize(100,40);
        ou.setLayoutX(450);
        ou.setLayoutY(450);
        ou.setStyle("-fx-background-color:skyblue; -fx-text-fill: black;");
     
        ou.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ou);
        
        
         ou.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                overtimeupdate b2=new overtimeupdate();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
          
        Button ees= new Button("EmpEduShow");
        ees.setPrefSize(100,40);
        ees.setLayoutX(450);
        ees.setLayoutY(510);
        ees.setStyle("-fx-background-color:lightpink; -fx-text-fill: black;");
     
        ees.setAlignment(Pos.CENTER_LEFT);
        group.getChildren().add(ees);
        
        
         ees.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                edushow b2=new edushow();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        
        
         ot.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                overtimeshow b2=new overtimeshow();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        
        

        
        
         eei.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                empeduInsert b2=new empeduInsert();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
         

        
               fd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                fineshow b2=new fineshow();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

        
        
        id.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String product_info="";
             

                
                issueshow b2=new issueshow();
                try {
                    b2.start(stage);
                } catch (Exception ex) {
                    Logger.getLogger(BookLend.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

        
        
  



   
        
       
        

 

        

       */
       
         

        
        
 
       scene=new Scene(group,1400,700,Color.MINTCREAM);
       stage.setScene(scene);
       stage.show();
       
    }
    
    
    
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}


