package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
		
		HttpSession ses = req.getSession(false);
		long lngTime = ses.getLastAccessedTime();
		
		pw.println("<html>");
		pw.println("<body bgcolor='pink'>");
		pw.println("<form action='./three'>");
		pw.println("Session is new "+ses.isNew()+"<br>");
		pw.println("Session id is "+ses.getId()+"<br>");
		pw.println("Session last accessed time is " + lngTime+"<br>");
		pw.println("Session last accessed time is "+ new Date(ses.getLastAccessedTime())+"<br>");
		pw.println("Session created time is " +new Date(ses.getCreationTime())+"<br>");
		pw.println("Session max inactive interval time is "+ses.getMaxInactiveInterval()+"<br>");
		pw.println("<input type='submit' value='THIRD'>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
