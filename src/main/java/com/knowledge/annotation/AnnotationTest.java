package com.knowledge.annotation;

import org.springframework.stereotype.Component;

/**
 * This test class shows how do you create a Annotation to run certain validation on the methods
 * This makes our header validation approach very neat and clean.
 * Think about testability of the method now.
 * */

@Component
public class AnnotationTest {
    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }

    @DoCheck
    public void performChecks(){

    }
}
