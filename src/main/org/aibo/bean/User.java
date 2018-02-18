package org.aibo.bean;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

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
    private String user_realname;             //用户真实姓名
    private String user_sex;                  //用户性别
    private String user_job;                  //用户职位
    private String user_work;                 //用户所属行业
    private String user_area;                 //用户所在地区
    private String user_desc;                 //用户简述
    private String user_icon;                 //用户头像存放路径
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")                //设置date类型json处理时间格式
    private Date user_birth;                 //用户生日
    private double user_level;               //用户经验值


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

    public String getUser_realname() {
        return user_realname;
    }

    public void setUser_realname(String user_realname) {
        this.user_realname = user_realname;
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

    public String getUser_area() {
        return user_area;
    }

    public void setUser_area(String user_area) {
        this.user_area = user_area;
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

    public void setUser_birth(Date user_birth) {
        this.user_birth = user_birth;
    }

    public Date getUser_birth() {
        return user_birth;
    }

    public double getUser_level() {
        return user_level;
    }

    public void setUser_level(double user_level) {
        this.user_level = user_level;
    }

    public String toString(){

        return   user_id+"user_name is "+user_name+"user_realname is "+user_realname+
                "user_sex is"+user_sex+"user_job is"+user_job+"user_work is"+user_work+"user_birth is"+user_birth+
                "user_icon is"+user_icon+"user_area is"+user_area+"user_desc is "+user_desc;
    }
}
