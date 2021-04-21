/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class dbcon {
    public Connection connection(){
        
        String driver= "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/phoenix";
        Connection con = null;

        try {
            Class.forName(driver);
             con = DriverManager.getConnection(url,"root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return con;
    }
}
