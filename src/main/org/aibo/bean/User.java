package org.aibo.bean;

import java.io.Serializable;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public class User implements Serializable{

    private static final long serialVersionUID = -3682557530779530927L;
    /**
     *  用户bean所有的属性
     */

    private int user_id;                       //用户id
    private String user_name;                  //用户名
    private String user_nickname;             //用户昵称
    private String user_relaname;             //用户真实姓名
    private String user_sex;                  //用户性别
    private String user_job;                  //用户职位
    private String user_work;                 //用户所属行业
    private String user_ares;                 //用户所在地区
    private String user_desc;                 //用户简述
    private String user_icon;                 //用户头像存放路径

    /**
     *  属性的getter setter 方法
     * @return
     */

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_relaname() {
        return user_relaname;
    }

    public void setUser_relaname(String user_relaname) {
        this.user_relaname = user_relaname;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_job() {
        return user_job;
    }

    public void setUser_job(String user_job) {
        this.user_job = user_job;
    }

    public String getUser_work() {
        return user_work;
    }

    public void setUser_work(String user_work) {
        this.user_work = user_work;
    }

    public String getUser_ares() {
        return user_ares;
    }

    public void setUser_ares(String user_ares) {
        this.user_ares = user_ares;
    }

    public String getUser_desc() {
        return user_desc;
    }

    public void setUser_desc(String user_desc) {
        this.user_desc = user_desc;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

}
