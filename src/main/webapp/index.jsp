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
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script>
        $(function () {
            $("#btn").click(
                function () {
                    //alert("hello!!");
                    $.ajax({
                        url: "user/testAjax",
                        contentType: "application/json;charset=UTF-8",
                        data: '{"username":"a","password":"123","age":20}',
                        dataType: "json",
                        type: "post",
                        success: function (data) {
                            //解析响应json
                            alert(data.username);
                        }
                    });
                }
            );
        })
    </script>
</head>
<body>

<h3>入门</h3>

<a href="hello/sayHello">sayHello</a><br>
<a href="hello/sayHello2">sayHello2</a><br>
<a href="hello/sayHello2?username=zhangsan">sayHello2?username=zhangsan</a><br>
<a href="hello/sayHello3?uname=zhangsan">sayHello3?uname=zhangsan</a><br>
<a href="hello/sayHello4/1000">sayHello4/1000</a><br>

<form action="hello/login" method="post">
    用户名：<input type="text" name="username" value="zhangsan"><br>
    密码：<input type="text" name="password" value="123"><br>
    <input type="submit" value="login">
</form>
<br>

<form action="hello/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    生日：<input type="text" name="date" value="2010-1-10"/><br>
    <input type="submit" value="提交"/>
</form>
<br>

<h3>响应数据、结果视图</h3>

<a href="user/testString">testString</a><br>
<a href="user/testVoid">testVoid</a><br>
<a href="user/testModelAndView">testModelAndView</a><br>
<a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br>

<button id="btn">发送ajax请求</button>
<br>

</body>
</html>
