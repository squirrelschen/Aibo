package org.aibo.dao;

import org.aibo.bean.User_Collected;
import java.util.Date;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
public interface UserCollectedDao {

    public User_Collected selectUserCollectedById(int user_id);  //根据用户id获取收藏的博文信息
    public int insertUserCollected(int user_id,int article_id,Date collected_date); //插入用户收藏记录
    public int deleteUserCollectedById(int collected_id);                          //删除对应的用户记录
}


