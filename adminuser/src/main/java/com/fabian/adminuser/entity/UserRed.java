package com.fabian.adminuser.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usered")
public class UserRed implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "email")
    private String email;
    @Column(name = "pass")
    private String pass;
    @Column(name = "statu")
    private String statu;

    public UserRed(String nombre, String email, String pass, String statu) {
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.statu = statu;
    }

    public UserRed(){};


}
