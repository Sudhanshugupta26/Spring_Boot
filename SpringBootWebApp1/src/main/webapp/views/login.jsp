<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Starter Template</title>
</head>
<body>
<h1>Login Here!</h1>

<c:if test="${not empty Emessage}">
    <h4 style="color: red">${Emessage}</h4>
</c:if>

<form action="/loginForm" method="post">
    Email: <input type="text" name="email">
    <br>
    Password: <input type="password" name="password"><br/>
    <input type="submit" value="Login"><br/>
    <a href="regiPage">Click here </a>if not registered!
</form>
</body>
</html>