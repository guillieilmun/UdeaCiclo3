package com.adasprint3.AdaEmpresaSprint3.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    private String nombre;
    private String direccion;
    private int telefono;
    private long nit;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioentrenador;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movimiento_id")
    private Movimiento movimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;


//@Enumerated(EnumType.STRING)
    //@Column(Name ="tipo")
    //private EnumType


}
