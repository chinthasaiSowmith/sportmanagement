<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="">
<%
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>
<h1 style="font-size:50px">Welcome  ${username}</h1>
<form action="Logout" style="position:absolute;top:10%;right:10%">
	<input type="submit" value="Logout" style="width:80px;height:40px;font-size:20px">
</form>
<form action="Store">
	<label style="font-size:25px;">Athlete name:<input type="text" name="Athlete"></label><br>
	<br><select name="sports" style="font-size:20px">
	<option value="">select option</option>
  <option value="cricket">Cricket</option>
  <option value="hockey">Hockey</option>
  <option value="football">Football</option>
  <option value="basketball">Basketball</option>
   <option value="volleyball">Volleyball</option>
</select><br>
<br><input type="submit" value="submit" style="width:80px;height:40px;font-size:20px"><br>
	
	
</form>
</body>
</html>