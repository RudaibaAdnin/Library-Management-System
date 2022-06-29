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
public class isbn{
    
     int book_id;
     String book_name;
     int cat_id;
     int amnt;
     
     public isbn(){
           this.book_id=0;
       // this.quan=0;
        this.cat_id=0;
        this.amnt=0;
     }
     public  isbn(int book_id,String book_name){
      
        this.book_id=book_id;
        this.book_name=book_name;
        //this.cat_id=cat_id;
        
        //this.amnt=amnt;
     }

 
    public void setbook_id(int po_id) {
        this.book_id = po_id;
    }

    public void setbookName(String quan) {
        this.book_name = quan;
    }



  
    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

     
     
     
     
  
}
