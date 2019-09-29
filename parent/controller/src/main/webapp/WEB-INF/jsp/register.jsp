<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>注册</title>
    <link rel="icon" href="static/png/ddr.png" sizes="32x32">
    <link rel="stylesheet" href="static/css/bootstrap.min.css"/>
    <style>
        .col-md-8 {
            flex: 0 0 100%;
            max-width: 100%;
        }

        .container {
            max-width: 640px;
        }
    </style>
</head>

<%@include file="navbar.jsp"%>

<div class="container">
    <div class="py-5 text-center"></div>
    <div class="row">
        <div class="col-md-8 order-md-1">
            <h1 class="mb-3">注册</h1>
            <br/>

            <form class="needs-validation" novalidate action="register">

                <div class="mb-3">
                    <label for="username">用户名:</label>
                    <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名" required>
                    <div class="invalid-feedback">请输入用户名.</div>
                </div>

                <div class="mb-3">
                    <div class="mb-3">
                        <label for="password">密码:</label>
                        <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码"
                               required>
                        <div class="invalid-feedback">请输入密码.</div>
                    </div>

                </div>

                <p>${errmsg }</p>
                <hr class="mb-4"/>
                <button class="btn btn-primary btn-lg btn-block" type="submit">提交</button>

            </form>

        </div>
    </div>

    <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">&copy; 版权没有 2019</p>
    </footer>

</div>

<script src="static/js/jquery-3.3.1.slim.min.js"></script>
<script src="static/js/popper.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script>
    (function () {
        window.addEventListener('load', function () {
            var forms = document.getElementsByClassName('needs-validation');
            Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    }());
</script>
</body>

</html>