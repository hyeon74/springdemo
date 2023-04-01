<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Spring Boot Application</title>
</head>
<body>Hello, Spring Boot App
<br>
<c:set var="langdiv" value="1" />

<select id="type">
    <c:forEach var="code" items="${boardTypeList}" varStatus="i">
        <option value="${code.key}"><c:if test="${langdiv eq '1'}">${code.engval}</c:if><c:if test="${langdiv ne '1'}">${code.value}</c:if></option>
    </c:forEach>
</select>
<br>

<select id="type">
    <c:forEach var="code" items="${boardTypeList}" varStatus="i">
        <option value="${code.key}">${code.value}</option>
    </c:forEach>
</select>
<br>
<select id="type">
    <c:forEach var="code" items="${divTypeList}" varStatus="i">
        <option value="${code.key}">${code.value}</option>
    </c:forEach>
</select>
<br>
<select id="type">
    <c:forEach var="code" items="${useYnList}" varStatus="i">
        <option value="${code.key}">${code.value}</option>
    </c:forEach>
</select>
<br>

<br>${test}
<c:set var="name" value="홍길동" />
<c:set var="name2" >홍길동2</c:set>
${name}/${name2}
<c:choose>
    <c:when test = "${test eq 'test2'}">
        Salary is very low to survive.
    </c:when>
    <c:otherwise>
        No comment sir...
    </c:otherwise>
</c:choose>
<c:if test="${test eq 'test'}" >
    aaaa
</c:if>

</body>
</html>