package com.rich;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Percentage2Division extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double percent = (double) req.getAttribute("div");
		String div = "";
		if(percent>=75) {
			div = "1st Division with distinction";
		}
		else if(percent>=60) {
			div = "1st Division";
		}
		else if(percent >= 50) {
			div = "2nd Division";
		}
		else if(percent >= 40) {
			div = "3rd Division";
		}
		else {
			div = "Fail";
		}
		
		PrintWriter out = res.getWriter();
		out.println("Passing status: " + div);
	}
}
