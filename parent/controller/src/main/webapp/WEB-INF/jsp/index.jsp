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
            <h1 class="display-1">大标题</h1>
            <p>用户列表。</p>
            <p><a class="btn btn-primary btn-lg" href="userlist" role="button">用户列表 &raquo;</a></p>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h2>登录</h2>
                <p>登录。</p>
                <p><a class="btn btn-secondary" href="toLogin" role="button">登录 &raquo;</a></p>
            </div>
            <div class="col-md-4">
                <h2>注册</h2>
                <p>注册。</p>
                <p><a class="btn btn-secondary" href="toRegister" role="button">注册 &raquo;</a></p>
            </div>
        </div>
        <hr>
    </div>

</main>

<footer class="container">
    <p>&copy; 版权没有 2019</p>
</footer>

<script src="static/js/jquery-3.3.1.slim.min.js"></script>
<script src="static/js/popper.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</body>
</html>