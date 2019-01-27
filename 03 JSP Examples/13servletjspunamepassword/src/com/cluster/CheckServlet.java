package com.cluster;

import java.io.IOException;

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
public class CheckServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Inside CheckServlet**************");
		String strNme = req.getParameter("nme");
		String strPwd = req.getParameter("pwd");
		RequestDispatcher rd = null;
		if (strNme.equalsIgnoreCase("Ravi")	&& strPwd.equalsIgnoreCase("Cluster")) {
			rd = req.getRequestDispatcher("./jsp/success.jsp");
			rd.forward(req, res);
		} else {
			rd = req.getRequestDispatcher("./jsp/failure.jsp");
			rd.forward(req, res);
		}
	}
}
