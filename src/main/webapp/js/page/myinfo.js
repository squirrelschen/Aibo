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
            var province=data.user_area.substring(0,data.user_area.indexOf('-'));
            console.log("p"+province);
            $("#province").val(province);
            var city=data.user_area.substring(data.user_area.indexOf('-')+1,data.user_area.lastIndexOf('-'));
            console.log("c"+city);
            var d=document.getElementsByName("city");
            $("#city").valueOf("宜宾");
            d.valueOf(city);
            var country=data.user_area.substring(data.user_area.lastIndexOf('-')+1,data.user_area.length);
            console.log("c"+country);
            $("#country").val("翠屏");



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















})