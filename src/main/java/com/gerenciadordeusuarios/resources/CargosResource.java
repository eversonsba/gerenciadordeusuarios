package com.gerenciadordeusuarios.resources;

import java.net.URI;
import java.util.List;

import javax.servlet.Servlet;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping
	public ResponseEntity<Cargos> insert(@RequestBody Cargos obj){
		
		obj = service.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{nome}").buildAndExpand(obj.getNome()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{nome}")
	public ResponseEntity<Void> delete(@PathVariable String nome){
		service.delete(nome);
		return ResponseEntity.noContent().build();
	}
}
