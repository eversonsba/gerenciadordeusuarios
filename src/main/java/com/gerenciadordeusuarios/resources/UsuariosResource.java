package com.gerenciadordeusuarios.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeusuarios.entidades.Usuarios;
import com.gerenciadordeusuarios.services.UsuariosService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosResource {
	
	@Autowired
	private UsuariosService service;
	
	@GetMapping
	public ResponseEntity<List<Usuarios>> findAll(){
		List<Usuarios> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{cpf}")
	public ResponseEntity<Usuarios> findById (@PathVariable String cpf){
		Usuarios obj = service.findById(cpf);
		return ResponseEntity.ok().body(obj);
	}
	
}
