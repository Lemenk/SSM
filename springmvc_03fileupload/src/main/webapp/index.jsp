<%--
  User: Lemenk
  Blog: www.lemenk.top
  Date: 2020/2/24 9:25
  Description: 首页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>传统方式文件上传</h3>
    <form action="user/fileUpload1" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"><br>
        <input type="submit" value="上传">
    </form>
    <br>
    <h3>SpringMVC方式文件上传</h3>
    <form action="user/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
