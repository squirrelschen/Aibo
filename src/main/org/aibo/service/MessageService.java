package org.aibo.service;

import org.aibo.bean.Message;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
public interface MessageService {

    public ArrayList<Message> selectMessageByUserId(int user_id);
}
