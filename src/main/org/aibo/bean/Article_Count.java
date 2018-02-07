package org.aibo.bean;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Count {

    private int comments_count;                //评论数
    private int view_count;                    //浏览数
    private int forward_count;                 //转发数
    private int collection_count;              //收藏数
    private int like_count;                    //点赞数

    /**
     *  Article_Count getter setter 方法
     */

    public int getCollection_count() {
        return collection_count;
    }

    public int getComments_count() {
        return comments_count;
    }

    public int getForward_count() {
        return forward_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public int getView_count() {
        return view_count;
    }

    public void setCollection_count(int collection_count) {
        this.collection_count = collection_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public void setForward_count(int forward_count) {
        this.forward_count = forward_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }
}

