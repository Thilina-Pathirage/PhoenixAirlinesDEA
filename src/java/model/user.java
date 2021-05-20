/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Thilina
 */
public class user {
    
    dbcon con = new dbcon();
    int state = 0;
    Statement statement = null;
    ResultSet resultSet = null;

    public boolean addAdmin(String uname, String email, String pwd) {
        
         try{
            PreparedStatement ps = con.connection().prepareStatement("INSERT INTO clients(uname,email,password) VALUES(?, ?, ?)");
            ps.setString(1, uname);
            ps.setString(2, email);
            ps.setString(3, pwd);

            state = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return state == 1;
        
        
    }

    public boolean updateUser(String namess, String cTime, String ip) {
        
        try{
            PreparedStatement ps = con.connection().prepareStatement("UPDATE clients SET lastlogin =?, ipaddress =? WHERE uname =?");
            ps.setString(1, cTime);
            ps.setString(2, ip);
            ps.setString(3, namess);
            
            state = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return state == 1;
    }
    
}
