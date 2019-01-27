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
public class ExistingUserServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<h1>please enter your details</h1>");
		pw.println("<form action='./check' method='post'>");
		pw.println("<table>");
		pw.println("<tr>");
		pw.println("<td>Enter your Name</td>");
		pw.println("<td><input type='text' name='nme'></td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Enter your Password</td>");
		pw.println("<td><input type='password' name='pwd'></td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td colspan='2' align='center'><input type='submit' value='Click Here'></td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
