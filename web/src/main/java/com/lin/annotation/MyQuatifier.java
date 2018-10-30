package com.lin.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/16 09:35
 * @Description:
 */
@Target({ElementType.FIELD})// 代表注解的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyQuatifier {
    String value() default "";
}
