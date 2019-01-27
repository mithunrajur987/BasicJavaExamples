<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="yellow">
<%
	String strName = request.getParameter("nme");
	String strPassword = request.getParameter("pwd");
	if ((strName.equalsIgnoreCase("ravi")) && (strPassword.equalsIgnoreCase("amogh"))) {
%>
<p> <font size="3" color="green">Hello Mr <%=strName%> you are welcome</font></p> 
<%}else{%>
<p><font size="3" color="red">Hello Mr <%=strName%> Mr You are not a valid User</font></p>
<%}%>
</body>
</html>