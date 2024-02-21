package com.alobomnito.compras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alobomnito.compras.entity.Compras;
import com.alobomnito.compras.service.ComprasService;

@RestController
@RequestMapping(path = "api/v1/compras")

public class ComprasController {
	
	
	@Autowired
	private ComprasService comprasService;
	
	@GetMapping
	public List<Compras> getAll(){
		return comprasService.getCompras();
	}
	
	@GetMapping("/{idProduct}")
	public Optional<Compras> getbyId(@PathVariable("idProduct") Integer idProduct){
		return comprasService.getCompra(idProduct);
	}
	
	
	@PostMapping
	public void saveUpdate(@RequestBody Compras compras){
		comprasService.saveOrUpdate(compras);
	}
	
	@DeleteMapping ("/{idProduct}")
	public void saveUpdate(@PathVariable("idProduct") Integer idProduct){
		comprasService.delete(idProduct);
	}

}
