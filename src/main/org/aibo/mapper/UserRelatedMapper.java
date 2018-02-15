package org.aibo.mapper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Squirrel-Chen on 2018/2/15.
 */
@Component
public interface UserRelatedMapper {

    public ArrayList<Integer> selectUserRelated(int user_id);

}
