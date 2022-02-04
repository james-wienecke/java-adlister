<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 2/4/22
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h1>Hello, ${name}!</h1>
<form action="hello" method="post">
    <label for="color">What is your favorite color?!</label>
    <input name="color" id="color" type="text"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>