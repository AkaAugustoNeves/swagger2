package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/produtos")
@Api("api rest produtos")
@CrossOrigin(origins="*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository pr;
	
	@GetMapping
	@ApiOperation("retorna uma lista de produtos")
	public List<Produto> getProducts(){
		return pr.findAll();
	}
	
	@PostMapping
	@Transactional
	@ApiOperation("cria um produto")
	public Produto register(@RequestParam String nome){
		return pr.save(new Produto(nome));
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation("deleta um produto")
	public void delete(@PathVariable Long id) {
		pr.deleteById(id);
	}
	
	
}
