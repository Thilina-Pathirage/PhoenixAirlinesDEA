/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class flights {
    dbcon con = new dbcon();
    int state = 0;
    Statement statement = null;
    ResultSet resultSet = null;

    public List searchFlight(String desti) throws SQLException {
        List searchList = new ArrayList();
        statement = con.connection().createStatement();
        String sql = "SELECT * FROM flights WHERE destination LIKE '" + desti + "'"; 
        resultSet = statement.executeQuery(sql);
        
        while(resultSet.next()){
            searchList.add(resultSet.getString("flightid"));
            searchList.add(resultSet.getString("firstclass"));
            searchList.add(resultSet.getString("businessclass"));
            searchList.add(resultSet.getString("economyclass"));
            searchList.add(resultSet.getString("destination"));
            searchList.add(resultSet.getString("date"));
        }
        return searchList;
    }
    
}
