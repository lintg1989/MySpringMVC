package com.lin.core.service.impl;

import com.lin.annotation.MyService;
import com.lin.core.service.SpringmvcService;

import java.util.Map;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/16 12:00
 * @Description:
 */
@MyService("SpringmvcServiceImpl")
public class SpringmvcServiceImpl implements SpringmvcService {
    @Override
    public int insert(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "select");
        return 0;
    }
}
