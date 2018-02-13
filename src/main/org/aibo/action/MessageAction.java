package org.aibo.action;

import org.aibo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Squirrel-Chen on 2018/2/13.
 */
@Controller
public class MessageAction {

    @Autowired
    private MessageService messageService;


}
