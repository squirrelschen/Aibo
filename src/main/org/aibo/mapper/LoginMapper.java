package org.aibo.mapper;

import org.springframework.stereotype.Component;

/**
 * Created by Squirrel-Chen on 2018/1/25.
 */
@Component
public interface LoginMapper {

    public String login(String username);
}
