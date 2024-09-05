package com.example.MarketPlace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MarketPlace.entity.Pedido;

@Repository
public interface Pedido_Repository extends JpaRepository<Pedido, Integer> {
	
}
