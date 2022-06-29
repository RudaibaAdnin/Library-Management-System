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
public class memreq{
    
     int book_id;
     String book_name;
     String cat_id;
     String amnt;
     
     public memreq(){
           this.book_id=0;
       // this.quan=0;
        //this.cat_id=0;
        //this.amnt=0;
     }
     public  memreq(int book_id,String book_name,String cat_id,String amnt){
      
        this.book_id=book_id;
        this.book_name=book_name;
        this.cat_id=cat_id;
        
        this.amnt=amnt;
     }

 
    public void setbook_id(int po_id) {
        this.book_id = po_id;
    }

    public void setbookName(String quan) {
        this.book_name = quan;
    }

    public void setTo_bill(String to_bill) {
        this.cat_id = to_bill;
    }

    public void setVat_bill(String vat_bill) {
        this.amnt= vat_bill;
    }

  
    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getCat_id() {
        return cat_id;
    }

    public String getAmnt() {
        return amnt;
    }
     
     
     
     
  
}
