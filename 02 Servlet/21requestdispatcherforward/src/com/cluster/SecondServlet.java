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

		String strNme = req.getParameter("nme"); // can access request parameter values
		Object e = req.getAttribute("EMAIL"); // getting attribute from request scope
		System.out.println("Value of parameter nme in SecondServlet ####### " + strNme);
		System.out.println("Value of attribute EMAIL in SecondServlet ####### " + e);
		pw.println("<html>");
		pw.println("<body bgcolor='orange'>");
		pw.println("Hello Mr " + strNme + " Your email is " + e + "<br>");
		pw.println("This is from SecondServlet");
		pw.println("</body>");
		pw.println("</html>");
	}
}
