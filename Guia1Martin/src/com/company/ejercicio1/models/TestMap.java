package com.company.ejercicio1.models;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    private Map<String,String> strMap ;

    public TestMap(){
        strMap = new HashMap<>();
    }

    public void addToMap(String key,String value){

        try {
            strMap.put(key, value);
            System.out.println("Element added");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }

    public void removeToMap(String key){
        if(strMap.containsKey(key)){
           try {
               strMap.remove(key);
               System.out.println("Element deleted");
           }catch(Exception e){
           e.printStackTrace();
           }
        }
        else{
            System.out.println("Element "+ key + " not exist");
        }
    }
    public void printMapWithLambda(){
        strMap.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }
    public void printMapWithStreams(){
        strMap.entrySet().stream()
                .forEach(entry-> System.out.println("key: "+ entry.getKey() + "  value : "+ entry.getValue()));
    }


    //*** Check this method ***
    public String getValue(String key) {

           return strMap.get(key);

    }

    public static void main(String[] args) {
        TestMap mapper = new TestMap();
        mapper.addToMap("Dario", "darioasaro29@gmail.com");
        mapper.addToMap("Luciana", "ludimeglio27@gmail.com");
        mapper.addToMap("Testing", "testingmdq@gmail.com");
        mapper.printMapWithLambda();
        mapper.removeToMap("Dario");
        System.out.println(mapper.getValue("Dario"));
        mapper.printMapWithStreams();

    }
}
