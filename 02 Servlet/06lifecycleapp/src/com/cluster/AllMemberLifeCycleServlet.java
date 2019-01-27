package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class AllMemberLifeCycleServlet extends HttpServlet 
{
	int i=0;
	
	static {
		System.out.println("############Inside static block");
	}
	{
		System.out.println("############Inside instance block");
	}


	public AllMemberLifeCycleServlet() {
		System.out.println("############Inside constructor block");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("############Inside init() method");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,
			IOException {
		int z = 0;
		z++;
		i++;
		System.out.println("############Inside doPost() method i=" +i + " z =" + z );
		PrintWriter pw = res.getWriter();
		String strNme = req.getParameter("nme");
		String strPwd = req.getParameter("pwd");
		
		pw.println("<html>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("Hello Mr " + strNme + "  you are Welcome");
		pw.println("</body>");
		pw.println("</html>");
	}

	public void destroy() {
		System.out.println("############Inside destroy() method");
	}
	void m1(){
		System.out.println("inside m1()++++++++++++++++");
	}
}
