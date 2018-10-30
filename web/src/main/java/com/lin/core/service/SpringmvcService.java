package com.lin.core.service;

import java.util.Map;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/16 11:35
 * @Description:
 */
public interface SpringmvcService {

    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);

}
