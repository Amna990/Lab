/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tech Inn Traders
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    

   
    Connection conn;
   PreparedStatement pst;
    public static Connection ConnectDb(){
        try{ Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Librarynew","root","");
          return conn;
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
           
        }
    }
    
    
}
