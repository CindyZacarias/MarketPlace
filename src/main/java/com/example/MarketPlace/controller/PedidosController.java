package com.example.MarketPlace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.MarketPlace.entity.Pedido;
import com.example.MarketPlace.service.PedidoService;

@RestController
@RequestMapping("/marketplace")
public class PedidosController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/pedidos")
    public List<Pedido> getAll(){
        return pedidoService.getPedidos();
    }

    @GetMapping("/pedidos/{id_pedido}")
    public Optional<Pedido> getById(@PathVariable("id_pedido") Integer id_pedido){
        return pedidoService.getPedido(id_pedido);
    }

    @PostMapping("/pedido")
    public Pedido save(@RequestBody Pedido pedido){
        pedidoService.savePedido(pedido);
        return pedido;
    }

    @PutMapping("/pedidos/{id_pedido}")
    public Pedido update(@RequestBody Pedido pedido){
        pedidoService.updatePedido(pedido);
        return pedido;
    }

    @DeleteMapping("/{id_pedido}")
    public void save(@PathVariable("id_pedido") Integer id_pedido){
        pedidoService.delete(id_pedido);
    }

}
