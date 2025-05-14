package com.ufg.socc.Entidades;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "docentes")
@Entity
public class Docentes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String usuario;
	private String nome;
	private  String email;
	private Date ingresso;
}
