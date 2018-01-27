<%--
  Created by IntelliJ IDEA.
  User: Squirrel-Chen
  Date: 2018/1/24
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- CSS -->
    <link rel="stylesheet" href="css/supersized.css">
    <link rel="stylesheet" href="css/login.css">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="js/html5.js"></script>
    <![endif]-->
    <script src="js/jquery-2.1.4.min.js"></script>
    <%--<script type="text/javascript" src="js/jquery.form.js"></script>--%>
    <%--<script type="text/javascript" src="js/tooltips.js"></script>--%>
    <script type="text/javascript" src="layui/layui.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
</head>

<body>

<div class="page-container">
    <div class="main_box">
        <p class="login_box">

            <div id="login_logo" style="text-align: center">
            <p><h1>Squirrel Studio </h1></p>
            </div>

            <div class="login_form">
                <form action="login" id="login_form" method="post">
                    <div class="form-group">
                        <label>用户名/邮箱地址/手机号码:</label>
                        <input id="username" value="" name="username" type="text" class="form-control x319 in"
                               autocomplete="off">
                    </div>
                    <div class="form-group">
                        <label>密码:</label>
                        <input id="password" value="" name="password" type="password" class="password form-control x319 in">
                    </div>

                    <div class="form-group" style="text-align: center">
                        <button type="button"  id="submit_btn"
                                class="btn btn-primary btn-lg">&nbsp;登&nbsp;录&nbsp </button>
                        <input type="reset" value="&nbsp;重&nbsp;置&nbsp;" class="btn btn-default btn-lg">
                    </div>

                    <div class="form-group">
                        <hr/>
                        <div class="bottom">Copyright &copy; 2017 - 2018 <a href="#">Squirrel Studio </a></div>
                    </div>

                </form>
            </div>
        </div>
    </div>
</div>

<!-- Javascript -->

<script src="js/supersized.3.2.7.min.js"></script>
<script src="js/supersized-init.js"></script>
<script src="js/scripts.js"></script>

</body>
</html>
