package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import com.example.MarketPlace.dto.ArticuloDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.MarketPlace.service.ArticuloService;

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
