package org.aibo.dao;

import org.aibo.bean.User_Contact;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
public interface UserContactDao {

    public User_Contact selectUserContactByUserId(int user_id);
    public int updateUserContactById(User_Contact user_contact);
    public int insertUserContact(User_Contact user_contact);
}
