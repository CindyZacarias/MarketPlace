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

import com.example.MarketPlace.dto.PedidoDTO;
import com.example.MarketPlace.service.PedidoService;

import jakarta.validation.Valid;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/marketplace")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<List<PedidoDTO>>(pedidoService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/pedidos/{id_pedido}")
    public Optional<PedidoDTO> getById(@PathVariable("id_pedido") Integer id_pedido) {
        return pedidoService.findById(id_pedido);
    }

    @PostMapping("/pedido")
    public ResponseEntity<PedidoDTO> createPedido(@RequestBody @Valid PedidoDTO pedido, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<PedidoDTO>(HttpStatus.BAD_REQUEST);
        } else {
            pedidoService.create(pedido);
            return new ResponseEntity<PedidoDTO>(pedido, HttpStatus.CREATED);
        }
    }

    @PutMapping(value = "/pedidos/{id_pedido}")
    public ResponseEntity<PedidoDTO> update(@RequestBody PedidoDTO pedido, @PathVariable String id_pedido, BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("datos incorrectos");
            System.out.println("error: " + result.getAllErrors());
            return new ResponseEntity<PedidoDTO>(HttpStatus.BAD_REQUEST);
        } else {
            pedidoService.update(pedido);
            return new ResponseEntity<PedidoDTO>(pedido, HttpStatus.ACCEPTED);
        }
    }
}
