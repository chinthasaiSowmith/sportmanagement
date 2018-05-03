package com.sports;

import java.sql.*;
import javax.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
try
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
try
{
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/sports";
	String username = "root";
	String password = "";
Connection con = DriverManager.getConnection(url, username, password);
Statement st=con.createStatement();
String z=req.getParameter("sport");
String sql="select * FROM registrations WHERE Sport='"+z+"'";
out.println("<h1>Registrations</h1>");
ResultSet rs=st.executeQuery(sql);
out.println("<center>");
out.println("<table border='1' width=150px height=50px cell-padding='0'>");
out.println("<tr>");
out.println("<th>NAME</th>");
out.println("<th>SPORT</th>");
out.println("</tr>");
out.println("</center>");
while(rs.next())
{
String ename=rs.getString("Username");
String dept=rs.getString("Sport");
out.println("<tr>");
out.println("<td>"+ename+"</td>");
out.println("<td>"+dept+"</td>");
out.println("</tr>");
}
out.println("</table>");
out.println("<form action=\"Logout\" style=\"position:absolute;top:10%;right:10%\">\r\n" + 
		"	<input type=\"submit\" value=\"Home\" style=\"width:60pxpx;height:30px;font-size:20px\">\r\n" + 
		"</form>");
}//try
catch(ClassNotFoundException cnfe)
{
 out.println("class not found");
}
}//try
catch(SQLException se)
{
throw new RuntimeException("not connected",se);
}//catch
}//doPost
}//main class
