<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Starter Template</title>
</head>
<body>
    <h1>Register Here!</h1>

    <c:if test="${not empty Smessage}">
        <h4 style="color: green">${Smessage}</h4>
    </c:if>

    <c:if test="${not empty Emessage}">
        <h4 style="color: red">${Emessage}</h4>
    </c:if>

<form action="/register" method="post">
    Name: <input type="text" name="name">
    <br>
    Email: <input type="text" name="email">
    <br>
    Password: <input type="password" name="password">
    <br>
    Mobile: <input type="text" name="mobile">
    <br>
    <input type="submit" value="Register"><br/>
    <a href="loginPage">Click here </a>if already registered!
</form>
</body>
</html>