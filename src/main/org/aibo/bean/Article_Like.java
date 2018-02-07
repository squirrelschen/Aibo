package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Like implements Serializable {

    private static final long serialVersionUID = 2951606268254613733L;
    private int article_id;             //点赞的博文id
    private int user_id;               //点赞的用户id
    private Date like_date;            //点赞的时间

    /**
     *  Article_Like getter setter方法
     */

    public int getArticle_id() {
        return article_id;
    }

    public Date getLike_date() {
        return like_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setLike_date(Date like_date) {
        this.like_date = like_date;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
