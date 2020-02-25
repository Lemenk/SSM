<%--
  User: Lemenk
  Blog: www.lemenk.top
  Date: 2020/2/25 20:24
  Description: 账户信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有账户信息</h3><br>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}
        <br>
    </c:forEach>
</body>
</html>
