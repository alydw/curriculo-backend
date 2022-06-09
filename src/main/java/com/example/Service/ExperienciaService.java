package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Model.Experiencias;
import com.example.Repository.ExperienciaRepository;

@Service
public class ExperienciaService {
	
	@Autowired
	private ExperienciaRepository repository;
	
	public List<Experiencias> Listar(){
		return repository.findAll();
	}
	

    public Experiencias Post(@Validated @RequestBody Experiencias pessoa){
        return repository.save(pessoa);
    }
	
}
