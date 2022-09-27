package com.adasprint3.AdaEmpresaSprint3.model;

import com.adasprint3.AdaEmpresaSprint3.Enum.EmpresaEnum;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false,unique = true, length = 50)
    private long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono", nullable = false)
    private int telefono;
    @Column(name = "nit", nullable = false)
    private long nit;

    @ManyToOne
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "empresa", nullable = false)
    private EmpresaEnum empresa;

    @CreationTimestamp
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

//@Enumerated(EnumType.STRING)
    //@Column(Name ="tipo")
    //private EnumType


}
