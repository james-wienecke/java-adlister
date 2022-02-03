<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Arrays"%>
<html>
<head>
    <%@include file="partials/head.jsp"%>
    <title><%= "Welcome" %></title>
</head>
<body>
<%! String name = "James"; %>
<%
    int[] numbers = {1, 2 ,3, 4, 5};
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    int avg = total / numbers.length;
    request.setAttribute("numbers", numbers);
%>

<c:choose>
    <c:when test="${param.condition}">
        <h1>The statement evaluates to true.</h1>
    </c:when>
    <c:when test="${param.numbers}">
        <h1>This time, I wanna show you some numbers. 1, 2, 3, 4, 5!</h1>
    </c:when >
    <%--Otherwise tags are optional.--%>
    <c:otherwise>
        <c:choose>
            <c:when test="true">
                <h1>test</h1>
            </c:when>
        </c:choose>
        <h1>The statements evaluates to false.</h1>
    </c:otherwise>
</c:choose>

<c:if test="">
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur culpa dignissimos iusto minus nulla provident quae quos sed sint ullam!</p>
</c:if>

<c:forEach items="${numbers}" var="num">
    <ul>
        <li>${num}</li>
    </ul>
</c:forEach>




<h1>Hello <%= avg %></h1>

<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<%--Used for singular parameters--%>
<h4>${param.name}</h4>
<%--Used for multiple values in one parameter--%>
<h4>${paramValues.name}</h4>
<h4>${Arrays.toString(numbers)}</h4>




<!--HTML COMMENT-->
<%--JSP COMMENT--%>
<%@include file="partials/bs-bundle.jsp"%>
</body>
</html>
