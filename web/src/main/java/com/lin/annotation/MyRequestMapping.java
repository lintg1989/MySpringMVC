package com.lin.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/12 11:37
 * @Description:
 */
@Target({ElementType.TYPE, ElementType.METHOD})// 在方法上的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    /**
     * 表示访问该方法的url
     * @return
     */
    String value() default "";
}
