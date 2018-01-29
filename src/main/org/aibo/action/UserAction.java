package org.aibo.action;

import com.alibaba.fastjson.JSON;
import org.aibo.bean.User;
import org.aibo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
@Controller
public class UserAction {

    @Autowired
    private UserService userService;
    private Object json;
    private String status;

    public Object getJson() {
        return json;
    }
    public void setJson(Object json) {
        this.json = json;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private static Logger logger=Logger.getLogger(UserAction.class);


    @RequestMapping(value="/getUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object getUserInfo(@RequestParam("username")String username)
    {

        if(!username.equals(""))
        {
            User user=userService.getUserInfo(username);
            if(user!=null)
            {
                json=JSON.toJSON(user);
            }
            else
            {
                status="{'status':'2'}";
                json=JSON.parse(status);
            }
        }
        else
        {
            status="{'status':'0'}";
            json=JSON.parse(status);
        }
        return json;
    }


    @RequestMapping(value="/updateUserInfo",method = RequestMethod.POST)
    public String updateUserInfo(User user)
    {
        logger.debug(user);
        userService.updateUserInfo(user);
        return "success";
    }
}
