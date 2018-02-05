/**
 * Created by Squirrel-Chen on 2018/2/5.
 */

$(document).ready(function () {

    //ajax请求获取博文内容
    $.ajax({
        url:"article",
        data:{"id":1},
        dataType:"json",
        method:"get",
        success:function (data) {
            console.log(data);
        }
    })
})