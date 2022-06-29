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
public class ovrtime{
    
     int po_id;
     String quan;
     float to_bill;
     float vat_bill;
     
     public ovrtime(){
           this.po_id=0;
       // this.quan=0;
        this.to_bill=0;
        this.vat_bill=0;
     }
     public  ovrtime(int po_id,String quan,float to_bill, float vat_bill){
      
        this.po_id=po_id;
        this.quan=quan;
        this.to_bill=to_bill;
        this.vat_bill=vat_bill;
     }

 
    public void setPo_id(int po_id) {
        this.po_id = po_id;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public void setTo_bill(float to_bill) {
        this.to_bill = to_bill;
    }

    public void setVat_bill(float vat_bill) {
        this.vat_bill = vat_bill;
    }

  
    public int getPo_id() {
        return po_id;
    }

    public String getQuan() {
        return quan;
    }

    public float getTo_bill() {
        return to_bill;
    }

    public float getVat_bill() {
        return vat_bill;
    }
     
     
     
     
  
}