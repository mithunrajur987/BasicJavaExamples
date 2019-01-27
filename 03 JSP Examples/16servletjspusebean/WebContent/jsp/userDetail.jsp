<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<jsp:useBean id="pto" class="com.cluster.to.PersonTO" scope="request"/>
<html>
<body bgcolor="wheat">
<center>
<h1>Hello Welcome User</h1>
</center>
<br>
<p>Following are your details</p>

<font size="5" color="red">
Your NAME is <jsp:getProperty name="pto" property="name"/><br>
Your PASSWORD is <jsp:getProperty name="pto" property="password"/><br>
Your PHONE is <jsp:getProperty name="pto" property="phone"/><br>
Your EMAIL is <jsp:getProperty name="pto" property="email"/><br>
</font>
</body>
</html>

