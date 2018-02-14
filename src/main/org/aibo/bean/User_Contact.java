package org.aibo.bean;

import java.io.Serializable;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public class User_Contact implements Serializable {

    private static final long serialVersionUID = -2987828402261461146L;
    private int user_id;
    private String user_tel;
    private String user_email;

    private String user_twitter;
    private String user_facebook;
    private String user_google;
    private String user_github;

    private String user_qq;
    private String user_wechat;
    private String user_weibo;

    /**
     * User_Contact getter setter 方法
     */

    public int getUser_id() {
        return user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_facebook() {
        return user_facebook;
    }

    public String getUser_github() {
        return user_github;
    }

    public String getUser_google() {
        return user_google;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public String getUser_twitter() {
        return user_twitter;
    }

    public String getUser_wechat() {
        return user_wechat;
    }

    public String getUser_weibo() {
        return user_weibo;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_facebook(String user_facebook) {
        this.user_facebook = user_facebook;
    }

    public void setUser_github(String user_github) {
        this.user_github = user_github;
    }

    public void setUser_google(String user_google) {
        this.user_google = user_google;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public void setUser_twitter(String user_twitter) {
        this.user_twitter = user_twitter;
    }

    public void setUser_wechat(String user_wechat) {
        this.user_wechat = user_wechat;
    }

    public void setUser_weibo(String user_weibo) {
        this.user_weibo = user_weibo;
    }
}
