<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page import="java.sql.*" errorPage="dbError.jsp"%>

<%!Connection con;%>
<%!public void jspInit() {
		System.out.println("############Inside jspInit() method");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ravioracle","ravioracle");
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}%>

<%!public void jspDestroy() {
		System.out.println("############Inside jspDestroy() method");
		try {
			con.close();
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}%>
<html>
<body bgcolor="yellow">
	<%
		String strNme = request.getParameter("nme");
		String strPwd = request.getParameter("pwd");
		String strEmail = request.getParameter("email");
		String strPhone = request.getParameter("phone");
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement("INSERT INTO CUSTOMER(NAME,PASSWORD,EMAIL,PHONE) VALUES (?,?,?,?)");
			pst.setString(1, strNme);
			pst.setString(2, strPwd);
			pst.setString(3, strEmail);
			pst.setString(4, strPhone);

			int i = pst.executeUpdate();

			if (i == 1) {
	%>
	Hello Mr <%=strNme%> Thank you for becoming a member
	<%
		} else {
	%>
	Hello Mr
	<%=strNme%>
	Better Luck Next Time
	<%
		}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	%>
</body>
</html>