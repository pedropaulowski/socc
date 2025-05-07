package com.ufg.socc.Entidades;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="nucleos_conhecimento")
public class NucleoConhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany(targetEntity = Docente.class)
    private Set docentes;
}
