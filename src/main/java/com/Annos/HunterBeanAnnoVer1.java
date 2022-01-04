package com.Annos;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 自定义注解，通过 BeanPostProccessor 实现
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HunterBeanAnnoVer1 {
    String param() default "null thing";
}
