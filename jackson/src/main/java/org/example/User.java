package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.time.LocalDateTime;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {

    private String name;

    private String lastName;

    private Integer age;

    private String dni;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    //@JsonFormat(pattern =  "yyyy-MM-dd hh:mm:ss" )
    private LocalDate dayOfBitrh;

    public User() {
    }

    public User(String name, String lastName, Integer age, String dni, LocalDate dayOfBitrh) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.dayOfBitrh = dayOfBitrh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getDayOfBitrh() {
        return dayOfBitrh;
    }

    public void setDayOfBitrh(LocalDate dayOfBitrh) {
        this.dayOfBitrh = dayOfBitrh;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", dayOfBitrh=" + dayOfBitrh +
                '}';
    }
}
