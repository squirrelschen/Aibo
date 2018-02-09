package org.aibo.dao.daoimpl;

import org.aibo.bean.Message;
import org.aibo.dao.MessageDao;
import org.aibo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/9.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private MessageMapper messageMapper;

    public ArrayList<Message> selectMessageByUserId(int user_id) {
        return messageMapper.selectMessageByUserId(user_id);
    }
}
