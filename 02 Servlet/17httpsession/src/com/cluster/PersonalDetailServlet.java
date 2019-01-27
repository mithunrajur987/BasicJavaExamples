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
public class PersonalDetailServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String strFirstName = req.getParameter("firstName");
		String strSecondName = req.getParameter("secondName");
		String strAge = req.getParameter("age");
		String strPhone = req.getParameter("phone");

		HttpSession ses = req.getSession();

		ses.setAttribute("FIRST_NAME", strFirstName);
		ses.setAttribute("SECOND_NAME", strSecondName);
		ses.setAttribute("AGE", strAge);
		ses.setAttribute("PHONE", strPhone);

		pw.println("<html>");
		pw.println("<body bgcolor='orange'>");
		pw.println("<form action='./prof' method='get'>");
		pw.println("<center><h2>PROFFESIONAL DETAILS</center>");
		pw.println("<table>");
		pw.println("<tr><td>Enter your current company name</td>");
		pw.println("<td><input type='text' name='companyName'></td></tr>");
		pw.println("<tr><td>Enter your previous company name</td>");
		pw.println("<td><input type='text' name='prevComp'></td></tr>");
		pw.println("<tr><td>Enter your current salary</td>");
		pw.println("<td><input type='text' name='salary'></td></tr>");
		pw.println("<tr><td>Enter your expected salary</td>");
		pw.println("<td><input type='text' name='expectedSal'></td></tr>");
		pw.println("<tr><td><input type='submit' value='Submit'></td></tr>");
		pw.println("</form></body></html>");
	}

}
