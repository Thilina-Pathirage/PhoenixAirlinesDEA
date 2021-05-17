<%-- 
    Document   : admin
    Created on : Apr 13, 2021, 11:40:54 AM
    Author     : User
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
        
        <nav class="navbar navbar-dark bg-dark navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <image src="../images/Logo.png" style="width: 25px; margin-left: 5px;" class="nav-logo"/>
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
                    <a class="nav-link" href="../Flights/flights.jsp">Flights</a>
                    <a class="nav-link " href="../price.jsp">Pricing</a>
            <% 
        String uname= (String)session.getAttribute("user");
        if(uname==null){%>
            <a class="nav-link" href="login.jsp">Login</a> <% }else{
            if(uname.endsWith("0")){%>
            <a class="nav-link" href="../Admin/admin.jsp">
             Dashboard
            </a>
            <% }else if(uname.endsWith("1")){%>
            <a class="nav-link" href="../Staff/staff.jsp">
            
            </a>
            <% }else if(uname.endsWith("2")){%>
            <a class="nav-link" href="../Staff/staff2.jsp">
            <i class="fas fa-user"></i>
            </a>
            <% }else{%>
            <a class="nav-link" href="../Profile/profile.jsp">
            <i class="fas fa-user"></i>
            </a>
            <% }}%>
            <form action="../logout" method="POST">
                <input type="submit" value="Log Out" style="color:black;border-radius:20px;background-color: white;margin: 5px 5px 0px 5px"></form> 
                  </div>
                </div>
          </div>
        </nav>

        <div class="d-flex justify-content-center">
            <br>
        
        <div class="container mt-5">
            <div style="text-align: center" class="row">
            <div class="col-lg-12">
                <h1 style="font-weight: bolder;">Staff Grade One Dashboard</h1>
            </div>
        </div>
            <br>
        
        <div class="row d-flex justify-content-center">
            
            
          </div>
         </div>
        </div>
       
        <div class="container">
                <br> <br>
    <center><h1>Flight Details</h1></center> <form action="../addflight">
        
    </form>
    <br>
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>FlightID</th>
                    <th>Seats 1st Class</th>
                    <th>Seats 2nd Class</th>
                    <th>Seats 3rd Class</th>
                    <th>Destination</th>
                    <th>Date</th>
                    <th>Delete</th>
                </tr>
            </thead>
            
            <%
            try{
            dbcon con = new dbcon();
            statement =con.connection().createStatement();
            String sql = "SELECT * FROM flights";
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){%>
            
            <tbody>
                <tr>
                    <td><%=resultSet.getString("flightid")%></td>
                    <td><%=resultSet.getString("firstclass")%></td>
                    <td><%=resultSet.getString("businessclass")%></td>
                    <td><%=resultSet.getString("economyclass")%></td>
                    <td><%=resultSet.getString("destination")%></td>
                    <td><%=resultSet.getString("date")%></td>
                    <td>
                        <form action="../deleteFlight" method="POST">
                            <input type="hidden" name="flightid" value="<%=resultSet.getString("flightid")%>">
                            <input type="submit" value="Delete" class="btn btn-dark"/>
                        </form>
                    </td>
                </tr>
            </tbody>
            <%
                }
            %>
        </table>
    
    <br> 
    <br>
    <hr>
            <div class="col-xl-12">
             <div class="card" style=" margin: 30px; height: 420px">
                <div class="bg-image hover-overlay ripple" data-mdb-ripple-color="light">

                    <div class="mask" style="background-color: rgba(251, 251, 251, 0.15)"></div>
                </div>
                <div class="card-body">
                    <h5 class="card-title"><strong>Update Flight</strong></h5>
                    <br>
                  
                  <form action="../updateFlight" method="POST">
                      Flight ID
                      <input type="text" class="form-control" placeholder="12003" aria-label="flightid" aria-describedby="addon-wrapping" name="flightid" /> <br>
                      Destination
                      <select name="destination" class="form-select" aria-label="Default select example">
                          <option value="">Select</option>
                          <option value="india">Sri Lanka - India</option>
                          <option value="dubai">Sri Lanka - Dubai</option>
                          <option value="Australia">Sri Lanka - Australia</option>
                      </select> <br>
                      Date
                      <input type="date" class="form-control"  aria-label="Username" aria-describedby="addon-wrapping" name="date" /> <br>
                      <input type="submit" class="btn btn-primary" value="Update"/><br>
                      
                  </form>
                </div>
             </div>
            </div>
    
    <br>
    <hr>
    <br>
            
            <div class="col-xl-12">
             <div class="card" style=" margin: 30px; height: 380px">
                <div class="bg-image hover-overlay ripple" data-mdb-ripple-color="light">
<!--                  <img
                    src="./images/20382870.jpg"
                    class="img-fluid"
                  />-->
                    <div class="mask" style="background-color: rgba(251, 251, 251, 0.15)"></div>
                </div>
                <div class="card-body">
                    <h5 class="card-title"><strong>Add New Flight</strong></h5>
                  <p class="card-text">
                    We a happy to see the your face in our flights
                  </p>
                  <form action="../addFlight" method="POST">
                      Destination
                      <select name="destination" class="form-select" aria-label="Default select example">
                          <option value="">Select</option>
                          <option value="india">Sri Lanka - India</option>
                          <option value="dubai">Sri Lanka - Dubai</option>
                          <option value="Australia">Sri Lanka - Australia</option>
                      </select> <br>
                      Date
                      <input type="date" class="form-control"  aria-label="Username" aria-describedby="addon-wrapping" name="date" /> <br>
                      <input type="submit" class="btn btn-primary" value="Add"/>
                  </form>
                </div>
             </div>
            </div>

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
                    <th>Delete</th>
                </tr>
            </thead>
            
            <%
            statement =con.connection().createStatement();
            String sql2 = "SELECT * FROM tiskets";
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
                    <td>
                        <form action="../deleteTicket" method="POST">
                            <input type="hidden" name="tiketid" value="<%=resultSet.getString("ticketid")%>">
                            <input type="submit" value="Delete" class="btn btn-dark"/>
                        </form>
                    </td>
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

        <br>
        <br>
        
         <div class="container-fluid footer">
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
             <center><p style="color: white"><i class="fas fa-copyright"></i> copyright phoenix airlines 2021</p></center><br>
        </div>
        
        
    </body>
</html>