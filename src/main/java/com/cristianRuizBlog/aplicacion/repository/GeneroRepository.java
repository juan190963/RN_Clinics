package com.cristianRuizBlog.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cristianRuizBlog.aplicacion.entity.Genero;
import com.cristianRuizBlog.aplicacion.entity.Role;

@Repository
public interface GeneroRepository extends CrudRepository<Genero, Long>{

	public Genero findByName(String genero);

}
