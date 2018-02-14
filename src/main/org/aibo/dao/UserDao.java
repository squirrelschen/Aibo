package org.aibo.dao;

import org.aibo.bean.User;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public interface UserDao {

    public User getUserInfo(String username);   //获取用户信息
    public int  updateUserInfo(User user);      //更新用户信息

    public String selectUserPassWordById(String user_name);    //根据用户名获取用户密码
}
