package org.aibo.dao;

import org.aibo.bean.User_Collected;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public interface UserCollectedDao {


    public ArrayList<Integer> selectUserCollectedById(int user_id);   //根据用户id获取用户所有的收藏信息
    public int deleteUserCollectedById(int collected_id);         //根据收藏id删除收藏



}
