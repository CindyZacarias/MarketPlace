package com.example.MarketPlace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.repository.Usuario_Repository;

@Service
public class UsuarioService {
	@Autowired
	Usuario_Repository usuario_Repository;

}
