package com.ufg.socc.Entidades;


import jakarta.persistence.*;

@Entity
@Table(name="nucleo_conhecimento")
public class NucleoConhecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


}
