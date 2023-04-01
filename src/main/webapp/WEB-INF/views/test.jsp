<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

</html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application</title>
</head>
<body>
    <h1>Hello, Spring Boot App</h1>
    <c:out value="김연아" />
    <c:set var="username1" value="김연아" />
    <c:set var="indate" value="2020-02-19" />
    <c:set var="indate2" value="1098-12-12" />
    <c:if test="${not empty indate2 && indate2.length() == 10}">
        <fmt:parseDate var="date2" value="${indate2}" pattern="yyyy-MM-dd" />
        <fmt:formatDate value="${date2}" pattern="MM/dd/yy" />
    </c:if>
    <fmt:parseDate var="date1" value="${indate}" pattern="yyyy-MM-dd" />
    <fmt:formatDate value="${date1}" pattern="MM.dd.yy." />
</body>
</html>