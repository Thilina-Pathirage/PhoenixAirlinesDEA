<%-- 
    Document   : signup
    Created on : Apr 26, 2021, 12:33:01 PM
    Author     : Hiruna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign UP</title>
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
        <link rel="stylesheet" href="signup.css">
        
    </head>
    <body>
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
                  aria-expanded="false"
                  aria-label="Toggle navigation"
                >
                  <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
                  <div class="navbar-nav">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                    <a class="nav-link" href="#">Flights</a>
                    <a class="nav-link" href="#">Pricing</a>
                    <a class="nav-link" href="#">
                        <i class="fas fa-user"></i>
                    </a>
                  </div>
                </div>
          </div>
        </nav>
  
        
        
      <!--Sigjn Up Form-->
        
        
        <!-- Button trigger modal -->


<!-- Modal -->

  <div class="row">
      <center>
      <div class="col-sm-9 col-lg-3">
          
        <div class="loginfrm">
            
            <form action="./signups" method="POST">
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
                 <%=rd%>
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
   

  

  <!-- Submit button -->
  <button type="submit" class="btn btn-dark btn-block mb-4">Sign in</button>


</form>
            
            
        </div>
                     </center>
    </div>
        </div>
        
  
    </body>
</html>
