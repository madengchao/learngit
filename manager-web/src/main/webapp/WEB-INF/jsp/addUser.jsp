<%--
  Created by IntelliJ IDEA.
  User: 墨风空间
  Date: 2020/1/28
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUsers" method="post">
        姓名<input type="text" name="userName"><br>
        年龄<input type="text" name="userAge"><br>
        <input type="submit" value="OKOK">

    </form>
</body>
</html>
