package org.aibo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Squirrel-Chen on 2018/1/25.
 */

@Controller
public class LoginAction {

    @RequestMapping("/login")
    public String login(@RequestParam("username")String username,@RequestParam("password")String password)
    {
        return "success";
    }



}
