package org.aibo.dao.daoimpl;

import org.aibo.dao.LoginDao;
import org.aibo.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Squirrel-Chen on 2018/1/25.
 */
@Repository
public class LoginDaoImpl implements LoginDao{

    @Autowired
    private LoginMapper loginMapper;

    public boolean login(String username, String password) {

        String pass=loginMapper.login(username);
        if(password.equals(pass))
        {
            return true;
        }
        return false;
    }
}
