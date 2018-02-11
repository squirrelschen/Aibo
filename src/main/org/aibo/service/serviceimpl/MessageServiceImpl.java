package org.aibo.service.serviceimpl;

import org.aibo.bean.Message;
import org.aibo.dao.MessageDao;
import org.aibo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    public ArrayList<Message> selectMessageByUserId(int user_id) {
        return messageDao.selectMessageByUserId(user_id);
    }

    public Message selectMessageById(int message_id) {
        return messageDao.selectMessageById(message_id);
    }
}
