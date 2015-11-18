package com.zbt.dubbo.provider.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Frank Zhang on 15/11/17.
 */
public class User implements Serializable {
    public Integer id;
    public String name;
    public String password;
    public Date createDate;
}
