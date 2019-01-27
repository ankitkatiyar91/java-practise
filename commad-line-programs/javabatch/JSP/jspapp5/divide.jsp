<%@ page errorPage="error.jsp" %>
<%
int a=Integer.parseInt(request.getParameter("txtnum1"));
int b=Integer.parseInt(request.getParameter("txtnum2"));
int c=a/b;
out.println("Result is "+c);
%>