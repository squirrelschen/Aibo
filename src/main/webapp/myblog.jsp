<%--
  Created by IntelliJ IDEA.
  User: Squirrel-Chen
  Date: 2018/2/3
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博客首页</title>
    <link rel="stylesheet" href="css/materialize.css"/>
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
                    <a class="collapsible-header waves-effect waves-teal" href="#"><img src="images/th (1).jpg"
                                                                                        class="circle responsive-img"
                                                                                        width="100px"
                                                                                        height="100px" id="changeuser_icon"><input type="file" hidden="hidden" id="user_icon_input" name="uploadfiles"/></a>
                    <hr/>
                </li>
                <li class="bold active">
                    <a class="collapsible-header waves-effect waves-teal" href="my_info.html"><i class="material-icons">info</i>我的资料</a>
                </li>
                <li class="bold">
                    <a class="collapsible-header waves-effect waves-teal" href="my_blog.html"><i class="material-icons">insert_chart</i>
                        我的博客
                    </a>
                </li>
                <li class="bold">
                    <a class="collapsible-header waves-effect waves-teal" href="my_fllow.html"><i
                            class="material-icons">group</i>我的关注</a>
                </li>
                <li class="no-padding">
                    <ul class="collapsible collapsible-accordion">
                        <li class="bold">
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
                <li class="no-padding">
                    <ul class="collapsible collapsible-accordion">
                        <li class="bold">
                            <a class="collapsible-header waves-effect waves-teal"><i class="material-icons">message</i>我的消息</a>
                            <div class="collapsible-body">
                                <ul>
                                    <li class="bold acitve">
                                        <a class="collapsible-header waves-effect waves-teal"><i class="material-icons">https</i>系统消息</a>
                                    </li>
                                    <li class="bold">
                                        <a class="collapsible-header waves-effect waves-teal"><i class="material-icons">keyboard</i>私信我的</a>
                                    </li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>


    <div id="context_container">

    <div class="col s9 ">
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
              <span class="card-title">Card Title</span>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
            <div class="card-action">
              <a href="#">This is a link</a>
              <a href="#">This is a link</a>
            </div>
          </div>
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
              <span class="card-title">Card Title</span>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
            <div class="card-action">
              <a href="#">This is a link</a>
              <a href="#">This is a link</a>
            </div>
          </div>
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
              <span class="card-title">Card Title</span>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
            <div class="card-action">
              <a href="#">This is a link</a>
              <a href="#">This is a link</a>
            </div>
          </div>
          <div class="card blue-grey darken-1">
            <div class="card-content white-text">
              <span class="card-title">Card Title</span>
              <p>I am a very simple card. I am good at containing small bits of information.
              I am convenient because I require little markup to use effectively.</p>
            </div>
            <div class="card-action">
              <a href="#">This is a link</a>
              <a href="#">This is a link</a>
            </div>
          </div>
    </div>
        <button type="button" id="more_btn">上拉加载更多</button>
    </div>


  


    





   
    
</div>








</body>


<!--javascript begin -->
<script type="text/javascript" src="js/page/myblog.js"></script>
<script type="text/javascript" src="js/zepto.min.js"></script>

<!--javascript end  -->

</html>
