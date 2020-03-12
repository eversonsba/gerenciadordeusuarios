package com.gerenciadordeusuarios.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gerenciadordeusuarios.entidades.Cargos;
import com.gerenciadordeusuarios.repositories.CargosRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private CargosRepository cargosRepository;

	@Override
	public void run(String... args) throws Exception {
		Cargos c1 = new Cargos("Programador");
		Cargos c2 = new Cargos("Design");
		
		cargosRepository.saveAll(Arrays.asList(c1,c2));
		
	}
	
	
}
