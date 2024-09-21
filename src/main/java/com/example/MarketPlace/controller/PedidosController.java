package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import com.example.MarketPlace.dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.MarketPlace.entity.Pedido;
import com.example.MarketPlace.service.PedidoService;

@RestController
@RequestMapping("/marketplace")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public ResponseEntity<?> findAll() {
        return  new ResponseEntity<List<PedidoDTO>>(pedidoService.findAll(), HttpStatus.OK);
    }

}
