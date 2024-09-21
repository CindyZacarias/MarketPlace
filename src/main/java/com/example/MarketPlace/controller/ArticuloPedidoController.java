package com.example.MarketPlace.controller;

import com.example.MarketPlace.entity.ArticuloPedido;
import com.example.MarketPlace.service.ArticuloPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marketplace")
public class ArticuloPedidoController {

    @Autowired
    private ArticuloPedidoService articuloPedidoService;

}
