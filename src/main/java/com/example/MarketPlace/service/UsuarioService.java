package com.example.MarketPlace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.dto.UsuarioDTO;
import com.example.MarketPlace.entity.Usuario;
import com.example.MarketPlace.repository.Usuario_Repository;

@Service
public class UsuarioService {
	@Autowired
	Usuario_Repository usuario_Repository;

	public List<UsuarioDTO> findAll() {

		List<UsuarioDTO> dtos = new ArrayList<UsuarioDTO>();
		List<Usuario> entities = usuario_Repository.findAll();

		for (Usuario usuario : entities) {
			UsuarioDTO dto = new UsuarioDTO();
			dto.setId_usuario(usuario.getId_usuario());
			dto.setNombre(usuario.getNombre());
			dto.setPassword(usuario.getPassword());
			dtos.add(dto);
		}

		return dtos;

	}

	public Optional<UsuarioDTO> findById(Integer id_usuario) {

		UsuarioDTO dto = new UsuarioDTO();
		Usuario entity = usuario_Repository.findById(id_usuario).get();

		BeanUtils.copyProperties(entity, dto);

		return Optional.of(dto);

	}

	public void create(UsuarioDTO dto) {

		Usuario entity = new Usuario();
		entity.setNombre(dto.getNombre());
		entity.setPassword(dto.getPassword());

		usuario_Repository.save(entity);

	}

	public void update(UsuarioDTO dto) {

		Usuario entity = new Usuario();
		entity.setId_usuario(dto.getId_usuario());
		entity.setNombre(dto.getNombre());
		entity.setPassword(dto.getPassword());

		usuario_Repository.save(entity);

	}

}
