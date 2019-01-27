<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@taglib uri="/WEB-INF/hello.tld" prefix="h" %>
<html>
	<body bgcolor="wheat">
		<% String strNum1 = request.getParameter("num1"); %>
		
		<% String strNum2 =request.getParameter("num2"); %>
		
	<h:add x = "<%=strNum1%>" y = "<%=strNum2%>" />
	END OF JSP

</body>
</html>