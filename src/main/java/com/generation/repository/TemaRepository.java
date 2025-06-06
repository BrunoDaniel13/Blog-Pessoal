package com.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	
	 public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
