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

                var arrLen = data.length;
                if(arrLen > 0){
                  console.log(data);
                  // loaddata(data);
                    // 如果没有数据
                }else{
                    // 锁定
                    me.lock();
                    // 无数据
                    me.noData();
                }
                // 为了测试，延迟1秒加载
                setTimeout(function(){
                    // 插入数据到页面，放到最后面
                    loaddata(data);
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
                "<div class='card-content white-text'>" +
                "<span class='card-title'>" + x.article_title + "</span>" +
                "<p>" + x.artitle_context + "</p>" +
                "</div>" +
                "<div class='card-action'> " +
                "<a href='' value='" + x.artitle_id + "'>More</a>" +
                "</div>" +
                "</div>")
    })
};



