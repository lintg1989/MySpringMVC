package com.lin.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/24 16:40
 * @Description:
 */
public class UserMapperXml {
    public static final String namespace = "com.lin.service.UserMapper";

    public static final Map<String, String> map = new HashMap<>();

    static {
        map.put("getUserById", "select * from User where id =?");
    }
}
