<%--
  User: Lemenk
  Blog: www.lemenk.top
  Date: 2020/2/13 21:21
  Description: 参数设置
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--请求参数绑定--%>
    <%--<a href="param/testParam?username=hehe&password=123">请求参数绑定</a>--%>

    <%--表单方式封装数据--%>
    <%--<form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="提交"><br>
    </form>--%>

    <%--把数据封装到Account类中，添加user后的表单--%>
    <%--<form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        金额：<input type="text" name="money"><br>
        用户名：<input type="text" name="user.uname"><br>
        年龄：<input type="text" name="user.age"><br>
        <input type="submit" value="提交"><br>
    </form>--%>

    <%--把数据封装到Account类中，添加集合后的表单--%>
    <%--<form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        金额：<input type="text" name="money"><br>

        用户名：<input type="text" name="list[0].uname"><br>
        年龄：<input type="text" name="list[0].age"><br>

        用户名：<input type="text" name="map['one'].uname"><br>
        年龄：<input type="text" name="map['one'].age"><br>
        <input type="submit" value="提交"><br>
    </form>--%>

    <%--给user添加date属性，验证自定义类型转换器--%>
    <form action="param/saveUser" method="post">
        用户名：<input type="text" name="uname"><br>
        年龄：<input type="text" name="age"><br>
        日期：<input type="text" name="date"><br>
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>
