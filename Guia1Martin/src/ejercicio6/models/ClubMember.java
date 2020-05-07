package ejercicio6.models;

import java.util.Objects;
import java.util.UUID;

public class ClubMember {
    private String name;
    private UUID id;
    private String phone;
    private Integer age;
    private boolean avaiableToVote;

    public ClubMember(String name,String phone, Integer age) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.phone = phone;
        this.age = age;
        avaiableToVote = true;
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
}
