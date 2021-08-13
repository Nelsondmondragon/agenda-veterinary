package com.nedacort.agendaveterinary.backend.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "usuario")
    private String userAccess;

    @Column(name = "contrasena")
    private String password;

    @Column(name = "estado")
    private Boolean active;

    @Column(name = "estado_sesion")
    private Boolean sessionActive;

    @ManyToOne
    @JoinColumn(name = "fk_empresa",insertable = false, updatable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "fk_usuario",insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_empleado",insertable = false, updatable = false)
    private Employee employee;

    @OneToMany(mappedBy = "user")
    private List<User> users;
}
