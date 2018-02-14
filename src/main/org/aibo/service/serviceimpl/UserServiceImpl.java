package org.aibo.service.serviceimpl;

import org.aibo.bean.User;
import org.aibo.dao.UserDao;
import org.aibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo(String username) {
        return userDao.getUserInfo(username);
    }

    public int updateUserInfo(User user) {
        return userDao.updateUserInfo(user);
    }

    public String selectUserPassWordByName(String user_name) {
        return userDao.selectUserPassWordByName(user_name);
    }

    public int updateUserPassWordById(int user_id, String password) {
        return userDao.updateUserPassWordById(user_id, password);
    }
}
