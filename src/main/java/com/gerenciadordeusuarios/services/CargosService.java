package com.gerenciadordeusuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeusuarios.entidades.Cargos;
import com.gerenciadordeusuarios.repositories.CargosRepository;

@Service
public class CargosService {
	
	@Autowired
	private CargosRepository repository;
	
	public List<Cargos> findAll(){
		return repository.findAll();
	}
	public Cargos findById(String nome) {
		Optional <Cargos> obj = repository.findById(nome);
		return obj.get();
	}
	
	public Cargos insert( Cargos obj) {
		return repository.save(obj);
	}
}
