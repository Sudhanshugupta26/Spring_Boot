<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Starter Template</title>
</head>
<body>
<c:if test="${not empty Smessage}">
    <h4 style="color: green">${Smessage}</h4>
</c:if>
<h1>Profile Page!</h1>
<h2>Welcome ${userName}</h2>
<a href="logout">Logout</a>
</body>
</html>