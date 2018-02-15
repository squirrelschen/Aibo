package org.aibo.service.serviceimpl;

import org.aibo.dao.UserRelatedDao;
import org.aibo.service.UserRelatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
@Service
public class UserRelatedServiceImpl implements UserRelatedService {

    @Autowired
    private UserRelatedDao userRelatedDao;

    public ArrayList<Integer> selectUserRelated(int user_id) {
        return userRelatedDao.selectUserRelated(user_id);
    }
}
