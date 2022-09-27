package com.adasprint3.AdaEmpresaSprint3.model;

import com.adasprint3.AdaEmpresaSprint3.Enum.EmpresaEnum;
import com.adasprint3.AdaEmpresaSprint3.Enum.MovimientoEnum;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movimiento {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false, unique = true, length = 50)
        private long id;
        @Column(name = "monto", nullable = false)
        private String monto;
        @Column(name = "positivo", nullable = false)
        private String positivo;
        @Column(name = "negativo", nullable = false)
        private int negativo;
        @Column(name = "concepto", nullable = false)
        private long concepto;
        @Column(name = "usuario", nullable = false)
        private long usuario;

        @ManyToOne
        private Movimiento movimiento;

        @Enumerated(EnumType.STRING)
        @Column(name = "movimiento", nullable = false)
        private MovimientoEnum movimieto;

        @CreationTimestamp
        @Column(name = "fecha_creacion")
        private LocalDateTime fechaCreacion;

        @UpdateTimestamp
        @Column(name = "fecha_actualizacion")
        private LocalDateTime fechaActualizacion;
}

//@Enumerated(EnumType.STRING)
//@Column(Name ="tipo")
//private EnumType
