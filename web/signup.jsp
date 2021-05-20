<%-- 
    Document   : Login
    Created on : Apr 17, 2021, 1:06:11 PM
    Author     : Hiruna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <!-- Font Awesome -->
        <link
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
          rel="stylesheet"
        />
        <!-- Google Fonts -->
      
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
      
        
    </head>
    <body>
        
    
     <style>
 .nav-logo{
    width: 25px;
    margin-left: 5px;}
    
    
.loginfrm{
  
    padding: 20px;
    margin: 20px;
    border-radius: 14px;
   
    box-shadow: 3px 3px 25px 5px rgba(0,0,0,0.4);
    
    height: auto;
    padding: 60px 60px 60px 60px;
}

.new{
    width: 100%;
    height: auto;
    background-image: url("./images/signphoto.jpg");
    background-size: cover;
}

h2{
   font-weight: 700;
}




</style>
<div class="new">   
     
<nav class="navbar navbar-dark bg-dark navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <image src="./images/Logo.png" class="nav-logo"/>
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
            <a class="nav-link active"  href="./index.jsp">Home</a>
            <a class="nav-link" href="#">Flights</a>
            <a class="nav-link" href="#">Pricing</a>
            <a class="nav-link" href="login.jsp">Login</a>
          
          </div>
        </div>
  </div>
</nav>


        
         <br> <br> <br> 
      <!--Sigjn Up Form-->
        
        
        <!-- Button trigger modal -->


<!-- Modal -->


      <center>
      <div class="col-sm-9 col-lg-4 col-md-7">
          
        <div class="loginfrm">
            
            <form action="./signup" method="POST">
        <br>
        <h2>Sign Up</h2><br>
               
                    <div class="input-group flex-nowrap">
  <span class="input-group-text" id="addon-wrapping"><i class="fas fa-user"></i></span>
  <input type="text" class="form-control"  placeholder="username" aria-label="Username" name="uname"
         aria-describedby="addon-wrapping" />
  
   <%
            
       
      String rd=(String)request.getAttribute("messageOne");
           if(rd==null)
           {
                    rd="";
           }
           
         String rt=(String)request.getAttribute("messageTwo");
           if(rt==null)
           {
                    rt="";
           }
       
            
            
            
            %>
          
       
</div>
            <p style="color: red;"><%=rd%></p> 
                 <p style="color: red;"> <%=rt%></p>
        
          
                               
                                        <div class="input-group flex-nowrap">
  <span class="input-group-text" id="addon-wrapping"><i class="fas fa-envelope"></i></span>
  <input type="email" class="form-control" placeholder="Email" aria-label="Username"
    aria-describedby="addon-wrapping" name="email" />
</div>
                          
                          
                           
        
        
        
                    <br>
                    
                              <div class="input-group flex-nowrap">
  <span class="input-group-text" id="addon-wrapping"><i class="fas fa-unlock-alt"></i></span>
  <input type="password" class="form-control" placeholder="password" aria-label="Username"
    aria-describedby="addon-wrapping" name="password" />
</div>
                          <br>
   

     <span>Have you already account </span><a href="./login.jsp">Login</a>  
    <br>    <br>
  <!-- Submit button -->
  <button type="submit" class="btn btn-dark btn-block mb-4">Sign Up</button>


</form>
            
            
        </div>
                    
    </div>
        <br> <br> <br> <br> 
        </div>
  
            
    
 
        
        
    </body>
</html>
