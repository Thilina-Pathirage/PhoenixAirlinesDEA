<%-- 
    Document   : logint
    Created on : Apr 23, 2021, 2:51:27 PM
    Author     : Hiruna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
    background-image: url("./images/loginphoto.jpg");
    background-size: cover;
}

h2{
   font-weight: 700;
}

</style>
        
    </head>
    <body>
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
                      <a class="nav-link" href="./signup.jsp">Sign Up</a>
                    
                   
                  </div>
                </div>
          </div>
        </nav>
  
        
        
      <!--Sigjn Up Form-->
        
        
        <!-- Button trigger modal -->


<!-- Modal -->

   <br> <br> <br>
      <center>
      <div class="col-sm-9 col-lg-4 col-md-7">
          
        <div class="loginfrm">
            <% 
        String uname= (String)session.getAttribute("user");
        if(uname==null){%>
        <p style="color:red;"> Please Log in for To do the rest</p>
              <%  }%>
            <form action="./login" method="POST">
        <br>
        <h2>Sign In</h2><br>
        
        <%
               String rs=(String)request.getAttribute("messagethree");
           if(rs==null)
           {
                    rs="";
           }
           
         String rk=(String)request.getAttribute("messagefour");
           if(rk==null)
           {
                    rk="";
           }
       
            
            
            
            %>
            
            
        
        
               
                    <div class="input-group flex-nowrap">
  <span class="input-group-text" id="addon-wrapping"><i class="fas fa-user"></i></span>
  <input type="text" class="form-control"  placeholder="username" aria-label="Username" name="uname"
         aria-describedby="addon-wrapping" />
  
  
          
       
</div>
        
    
       
                          
                           
        
        
        
                    <br>
                    
                              <div class="input-group flex-nowrap">
  <span class="input-group-text" id="addon-wrapping"><i class="fas fa-unlock-alt"></i></span>
  <input type="password" class="form-control" placeholder="password" aria-label="Username"
    aria-describedby="addon-wrapping" name="password" />
     
</div>
                     <p style="color: red;"> <%=rk%></p>
                           <p style="color: red;"> <%=rs%></p>   
   

                            <br>
                          <span>Haven’t created an account yet?</span><a href="./signup.jsp">sign up</a>  
  
                          <br><br>

  <!-- Submit button -->
  <button type="submit" class="btn btn-dark btn-block mb-4">Sign in</button>


</form>
            
            
        </div>
                     </center>
                        <br> <br> <br> <br> <br> <br>
    </div>
                   
     
        
  
            
    
    </body>
</html>
