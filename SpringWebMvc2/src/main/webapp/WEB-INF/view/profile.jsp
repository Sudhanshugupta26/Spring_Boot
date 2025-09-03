<%--
  Created by IntelliJ IDEA.
  User: Sudhanshu_Gupta
  Date: 03-09-2025
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h3>Profile</h3>
<h3>Name: ${model_user.getName()}</h3>
<h3>Email: ${model_user.getEmail()}</h3>
<h3>Phone: ${model_user.getPhone()}</h3>
</body>
</html>
