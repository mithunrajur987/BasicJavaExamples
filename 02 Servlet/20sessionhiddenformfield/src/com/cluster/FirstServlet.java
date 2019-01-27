package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FirstServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String strEmail = req.getParameter("email");
		
		HttpSession ses = req.getSession();
		pw.println("<html>");
		pw.println("<body bgcolor='pink'>");
		pw.println("<h1>");
		pw.println("Email is " + strEmail + "<br></h1>");
		pw.println("<form action='two'>");
		pw.println("<input type='hidden' name='JSESSIONID' value =" + ses.getId() +">");
		pw.println("<input type='submit' value='CLICK HERE'>" );
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
