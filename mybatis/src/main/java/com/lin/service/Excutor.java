package com.lin.service;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/24 16:56
 * @Description:
 */
public interface Excutor {
    public <T> T query(String state, Object parameter);
}
