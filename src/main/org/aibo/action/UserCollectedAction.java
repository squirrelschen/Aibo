package org.aibo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Squirrel-Chen on 2018/2/24.
 *  用户收藏的action
 */

@Controller
public class UserCollectedAction {


    @RequestMapping("/collected")
    public Object collected(){
        return null;
    }



}
