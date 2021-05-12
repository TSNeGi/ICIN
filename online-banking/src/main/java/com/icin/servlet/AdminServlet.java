package com.icin.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icin.hibernate.*;

public class AdminServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher wrongDispatcher = request.getRequestDispatcher("admin.jsp");
		PrintWriter writer = response.getWriter();
		if(request.getParameter("adminUsername").equals(new hibernateUtil().getadminUername()) && request.getParameter("adminPassword").equals(new hibernateUtil().getadminPassword())) {
			
			RequestDispatcher rightDiapatcher = request.getRequestDispatcher("official.jsp"); 
			rightDiapatcher.forward(request,response); 
		} 
		else {
			wrongDispatcher.include(request, response);
			writer.println(" <h3 align=\"left\">Bad Credentials!<h3>");
		}
	}

}

