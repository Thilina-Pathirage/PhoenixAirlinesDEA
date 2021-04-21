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
public class prices {

    dbcon con = new dbcon();
    int state = 0;
    Statement statement = null;
    ResultSet resultSet = null;
    
    public List getPrice(String desti, String Fclass) throws SQLException {
        List priceList = new ArrayList();
        statement = con.connection().createStatement();
        String sql2 = "SELECT * FROM prices WHERE destination LIKE '" + desti + "' AND class LIKE '" + Fclass + "'"; 
        resultSet = statement.executeQuery(sql2);
        
        while(resultSet.next()){
            priceList.add(resultSet.getString("priceid"));
            priceList.add(resultSet.getString("destination"));
            priceList.add(resultSet.getString("class"));
            priceList.add(resultSet.getString("price"));
        }
        return priceList;
    }

    public void calTotal(String pass, float priceForEach) {
        prices gp = new prices();
    }
    
}
