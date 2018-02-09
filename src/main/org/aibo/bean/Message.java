package org.aibo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 7257719638171960078L;
    private int message_id;                //消息编号id
    private int message_type;              //消息类型
    private int message_user_id;          //消息所属用户id
    private String message_title;         //消息标题
    private String message_context;        //消息内容
    private Date message_date;             //消息发布时间

    /**
     *  Message getter setter 方法
     */

    public int getMessage_id() {
        return message_id;
    }

    public int getMessage_user_id() {
        return message_user_id;
    }

    public int getMessage_type() {
        return message_type;
    }

    public Date getMessage_date() {
        return message_date;
    }

    public String getMessage_context() {
        return message_context;
    }

    public String getMessage_title() {
        return message_title;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public void setMessage_user_id(int message_user_id) {
        this.message_user_id = message_user_id;
    }

    public void setMessage_type(int message_type) {
        this.message_type = message_type;
    }

    public void setMessage_title(String message_title) {
        this.message_title = message_title;
    }

    public void setMessage_date(Date message_date) {
        this.message_date = message_date;
    }

    public void setMessage_context(String message_context) {
        this.message_context = message_context;
    }
}
