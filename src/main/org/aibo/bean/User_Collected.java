package org.aibo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public class User_Collected implements Serializable{

    private static final long serialVersionUID = -3877634378182876960L;
    private int user_id;
    private ArrayList<Article> collected_article;
    private Date collected_date;


    /**
     *  User_Collection getter setter 方法
     */

    public int getUser_id() {
        return user_id;
    }

    public ArrayList<Article> getCollected_article() {
        return collected_article;
    }

    public Date getCollected_date() {
        return collected_date;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setCollected_article(ArrayList<Article> collected_article) {
        this.collected_article = collected_article;
    }

    public void setCollected_date(Date collected_date) {
        this.collected_date = collected_date;
    }
}
