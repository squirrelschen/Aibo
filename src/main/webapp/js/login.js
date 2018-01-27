// JavaScript Document
//支持Enter键登录
$(document).ready(function(){

	layui.use('layer',function () {

		var layer=layui.layer;

			 $("#submit_btn").click(function(){


			 	if($("#username").val()==''&&$("#password").val()=='')
				{
					layer.msg('用户名与密码均不能为空');
                    $("#username").val('');
                    $("#password").val('');
				}
			 	else if($("#username").val()=='')
				{
					layer.msg('用户名/邮箱地址/手机号 不能为空');
					$("#username").val('');
					$("#password").val('');
				}
				else if ($("#password").val()=='')
				{
					layer.msg('密码不能为空');
                    $("#username").val('');
                    $("#password").val('');
				}
				else {
                    $.ajax({
                        url: "login",
                        data: {username: $("#username").val(), password: $("#password").val()},
						dataType: "json",
						method:"post",
                        success: function (data) {
                            layer.msg("登录成功");
                        },
                        error: function () {
                            layer.msg("错误链接");
                        }
                    })
                }

	 });
    })
})

document.onkeydown = function(e){
			if($(".bac").length==0)
			{
				if(!e) e = window.event;
				if((e.keyCode || e.which) == 13){
					var obtnLogin=document.getElementById("submit_btn")
					obtnLogin.focus();
				}
			}
}

        // $(function(){
		// 	//提交表单
		// 	$('#submit_btn').click(function(){
		// 		show_loading();
		// 		var myReg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; //邮件正则
		// 		if($('#email').val() == ''){
		// 			show_err_msg('邮箱还没填呢！');
		// 			$('#email').focus();
		// 		}else if(!myReg.test($('#email').val())){
		// 			show_err_msg('您的邮箱格式错咯！');
		// 			$('#email').focus();
		// 		}else if($('#password').val() == ''){
		// 			show_err_msg('密码还没填呢！');
		// 			$('#password').focus();
		// 		}else{
		// 			//ajax提交表单，#login_form为表单的ID。 如：$('#login_form').ajaxSubmit(function(data) { ... });
		// 			show_msg('登录成功咯！  正在为您跳转...','/');
		// 		}
		// 	});
		// });