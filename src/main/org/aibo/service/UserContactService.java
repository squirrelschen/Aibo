package org.aibo.service;

import org.aibo.bean.User_Contact;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public interface UserContactService {

    public User_Contact selectUserContactById(int user_id);
    public int updateUserContactById(User_Contact user_contact);
    public int insertUserContact(User_Contact user_contact);
}
