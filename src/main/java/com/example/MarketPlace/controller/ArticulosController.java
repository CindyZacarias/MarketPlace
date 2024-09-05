package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.MarketPlace.entity.Articulo;
import com.example.MarketPlace.service.ArticuloService;

@RestController
@RequestMapping("/marketplace")
public class ArticulosController {
	
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/articulos")
    public List<Articulo> getAll(){
        return articuloService.getArticulos();
    }

    @GetMapping("/articulos/{id_articulo}")
    public Optional<Articulo> getById(@PathVariable("id_articulo") Integer id_articulo){
        return articuloService.getArticulo(id_articulo);
    }

    @PostMapping("/articulo")
    public Articulo save(@RequestBody Articulo articulo){
    	articuloService.saveArticulo(articulo);
        return articulo;
    }

    @PutMapping("/articulos/{id_articulo}")
    public Articulo update(@RequestBody Articulo articulo){
        articuloService.updateArticulo(articulo);
        return articulo;
    }

}
