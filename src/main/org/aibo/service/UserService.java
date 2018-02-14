package org.aibo.service;

import org.aibo.bean.User;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public interface UserService {

    public User getUserInfo(String username);
    public int  updateUserInfo(User user);

    public String selectUserPassWordByName(String user_name);
    public int updateUserPassWordById(int user_id,String password);
    public int updateUserIconById(int user_id,String icon);
}
