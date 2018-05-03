<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body background="yes.png" >
<center>

<form action="Logging" method="get" style="position:absolute;left:40%;top:40%;background-color:#4286f4">
<fieldset>
<legend>Login</legend>
<table border='0px' width="200" height="200" cellspacing='5' style="border:blue;background:">
	<tr><th>Username: </th>
	<td><input type="text" name="uname"></td>
	</tr>
	
	<tr><th>Password:</th> <td><input type="password" name="pass"><br></td></tr>

	<tr><td align='center' colspan='2'><input type="submit" value="login" style="background-color:red;height:50px;width:100px;font-size:25px"></td></tr>
	</table>
	</fieldset>
</form>

</center>
<form action="register.jsp" style="position:absolute;right:10%;top:10%" >
	<input type="submit" value="Signup" style="background-color:#40E0D0;width:100px;height:50px;color:blue;font-size:25px">
	
</form>
<form action="resul.jsp" style="position:absolute;right:10%;top:80%">
	<input type="submit" value="Registrations" style="background-color:#FFD700;width:130px;height:60px;font-size:20px">
</form> 

</body>
</html>