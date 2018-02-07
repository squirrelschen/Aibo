package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Collection implements Serializable{

    private static final long serialVersionUID = 8918416247831526099L;
    private int collection_id;    //收藏的id
    private int collection_article_id;      //收藏的博文id
    private int collection_user_id;         //收藏的用户id
    private Date collection_date;  //收藏的时间

    /**
     *  Article_Collection getter setter 方法
     */

    public int getCollection_id() {
        return collection_id;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public int getCollection_article_id() {
        return collection_article_id;
    }

    public int getCollection_user_id() {
        return collection_user_id;
    }

    public void setCollection_id(int collection_id) {
        this.collection_id = collection_id;
    }

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

    public void setCollection_article_id(int collection_article_id) {
        this.collection_article_id = collection_article_id;
    }

    public void setCollection_user_id(int collection_user_id) {
        this.collection_user_id = collection_user_id;
    }
}
