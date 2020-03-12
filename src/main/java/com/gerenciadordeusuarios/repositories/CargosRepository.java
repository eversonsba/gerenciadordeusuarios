package com.gerenciadordeusuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeusuarios.entidades.Cargos;

public interface CargosRepository extends JpaRepository<Cargos, String> {

}
