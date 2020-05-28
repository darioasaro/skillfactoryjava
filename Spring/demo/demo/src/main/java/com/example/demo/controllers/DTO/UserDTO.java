package com.example.demo.controllers.DTO;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private Integer id;
    private String username;
    private String dni;
    private String email;


    public UserDTO() {
    }

    public UserDTO(Integer id, String username, String dni, String email) {
        this.id = id;
        this.username = username;
        this.dni = dni;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
