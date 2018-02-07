package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Collection implements Serializable{

    private static final long serialVersionUID = 8918416247831526099L;
    private int collection_id;    //收藏的id
    private int article_id;      //收藏的博文id
    private int user_id;         //收藏的用户id
    private Date collection_date;  //收藏的时间

    /**
     *  Article_Collection getter setter 方法
     */

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public int getCollection_id() {
        return collection_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }
}
