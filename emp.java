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
public class emp{
    
     int EMP_ID;
     String name;
     String db;
     float wh;
     float ot;
     float sl;
      String jd;
     
     public emp(){
           this.EMP_ID=0;
       // this.quan=0;
        this.ot=0;
        this.wh=0;
        this.sl=0;
     }
     public  emp(int EMP_ID,String name,String db,float wh, float ot,float sl,String jd){
      
        this.EMP_ID=EMP_ID;
        this.name=name;
        this.db=db;
        this.wh=wh;
        this.ot=ot;
         this.sl=sl;
          this.jd=jd;
     }

 
    public void setPo_id(int EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public void setQuan(String name) {
        this.name = name;
    }
     public void setdb(String db) {
        this.db = db;
    }

    public void setwh(float wh) {
        this.wh= wh;
    }

    public void setot(float ot) {
        this.ot = ot;
    }
    public void setsl(float sl) {
        this.sl = sl;
    }
     public void setjd(String jd) {
        this.jd = jd;
    }

  
    public int getEMP_ID() {
        return EMP_ID;
    }

    public String getName() {
        return name;
    }

    public String getDb() {
        return db;
    }

    public float getWh() {
        return wh;
    }
     
       public float getOt() {
        return ot;
    }
     
         public float getSl() {
        return sl;
    }
           public String getJd() {
        return jd;
    }
     
     
  
}
