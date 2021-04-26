/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiruna
 */
public class upCheck {
  String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/phoenix";
        Statement st;
    public List viewdata(String uname) {
        
        
           ConnectDB();
               
        List booklist=new ArrayList();
        ConnectDB();
        String query="SELECT * FROM clients where uname LIKE '%"+uname+"%'";
        
            try {
                ResultSet rs = st.executeQuery(query);
                
                
                 while(rs.next())
            {
             
                booklist.add(rs.getString("uname"));
                booklist.add(rs.getString("email"));
                booklist.add(rs.getString("password"));   
            }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(upCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return booklist;
               
           
    }
    
    
      private void ConnectDB() {
       
         try {
             Class.forName(driver);
             Connection con=DriverManager.getConnection(url, "root","");
               st  = con.createStatement();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(unameCheck.class.getName()).log(Level.SEVERE, null, ex);
         }
    
       
            
        
        
       
        
        
        
        
     
    }
}
