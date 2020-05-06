package ejercicio2.models;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Human extends Species implements Sprintable {

    public Human(String name){
        super(name,5.3);
    }

    @Override
    public Double getVelocity() {
        return (Double)(Math.random() * ((10.0 - getVelocity()) + 1)) + getVelocity();
    }

    @Override
    public Double run(Double distance) {
        return (distance / getVelocity());
    }
}
