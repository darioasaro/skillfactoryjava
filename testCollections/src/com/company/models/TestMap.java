package com.company.models;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    private Map<String,String> strMap = new HashMap<>();

    public void addToMap(String key,String value){
        strMap.put(key,value);
    }
    public void removeToMap(String key){
        if(strMap.containsKey(key)){
            strMap.remove(key);
        }
    }
    public void printMap(){
        strMap.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }
    public Object getValue(String key) throws Exception{

            String result = strMap.get(key);
            return result;


    }


}
