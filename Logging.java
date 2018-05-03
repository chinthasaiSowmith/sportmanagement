package com.sports;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logging.dao.LoginDao;

/**
 * Servlet implementation class Logging
 */
@WebServlet("/Logging")
public class Logging extends HttpServlet {
	
	
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = response.getWriter();
			 String name = request.getParameter("uname");
			  String password = request.getParameter("pass");
			  
			  LoginDao dao=new LoginDao();
			  
			  
			  
			 if(dao.check(name, password))
			  {
				  HttpSession session=request.getSession();
				  session.setAttribute("username", name);
				  
				  response.sendRedirect("welcome.jsp");
				 
			  }
			  else
			  {
				  RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				   out.println("<font color=red>Invalid username or password.To create new account click on register</font>");
				   rd.include(request, response);
				 // response.sendRedirect("login.jsp");
				  
			  }
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		}
		
}

