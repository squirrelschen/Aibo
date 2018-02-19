package org.aibo.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public class User_Collected implements Serializable{

    private static final long serialVersionUID = -3877634378182876960L;
    private int user_id;
    private ArrayList<Article_Collected> collecteds;


    /**
     *  User_Collection getter setter 方法
     */

    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public ArrayList<Article_Collected> getCollecteds() {
        return collecteds;
    }

    public void setCollecteds(ArrayList<Article_Collected> collecteds) {
        this.collecteds = collecteds;
    }
}
