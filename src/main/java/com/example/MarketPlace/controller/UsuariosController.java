package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MarketPlace.dto.UsuarioDTO;
import com.example.MarketPlace.service.UsuarioService;

import jakarta.validation.Valid;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/marketplace")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<List<UsuarioDTO>>(usuarioService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/usuarios/{id_usuario}")
    public Optional<UsuarioDTO> getById(@PathVariable("id_usuario") Integer id_usuario){
        return usuarioService.findById(id_usuario);
    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioDTO> createUsuario(@RequestBody @Valid UsuarioDTO usuario, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<UsuarioDTO>(HttpStatus.BAD_REQUEST);
        } else {
            usuarioService.create(usuario);
            return new ResponseEntity<UsuarioDTO>(usuario, HttpStatus.CREATED);
        }
    }

    @PutMapping(value = "/usuarios/{id_usuario}")
    public ResponseEntity<UsuarioDTO> update(@RequestBody UsuarioDTO usuario, @PathVariable String id_usuario, BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<UsuarioDTO>(HttpStatus.BAD_REQUEST);
        } else {
            usuarioService.update(usuario);
            return new ResponseEntity<UsuarioDTO>(usuario, HttpStatus.ACCEPTED);
        }
    }
}
