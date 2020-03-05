package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import lombok.Setter;

@Service

public class ServiceClient {
	
	public ArrayList<Cliente> clientes() {
		Cliente cliente = new Cliente();
		
		ArrayList<Cliente> clientes = new ArrayList();

		cliente.setNameMarket("RBO atacado");
		cliente.setCpf("12345234514123");
		cliente.setNameOwner("Roberto Borges de Oliveira");
		
		clientes.add(cliente);
		
		cliente.setNameMarket("Carrefour");
		cliente.setCpf("432141412342");
		cliente.setNameOwner("Pedro Nascimento de Lima");
		
		clientes.add(cliente);
		
		return clientes;
	}
	
}
