package com.rich;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Convert extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		double a = Double.parseDouble(req.getParameter("cgpa"));
		
		double percent = a * 9.5; 
		/*
		 * PrintWriter out = res.getWriter();
		 * out.println("The percentage is : "+percent+"%");
		 */
		
		req.setAttribute("div", percent);
		
		RequestDispatcher rd = req.getRequestDispatcher("Div");
		rd.forward(req, res);
	}
}
