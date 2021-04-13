<%--
  Created by IntelliJ IDEA.
  User: zhaoxiaoqing
  Date: 2020/8/17
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="user/createUser" method="post">
    <p>
        姓名：<input type="text" name="userName"/>
    </p>
    <p>
        年龄：<input type="text" name="age"/>
    </p>
    <p>
        兴趣：<input type="text" name="interest"/>
    </p>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
