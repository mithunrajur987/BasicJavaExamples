package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		String strNme = req.getParameter("nme");
		System.out.println("Value of parameter in FirstServlet ******** " + strNme);
		
		String strEmail = "ravi@clusterindia.com";
		req.setAttribute("EMAIL", strEmail); // setting attribute in request scope
		
		RequestDispatcher rd  = req.getRequestDispatcher("scd");
		rd.forward(req, res);
	}
}
