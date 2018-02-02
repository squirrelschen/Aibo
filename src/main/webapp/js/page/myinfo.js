/**
 * Created by Squirrel-Chen on 2018/1/29.
 */

$(document).ready(function () {

    var username=$("#user_name").val();

    // 使用时间js控件
    $('.datepicker').pickadate({
        selectMonths: true, // Creates a dropdown to control month
        selectYears: 15, // Creates a dropdown of 15 years to control year,
        today: 'Today',
        clear: 'Clear',
        close: 'Ok',
        format: 'yyyy-mm-dd',
        formatSubmit:'yyyy-mm-dd',
        hiddenName:'true',
        closeOnSelect: false // Close upon selecting a date,
    });

    // 使用选择js控件
    $('select').material_select();

    //使用省市县三级联动控件
    addressInit('province','city','country','请选择省','请选择市','请选择县');

    // ajax获取用户信息并填入表单
    $.ajax({
        url:"getUserInfo",
        data:{username:'squirrelchen'},
        dataType:"json",
        method:"post",
        success:function (data) {

            $("#user_name").val(data.user_name);
            $("#user_nickname").val(data.user_nickname);
            $("#user_realname").val(data.user_realname);
            $("#user_job").val(data.user_job);
            $("#user_birth").val(data.user_birth);
            $("#user_work").val(data.user_work);
            $("#user_desc").val(data.user_desc);
            $("#address").val(data.user_area);


            if(data.user_sex=='男')
            {
                $("input[name=user_sex]:eq(0)").attr("checked","true");
            }
            else if (data.user_sex=='女')
            {
                $("input[name=user_sex]:eq(1)").attr("checked","true");
            }
            else
            {
                $("input[name=user_sex]:eq(2)").attr("checked","true");
            }

        },
        error: function () {
            console.log("error ");
        }
    })



    $("#changeuser_icon").click(function () {
    	console.log("hei");
    	$("#user_icon_input").click();
    });

	$("#user_icon_input").change(function() {
        console.log("D");


        $.ajaxFileUpload({
            //处理文件上传操作的服务器端地址(可以传参数,已亲测可用)
            url: 'fileUpload',
            secureuri: false,                       //是否启用安全提交,默认为false
            fileElementId: 'user_icon_input',           //文件选择框的id属性
            dataType: 'json',                       //服务器返回的格式,可以是json或xml等
            success: function (data, status) {        //服务器响应成功时的处理函数
               console.log(data+"t");
            },
            error: function (data, status, e) { //服务器响应失败时的处理函数
                console.log("3");
            }
        });


    });









})