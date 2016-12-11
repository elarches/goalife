<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<c:if test="${not empty loggedInUser}">
		<div class="page-header">
	  		<h1>Goalife!</h1>
	  		<h2>Welcome, ${loggedInUser.first_name} ${loggedInUser.last_name}!</h2>
	  		<h3>Good Goals Got Gold!</h3>
		</div>
		<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="#">GoaLife!</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Profile</a></li>
        <li><a href="#">My Goals</a></li> 
        <li><a href="#">Goals I Follow</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="logout.html"><span class="glyphicon glyphicon-log-in"></span> Log out</a></li>
      </ul>
    </div>
  </div>
</nav>
	</c:if>
</div>
</body>
</html>