package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/3.
 */
public class Article implements Serializable{

    private static final long serialVersionUID = -1612504911440358382L;

    private int article_id;                          //博文的id
    private int article_type;                        //博文类型
    private int article_user_id;                     //博文所属用户
    private String article_title;                    //博文标题
    private String article_context;                  //博文内容
    private Date article_publish_date;                //博文发布时间
    private Date article_last_date;                   //博文修改时间

    /**
     *  article getter setter 方法
     */

    public int getArticle_id() {
        return article_id;
    }

    public int getArticle_type() {
        return article_type;
    }

    public int getArticle_user_id() {
        return article_user_id;
    }

    public Date getArticle_last_date() {
        return article_last_date;
    }

    public Date getArticle_publish_date() {
        return article_publish_date;
    }

    public String getArticle_context() {
        return article_context;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setArticle_user_id(int article_user_id) {
        this.article_user_id = article_user_id;
    }

    public void setArticle_type(int article_type) {
        this.article_type = article_type;
    }

    public void setArticle_context(String article_context) {
        this.article_context = article_context;
    }

    public void setArticle_last_date(Date article_last_date) {
        this.article_last_date = article_last_date;
    }

    public void setArticle_publish_date(Date article_publish_date) {
        this.article_publish_date = article_publish_date;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }
}
