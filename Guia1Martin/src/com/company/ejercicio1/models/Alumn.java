package com.company.ejercicio1.models;

public class Alumn {
    private static int id = 0;
    private String name;
    private Integer age;
    public Alumn(String name,Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Alumn) {
            Alumn p = (Alumn)o;
            return this.name.equals(p.name);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return age * this.name.length();
    }


}
