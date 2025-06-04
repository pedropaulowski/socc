package com.ufg.socc.Entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Table(name = "docentes")
@Entity
public class Docente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String usuario;
    private String email;
    private Date ingresso;

    @ManyToMany(targetEntity = NucleoConhecimentoEntidade.class)
    private Set nucleosConhecimento;
}
