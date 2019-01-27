package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ServletContext ctx = getServletContext();
		// getting context attributes
		Object e = ctx.getAttribute("company");
		String strCompName = e.toString();
		
		// getting context parameters
		String strCountry = ctx.getInitParameter("country");
		
		pw.println("<html>");
		pw.println("<body bgcolor='wheat'>");
		pw.println("<h1>Displaying both context attribute value and parameter value </h1>");
		pw.println("Context attribute value is " + strCompName + "<br>");
		pw.println("Context parameter value is " + strCountry);
		pw.println("</body>");
		pw.println("</html>");
	}
}
