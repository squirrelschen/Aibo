/**
 * Created by Squirrel-Chen on 2018/2/3.
 */

$(document).ready(function () {

$('.element').dropload({
    scrollArea : window,
    loadDownFn : function(me){
        $.ajax({
            type: 'GET',
            url: 'json/more.json',
            dataType: 'json',
            success: function(data){
                // 每次数据加载完，必须重置
                LoadPage();
                me.resetload();
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


function LoadPage() {
    $("#context_container").append("<div class='card blue-grey darken-1'>"+
    "<div class='card-content white-text'>"+
        "<span class='card-title'>Card Title</span>"+
    "<p>I am a very simple card. I am good at containing small bits of information."+
       " I am convenient because I require little markup to use effectively.</p>"+
    "</div>"+
    "<div class='card-action'>"+
        "<a href='#'>This is a link</a>"+
    "<a href='#'>This is a link</a>"+
    "</div>"+
    "</div>");

}