package com.lin.core.controller;

import com.lin.annotation.MyController;
import com.lin.annotation.MyRequestMapping;
import com.lin.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/12 15:52
 * @Description:
 */
@MyController
@MyRequestMapping("/test")
public class TestController {

    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
                      @MyRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method success! param:" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
//        System.out.println(param);
        try {
            response.getWriter().write("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
