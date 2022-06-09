package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Experiencias;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencias, Long> {

}