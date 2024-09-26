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

import com.example.MarketPlace.dto.ArticuloDTO;
import com.example.MarketPlace.service.ArticuloService;

import jakarta.validation.Valid;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/marketplace")
public class ArticulosController {
	
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/articulos")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<List<ArticuloDTO>>(articuloService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/articulos/{id_articulo}")
    public Optional<ArticuloDTO> getById(@PathVariable("id_articulo") Integer id_articulo){
        return articuloService.findById(id_articulo);
    }

    @PostMapping("/articulo")
    public ResponseEntity<ArticuloDTO> createArticulo(@RequestBody @Valid ArticuloDTO articulo, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<ArticuloDTO>(HttpStatus.BAD_REQUEST);
        } else {
            articuloService.create(articulo);
            return new ResponseEntity<ArticuloDTO>(articulo, HttpStatus.CREATED);
        }
    }

    @PutMapping(value = "/articulos/{id_articulo}")
    public ResponseEntity<ArticuloDTO> update(@RequestBody ArticuloDTO articulo, @PathVariable String id_articulo,BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<ArticuloDTO>(HttpStatus.BAD_REQUEST);
        } else {
            articuloService.update(articulo);
            return new ResponseEntity<ArticuloDTO>(articulo, HttpStatus.ACCEPTED);
        }
    }
}
