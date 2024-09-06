package com.example.MarketPlace.repository;

import com.example.MarketPlace.entity.ArticuloPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloPedido_Repository extends JpaRepository <ArticuloPedido, Integer> {

}
