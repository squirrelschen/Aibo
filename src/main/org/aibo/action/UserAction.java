package org.aibo.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.aibo.bean.User;
import org.aibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by Squirrel-Chen on 2018/1/28.
 */
@Controller
public class UserAction {

    @Autowired
    private UserService userService;
    private Object json;

    public Object getJson() {
        return json;
    }
    public void setJson(Object json) {
        this.json = json;
    }

    @RequestMapping(value="/getUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object getUserInfo(@RequestParam("username")String username)
    {
        User user=userService.getUserInfo(username);
        String str="{'status':'true'}";
        HashMap<String,Object> result=new HashMap();
        result.put("s",str);
        result.put("user",user);
        json= JSON.toJSON(result);
        return json;
    }

}
