package org.aibo.mapper;

import org.aibo.bean.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
@Component
public interface MessageMapper {
    public ArrayList<Message> selectMessageByUserId(int user_id);
    public Message selectMessageById(int message_id);
}
