package ejercicio2.models;

public class Dog extends Species implements Sprintable{
    public Dog (String name){
        super(name,9.0);
    }

    @Override
    public Double getVelocity() {
        return (Double)(Math.random() * ((15.0 - velocity) + 1)) + velocity;
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
