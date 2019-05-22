﻿package com.ssslinppp.reflectdemo.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RUNTIME)
public @interface ParamAnnotation {
    String alias() default "";
}
