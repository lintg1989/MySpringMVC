package com.lin.core.controller;

import com.lin.annotation.MyController;
import com.lin.annotation.MyQuatifier;
import com.lin.annotation.MyRequestMapping;
import com.lin.annotation.MyService;
import com.lin.core.service.SpringmvcService;
import com.lin.core.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/16 14:14
 * @Description:
 */
@MyController("lin")
public class TestSpringmvcController {

    @MyQuatifier("TestServiceImpl")
    TestService testService;
    @MyQuatifier("SpringmvcServiceImpl")
    SpringmvcService springmvcService;

    @MyRequestMapping("/insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        testService.insert(null);
        springmvcService.insert(null);
        return null;
    }

    @MyRequestMapping("/delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        testService.delete(null);
        springmvcService.delete(null);
        return null;
    }

    @MyRequestMapping("/update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        testService.update(null);
        springmvcService.update(null);
        return null;
    }

    @MyRequestMapping("/select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        testService.select(null);
        springmvcService.select(null);
        return null;
    }

}
