<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="green">
<jsp:useBean id="pto" class="com.cluster.to.PersonTO" scope="request">

<!-- <jsp:setProperty name="pto" property="firstname" param="firstname"/>
<jsp:setProperty name="pto" property="lastname" param="lastname"/>
<jsp:setProperty name="pto" property="email" param="email"/>  -->

<jsp:setProperty name="pto" property="*"/>
</jsp:useBean>

<h1>Hello Mr Welcome</h1><br>
<h1>Your First Name is <jsp:getProperty name="pto" property="firstname"/> </h1><br>
<h1>Your Last Name is <jsp:getProperty name="pto" property="lastname"/></h1>
<h1>Your Email is <jsp:getProperty name="pto" property="email"/></h1>

</body>
</html>