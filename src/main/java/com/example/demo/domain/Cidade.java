package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.NamedEntity;

@Entity
public class Cidade extends NamedEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;

	public Cidade() {

	}

	public Cidade(String nome, Estado estado) {
		this.setName(nome);
		this.estado = estado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
