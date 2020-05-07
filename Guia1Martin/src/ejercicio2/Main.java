package ejercicio2;

import ejercicio2.models.*;

/*Se va a realizar una carrera entre distintas “especies”. Crear las clases Human, Dog y Robot. Cada objeto debe tener una velocidad
        diferente como atributo (podría ser un random, pero en este caso debemos definir un rango para cada especie) . Las 3 clases deben
        implementar la interfaz Sprintable, la cual tiene un método qué es public Double run(Double distance) (el método recibe la
        distancia de la carrera (en kilómetros) que van a correr y devuelve el tiempo que tardó dicho competidor, calculado con el “coeficiente” de
        velocidad de cada objeto) . Debemos crear una clase que se llame Marathon en la cual debemos cargar los objetos en una List o Set
        y luego debemos iterar sobre dicha colección e ir imprimiendo el tiempo que realiza cada competidor*/

public class Main {

    public static void main(String[] args) {
        //***Uncomment to test!***
        Marathon mardel10k = new Marathon(10.0);
        mardel10k.addCompetitor(new Human("Dario"));
        mardel10k.addCompetitor(new Human("Mauro"));
        mardel10k.addCompetitor(new Robot("R2d2"));
        mardel10k.addCompetitor(new Robot("Robocop"));
        mardel10k.addCompetitor(new Dog("Marley"));
        mardel10k.addCompetitor(new Dog("Electra"));
        mardel10k.runMarathon();

    }
}
