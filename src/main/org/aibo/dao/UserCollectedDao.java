package org.aibo.dao;

import org.aibo.bean.User_Collected;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public interface UserCollectedDao {

    public User_Collected selectUserCollectedById(int user_id);  //根据用户id获取收藏的博文信息

}
