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
public class ProfessionalDetailServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String strCompanyName = req.getParameter("companyName");
		String strPrevCompName = req.getParameter("prevComp");
		String strSalary = req.getParameter("salary");
		String strExpectedSal = req.getParameter("expectedSal");

		ServletContext ctx = getServletContext();

		ctx.setAttribute("COMPANY_NAME", strCompanyName);
		ctx.setAttribute("PRE_COMPANY_NAME", strPrevCompName);
		ctx.setAttribute("SALARY", strSalary);
		ctx.setAttribute("EXP_SALARY", strExpectedSal);
		
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<form action='./add' method='get'>");
		pw.println("<center><h2>ADDRESS DETAILS</center>");
		pw.println("<table>");
		pw.println("<tr><td>Enter your street</td>");
		pw.println("<td><input type='text' name='street'></td></tr>");
		pw.println("<tr><td>Enter your city</td>");
		pw.println("<td><input type='text' name='city'></td></tr>");
		pw.println("<tr><td>Enter your state</td>");
		pw.println("<td><input type='text' name='state'></td></tr>");
		pw.println("<tr><td>Enter your country</td>");
		pw.println("<td><input type='text' name='country'></td></tr>");
		pw.println("<tr><td colspan='2' align='center'><input type='submit' value='Submit'></td></tr>");
		pw.println("</form></body></html>");
	}
}
