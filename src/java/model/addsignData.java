/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hiruna
 */
public class addsignData {

    
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/phoenix";
        Statement st;
    public void addData(String uname, String email, String password) {
      
        
        ConnectDB();
        String query=" INSERT INTO clients(uname,email,password) VALUES ('"+uname+"','"+email+"','"+password+"')" ; 
        
            try {
                st.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(addsignData.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
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
