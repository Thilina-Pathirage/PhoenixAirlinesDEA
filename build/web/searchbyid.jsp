<%-- 
    Document   : searchbyid
    Created on : Apr 27, 2021, 7:22:46 PM
    Author     : Thilina
--%>

<%@page import="model.dbcon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
String userid = (String)request.getParameter("userid");
%>

<html>
    <head>
        <!-- CSS Links -->
        <link rel="stylesheet" href="../home.css">
        
        
        <!-- MDB -->
        <script
          type="text/javascript"
          src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js"
        ></script>
        
        <!-- Font Awesome -->
        <link
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          rel="stylesheet"
        />
        <!-- MDB -->
        <link
          href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css"
          rel="stylesheet"
        />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <br><br>
    <center><h1>Booked Flights</h1></center>
    <br>
    <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>clientid</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Last login</th>
                    <th>IP Address</th>
                   
                </tr>
            </thead>
            
            <%
            try{
            dbcon con = new dbcon();
            statement =con.connection().createStatement();
            String sql = "SELECT * FROM clients WHERE clientid="+ userid +"";
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){%>
            
            <tbody>
                <tr>
                    <td><%=resultSet.getString("clientid")%></td>
                    <td><%=resultSet.getString("uname")%></td>
                    <td><%=resultSet.getString("email")%></td>
                    <td><%=resultSet.getString("password")%></td>
                    <td><%=resultSet.getString("lastlogin")%></td>
                    <td><%=resultSet.getString("ipaddress")%></td>
                </tr>
            </tbody>
            <%
                }
            %>
        </table>
    
    <br> 
    <hr>
    <br>

    <center><h1>Ticket Details</h1></center>
    <br>
             
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>TiketID</th>
                    <th>FlightID</th>
                    <th>ClientID</th>
                    <th>Seat Numbers</th>
                    <th>Price</th>
                    <th>Date</th>
                    <th>Destination</th>
                    <th>Class</th>
                </tr>
            </thead>
            
            <%
            statement =con.connection().createStatement();
            String sql2 = "SELECT * FROM tiskets WHERE clientid="+ userid +"";
            resultSet = statement.executeQuery(sql2);

            while(resultSet.next()){%>
            <tbody>
                <tr>
                    <td><%=resultSet.getString("ticketid")%></td>
                    <td><%=resultSet.getString("flightid")%></td>
                    <td><%=resultSet.getString("clientid")%></td>
                    <td><%=resultSet.getString("seatno")%></td>
                    <td><%=resultSet.getString("price")%></td>
                    <td><%=resultSet.getString("date")%></td>
                    <td><%=resultSet.getString("destination")%></td>
                    <td><%=resultSet.getString("class")%></td>
                </tr>
            </tbody>
            
            <%
                }
            connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }      
            %>
        </table>
        </div>
    </body>
</html>
