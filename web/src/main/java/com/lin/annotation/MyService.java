package com.lin.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/16 09:38
 * @Description:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
    String value() default "";
}
