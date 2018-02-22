package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/7.
 */
public class Article_Collected implements Serializable{

    private static final long serialVersionUID = 8918416247831526099L;

    private int collected_id ;
    private Date collected_date;
    private Article article;

    /**
     *  Article_Collection getter setter 方法
     */

    public Date getCollected_date() {
        return collected_date;
    }

    public int getCollected_id() {
        return collected_id;
    }

    public Article getArticle() {
        return article;
    }

    public void setCollected_date(Date collected_date) {
        this.collected_date = collected_date;
    }

    public void setCollected_id(int collected_id) {
        this.collected_id = collected_id;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}

