package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public class User_Followed implements Serializable {


    private static final long serialVersionUID = 2922029549355920255L;
    private int user_id;
    private int user_followed_id;
    private Date followed_date;

    /**
     * User_Followed getter setter 方法
     */

    public int getUser_id() {
        return user_id;
    }

    public Date getFollowed_date() {
        return followed_date;
    }

    public int getUser_followed_id() {
        return user_followed_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFollowed_date(Date followed_date) {
        this.followed_date = followed_date;
    }

    public void setUser_followed_id(int user_followed_id) {
        this.user_followed_id = user_followed_id;
    }
}
