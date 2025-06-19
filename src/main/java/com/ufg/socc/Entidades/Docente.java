package com.ufg.socc.Entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Table(name = "docentes")
@Entity
public class Docente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String nome;
    protected String usuario;
    protected String email;
    protected Date ingresso;

    @ManyToMany(targetEntity = NucleoConhecimentoEntidade.class)
    protected Set nucleosConhecimento;
}
