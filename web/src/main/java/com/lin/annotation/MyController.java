package com.lin.annotation;

import java.lang.annotation.*;

/**
 * @Auther: Lin tiangang
 * @Date: 2018/10/12 11:33
 * @Description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
