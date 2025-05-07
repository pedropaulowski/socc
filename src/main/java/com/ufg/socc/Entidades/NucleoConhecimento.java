package com.ufg.socc.Entidades;


import jakarta.persistence.*;

@Entity
@Table(name="nucleos_conhecimento")
public class NucleoConhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


}
