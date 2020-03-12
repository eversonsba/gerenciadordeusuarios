package com.gerenciadordeusuarios.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeusuarios.entidades.Cargos;
import com.gerenciadordeusuarios.services.CargosService;

@RestController
@RequestMapping(value = "/cargos")
public class CargosResource {
	
	@Autowired
	private CargosService service;
	
	@GetMapping
	public ResponseEntity<List<Cargos>> findAll(){
		List<Cargos> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{nome}")
	public ResponseEntity<Cargos> findById (@PathVariable String nome){
		Cargos obj = service.findById(nome);
		return ResponseEntity.ok().body(obj);
	}
	
}
