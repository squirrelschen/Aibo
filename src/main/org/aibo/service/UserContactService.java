package org.aibo.service;

import org.aibo.bean.User_Contact;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public interface UserContactService {

    public User_Contact selectUserContactById(int user_id);
}