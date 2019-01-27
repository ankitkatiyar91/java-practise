<jsp:useBean id="user" class="beanpack.UserBean" scope="application"/>
<jsp:setProperty name="user" property="*"/>
<%
user.register();
out.println("You are successfully registered....");
%>
<a href="view.jsp">View Bean Data </a>
