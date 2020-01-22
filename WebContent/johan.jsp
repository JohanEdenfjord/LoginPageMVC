
<%@page import="a.testPackage.TheBean"
%>

<%
TheBean bean=(TheBean)request.getAttribute("bean");




            	out.print("<p>You are successfully logged in!</p>");
            	out.print("Welcome, " + bean.getUname() + "<br>");
            	out.print("Johan is an old name with the meaning Allknowing man from malmö!<br>");
            	out.print("It has its roots in the time of the magic Vikings who had raves all the time doing mushrooms!");
          



%>

