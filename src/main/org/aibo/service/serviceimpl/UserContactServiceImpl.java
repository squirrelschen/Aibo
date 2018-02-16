package org.aibo.service.serviceimpl;

import org.aibo.bean.User_Contact;
import org.aibo.dao.UserContactDao;
import org.aibo.service.UserContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
@Service
public class UserContactServiceImpl implements UserContactService {

    @Autowired
    private UserContactDao userContactDao;

    public User_Contact selectUserContactById(int user_id) {
        return userContactDao.selectUserContactByUserId(user_id);
    }

    public int updateUserContactById(User_Contact user_contact) {
        return userContactDao.updateUserContactById(user_contact);
    }

    public int insertUserContact(User_Contact user_contact) {
        return userContactDao.insertUserContact(user_contact);
    }
}
