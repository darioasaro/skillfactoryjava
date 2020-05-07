package ejercicio2.models;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Human extends Species implements Sprintable {

    public Human(String name){
        super(name,5.3);
    }

    @Override
    public Double getVelocity() {
        return (Double)(Math.random() * ((10.0 - velocity) + 1)) + velocity;
    }

    @Override
    public Double run(Double distance) { return (distance / getVelocity());}

    @Override
    public String getName() {
        return name;
    }
}
