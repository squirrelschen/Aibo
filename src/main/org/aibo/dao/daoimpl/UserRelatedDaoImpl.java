package org.aibo.dao.daoimpl;

import org.aibo.dao.UserRelatedDao;
import org.aibo.mapper.UserRelatedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
@Repository
public class UserRelatedDaoImpl implements UserRelatedDao {

    @Autowired
    private UserRelatedMapper userRelatedMapper;

    public ArrayList<Integer> selectUserRelated(int user_id) {
        return userRelatedMapper.selectUserRelated(user_id);
    }

    public ArrayList<Integer> selectRelatedUser(int user_related_id) {
        return userRelatedMapper.selectRelatedById(user_related_id);
    }
}
