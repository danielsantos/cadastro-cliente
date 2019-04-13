package com.digjoy.cadastrocliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digjoy.cadastrocliente.model.Cliente;
import com.digjoy.cadastrocliente.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/consultar/{id}")
    public Cliente consultaClientePorId(@PathVariable Long id) {
        return clienteRepository.findById(id).get();
    }
	
	@GetMapping("/listar")
    public List<Cliente> consultaClientes() {
        return clienteRepository.findAll();
    }
	
	@PostMapping("/salvar")
    public void salvaCliente(@RequestParam Cliente cliente) {
        clienteRepository.save(cliente);
    }
	
	@PostMapping("/salvar")
    public void atualizaCliente(@RequestParam Cliente cliente) {
        clienteRepository.saveAndFlush(cliente);
    }
	
}
