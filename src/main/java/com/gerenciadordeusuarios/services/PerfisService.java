package com.gerenciadordeusuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeusuarios.entidades.Perfis;
import com.gerenciadordeusuarios.repositories.PerfisRepository;

@Service
public class  PerfisService {
	
	@Autowired
	private PerfisRepository repository;
	
	public List<Perfis> findAll(){
		return repository.findAll();
	}
	public Perfis findById(String nome) {
		Optional <Perfis> obj = repository.findById(nome);
		return obj.get();
	}
}
