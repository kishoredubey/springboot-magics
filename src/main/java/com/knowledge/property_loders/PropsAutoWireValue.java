package com.knowledge.property_loders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class PropsAutoWireValue {

    @Value("#{${exampleMap}}")
    private Map<String,String>  exampleMap;

    @Value("#{${exampleList}}")
    private List<String> exampleList;

    public void checkCollections(){
        System.out.println("PropsAutoWireValue:: Values in the map, are - "+ exampleMap.toString());
        System.out.println("PropsAutoWireValue:: Values in the list, are - "+ exampleList.toString());
    }
}
