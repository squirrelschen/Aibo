package org.aibo.service;

import org.aibo.bean.User;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public interface UserService {

    public User getUserInfo(String username);
    public int  updateUserInfo(User user);

    public String selectUserPassWordById(String user_name);
}
