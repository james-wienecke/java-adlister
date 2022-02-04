<%--
  Created by IntelliJ IDEA.
  User: jamesw
  Date: 2/4/22
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guess What????</title>
</head>
<body>
<fieldset>
    <legend>Guess the number!</legend>
    <c:if test="${badGuess}">
        <p style="color: red">Pick a number BETWEEN 1 AND 3</p>
    </c:if>
    <form action="guess" method="post">
        <label for="guess">Guess a number between 1 and 3</label>
        <input type="number" id="guess" name="guess">
        <button type="submit">Submit guess</button>
    </form>
</fieldset>
</body>
</html>
