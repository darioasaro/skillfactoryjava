package ejercicio2.models;

import ejercicio2.models.utils.SelfUtils;

import java.util.ArrayList;
import java.util.List;

public class Marathon {
    private List<Sprintable> competitors;
    private double distance;

    public Marathon(double dist){
        distance = dist;
        competitors = new ArrayList<>();
    }
    public void addCompetitor(Sprintable compet){
        competitors.add(compet);
    }
    public void runMarathon(){
        System.out.println("***Marathon***");
        System.out.println("Distance : "+distance + "km");

        for(Sprintable runner : competitors ){
           double time = runner.run(distance);
            System.out.println(SelfUtils.getDuration(runner.getName(),time));

        }
    }
}
