package org.aibo.dao;

import org.aibo.bean.User;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
public interface UserDao {
    public User getUserInfo(String username);
}
