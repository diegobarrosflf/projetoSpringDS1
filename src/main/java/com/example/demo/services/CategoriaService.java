package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria findById(Integer id) {
		
		Optional<Categoria> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Perdoe! Não achei seu objeto id:" + id + ", Tipo: " + Categoria.class.getName())
				);
	}
}
