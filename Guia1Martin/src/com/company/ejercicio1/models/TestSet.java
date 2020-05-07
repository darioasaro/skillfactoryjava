package com.company.ejercicio1.models;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    private Set<Alumn> alumnHashSet = new HashSet<>();

    public void addAlumn(Alumn alu){
        alumnHashSet.add(alu);
    }
    public void printHashSet(){
        alumnHashSet.forEach(alumn-> System.out.println("Alumno : " + alumn.getName()));

    }
    public boolean removeAlumn(String alu){
        return alumnHashSet.removeIf((Alumn element) -> {
            return (element.getName() == alu);
        });
    }

}
