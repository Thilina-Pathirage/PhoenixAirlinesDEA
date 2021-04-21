<%-- 
    Document   : index
    Created on : Apr 13, 2021, 10:30:31 AM
    Author     : User
--%>

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
        
        <!-- CSS Links -->
        <link rel="stylesheet" href="./home.css">
        
        
    </head>
    <body>
        <%@ include file="./navbar.jsp"%>
        
        <div class="parallax-home" >
            <h1 class="main-title" >BOOK A FLIGHT</h1>
        </div>
        <br>
        <br>
        <br>
        
        <center>
            <h2>Book Here</h2>
            <form action="./SearchFlight" method="POST">
            <input type="text" placeholder="destination" name="destination" style="margin-bottom: 5px"> <br>
            <input type="text" placeholder="passengers" name="passengers" style="margin-bottom: 5px"> <br>
            <select name="class" style="margin-bottom: 5px">
                <option value="">Select Class</option>
                <option value="firstclass">firstclass</option>
                <option value="businessclass">businessclass</option>
                <option value="economyclass">economyclass</option>
            </select>
            <br>
            <input type="date" placeholder="Depart Date" name="departDate" style="margin-bottom: 5px"> <br>
           
            <input type="submit" value="Search">
                       
        </form>
        </center>
    
        <br>
        <br>
        <br><br>
        <br>
        <br><br>
        <br>
        <br>
       
    </body>
</html>
