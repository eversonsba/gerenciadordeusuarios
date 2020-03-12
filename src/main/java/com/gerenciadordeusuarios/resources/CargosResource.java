package com.gerenciadordeusuarios.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeusuarios.entidades.Cargos;

@RestController
@RequestMapping(value = "/cargos")
public class CargosResource {
	
	@GetMapping
	public ResponseEntity<Cargos> findAll(){
		Cargos c = new Cargos("Programador");
		return ResponseEntity.ok().body(c);
	}
	
}
