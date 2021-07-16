package com.devsuperior.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.services.CategoryService;



@RestController
@RequestMapping (value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll(){
		return ResponseEntity.ok(service.findAll());		
	}
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
		return ResponseEntity.ok(service.findById(id));		
	}
}
