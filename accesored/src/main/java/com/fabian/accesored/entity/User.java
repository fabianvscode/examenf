package com.fabian.accesored.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


@Entity
@Table(name = "usered")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id_user;
    @Column(name = "nombre")
    @NotBlank
    private String nombre;
    @Column(name = "email")
    @NotBlank
    private String email;
    @Column(name = "pass")
    @NotBlank
    private String pass;
    @Column(name = "statu")
    @NotBlank
    private int statu;

    public User(String nombre, String email, String pass, int statu) {
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.statu = statu;
    }

    public User() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }
}
