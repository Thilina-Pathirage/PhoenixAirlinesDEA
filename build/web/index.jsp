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
        <title>Phoenix Airline</title>
        
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
            <h2 class="main-title" >PHOENIX AIRLINES </h2>
            <div class="row justify-content-center">
                <div class="col-xl-6 col-lg-6 col-sm-12 form1">
                    <form action="./SearchFlight" method="POST">
                    <div class="row">
                        <div class="col-lg-6 col-sm-12">
                            <label style="color: white">Destination</label><br>
                            <select name="destination" class="dropdown" required >
                                <option value="">Destination</option>
                                <option value="india">Sri lanka - India</option>
                                <option value="australia">Sri Lanka - Australia</option>
                                <option value="dubai">Sri Lanka - Dubai</option>
                            </select>
                        </div>
                        <div class="col-lg-6 col-sm-12">
                            <label style="color: white">Class</label><br>
                            <select name="class" class="dropdown" required >
                                <option value="">Class</option>
                                <option value="firstclass">First Class</option>
                                <option value="businessclass">Business Class</option>
                                <option value="economyclass">Economy Class</option>
                            </select>
                        </div>
                    </div><br><br>
                    
                    <div class="row">
                        <div class="col-lg-6 col-sm-12">
                            <label style="color: white">Number of passengers</label><br>
                            <input type="text" placeholder="Number of passengers"  name="passengers" class="dropdown" style="width: 70%" required>
                          
                        </div>
                        <div class="col-lg-6 col-sm-12">
                            <label style="color: white">Departure Date</label><br>
                            <input type="date"  name="departDate" class="dropdown" style="width: 70%;" required> 
                        </div>
                        
                    </div><br><br>
              
                            <center><button type="submit" class="btn btn-dark" style="width: 200px"> SEARCH </button></center>
                  
                    </form>

                </div>
            </div> 
        </div> 
        
        
        <div class="cont"> 
            <image src="./images/logo2.jpg" class="body-logo"/><br><br>
            <h1 class="header">Fly With Phoenix...</h1>
            <h3 class="slog">Find islands' best offers with SriLankan Holidays</h3><br>
            <p class="content">Discover a range of holiday deals in Sri Lanka with Sri Lankan Airlines including hotel offers,<br> special rates for charter of flights and yachts and exclusive spas</p>
            
            
        </div>
        
        
        <div class="container">
            <div class="row row-cols-1 row-cols-md-3 g-4" style="margin: -100px 0px 100px 0px">
                    <div class="col">
                      <div class="card h-100">
                        <img
                          src="./images/seats.jpg"
                          class="card-img-top"
                          alt="..."
                        />
                        <div class="card-body">
                          <h5 class="card-title">Comfortable</h5>
                          <p class="card-text">
                            This is a wider card with supporting text below as a natural lead-in to
                            additional content. This content is a little bit longer.
                          </p>
                        </div>

                      </div>
                    </div>
                    <div class="col">
                      <div class="card h-100">
                        <img
                          src="./images/service.jpg"
                          class="card-img-top"
                          alt="..."
                        />
                        <div class="card-body">
                          <h5 class="card-title">Best Customer Service</h5>
                          <p class="card-text">
                            This card has supporting text below as a natural lead-in to additional
                            content.
                          </p>
                        </div>

                      </div>
                    </div>
                    <div class="col">
                      <div class="card h-100">
                        <img
                          src="./images/cost.jpg"
                          class="card-img-top"
                          alt="..."
                        />
                        <div class="card-body">
                          <h5 class="card-title">Cost Effective</h5>
                          <p class="card-text">
                            This is a wider card with supporting text below as a natural lead-in to
                            additional content. This card has even longer content than the first to show
                            that equal height action.
                          </p>
                        </div>

                      </div>
                    </div>
                  </div>
        </div>
        <div class="cont"> 
            
            <h1 class="header">Lorem Ipsum...</h1>
            <h3 class="slog">Lorem Ipsum is simply dummy text of the printing and typesetting</h3><br>
            <p class="content">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. <br>It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularise</p>
            
            
        </div>
        
        <div class="container-fluid footer">
            <div class="row">
                <div class="col-lg-4 col-sm-12" style="text-align: center;color: white">
                   <image src="./images/logo2.jpg" class="footer-logo"/>
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
            <center><p style="color: white"><i class="fas fa-copyright"></i> copyright phoenix airlines 2021</p></center><br>
        </div>
        
       
    </body>
</html>
