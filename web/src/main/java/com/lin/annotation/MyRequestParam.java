package com.lin.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/12 11:42
 * @Description:
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();
}
