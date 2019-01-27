<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%
if((request.getParameter("nme").equalsIgnoreCase("ravi"))&&
	(request.getParameter("pwd").equalsIgnoreCase("cluster")))
{ %><jsp:forward page="success.jsp"/>
<% }else { %>
<%@include file="../html/login.html" %>
<% } %>