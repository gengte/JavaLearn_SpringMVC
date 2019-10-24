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
<a href="/Hello/sayHello">sayHello</a>
<br>
<a href="/Hello/sayHello2">sayHello2</a>
<br>
<a href="/Hello/sayHello2?username=zhangsan">sayHello2</a>
<br>
<a href="/Hello/login?username=lisi&password=123">参数绑定</a>
<br>
<form action="/Hello/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    <input type="submit" value="提交"/>
</form>
<br>

</body>
</html>
