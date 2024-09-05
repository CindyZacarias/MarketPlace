package com.example.MarketPlace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.entity.Usuario;
import com.example.MarketPlace.repository.Usuario_Repository;

@Service
public class UsuarioService {
	@Autowired
	Usuario_Repository usuario_Repository;

	public List<Usuario> getUsuarios(){
		return usuario_Repository.findAll();
	}

	public Optional<Usuario> getUsuario(Integer id){
		return usuario_Repository.findById(id);
	}

	public void saveUsuario(Usuario usuario){
		usuario_Repository.save(usuario);
	}

	public void updateUsuario(Usuario usuario){
		usuario_Repository.save(usuario);
	}
}
