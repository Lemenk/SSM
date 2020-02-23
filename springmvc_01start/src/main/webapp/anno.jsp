<%--
  User: Lemenk
  Blog: www.lemenk.top
  Date: 2020/2/14 14:48
  Description: 常用注解的演示
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>

    <%--常用注解--%>
    <a href="anno/testRequestParam?name=刘洋">testRequestParam</a>

    <form action="anno/testRequestBody" method="post">
        用户名：<input type="text" name="username"><br>
        年龄：<input type="text" name="age"><br>
        <input type="submit" value="提交"><br>
    </form>

    <a href="anno/testPathVariable/10?">testPathVariable</a>
</body>
</html>
