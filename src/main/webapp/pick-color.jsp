<%--
  Created by IntelliJ IDEA.
  User: jamesw
  Date: 2/4/22
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pick a color!</title>
</head>
<body>
<form action="pickcolor" method="post">
    <label for="color-in">Enter a color:</label>
    <input type="text" name="color-in" id="color-in" value="purple">
    <button type="submit">Submit</button>
</form>
</body>
</html>