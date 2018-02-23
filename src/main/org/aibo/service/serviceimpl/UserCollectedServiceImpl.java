package org.aibo.service.serviceimpl;

import org.aibo.bean.User_Collected;
import org.aibo.dao.UserCollectedDao;
import org.aibo.service.UserCollectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
@Service
public class UserCollectedServiceImpl implements UserCollectedService{

    @Autowired
    private UserCollectedDao userCollectedDao;


    public User_Collected selectUserCollectedById(int user_id) {
        return userCollectedDao.selectUserCollectedById(user_id);
    }

    public int insertUserCollected(int user_id, int article_id, Date collected_date) {
        return userCollectedDao.insertUserCollected(user_id, article_id, collected_date);
    }

}
