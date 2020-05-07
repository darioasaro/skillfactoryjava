package ejercicio2.models;

public abstract class Species {
    protected String name;
    protected Double velocity;
    public Species(String nam , Double vel){
        this.name = nam;
        this.velocity = vel;
    }

    public abstract Double getVelocity();

}
