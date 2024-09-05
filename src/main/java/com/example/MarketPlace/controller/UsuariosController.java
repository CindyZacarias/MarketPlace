package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.MarketPlace.entity.Usuario;
import com.example.MarketPlace.service.UsuarioService;

@RestController
@RequestMapping("/marketplace")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/usuarios/{id_usuario}")
    public Optional<Usuario> getById(@PathVariable("id_usuario") Integer id_usuario){
        return usuarioService.getUsuario(id_usuario);
    }

    @PostMapping("/usuario")
    public Usuario save(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return usuario;
    }

    @PutMapping("/usuarios/{id_usuario}")
    public Usuario update(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
        return usuario;
    }

}
