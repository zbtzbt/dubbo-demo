package com.zbt.dubbo.provider.service.impl;

import com.zbt.dubbo.provider.model.User;
import com.zbt.dubbo.provider.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Frank Zhang on 15/11/17.
 */
@Service
public class UserServiceImpl implements UserService {

    public List<User> getAll() {
        User a = new User();
        a.id = 0;
        a.name = "John";
        a.password = "aaaaaa";
        a.createDate = new Date();
        User b = new User();
        b.id = 1;
        b.name = "Frank";
        b.password = "bbbbbb";
        b.createDate = new Date();
        List<User> list = new ArrayList<User>();
        list.add(a);
        list.add(b);
        return list;
    }
}
