package org.aibo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Squirrel-Chen on 2018/2/24.
 *  用户联系方式action
 */
@Controller
public class UserContactAction {


    @RequestMapping("/update")
    public Object update(){return  null;
    }

    @RequestMapping("/insert")
    public Object insert()
    {
        return null;
    }


}
