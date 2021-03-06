package ejercicio2.models;

public class Robot extends Species implements Sprintable {
    public Robot(String name){
        super(name,10.0);
    }

    @Override
    public Double getVelocity() {
        return (Double)(Math.random() * ((25.0 - velocity) + 1)) + velocity;
    }

    @Override
    public Double run(Double distance) {
        return (distance / getVelocity());
    }

    @Override
    public String getName() {
        return name;
    }
}
