package com.adasprint3.AdaEmpresaSprint3.model;
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
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

        @Column(name = "nombre", nullable = false, unique = true, length = 50)
        private String nombre;

        @Column(name = "correo", nullable = false)
        private int correo;

        @Column(name = "pertenece", nullable = false)
        private int pertenece;

        @Column(name = "rol", nullable = false)
        private int rol;

        @CreationTimestamp
        @Column(name = "fecha_creacion")
        private LocalDateTime fechaCreacion;

        @UpdateTimestamp
        @Column(name = "fecha_actualizacion")
        private LocalDateTime fechaActualizacion;
    }
