package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanoDeContasController {
	
	@Autowired
	private ServiceClient service;
	
	@GetMapping("/clientes")
	public List<Cliente> Clientes() {		
		return service.clientes();
	}
}
