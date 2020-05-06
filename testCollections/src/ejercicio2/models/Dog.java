package ejercicio2.models;

public class Dog extends Species implements Sprintable{
    public Dog (String name){
        super(name,6.5);
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
