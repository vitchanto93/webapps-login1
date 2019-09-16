<%--
  Created by IntelliJ IDEA.
  User: CongTuHoMai
  Date: 9/15/2019
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Xin chao vui long dang : </h1>
<form action="/login" method="post">
    login-name: <input type="text" name="tk" width="30">
    password: <input type="password" name="mk" width="10">
    <input type="submit" value="Login">
    <p style="color: red"> ${errormessage}</p>
</form>
</body>
</html>
