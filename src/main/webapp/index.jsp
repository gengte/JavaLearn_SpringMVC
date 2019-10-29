<%--
  Created by IntelliJ IDEA.
  User: gengte
  Date: 2019/10/24
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>入门</h3>

<a href="/Hello/sayHello">/Hello/sayHello</a>

<br>
<a href="/Hello/sayHello2">/Hello/sayHello2</a>
<br>
<a href="/Hello/sayHello2?username=zhangsan">/Hello/sayHello2?username=zhangsan</a>
<br>
<a href="/Hello/sayHello3?uname=zhangsan">/Hello/sayHello3?uname=zhangsan</a>
<br>
<a href="/Hello/sayHello4/1000">/Hello/sayHello4/1000</a>

<br>
<br>
<form action="/Hello/login" method="post">
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="login">
</form>

<br>
<form action="/Hello/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    生日:<input type="text" name="date"/><br>
    <input type="submit" value="提交"/>
</form>

<br>



</body>
</html>
