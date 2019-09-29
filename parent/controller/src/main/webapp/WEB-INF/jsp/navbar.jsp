<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

    <a class="navbar-brand" href="index">示例</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault"
            aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index">主页 <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true"
                   aria-expanded="false">帮助</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="#">帮助</a>
                    <a class="dropdown-item" href="#">联系</a>
                    <a class="dropdown-item" href="#">关于</a>
                </div>
            </li>
        </ul>

        <c:if test="${empty username}" var="result">
            <a class="navbar-brand" href="toLogin">登录</a>
        </c:if>
        <c:if test="${!result }">
            <a class="navbar-brand" href="logout" >${username}</a>
        </c:if>

    </div>

</nav>