package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

// Aca se ponen los metodos del crud
public interface IClienteService {
	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save (Cliente cliente);

	public void delete (Long id);

}
