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
public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String strJSessionId = req.getParameter("JSESSIONID");
		HttpSession ses = req.getSession();
		pw.println("<html>");
		pw.println("<body bgcolor='wheat'>");
		pw.println("<h1>");
		pw.println(ses.getId()+"<br>");
		pw.println(strJSessionId+"<br>");
		pw.println(ses.isNew()+"<br>");
		pw.println("</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
	}
}
