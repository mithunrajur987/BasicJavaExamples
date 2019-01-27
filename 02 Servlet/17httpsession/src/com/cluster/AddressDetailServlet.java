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
public class AddressDetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String strStreet = req.getParameter("street");
		String strCity = req.getParameter("city");
		String strState = req.getParameter("state");
		String strCountry = req.getParameter("country");

		HttpSession ses = req.getSession();
	//	ses.setMaxInactiveInterval(10);

		ses.setAttribute("STREET", strStreet);
		ses.setAttribute("CITY", strCity);
		ses.setAttribute("STATE", strState);
		ses.setAttribute("COUNTRY", strCountry);
	//	ses.invalidate();

		pw.println("<html><body bgcolor='orange'>");
		pw.println("<form action='./show' method='get'>");
		pw.println("<input type ='submit' value='CLICK TO SEE ALL DETAILS'>");
		pw.println("</form></body></html>");
	}
}
