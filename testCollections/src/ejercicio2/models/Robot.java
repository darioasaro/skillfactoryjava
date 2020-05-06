package ejercicio2.models;

public class Robot extends Species implements Sprintable {
    public Robot(String name){
        super(name,8.0);
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
