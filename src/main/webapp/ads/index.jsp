<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
  <h1>All ads:</h1>
  <div>
    <c:forEach var="ads" items="${ads}">
      <div class="ad">
        <h2>${ads.title}</h2>
        <p>${ads.description}</p>
      </div>
    </c:forEach>
  </div>
</body>
</html>
