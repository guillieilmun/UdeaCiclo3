package com.adasprint3.AdaEmpresaSprint3.model;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movimiento {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
        private Long id;

        private String ConceptoMovimiento;
        private int MontoMovimiento;
        public int ValorMonto(){
                return 0;
        }


        public String UsuarioMovimiento(){
                return "";
        }


        @Enumerated(EnumType.STRING)
        @Column(name = "tipo")
        private EnumType tipo;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "Usuario_id")
        private Usuario usuario;

//    @ManyToOne
//    @JoinColumn(name = "entrenador_id")
//    private Entrenador entrenador;

       // @ManyToMany
       // @JoinTable(name = "entrenador_pokemon")
        //private List<Entrenador> entrenadors;
}
