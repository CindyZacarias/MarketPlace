package com.example.MarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MarketPlace.entity.Articulo;

@Repository
public interface Articulo_Repository extends JpaRepository<Articulo, Integer> {
	
}
