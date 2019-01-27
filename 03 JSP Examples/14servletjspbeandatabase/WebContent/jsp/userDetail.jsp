<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page import="com.cluster.to.PersonTO"%>
<html>
<body bgcolor="wheat">
<center>
<h1>Hello Welcome User</h1>
</center>
<br>
<p>Following are your details</p>
<%
	PersonTO person = (PersonTO) request.getAttribute("pto");
%>
<font size="5" color="red">
Your name is <%=person.getName()%><br>
Your password is <%=person.getPassword()%><br>
Your phone is <%=person.getPhone()%><br>
Your email is <%=person.getEmail()%><br>
</font>
</body>
</html>