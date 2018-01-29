<%--
  Created by IntelliJ IDEA.
  User: Squirrel-Chen
  Date: 2018/1/28
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

	<head>

		<head>
			<meta charset="utf-8" />
			<title>用户首页</title>
			<link rel="stylesheet" href="css/materialize.css" />
			<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
			<script type="text/javascript" src="js/materialize.js"></script>
			<link rel="stylesheet" href="css/material-icons.css">
		</head>

		<body>
			<div class="row">
				<div class="col s12 m4 l3">
					<div id="nav-bar">
						<ul id="nav-mobile" class="side-nav fixed" style="transform: translateX(0px);">
							<li class="bold" style="text-align: center;">
										<a class="collapsible-header waves-effect waves-teal" href="#"><img src="images/th (1).jpg" class="circle responsive-img" width="100px" height="100px"></a>
							</li>
							<li class="bold active">
								<a class="collapsible-header waves-effect waves-teal" href="my_info.html"><i class="material-icons">info</i>我的资料</a>
							</li>
							<li class="bold">
								<a class="collapsible-header waves-effect waves-teal" href="my_blog.html"><i class="material-icons">insert_chart</i> 我的博客
								</a>
							</li>
							<li class="bold">
								<a class="collapsible-header waves-effect waves-teal" href="my_fllow.html"><i class="material-icons">group</i>我的关注</a>
							</li>
							<li class="no-padding">
								<ul class="collapsible collapsible-accordion">
									<li style="bold">
										<a class="collapsible-header waves-effect waves-teal"><i class="material-icons">build</i>账户设置</a>
										<div class="collapsible-body">
											<ul>
												<li class="bold acitve">
													<a class="collapsible-header waves-effect waves-teal"><i class="material-icons">https</i>密码设置</a>
												</li>
												<li class="bold">
													<a class="collapsible-header waves-effect waves-teal"><i class="material-icons">keyboard</i>修改设置</a>
												</li>
											</ul>
										</div>
									</li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
				<div class="col s12 m5 l9">
					<h2 class="header">个人资料</h2>
					<div class="card horizontal">
						<div>
							<a href="#"><img src="images/th (1).jpg" class="circle responsive-img" width="100px" height="100px">修改头像</a>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<form>
									<label>用户名</label><input type="text">
									<label>昵称</label><input type="text">
									<label>真实姓名</label><input type="text">
									<label>职位</label><input type="text">
									<label>性别</label><input type="radio" name="sex" id="man"><label for="man">男</label><input type="radio" name="sex" id="woman"><label for="woman">女</label><input type="radio" name="sex" id="secret"><label for="secret">保密</label><br/>
									<label>生日</label><input type="text" class="datepicker">
									<label>行业</label><input type="text">
									<label>地区</label><br/>
									<label>省</label>

									<select>
										<option value="1">1</option>
										<option value="2">1</option>
										<option value="3">1</option>
										<option value="4">1</option>
										<option value="5">1</option>
									</select>
									<br/>
									<label>市</label>
									<select>
										<option value="1">1</option>
										<option value="2">1</option>
										<option value="3">1</option>
										<option value="4">1</option>
										<option value="5">1</option>
										<option value="6">1</option>
									</select>
									<br />
									<label>县</label>
									<select>
										<option value="1">1</option>
										<option value="2">1</option>
										<option value="3">1</option>
										<option value="4">1</option>
									</select>

									<br/>
									<label>简述</label><textarea cols="10" rows="10"></textarea>
								</form>
							</div>
							<div class="card-action">
								<a href="#">This is a link</a>

							</div>
						</div>
					</div>

				</div>
			</div>
			</div>
			</div>

			<script type="text/javascript">
                $(document).ready(function () {

                    $('.datepicker').pickadate({
                        selectMonths: true, // Creates a dropdown to control month
                        selectYears: 15, // Creates a dropdown of 15 years to control year,
                        today: 'Today',
                        clear: 'Clear',
                        close: 'Ok',
                        closeOnSelect: false // Close upon selecting a date,
                    });

                    $('select').material_select();

                    $.ajax({
                        url:"getUserInfo",
                        data:{username:"squirrelchen"},
                        dataType:"json",
                        method:"post",
                        success:function (data) {
                            console.log("this object is ")+data;
                        },
                        error: function () {
                            console.log("error ");
                        }
                    })



                })
			</script>

	</body>


</html>