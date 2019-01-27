package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String strNme = req.getParameter("nme");
		System.out.println("Value of parameter nme in FirstServlet ******** " + strNme);

		RequestDispatcher rd  = req.getRequestDispatcher("scd");
		rd.include(req, res);
		
		pw.println("<html>");
		pw.println("<body bgcolor='red'>");
		pw.println("Hello Mr " + strNme  );
		pw.println("This is from FirstServlet");
		pw.println("</body>");
		pw.println("</html>");
	}
}
