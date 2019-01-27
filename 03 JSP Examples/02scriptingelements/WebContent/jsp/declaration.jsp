<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%!
int i = 100;
public String sayHello(String name)
{
	return "Hello, " + name + "!";
}
%>
<html>
<body bgcolor="yellow">
<h1>DECLARATION TEST PAGE</h1><br>
<p>Saying hello to all reader: <%=sayHello("CLUSTER") %>.</p>
<p>Value of i is <%= i %></p>
</body>
</html>