<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/28
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <center>
        <h1>请登录</h1>
        <form action="/sso/doLogin.action" method="post">
            <span>用户名:</span><input type="text" name="username">
            <span>密码:</span><input type="password" name="password">
            <input type="submit" value="提交">
            <input type="hidden" name="gotoUrl" value="${gotoUrl}">
        </form>
    </center>
</body>
</html>
