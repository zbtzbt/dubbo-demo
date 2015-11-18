package com.zbt.dubbo.consumer.controller;

import com.zbt.dubbo.provider.model.User;
import com.zbt.dubbo.provider.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Frank Zhang on 15/11/18.
 */
@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping( value = "/getAll", method = RequestMethod.GET )
    @ResponseBody
    public List<User> getSettleCheckBatchs() {
        return userService.getAll();
    }
}
