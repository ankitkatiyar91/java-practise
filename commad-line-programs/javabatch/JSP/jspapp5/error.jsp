<%@  page isErrorPage="true"%>
<%
if(exception instanceof ArithmeticException)
out.println("<b> Secon Number must be non zero</b>");
else
out.println("<b>Input must be numeric</b>");
%>