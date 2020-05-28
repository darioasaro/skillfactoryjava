package ejercicio6.models;

import java.util.Collections;
import java.util.Objects;
import java.util.UUID;

public class ClubMember {
    private String name;
    private UUID id;
    private String phone;
    private Integer age;
    private boolean avaiableToVote;

    public boolean isAvaiableToVote() {
        return avaiableToVote;
    }

    public void setAvaiableToVote(boolean avaiableToVote) {
        this.avaiableToVote = avaiableToVote;
    }

    public ClubMember(String name, String phone, Integer age) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.phone = phone;
        this.age = age;
        avaiableToVote = true;
    }

    public UUID getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubMember)) return false;
        ClubMember that = (ClubMember) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Member:" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", age=" + age;
    }
    public void vote(Club club, ClubMember candidate){
        club.addVote(candidate,this);
    }

}
