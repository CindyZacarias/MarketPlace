package com.example.MarketPlace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MarketPlace.entity.Articulo;
import com.example.MarketPlace.service.ArticuloService;

@RestController
@RequestMapping("/api")
public class ArticulosController {
	
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/articulos")
    public List<Articulo> getAll(){
        return articuloService.getArticulos();
    }
	
}
