package com.example.MarketPlace.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.dto.PedidoDTO;
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
			dto.setFecha(LocalDate.parse(pedido.getFecha()));
			dto.setId_usuario(pedido.getId_usuario());
			dto.setArticulos(pedido.getArticulos());
			dtos.add(dto);
		}

		return  dtos;

	}

	public Optional<PedidoDTO> findById(Integer id_pedido) {

		PedidoDTO dto = new PedidoDTO();
		Pedido entity = pedido_Repository.findById(id_pedido).get();

		BeanUtils.copyProperties(entity, dto);

		return Optional.of(dto);

	}

	public void create(PedidoDTO dto) {

		Pedido entity = new Pedido();
		entity.setNombre(dto.getNombre());
		entity.setFecha(String.valueOf(dto.getFecha()));
		entity.setId_usuario(dto.getId_usuario());

		pedido_Repository.save(entity);

	}

	public void update(PedidoDTO dto) {

		Pedido entity = new Pedido();
		entity.setId_pedido(dto.getId_pedido());
		entity.setNombre(dto.getNombre());
		entity.setFecha(String.valueOf(dto.getFecha()));
		entity.setId_usuario(dto.getId_usuario());

		pedido_Repository.save(entity);

	}

}
