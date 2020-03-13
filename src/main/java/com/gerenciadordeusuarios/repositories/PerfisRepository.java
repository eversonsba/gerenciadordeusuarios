package com.gerenciadordeusuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciadordeusuarios.entidades.Perfis;

public interface PerfisRepository extends JpaRepository<Perfis, String> {

}
