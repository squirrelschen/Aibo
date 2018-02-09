package org.aibo.dao;

import org.aibo.bean.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
public interface MessageDao {

    public ArrayList<Message> selectMessageByUserId(int user_id);
}
