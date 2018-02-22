package org.aibo.mapper;

import org.aibo.bean.User_Collected;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by Squirrel-Chen on 2018/2/17.
 */
@Component
public interface UserCollectedMapper {
    public List<User_Collected> selectUserCollectedById(int user_id);
}
