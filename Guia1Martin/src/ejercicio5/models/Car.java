package ejercicio5.models;

import java.util.Objects;

public class Car {
    private String model;
    private Integer prize;

    @Override
    public String toString() {
        return "Car" +
                "model= '" + model + '\'' +
                ", prize=" + prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getPrize());
    }

    public Car (String modelN, Integer prizeN){
        model = modelN;
        prize = prizeN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }
}
