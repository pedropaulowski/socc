package com.ufg.socc.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@Table(name= "disciplina")
@Entity
public class Disciplina {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nucleo_id;
    private Integer matriz;
    private Integer ch_teorica;
    private Integer ch_pratica;
    private Integer ch_total;
    private String nome;

    @JsonIgnore
    @ManyToMany(targetEntity = NucleoConhecimentoEntidade.class)
    private Set nucleosConhecimento;


}
