package com.example.MarketPlace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.MarketPlace.dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.entity.Pedido;
import com.example.MarketPlace.repository.Pedido_Repository;

@Service
public class PedidoService {
	@Autowired
	Pedido_Repository pedido_Repository;

	public List<PedidoDTO> findAll() {
		List<PedidoDTO> dtos = new ArrayList<PedidoDTO>();
		List<Pedido> entities = pedido_Repository.findAll();

		for (Pedido pedido : entities) {
			PedidoDTO dto = new PedidoDTO();
			dto.setId_pedido(pedido.getId_pedido());
			dto.setNombre(pedido.getNombre());
			dto.setFecha(pedido.getFecha());
			dto.setId_usuario(pedido.getId_usuario());
			dtos.add(dto);
		}

		return  dtos;

	}

}
