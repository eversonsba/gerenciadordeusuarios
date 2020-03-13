package com.gerenciadordeusuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciadordeusuarios.entidades.Usuarios;
import com.gerenciadordeusuarios.repositories.UsuariosRepository;

@Service
public class UsuariosService {
	
	@Autowired
	private UsuariosRepository repository;
	
	public List<Usuarios> findAll(){
		return repository.findAll();
	}
	public Usuarios findById(String cpf) {
		Optional <Usuarios> obj = repository.findById(cpf);
		return obj.get();
	}
}
