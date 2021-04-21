<%-- 
    Document   : navbar
    Created on : Apr 18, 2021, 12:58:27 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<style>
    .nav-logo{
    width: 25px;
    margin-left: 5px;
}
</style>

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

