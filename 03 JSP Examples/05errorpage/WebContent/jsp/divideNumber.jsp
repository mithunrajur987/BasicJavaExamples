<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page errorPage="divideError.jsp"%>
<html>
<body bgcolor="yellow">
<%
	String num1 = request.getParameter("number1");
	String num2 = request.getParameter("number2");
	int a = Integer.parseInt(num1);
	int b = Integer.parseInt(num2);
	int result = a/b;
%>
<h1>Division of both numbers result is <%= result %></h1>
</body>
</html>