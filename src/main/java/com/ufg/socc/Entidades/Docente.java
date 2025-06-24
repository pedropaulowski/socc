package com.ufg.socc.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Table(name = "docentes")
@Entity
@NoArgsConstructor
@Data
public class Docente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String usuario;
    private String email;
    private Date ingresso;

    @JsonIgnore
    @ManyToMany(targetEntity = NucleoConhecimentoEntidade.class)
    private Set nucleosConhecimento;

    // public Long getId() {
    //     return this.id;
    // }
}
