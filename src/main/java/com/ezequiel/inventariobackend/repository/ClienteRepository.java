package com.ezequiel.inventariobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezequiel.inventariobackend.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
