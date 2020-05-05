package com.company.models;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestList  {
        private List<String>names = new ArrayList<>();

        public void addList(String s) {
            this.names.add(s);

        }
        public List<String> getList(){

            return this.names;
        }
        public boolean remove(String nameR){
            return this.names.remove(nameR);
        }
        public void printListByForEach(){
            for(String namePrint : this.names){
                System.out.println(namePrint);
            }
        }
        public void printListByForEach2(){
            this.names.forEach((nameP)->{
                System.out.println(nameP);
            });
        }
        public List<String> orderAsc(){
             Collections.sort(names);
             return names;

        }
        public List<String>reverseOrder(){
            Collections.reverse(names);
            return names;

        }

}
