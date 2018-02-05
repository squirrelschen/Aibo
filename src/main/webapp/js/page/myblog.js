/**
 * Created by Squirrel-Chen on 2018/2/3.
 */

$(document).ready(function () {

    var pageSize=3;
    var pageNum=0;

$('#container').dropload({
    scrollArea : window,
    loadDownFn : function(me){
        pageNum=pageNum+1;
        $.ajax({
            url: 'myarticle',
            dataType: 'json',
            data:{'user_id':1,'pageNum':pageNum,'pageSize':pageSize},
            method:"post",
            success: function(data){

                console.log(pageNum);

                if(data.status==true)
                {

                }
                else
                {
                    me.lock();
                    me.noData();
                }
                // 为了测试，延迟1秒加载
                setTimeout(function(){
                    // 插入数据到页面，放到最后面
                    loaddata(data.articles);
                    // 每次数据插入，必须重置
                    me.resetload();
                },1000);
            },
            error: function(xhr, type){
                alert('Ajax error!');
                // 即使加载出错，也得重置
                me.resetload();
            }
        });
    }
});
   

});




function loaddata(data) {

    $.each(data,function (i,x) {

            $("#context_container").append("<div class='card blue-grey darken-1'>" +
                "<div class='card-content white-text'>"+
                "<div class='card-title'>"+
                "<span>" + x.article_title + "</span>"+"<div id='title-right' style='float: right;display: inline' ><span>"+x.article_publish_date+"</span></div><hr/></div>"+
                "<div class='card-context'><p>" + x.article_context + "</p>" +
                "</div></div>" +
                "<div class='card-action'> " +
                "<a href='' value='" + x.artitle_id + "'>More</a>" +
                "</div>" +
                "</div>")
    })
};



