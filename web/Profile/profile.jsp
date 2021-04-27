<%-- 
    Document   : profile
    Created on : Apr 13, 2021, 11:40:44 AM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="model.tickets"%>
<% 
    
        String uname= (String)session.getAttribute("user");
        if(uname!=null){%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        
        <link rel="stylesheet" href="./profile.css">
        <link rel="stylesheet" href="../home.css">
    
    </head>
    <body>
       <style>
    .nav-logo{
    width: 25px;
    margin-left: 5px;
}
</style>

<nav class="navbar navbar-dark bg-dark navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <image src="../images/Logo.png" class="nav-logo"/>
            <span class="nav-name"> Phoenix Airlines </span>
        </a> 
        <button
          class="navbar-toggler"
          type="button"
          data-mdb-toggle="collapse"
          data-mdb-target="#navbarNavAltMarkup"
          aria-controls="navbarNavAltMarkup"
         
          aria-label="Toggle navigation"
        >
          <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <a class="nav-link " href="../index.jsp">Home</a>
            <a class="nav-link active" href="#">Flights</a>
            <a class="nav-link" href="#">Pricing</a>
            <form action="../logout" method="POST">
                <input type="submit" value="Log Out" style="color:black;border-radius:20px;background-color: white;margin: 5px 5px 0px 5px"></form> 
            <a class="nav-link" href="#">
                <i class="fas fa-user"></i>
            </a>
            
          </div>
        </div>
  </div>
</nav>
<% 
String name= (String)session.getAttribute("user");
String mail= (String)session.getAttribute("mail");
String last= (String)session.getAttribute("last");
String ip= (String)session.getAttribute("ip");

String tickect =(String) session.getAttribute("ticket");
              String flight = (String) session.getAttribute("flight");
              String seat = (String) session.getAttribute("seat");
              String price = (String) session.getAttribute("price");
              String date = (String) session.getAttribute("date");
              String desti = (String) session.getAttribute("desti");
              String cls = (String) session.getAttribute("cls");


%>
       <div class="prof">
           <center><h1>Welcome <%= name%> ... </h1>
           <h5>Profile details</h5></center>
           <br> 
           <div class="row"><center>
               <div class="col-lg-6 col-sm-12">
                   <table class="table " style="text-align:center;">
                       <thead>
                        <tr>
                          
                          <th scope="col">User Name</th>
                          <th scope="col"><%= name %></th>
                          
                        </tr>
                      </thead>
                     
                        <tr>
                          
                          <th scope="col">E mail</th>
                          <th scope="col"><%= mail%></th>
                          
                        </tr>
                      
                      
                        <tr>
                          
                          <th scope="col">Last Login</th>
                          <th scope="col"><%= last%></th>
                          
                        </tr>
                      
                        <tr>
                          
                          <th scope="col">IP Address</th>
                          <th scope="col"><%= ip%></th>
                          
                        </tr>
                      
                   </table>
                          <br>
                   <h5>Profile details</h5></center>
           <br> 
                   <table class="table " style="text-align:center;">
                       <thead>
                        <tr>
                          
                          <th scope="col">User Name</th>
                          <th scope="col">Flight</th>
                          <th scope="col">Seats</th>
                          <th scope="col">Price</th>
                          <th scope="col">Date</th>
                          <th scope="col">Destination</th>
                          <th scope="col">Class</th>
                          
                        </tr>
                      </thead>
                      <tr>
                          <td><%= name %></td>
                          <td><%= flight %></td>
                          <td><%= seat %></td>
                          <td><%= price %></td>
                          <td><%= date %></td>
                          <td><%= desti %></td>
                          <td><%= cls %></td>
                      </tr>
                      
                   </table>
                   
               </div>
               
           </div>
      
               
       

<div class="container-fluid footer" >
            <div class="row">
                <div class="col-lg-4 col-sm-12" style="text-align: center;color: white">
                   <image src="../images/logo2.jpg" class="footer-logo"/>
                   <h6>Phoenix Airlines</h6>
                   <p>Find islands' best offers with SriLankan Holidays</p>
                </div>
                <div class="col-lg-4 col-sm-12"><br>
                    <form>

                        <!-- Email input -->
                        <div>
                          <label style="color: white">Email address</label>
                          <input type="email"  class="dropdown" />
                        </div>

                        <!-- Message input -->
                        <div>
                          <label style="color: white">Message</label>
                          <textarea class="dropdown"  rows="2"></textarea>
                        </div><br>

                        <!-- Submit button -->
                        <button type="submit" class="btn btn-light btn-block mb-4" style="width: 200px">Send</button>
                    </form>
                </div>
                <div class="col-lg-4 col-sm-12" style="text-align: right; color: white;padding: 40px 70px 0px 0px">
                    <p>+94 152 524 45 &nbsp;<i class="fas fa-phone"></i></p>
                    <p>phoenixairlines@gmail.com &nbsp;<i class="fas fa-envelope-square"></i></p>
                    <p>NO.25, Pitipana South , Homagama &nbsp; <i class="fas fa-home"></i></p><br><br>
                    <span><i class="fab fa-facebook fa-2x"></i>&nbsp;&nbsp;<i class="fab fa-twitter fa-2x"></i>&nbsp;&nbsp;<i class="fab fa-linkedin fa-2x"></i>&nbsp;&nbsp;<i class="fab fa-instagram fa-2x"></i></span>
                </div>
                
            </div>
            <center><p style="color: white;margin: 10px"><i class="fas fa-copyright"></i> copyright phoenix airlines 2021</p></center><br>
        </div>
    </body>
</html>
<% }else{
            
            response.sendRedirect("../login.jsp");
        }%>


