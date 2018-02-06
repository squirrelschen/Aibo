/**
 * Created by Squirrel-Chen on 2018/2/5.
 */

$(document).ready(function () {

    var article_id=getQueryString("id");
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
            loadData(data.article);
        }
    })
})

function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}

function loadData(data)
{
    $("#article_info").empty();
    $("#article_info").append("<div class='card large'><div class='card-image'>" +
        "<img src=''>" +
        "<span class='card-title'> "+data.article_title+"</span>"+
            "<a class='btn-floating halfway-fab waves-effect waves-light red'><i class='material-icons'>edit</i> </a>"+
            "</div>"+
            "<div class='card-content'><p> "+data.article_context+"</p></div></div>"
    );

}