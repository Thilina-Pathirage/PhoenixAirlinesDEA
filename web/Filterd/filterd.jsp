<%-- 
    Document   : filterd
    Created on : Apr 13, 2021, 11:41:07 AM
    Author     : User
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.dbcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Font Awesome -->
        <link
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          rel="stylesheet"
        />
        <!-- Google Fonts -->
        <link
          href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
          rel="stylesheet"
        />
        <!-- MDB -->
        <link
          href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css"
          rel="stylesheet"
        />
        
        <!-- MDB -->
        <script
          type="text/javascript"
          src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js"
        ></script>
    
    </head>
    <body>
        <%@ include file="../navbar.jsp" %>
        <%
        String avSeats= (String) request.getAttribute("AVseats");
        String destination = (String) request.getAttribute("Destination");
        String date = (String) request.getAttribute("date");
        String passe = (String) request.getAttribute("passen");
        String Fclass = (String) request.getAttribute("class");
        String totPrice = (String) request.getAttribute("totPrice");
        String FlightId =(String) request.getAttribute("flightID");
        %>
        
        <div class="container mt-5">
            <div class="card">
                <h5 class="card-header">Total Price <%=totPrice%>$</h5>
                <div class="container">
                    <div class="row">
                    <div class="col-lg-6">
                        <div class="card-body">
                            <h5 class="card-title">Sri Lanka to <%=destination%></h5>
                          <p class="card-text">
                            With supporting text below as a natural lead-in to additional content.
                          </p>
                          <form action="./AddTickets" method="POST">
                              <input type="hidden" name="avseats" value="<%=avSeats%>" />
                              <input type="hidden" name="desti" value="<%=destination%>" />
                              <input type="hidden" name="date" value="<%=date%>" />
                              <input type="hidden" name="passe" value="<%=passe%>" />
                              <input type="hidden" name="Fclass" value="<%=Fclass%>" />
                              <input type="hidden" name="price" value="<%=totPrice%>" />
                              <input type="hidden" name="flightId" value="<%=FlightId%>" />
                              
                              <input type="submit" class="btn btn-primary" value="Book your Ticket Now">
                          </form>
                        </div>
                    </div>
                          
                    <div class="col-lg-6">
                        <div class="card-body">
                            <h5 class="card-title"><%=date%></h5>
                          <p class="card-text">
                              <strong>Seats:</strong> <%=passe%> seats from <%=avSeats%> seats
                              
                          </p>
                          <p>
                              <strong>Class:</strong> <%=Fclass%>
                          </p>
                        </div>
                    </div>
                </div>
                </div>
            </div>
        </div>
    </body>
</html>
