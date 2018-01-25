package org.aibo.service.serviceimpl;

import org.aibo.dao.LoginDao;
import org.aibo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Squirrel-Chen on 2018/1/25.
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginDao loginDao;

    public boolean login(String username, String password) {
        return loginDao.login(username, password);
    }
}
