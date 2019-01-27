package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String strNme = req.getParameter("nme"); // cannot access previous request values
		System.out.println("Value of parameter nme in SecondServlet ####### " + strNme);
		pw.println("<html>");
		pw.println("<body bgcolor='green'>");
		pw.println("Printing from SecondServlet");
		pw.println("This is output from SecondServlet <br>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
