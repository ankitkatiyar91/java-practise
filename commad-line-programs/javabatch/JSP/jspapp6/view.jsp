<jsp:useBean id="user" class="beanpack.UserBean" scope="application"/>
<b>Following data is found in application scope bean</b><br>
Name<jsp:getProperty name="user" property="name"/>
Password<jsp:getProperty name="user" property="password"/>
MailId<jsp:getProperty name="user" property="mailid"/>