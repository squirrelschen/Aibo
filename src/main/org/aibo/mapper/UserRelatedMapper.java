package org.aibo.mapper;

import org.aibo.bean.User_Followed;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
@Component
public interface UserRelatedMapper {

    public ArrayList<Integer> selectUserRelated(int user_id);

    public ArrayList<Integer> selectRelatedById(int user_related_id);

    public int insertUserRelated(User_Followed user_followed);

}
