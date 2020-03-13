package com.gerenciadordeusuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeusuarios.entidades.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String> {

}
