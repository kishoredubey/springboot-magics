package com.knowledge.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoCheckAspect {

    @Before("@annotation(com.knowledge.annotation.DoCheck) && @annotation(doCheck)")
    public void before(JoinPoint joinPoint, DoCheck doCheck){

        if (doCheck.checkThis()){
            System.out.println("doing this check");
        }
        if(doCheck.checkThat()){
            System.out.println("doing that check");
        }
    }
}
