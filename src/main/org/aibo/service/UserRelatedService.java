package org.aibo.service;

import org.aibo.bean.User_Followed;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
public interface UserRelatedService {

    public ArrayList<Integer> selectUserRelated(int user_id);
    public ArrayList<Integer> selectRelatedUser(int user_related_id);
    public  int insertUserRelated(User_Followed user_followed);
}
