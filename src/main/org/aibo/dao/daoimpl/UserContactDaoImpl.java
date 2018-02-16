package org.aibo.dao.daoimpl;

import org.aibo.bean.User_Contact;
import org.aibo.dao.UserContactDao;
import org.aibo.mapper.UserContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
@Repository
public class UserContactDaoImpl implements UserContactDao {

    @Autowired
    private UserContactMapper userContactMapper;

    public User_Contact selectUserContactByUserId(int user_id) {
        return userContactMapper.selectUserContactById(user_id);
    }

    public int updateUserContactById(User_Contact user_contact) {
        return userContactMapper.updateUserContactById(user_contact);
    }

    public int insertUserContact(User_Contact user_contact) {
        return userContactMapper.insertUserContact(user_contact);
    }
}
