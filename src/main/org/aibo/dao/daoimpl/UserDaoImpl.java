package org.aibo.dao.daoimpl;

import org.aibo.bean.User;
import org.aibo.dao.UserDao;
import org.aibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;


    public User getUserInfo(String username) {

        return userMapper.getUserInfo(username);
    }

    public int updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }

    public User selectUserInfoById(int user_id) {
        return userMapper.selectUserInfoById(user_id);
    }

    public String selectUserPassWordByName(String user_name) {
        return userMapper.selectUserPassWordByName(user_name);
    }

    public int updateUserPassWordById(int user_id, String password) {
        return userMapper.updateUserPassWordById(user_id, password);
    }

    public int updateUserIconById(int user_id, String icon) {
        return userMapper.updateUserPassWordById(user_id, icon);
    }

    public int insertUserInfo(User user) {
        return userMapper.insertUserInfo(user);
    }

    public int updateUserlevel(int user_id, double user_level) {
        return userMapper.updateUserLevel(user_id, user_level);
    }
}
