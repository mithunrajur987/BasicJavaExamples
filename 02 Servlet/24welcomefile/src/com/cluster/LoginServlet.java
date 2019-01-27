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
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String strNme = req.getParameter("nme");
		String strPwd = req.getParameter("pwd");
		System.out.println("Value of nme is " + strNme);
		System.out.println("Value of pwd is " + strPwd);

		if (strNme.equalsIgnoreCase("Ravi") && strPwd.equalsIgnoreCase("Amogh")) {
			pw.println("<html>");
			pw.println("<body bgcolor='green'>");
			pw.println("Hello Mr " + strNme + " You are welcome");
			pw.println("</body>");
			pw.println("</html>");
		}

		else {
			pw.println("<html>");
			pw.println("<body bgcolor='red'>");
			pw.println("Hello Mr " + strNme + " You are invalid user");
			pw.println("</body>");
			pw.println("</html>");
		}
	}
}
