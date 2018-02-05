/**
 * Created by Squirrel-Chen on 2018/2/5.
 */

$(document).ready(function () {

    var article_id=console.log(getQueryString("id"));
    if(article_id==null)
    {
        article_id=-1;
    }


    //ajax请求获取博文内容
    $.ajax({
        url:"article",
        data:{"id":article_id},
        dataType:"json",
        method:"get",
        success:function (data) {
            console.log(data);
        }
    })
})

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}