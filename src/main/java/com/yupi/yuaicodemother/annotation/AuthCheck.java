package com.yupi.yuaicodemother.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// AOP 切面中，需要先设置注解，里面指定生效范围和操作
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    // 必须有某个角色，这里意思就是谁都可以调用
    String mustRole() default "";
}
