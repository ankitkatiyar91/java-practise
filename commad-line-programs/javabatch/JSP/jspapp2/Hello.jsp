<%!
String name;
public String getMessage()
{
return "Good Morning, "+name;
}
public void jspInit()
{
System.out.println("JspInit() is overrided...");
}
%>

<%
name=request.getParameter("txtName");
%>
<%=getMessage()%>