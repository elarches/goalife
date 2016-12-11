<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>

<head>
	<script  type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.0.0.min.js"> </script>
	<meta charset="UTF-8">
</head>

<body>
	<h1> Create a new account </h1>	
	<form:form method="post" action="${pageContext.request.contextPath}/validateNewAccountForm.html">
		<table> 			
		<tr>		
			<td> <form:label path="first_name"> First Name </form:label> </td>
			<td> <form:input path="first_name"/> </td>
		</tr>
		
		<tr>		
			<td></td>
			<td> <form:errors path="first_name"/></td>
		</tr>
		
		<tr>
			<td> <form:label path="last_name"> Last Name </form:label> </td>
			<td> <form:input path="last_name"/> </td>
		</tr> 	
		
		<tr>		
			<td></td>
			<td> <form:errors path="last_name"/> </td>
		</tr>		
		
		<tr>
			<td> <form:label path="email"> Email </form:label> </td>
			<td> <form:input path="email"/> </td>
		</tr>
		
		<tr>		
			<td></td>
			<td> <form:errors path="email"/> </td>
		</tr>		
		
		<tr>
			<td> <form:label path="password"> Password </form:label> </td>
			<td> <form:password path="password"  class="password-field"/> </td>
		</tr>
		
		<tr>		
			<td></td>
			<td> <form:errors path="password" /> </td>
		</tr>		
		
		
		<tr>
			<td> <form:label path="confirmPassword"> Confirm Password </form:label> </td>
			<td> <form:password path="confirmPassword"  class="password-field"/> </td>			
		</tr>

		<tr>		
			<td></td>
			<td> <form:errors path="confirmPassword"/> </td>
		</tr>
		
		<tr>
			<td> <form:label path="city"> City</form:label> </td>
			<td> <form:input path="city"/> </td>		
		</tr>
		
		<tr>		
			<td></td>
			<td> <form:errors path="city"/> </td>
		</tr>
		
		<tr>	
			<td> <form:label path="country"> Country </form:label> </td>
			<td> <form:input path="country"/> </td>		
		</tr>

		<tr>		
			<td></td>
			<td> <form:errors path="country"/> </td>
		</tr>
		
		</table>
		<input type="submit" value="Submit Edited the Award Nomination Form" name="edit2" id="form-submit"/>
		
	</form:form>
	
	<a href="/"> Back to Login </a>
	
	<div id="password-status"> </div>
</body>

<script>
$(".password-field").keyup(passwordChecker);

function passwordChecker() {
    if ( $("[name='password']").val() != $("[name='confirmPassword']").val() ){ 
        $("#form-submit").attr('disabled',"true");
     	$("#password-status").html('Passwords do not match');
    }
    else {
        $("#form-submit").removeAttr('disabled');
        $("#password-status").html('');   
    }
}
</script>
</html>