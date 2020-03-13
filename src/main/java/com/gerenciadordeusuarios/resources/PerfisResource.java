package com.gerenciadordeusuarios.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciadordeusuarios.entidades.Perfis;
import com.gerenciadordeusuarios.services.PerfisService;

@RestController
@RequestMapping(value = "/perfis")
public class PerfisResource {

	@Autowired
	private PerfisService service;

	@GetMapping
	public ResponseEntity<List<Perfis>> findAll() {
		List<Perfis> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{nome}")
	public ResponseEntity<Perfis> findById(@PathVariable String nome) {
		Perfis obj = service.findById(nome);
		return ResponseEntity.ok().body(obj);
	}

}
