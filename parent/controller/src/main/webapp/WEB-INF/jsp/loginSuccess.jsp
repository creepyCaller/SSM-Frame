<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>首页</title>
    <link rel="icon" href="static/png/ddr.png" sizes="32x32">
    <link rel="stylesheet" href="static/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="static/css/jumbotron.css"/>
</head>

<body>

<%@include file="navbar.jsp"%>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-1">登陆成功</h1>
            <p>用户名：${username}</p>
            <p>密码：${password}</p>
            <p><a class="btn btn-primary btn-lg" href="index" role="button">主页 &raquo;</a></p>
        </div>
    </div>

</main>

<footer class="container">
    <p>&copy; 版权没有 2019</p>
</footer>

<script src="static/js/bootstrap.min.js"></script>

</body>
</html>