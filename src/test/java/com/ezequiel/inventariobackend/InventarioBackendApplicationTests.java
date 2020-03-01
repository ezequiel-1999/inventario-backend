package com.ezequiel.inventariobackend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ezequiel.inventariobackend.model.Cliente;
import com.ezequiel.inventariobackend.repository.ClienteRepository;

@SpringBootTest
class InventarioBackendApplicationTests {
	
	@Autowired
	ClienteRepository rep;

	@Test
	void contextLoads() {
		
		Cliente c = new Cliente(null, "Ezequiel"); 
		rep.save(c);
	}

}
