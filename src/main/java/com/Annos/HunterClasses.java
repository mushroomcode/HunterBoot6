package com.Annos;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface HunterClasses {

}
