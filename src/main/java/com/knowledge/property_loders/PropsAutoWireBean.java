package com.knowledge.property_loders;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "another")
public class PropsAutoWireBean {

    private List<String> exampleList;
    private Map<String,String> exampleMap;

    public void checkCollections(){
//        System.out.println("PropsAutoWireBean:: Values in the map, are - "+ exampleMap.toString());
//        System.out.println("VPropsAutoWireBean:: alues in the list, are - "+ exampleList.toString());
    }

}
