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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Club theCrew = new Club("The Crew");
        // Test auto fill list
      /*  for(int i = 0;i<10;i++){
            ClubMember generic = new ClubMember("Socio"+ i,"123156"+i,22+i);
            theCrew.associate(generic);
        }*/

        ClubMember partner1 =  new ClubMember("Dario","123456",25);
        theCrew.associate(partner1);
        ClubMember partner2 =  new ClubMember("Luciana","123456",25);
        theCrew.associate(partner2);
        ClubMember partner10 = new ClubMember("Electra","123456",25);
        theCrew.associate(partner10);
        ClubMember partner3 =  new ClubMember("Humberto","123456",25);
        theCrew.associate(partner3);
        ClubMember partner4 =  new ClubMember("Cristina","123456",25);
        theCrew.associate(partner4);
        ClubMember partner5 =  new ClubMember("Laura","123456",25);
        theCrew.associate(partner5);
        ClubMember partner6 =  new ClubMember("Monica","123456",25);
        theCrew.associate(partner6);
        ClubMember partner7 =  new ClubMember("Silvana","123456",25);
        theCrew.associate(partner7);
        ClubMember partner8 =  new ClubMember("Juan Cruz","123456",25);
        theCrew.associate(partner8);
        ClubMember partner9 =  new ClubMember("Gian","123456",25);
        theCrew.associate(partner9);

        theCrew.printPartners();
        theCrew.initElections();
        //List<ClubMember> members = theCrew.getPartners();


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
