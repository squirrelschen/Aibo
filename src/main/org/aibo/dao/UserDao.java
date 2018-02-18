package org.aibo.dao;

import org.aibo.bean.User;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public interface UserDao {

    public User getUserInfo(String username);   //获取用户信息
    public int  updateUserInfo(User user);      //更新用户信息

    public User selectUserInfoById(int user_id);                 //根据用户id获取用户信息
    public String selectUserPassWordByName(String user_name);    //根据用户名获取用户密码
    public int updateUserPassWordById(int user_id,String password);   //根据用户id更改用户密码
    public int updateUserIconById(int user_id,String icon);          //修改用户头像
    public int insertUserInfo(User user);                          //增加用户信息
}
