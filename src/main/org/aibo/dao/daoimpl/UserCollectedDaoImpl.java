package org.aibo.dao.daoimpl;

import org.aibo.bean.User_Collected;
import org.aibo.dao.UserCollectedDao;
import org.aibo.mapper.UserCollectedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
@Repository
public class UserCollectedDaoImpl implements UserCollectedDao{


    @Autowired
    private UserCollectedMapper collectedMapper;

    public User_Collected selectUserCollectedById(int user_id) {
        return collectedMapper.selectUserCollectedById(user_id);
    }
}
