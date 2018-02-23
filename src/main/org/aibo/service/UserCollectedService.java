package org.aibo.service;

import org.aibo.bean.User_Collected;

import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public interface UserCollectedService {

    public User_Collected selectUserCollectedById(int user_id);
    public int insertUserCollected(int user_id,int article_id,Date collected_date);

}
