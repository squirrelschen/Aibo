package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Comment implements Serializable{

    private static final long serialVersionUID = 1617770232228346954L;
    private int comment_id;     //评论id
    private int comment_user_id;       //评论用户id
    private int comment_article_id;    //评论博文id
    private Date comment_date;  //评论时间
    private int comment_context;  //评论内容

    /**
     * Article_Comment getter setter 方法
     */

    public int getComment_id() {
        return comment_id;
    }

    public int getComment_context() {
        return comment_context;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public int getComment_article_id() {
        return comment_article_id;
    }

    public int getComment_user_id() {
        return comment_user_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public void setComment_context(int comment_context) {
        this.comment_context = comment_context;
    }

    public void setComment_article_id(int comment_article_id) {
        this.comment_article_id = comment_article_id;
    }

    public void setComment_user_id(int comment_user_id) {
        this.comment_user_id = comment_user_id;
    }
}
