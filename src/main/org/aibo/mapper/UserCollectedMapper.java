package org.aibo.mapper;

import org.aibo.bean.User_Collected;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
@Component
public interface UserCollectedMapper {

    public User_Collected selectUserCollectedById(int user_id);
    public int insertUserCollected(int user_id,int article_id,Date collected_date);
}
