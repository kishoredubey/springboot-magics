package com.config;

import com.knowledge.annotation.AnnotationTest;
import com.knowledge.property_loders.PropsAutoWireBean;
import com.knowledge.property_loders.PropsAutoWireValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com")
public class Application  implements CommandLineRunner{
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(Application.class, args);
    }

    @Autowired
    private AnnotationTest annotationTest;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner running");
        annotationTest.serve();
        annotationTest.performChecks();

        propsAutoWireValue.checkCollections();
        propsAutoWireBean.checkCollections();
    }

    @Autowired
    private PropsAutoWireValue propsAutoWireValue;
    @Autowired
    private PropsAutoWireBean propsAutoWireBean;

}
