package com.knowledge.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DoCheck {
    boolean checkThis() default true;
    boolean checkThat() default true;
}
