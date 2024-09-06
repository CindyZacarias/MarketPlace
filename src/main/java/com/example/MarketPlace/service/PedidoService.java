package com.example.MarketPlace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.entity.Pedido;
import com.example.MarketPlace.repository.Pedido_Repository;

@Service
public class PedidoService {
	@Autowired
	Pedido_Repository pedido_Repository;

	public List<Pedido> getPedidos(){
		return pedido_Repository.findAll();
	}

	public Optional<Pedido> getPedido(Integer id){
		return pedido_Repository.findById(id);
	}

	public void savePedido(Pedido pedido){
		pedido_Repository.save(pedido);
	}

	public void updatePedido(Pedido pedido){
		pedido_Repository.save(pedido);
	}

	public void delete(Integer id){
		pedido_Repository.deleteById(id);
	}

}
