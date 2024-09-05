package com.example.MarketPlace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.repository.Pedido_Repository;

@Service
public class PedidoService {
	@Autowired
	Pedido_Repository pedido_Repository;

}
