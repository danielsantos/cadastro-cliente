package com.digjoy.cadastrocliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digjoy.cadastrocliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
