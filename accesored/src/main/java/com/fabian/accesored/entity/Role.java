package com.fabian.accesored.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "status")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private int id_role;
    @Column(name = "statu")
    private String statu;
    @Column(name = "description")
    private String description;

    public Role(){

    }


    public Role(String statu, String description) {
        this.statu = statu;
        this.description = description;
    }


}
