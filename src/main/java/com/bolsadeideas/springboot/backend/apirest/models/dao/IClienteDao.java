package com.bolsadeideas.springboot.backend.apirest.models.dao;

// import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

//en esta clase DAO se implemtan los crud de forma automatica
public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
