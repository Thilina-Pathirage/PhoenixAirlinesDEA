<%-- 
    Document   : flights
    Created on : Apr 13, 2021, 11:41:18 AM
    Author     : User
--%>

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
        
        <link rel="stylesheet" href="./flights.css">
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
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
          <div class="navbar-nav">
            <a class="nav-link " aria-current="page" href="../index.jsp">Home</a>
            <a class="nav-link active" href="#">Flights</a>
            <a class="nav-link" href="#">Pricing</a>
            <a class="nav-link" href="#">
                <i class="fas fa-user"></i>
            </a>
          </div>
        </div>
  </div>
</nav>

       <div class="flight">
           <center><h1> Lorem ipsum </h1></center>
           <center> <p>Some quick example text to build on the card title and make up the bulk of the card's content.<br>Some quick example text <br>to build on the card title and make up the bulk of the card's content.</p></center><br> 
           <div class="row">
               
               <div class="col-lg-4 col-md-6 col-sm-12"> 
           
                <div class="card crd">
                 <img src="../images/india.png" class="card-img-top" alt="...">
                 <div class="card-body" >
                   <h4 class="card-title">Sri Lanka To India</h4>
                   <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                 </div>
                 <h5 class="card-title" style="padding-left: 15px">Facilities</h5>
                 <table class="table" style="background-color: rgba(255,255,255,0.6);">
                    <thead>
                      <tr>

                        <th scope="col">First Class</th>
                        <th scope="col">Business Class</th>
                        <th scope="col">Economy Class</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>

                    </tbody>
                  </table>
                 <h5 class="card-title" style="padding-left: 15px">Common Facilities</h5>
                 <ul class="list-group list-group-flush" style="padding-left: 20px;">
                   <li class="list-group-item">An item</li>
                   <li class="list-group-item">A second item</li>
                   <li class="list-group-item">A third item</li>
                 </ul>
                 <div class="card-body">
                   <a href="../index.jsp" ><button type="submit" class="btn btn-dark" style="width: 100%"> Reserve </button></a>
                 </div>
               </div>
               
               </div>
               
               <div class="col-lg-4 col-md-6 col-sm-12"> 
           
                <div class="card crd">
                 <img src="../images/dubai.jpg" class="card-img-top" alt="...">
                 <div class="card-body" >
                   <h4 class="card-title">Sri Lanka To Dubai</h4>
                   <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                 </div>
                 <h5 class="card-title" style="padding-left: 15px">Facilities</h5>
                 <table class="table" style="background-color: rgba(255,255,255,0.6);">
                    <thead>
                      <tr>

                        <th scope="col">First Class</th>
                        <th scope="col">Business Class</th>
                        <th scope="col">Economy Class</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>

                    </tbody>
                  </table>
                 <h5 class="card-title" style="padding-left: 15px">Common Facilities</h5>
                 <ul class="list-group list-group-flush" style="padding-left: 20px">
                   <li class="list-group-item">An item</li>
                   <li class="list-group-item">A second item</li>
                   <li class="list-group-item">A third item</li>
                 </ul>
                 <div class="card-body">
                   <a href="../index.jsp" ><button type="submit" class="btn btn-dark" style="width: 100%"> Reserve </button></a>
                 </div>
               </div>
               
               </div>
               
               <div class="col-lg-4 col-md-6 col-sm-12"> 
           
                <div class="card crd">
                 <img src="../images/aus.jpg" class="card-img-top" alt="...">
                 <div class="card-body" >
                   <h4 class="card-title">Sri Lanka To Australia</h4>
                   <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                 </div>
                 <h5 class="card-title" style="padding-left: 15px">Facilities</h5>
                 <table class="table" style="background-color: rgba(255,255,255,0.6);">
                    <thead>
                      <tr>

                        <th scope="col">First Class</th>
                        <th scope="col">Business Class</th>
                        <th scope="col">Economy Class</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>
                      <tr>
                        <td>An item</td>
                        <td>A second item</td>
                        <td>A third item</td>
                      </tr>

                    </tbody>
                  </table>
                 <h5 class="card-title" style="padding-left: 15px">Common Facilities</h5>
                 <ul class="list-group list-group-flush" style="padding-left: 20px">
                   <li class="list-group-item">An item</li>
                   <li class="list-group-item">A second item</li>
                   <li class="list-group-item">A third item</li>
                 </ul>
                 <div class="card-body">
                   <a href="../index.jsp" ><button type="submit" class="btn btn-dark" style="width: 100%"> Reserve </button></a>
                 </div>
               </div>
               
               </div>   
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


