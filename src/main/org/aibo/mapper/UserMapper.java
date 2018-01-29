package org.aibo.mapper;

import org.aibo.bean.User;
import org.springframework.stereotype.Component;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
@Component
public interface UserMapper {

    public User getUserInfo(String  username);
    public int  updateUserInfo(User user);
}
