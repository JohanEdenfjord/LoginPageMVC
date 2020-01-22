<%@page import="a.testPackage.TheBean"
%>

<p>You are successfully logged in!</p>



<%
TheBean bean=(TheBean)request.getAttribute("bean");
out.print("Welcome, " + bean.getUname());
out.print("You are the Bossman!");
%>

