package com.example.demo.domain;

import java.io.Serializable;

import com.example.demo.model.NamedEntity;

public class Categoria extends NamedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public Categoria() {

	}

	public Categoria(String nome) {
		this.setName(nome);
	}

}
