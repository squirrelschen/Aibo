package org.aibo.dao;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
public interface UserRelatedDao {
    public ArrayList<Integer> selectUserRelated(int user_id);
}
