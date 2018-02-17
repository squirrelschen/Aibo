package org.aibo.service.serviceimpl;

import org.aibo.bean.User_Collected;
import org.aibo.dao.UserCollectedDao;
import org.aibo.service.UserCollectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public int deleteUserColltedById(int collected_id) {
        return userCollectedDao.deleteUserCollectedById(collected_id);
    }
}
