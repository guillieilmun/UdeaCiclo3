package com.adasprint3.AdaEmpresaSprint3.model;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)

    private long id;
    private String nombre;
    private String correo;
    private String pertenece;
    private String rol;

    @OneToMany(mappedBy = "empleado")
    @ToString.Exclude
    private List<Empresa> empresas;


}
