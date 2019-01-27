package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class ControllerServlet extends HttpServlet {

	Connection con;
	

	public void init(ServletConfig config) throws ServletException {
		System.out.println("############Inside init() method");
		String strDriver = config.getInitParameter("driver");
		String strUrl = config.getInitParameter("dburl");
		String strUserId = config.getInitParameter("dbuid");
		String strPassword = config.getInitParameter("dbpwd");
		try {
			Class.forName(strDriver);
			con = DriverManager.getConnection(strUrl, strUserId, strPassword);
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String path = req.getServletPath();

		if (path.equalsIgnoreCase("/exist.do")) {
			System.out.println(path);
			pw.println("<html>");
			pw.println("<body bgcolor='yellow'>");
			pw.println("<h1>please enter your details</h1>");
			pw.println("<form action='./check.do' method='post'>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>Enter your Name</td>");
			pw.println("<td><input type='text' name='nme'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Enter your Password</td>");
			pw.println("<td><input type='password' name='pwd'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td colspan='2' align='center'><input type='submit' value='Click Here'></td>");
			pw.println("</tr>");
			pw.println("</table>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");

		} else if (path.equalsIgnoreCase("/check.do")) {
			System.out.println(path);
			boolean b = false;
			ResultSet rs = null;
			Statement st = null;
			PrintWriter writer = res.getWriter();
			String strName = req.getParameter("nme");
			String strPassword = req.getParameter("pwd");

			try {
				st = con.createStatement();
				rs = st.executeQuery("SELECT NAME, PASSWORD FROM CUSTOMER");
				while (rs.next()) {
					if ((strName.equalsIgnoreCase(rs.getString("NAME")))
							&& (strPassword.equalsIgnoreCase(rs
									.getString("PASSWORD")))) {
						b = true;
						break;
					}
				}
				if (b) {
					writer.println("<html>");
					writer.println("<body bgcolor='green'>");
					writer.println("Hello Mr " + strName + " you are Welcome");
					writer.println("</body>");
					writer.println("</html>");
				} else {
					writer.println("<html>");
					writer.println("<body bgcolor='red'>");
					writer.println("Hello Mr " + strName
							+ " you are invalid user");
					writer.println("</body>");
					writer.println("</html>");
				}
			}

			catch (SQLException sqle) {
				sqle.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (st != null) {
						st.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		else if (path.equalsIgnoreCase("/new.do")) {
			System.out.println(path);
			pw.println("<html>");
			pw.println("<body bgcolor='orange'>");
			pw.println("<h1>please enter your details</h1>");
			pw.println("<form action='./sign.do' method='post'>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>Enter your name</td>");
			pw.println("<td><input type='text' name='nme'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Enter your password</td>");
			pw.println("<td><input type='password' name='pwd'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Enter your Email</td>");
			pw.println("<td><input type='text' name='email'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Enter your Phone</td>");
			pw.println("<td><input type='text' name='phone'></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td colspan='2' align='center'><input type='submit' value='CLICK HERE'></td>");
			pw.println("</tr>");
			pw.println("</table>");
			pw.println("</form>");
			pw.println("</body>");
			pw.println("</html>");

		}

		else if (path.equalsIgnoreCase("/sign.do")) {
			System.out.println(path);

			String strNme = req.getParameter("nme");
			String strPwd = req.getParameter("pwd");
			String strEmail = req.getParameter("email");
			String strPhone = req.getParameter("phone");

			PreparedStatement pst = null;

			try {
				pst = con
						.prepareStatement("INSERT INTO CUSTOMER(NAME,PASSWORD,EMAIL,PHONE) VALUES (?,?,?,?)");
				pst.setString(1, strNme);
				pst.setString(2, strPwd);
				pst.setString(3, strEmail);
				pst.setString(4, strPhone);

				int i = pst.executeUpdate();

				if (i == 1) {
					pw.println("<html>");
					pw.println("<body bgcolor='green'>");
					pw.println("Hello Mr " + strNme
							+ " Thank you for becoming a member");
					pw.println("</body>");
					pw.println("</html>");
				}

				else {
					pw.println("<html>");
					pw.println("<body bgcolor='red'>");
					pw.println("Hello Mr " + strNme + " Better luck next time");
					pw.println("</body>");
					pw.println("</html>");
				}

			} catch (SQLException e) {
				System.out.println("Exception caught " + e);
				e.printStackTrace();
			}
			finally{
				try {
					
					if(pst!=null)
					{
					pst.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		}
	}
		public void destroy() {
			System.out.println("############Inside destroy() method");
			try {
				con.close();
			} catch (SQLException sqle) {
				System.out.println(sqle);
			}
		}
}
