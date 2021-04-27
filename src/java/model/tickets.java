/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class tickets {
    
    dbcon con = new dbcon();
    int state = 0;
    Statement statement = null;
    ResultSet resultSet = null;

    public List getSeatNumbers(int avSeats, int passe) {

        List seatList = new ArrayList();
        
        if(passe > 0){
            for(int i = 0; i < passe; i++){
                seatList.add(avSeats);
                avSeats = avSeats - 1;
            }
        }
        return seatList;
    } 
 

    public boolean createTicket(String flightId, String clientID, String seats, String price, String date, String destination, String Fclass) {
        try{
            PreparedStatement ps = con.connection().prepareStatement("INSERT INTO tiskets(flightid,clientid,seatno,price,date,destination,class) VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, flightId);
            ps.setString(2, clientID);
            ps.setString(3, seats);
            ps.setString(4, price);
            ps.setString(5, date);
            ps.setString(6, destination);                                                            
            ps.setString(7, Fclass);
            
            state = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return state == 1;
    }

    public boolean ticketDelete(String ticketid) {
        try{
            PreparedStatement ps = con.connection().prepareStatement("DELETE FROM tiskets WHERE ticketid=?");
            
            ps.setString(1, ticketid);
            
            state = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return state == 1;
    }

    public List getTicket(String userid) throws SQLException {
        List tList = new ArrayList();
        statement = con.connection().createStatement();
        String sql = "SELECT * FROM tiskets WHERE clientid LIKE '" + userid + "'"; 
        resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()){
            tList.add(resultSet.getString("ticketid"));
            tList.add(resultSet.getString("flightid"));
            tList.add(resultSet.getString("seatno"));
            tList.add(resultSet.getString("price"));
            tList.add(resultSet.getString("date"));
            tList.add(resultSet.getString("destination"));
            tList.add(resultSet.getString("class"));
        }
        return tList;
    }
}
