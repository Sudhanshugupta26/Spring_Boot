<%@ page import="in.gupta.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Sudhanshu_Gupta
  Date: 01-09-2025
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        User user = (User) session.getAttribute("user");
    %>

    <h3>Welcome</h3>
    <h4> Name: <%= user.getName()  %></h4>
    <h4> Email: <%= user.getEmailId()  %></h4>
    <h4> City: <%= user.getCity()  %></h4>
    <h4> Password: <%= user.getPassword()  %></h4>

<a href="logout">Logout</a>
</body>
</html>
