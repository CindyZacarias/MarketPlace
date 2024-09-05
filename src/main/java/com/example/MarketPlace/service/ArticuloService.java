package com.example.MarketPlace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.entity.Articulo;
import com.example.MarketPlace.repository.Articulo_Repository;

@Service
public class ArticuloService {
	@Autowired
	Articulo_Repository articulo_Repository;
	
    public List<Articulo> getArticulos(){
    	return articulo_Repository.findAll();
    }
    
    public Optional<Articulo> getArticulo(Integer id){
    	return articulo_Repository.findById(id);
    }
    
    public void saveArticulo(Articulo articulo){
    	articulo_Repository.save(articulo);
    }

    public void updateArticulo(Articulo articulo){
        articulo_Repository.save(articulo);
    }
    
}
