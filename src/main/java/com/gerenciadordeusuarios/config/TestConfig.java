package com.gerenciadordeusuarios.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gerenciadordeusuarios.entidades.Cargos;
import com.gerenciadordeusuarios.entidades.Perfis;
import com.gerenciadordeusuarios.entidades.Usuarios;
import com.gerenciadordeusuarios.repositories.CargosRepository;
import com.gerenciadordeusuarios.repositories.PerfisRepository;
import com.gerenciadordeusuarios.repositories.UsuariosRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private CargosRepository cargosRepository;
	
	@Autowired
	private UsuariosRepository usuariosRepository; 
	
	@Autowired
	private PerfisRepository perfisRepository;

	@Override
	public void run(String... args) throws Exception {
		Cargos c1 = new Cargos("Programador");
		Cargos c2 = new Cargos("Design");
		
		Usuarios u1 = new Usuarios();
		u1.setNome("Everson");
		u1.setCpf("094295111661");
		u1.setData_cadastro(Instant.parse("2020-03-13T15:15:15Z"));
		u1.setSexo("M");
		u1.setCargo(c1);
		

		Usuarios u2 = new Usuarios();
		u2.setNome("Maria");
		u2.setCpf("09876543212");
		u2.setData_cadastro(Instant.parse("2020-03-13T15:15:15Z"));
		u2.setSexo("F");
		u2.setCargo(c2);
		
		Perfis p1 = new Perfis("vecinho",u1);
		Perfis p2 = new Perfis("vecinhoSBA",u1);
		Perfis p3 = new Perfis("Mariazinha",u2);
		
		
		
		cargosRepository.saveAll(Arrays.asList(c1,c2));
		usuariosRepository.saveAll(Arrays.asList(u1,u2));
		perfisRepository.saveAll(Arrays.asList(p1,p2,p3));
	
	}
	
	
}
