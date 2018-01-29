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
							<a href="#"><img src="images/th (1).jpg" class="circle responsive-img" width="100px" height="100px"></a>
						</div>
						<div class="card-stacked">
							<div class="card-content">
								<form action="updateUserInfo" method="post">
									<label>用户名</label><input type="text" id="user_name" name="user_name" readonly="true">
									<label>真实姓名</label><input type="text" id="user_realname" name="user_realname">
									<label>职位</label><input type="text" id="user_job" name="user_job">
									<label>性别</label><input type="radio" name="user_sex" id="man"><label for="man">男</label><input type="radio" name="user_sex" id="woman"><label for="woman">女</label><input type="radio" name="user_sex" id="secret"><label for="secret">保密</label><br/>
									<label>生日</label><input type="text" class="datepicker" id="user_birth" name="user_birth">
									<label>行业</label><input type="text" id="user_work" name="user_work">
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
									<label>简述</label><textarea cols="10" rows="10" id="user_desc" name="user_desc" class="materialize-textarea" data-length="255"></textarea>

									<button class="btn waves-effect waves-light red" type="submit" name="action">修改资料<i class="material-icons right">mode_edit</i></button>

								</form>
							</div>
							<div class="card-action">
							</div>
						</div>
					</div>

				</div>
			</div>
			</div>
			</div>

	</body>

<!--  javascript  begin -->
<script type="text/javascript" src="js/page/myinfo.js"></script>

<!--  javascript  end   -->


</html>