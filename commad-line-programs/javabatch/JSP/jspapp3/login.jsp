<%@ page import="java.sql.*" %>
<%
String name=request.getParameter("txtName");
String password=request.getParameter("txtPassword");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:user");
PreparedStatement stmt=con.prepareStatement("select UserName from User where UserName=? and Password=?");
stmt.setString(1,name);
stmt.setString(2,password);
ResultSet rset=stmt.executeQuery();
if(rset.next())
{
out.println("Welcome, "+name);
}
else
{
out.println("<b>Invlid name or password!!!!!</b>");
%>
<jsp:forward page="a.jsp" />
<%
}
con.close();
%>