package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String nome;
    
    public Produto() {
		// TODO Auto-generated constructor stub
	}

    public Produto(String nome) {
		this.nome = nome;
	}

    
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
	
}
