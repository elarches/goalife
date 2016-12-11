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
	<div class="loginpage right">
	
	
	</div>
	<div class="container">
		<form action="logIn.html" method="post">
		<form:errors path="invalid_user" cssClass="errors" />
			<div class="form-group">
	  				<label for="usr">Name:</label>
	  			<input name = "username" type="text" class="form-control" id="usr">
			</div>
			<div class="form-group">
	 			 <label for="pwd">Password:</label>
	 			 <input type="password" name = "password" class="form-control" id="pwd">
			</div>
			<div class="form-group">
	 			 <input type="submit" class = "form-control btn btn-primary">
			</div>
		</form>
	</div>

</body>

</html>