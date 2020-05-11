package ejercicio6;

/*
Crear una clase ClubMember con los siguientes atributos:
        name: String
        id: UUID
        phone: String
        age: Integer
        redefinir equals(), hashCode() y toString()
       * Los socios deben tener la posibilidad de ser comparados por su nombre
       * Crear una clase Club en donde los ClubMember van a tener la posibilidad de hacerse socios, votar y renunciar.
       * Entre los mismos socios se votan entre ellos para elegir presidente, la unica condicion es que no se pueden votar a ellos mismos.
       * Por reglamento del club tampoco se puede votar 2 veces, si esto ocurre se descalifica al socio quitándole la posibilidad de ser
        votado por el resto.
       * Cada voto debe ir acompañado del id del socio que votó, si no ingresa su id, a este socio que votó, se le resta un voto, siempre y
        cuando tenga votos, sino, no se le resta.
       * El club mes a mes va publicando una lista actualizada de sus socios, ordenada por orden alfabético (investigar cómo ayudar a la
        colección a comparar objetos).
       * Si desea, puede agregar más funcionalidades y reglas.
*/

import ejercicio6.models.Club;
import ejercicio6.models.ClubMember;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Club theCrew = new Club("The Crew");
        // Test auto fill list
        for(int i = 0;i<10;i++){
            ClubMember generic = new ClubMember("Socio"+ i,"123156"+i,22+i);
            theCrew.associate(generic);
        }
        theCrew.printPartners();
        theCrew.initElections();
    List<ClubMember> members = theCrew.getPartners();

    ClubMember partner1 = members.get(0);
    ClubMember partner2 = members.get(1);
    ClubMember partner3 = members.get(2);
    ClubMember partner4 = members.get(3);
    ClubMember partner5 = members.get(4);
    ClubMember partner6 = members.get(5);
    ClubMember partner7 = members.get(6);
    ClubMember partner8 = members.get(7);
    ClubMember partner9 = members.get(8);
    ClubMember partner10 = members.get(9);

    partner1.vote(theCrew,partner2);
    partner2.vote(theCrew,partner3);
    partner3.vote(theCrew,partner2);
    partner4.vote(theCrew,partner4);
    partner1.vote(theCrew,partner3);
    partner5.vote(theCrew,partner1);
    partner10.vote(theCrew,partner2);
    partner6.vote(theCrew,partner9);
    partner8.vote(theCrew,partner2);
    partner7.vote(theCrew,partner4);
        try {
            theCrew.voteCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
