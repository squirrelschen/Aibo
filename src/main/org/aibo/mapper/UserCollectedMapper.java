package org.aibo.mapper;

import org.aibo.bean.User_Collected;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
@Component
public interface UserCollectedMapper {

    public ArrayList<Integer> selectUserCollectedById(int user_id);
    public int deleteUserCollectedById(int collected_id);
}
