package org.aibo.action;

import org.aibo.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;


/**
 * Created by Squirrel-Chen on 2018/1/25.
 */

@Controller
public class LoginAction {

    @Autowired
    private LoginService loginService;
    private static Logger log = Logger.getLogger(LoginAction.class);


    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestParam("username")String username,@RequestParam("password")String password)
    {

        log.info("This is username "+":        "+username+"      :" +"password"+":      "+password+"     :");

        if(username.equals("")||password.equals(""))
        {
            log.debug("This is ' ' string ");
        }
        if(username.equals(null)||password.equals(null))
        {
            log.debug("This is null string ");
        }

        if(loginService.login(username,password))
        {
            return "success";
        }

        return "error";
    }



}
