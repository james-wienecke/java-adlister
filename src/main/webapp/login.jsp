<%--
  Created by IntelliJ IDEA.
  User: jamesw
  Date: 2/3/22
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form method="post">
    <label for="username">Username</label>
    <input type="text" name="username" id="username">
    <label for="password">Password</label>
    <input type="password" name="password" id="password">
    <button type="submit" name="submit-login">Submit</button>
    <button type="reset" name="reset-login">Reset</button>
</form>

<c:choose>
    <c:when test="${param.username.equalsIgnoreCase(\"admin\") && param.password.equalsIgnoreCase(\"password\")}">
        <% response.sendRedirect("profile.jsp"); %>
    </c:when>
    <c:when test="${param.username.length() > 0}">
        <% response.sendRedirect("login.jsp"); %>
    </c:when>
</c:choose>

<div>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>
</div>
</body>
</html>
