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

/**
 *
 * @author JOHN
 */
public class Databaseproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //    private Users()
//    {
//    }
    
//    public static Users getInstance()
//    {
//        if (instance == null)
//        {
//            instance = new Users();
//        }
//        return instance;
//    }
   
        boolean success = false;
        String sql = "SELECT * FROM EMPLOYEE";
        
        try{
            Connection con = new OracleDBMS().getConnection();

            PreparedStatement pst = con.prepareStatement(sql);
                                    System.out.println("hello");

            //pst.setString(1, userName);
            //pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                
                 System.out.println(rs.getString(3));
                   System.out.println(rs.getString(4));
                    System.out.println(rs.getString(5));
                      System.out.println(rs.getString(6));
                       System.out.println(rs.getString(7));

            }
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            
        }
        
        
        
        
    }
    
}