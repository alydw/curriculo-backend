package com.example.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.Model.Experiencias;
import com.example.Service.ExperienciaService;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ExperienciasController {

	
	@Autowired
	private ExperienciaService service;
	

	
	@RequestMapping(value = "/experiencia", method = RequestMethod.GET)
	public List<Experiencias> Listar(){
		return service.Listar();
	}

	
	@RequestMapping(value = "/experiencia", method =  RequestMethod.POST)
    public ResponseEntity<Void> Post(@Validated @RequestBody Experiencias pessoa){
		pessoa = service.Post(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(pessoa.getId()).toUri();
		
        return ResponseEntity.created(uri).build();
    }
	
    
    
    
}
