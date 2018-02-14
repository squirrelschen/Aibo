package org.aibo.mapper;

import org.aibo.bean.User_Contact;
import org.springframework.stereotype.Component;

/**
 * Created by Squirrel-Chen on 2018/2/14.
 */
@Component
public interface UserContactMapper {

    public User_Contact selectUserContactById(int user_id);
}
