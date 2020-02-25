<%--
  User: Lemenk
  Blog: www.lemenk.top
  Date: 2020/2/25 20:20
  Description: 首页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>测试</h3>
    <a href="account/findAll">测试查询</a>
    <br>
    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
