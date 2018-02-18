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

    public User selectUserInfoById(int user_id) {
        return userDao.selectUserInfoById(user_id);
    }

    public String selectUserPassWordByName(String user_name) {
        return userDao.selectUserPassWordByName(user_name);
    }

    public int updateUserPassWordById(int user_id, String password) {
        return userDao.updateUserPassWordById(user_id, password);
    }

    public int updateUserIconById(int user_id, String icon) {
        return userDao.updateUserIconById(user_id, icon);
    }

    public int insertUserInfo(User user) {
        return userDao.insertUserInfo(user);
    }

    public int updateUserLevel(int user_id, double user_level) {
        return userDao.updateUser_level(user_id, user_level);
    }
}
