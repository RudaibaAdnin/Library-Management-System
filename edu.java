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
public class edu{
    
     int book_id;
     String book_name;
     String cat_id;
     String amnt;
     String jd;
     String bd;
     String fa;
     String sy;
     String sg;
     String hy;
     String hg;
     String gy;
     String gg;
          
     
     public edu(){
           this.book_id=0;
       // this.quan=0;
        //this.cat_id=0;
        //this.amnt=0;
     }
     public  edu(int book_id,String book_name,String cat_id, String amnt,String  jd,String bd,String fa,String sg,String hy,String hg,String gy){
      
        this.book_id=book_id;
        this.book_name=book_name;
        this.cat_id=cat_id;
        
        this.amnt=amnt;
        this.jd=jd;
        
        this.bd=bd;
        this.fa=fa;
        this.hg=hg;
        this.gg=gg;
        this.sg=sg;
        this.hy=hy;
        this.gy=gy;
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
     public void setJD(String JD) {
        this.jd= JD;
    }
      public String getJD() {
        return jd;
    }
      
       public void setBD(String BD) {
        this.bd= BD;
    }
      public String getBD() {
        return bd;
    }
      
      public void setFA(String fa) {
        this.fa= fa;
    }
      public String getFA() {
        return fa;
    }
    
      public void setSG(String sg) {
        this.sg= sg;
    }
      public String getSG() {
        return sg;
    }
       public void setHY(String hy) {
        this.hy= hy;
    }
      public String getHY() {
        return hy;
    }
       public void setHG(String hg) {
        this.hg= hg;
    }
      public String getHG() {
        return hg;
    }
       public void setGY(String gy) {
        this.gy= gy;
    }
      public String getGY() {
        return gy;
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
