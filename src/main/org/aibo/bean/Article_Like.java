package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Like implements Serializable {

    private static final long serialVersionUID = 2951606268254613733L;
    private int like_id;                 //点赞id
    private int like_article_id;             //点赞的博文id
    private int like_user_id;               //点赞的用户id
    private Date like_date;            //点赞的时间

    /**
     *  Article_Like getter setter方法
     */

    public int getLike_id() {
        return like_id;
    }

    public Date getLike_date() {
        return like_date;
    }

    public int getLike_article_id() {
        return like_article_id;
    }

    public int getLike_user_id() {
        return like_user_id;
    }

    public void setLike_id(int like_id) {
        this.like_id = like_id;
    }

    public void setLike_date(Date like_date) {
        this.like_date = like_date;
    }

    public void setLike_article_id(int like_article_id) {
        this.like_article_id = like_article_id;
    }

    public void setLike_user_id(int like_user_id) {
        this.like_user_id = like_user_id;
    }
}
