package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ShowAllDetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Cookie[] ck = req.getCookies();

		pw.println("<html><body bgcolor ='pink'><form>");
		for (int i = 0; i < ck.length; i++) {
			pw.println("<h1>" + ck[i].getName() + "......"
					+ ck[i].getValue() + "<br></h1>");
		}
		pw.println("</form></body></html>");
	}

}
