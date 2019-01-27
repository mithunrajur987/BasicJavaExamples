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
public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ServletContext ctx = getServletContext();
		
		// setting attribute value
		ctx.setAttribute("company","IBM");
		
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<form action='./sec'>");
		pw.println("<h1>Please click here to go to Second Servlet</h1>");
		pw.println("<center><input type='submit' value='SECOND'></center>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
