package org.aibo.dao;

import org.aibo.bean.User_Contact;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public interface UserContactDao {

    public User_Contact selectUserContactByUserId(int user_id);
}
