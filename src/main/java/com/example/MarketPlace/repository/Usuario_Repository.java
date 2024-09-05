package com.example.MarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MarketPlace.entity.Usuario;

@Repository
public interface Usuario_Repository extends JpaRepository<Usuario, Integer> {
	
}
