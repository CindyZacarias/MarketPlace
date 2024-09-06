package com.example.MarketPlace.service;

import com.example.MarketPlace.entity.ArticuloPedido;
import com.example.MarketPlace.repository.ArticuloPedido_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloPedidoService {
    @Autowired
    ArticuloPedido_Repository articuloPedido_Repository;

    public List<ArticuloPedido> getArticuloPedido(){
        return articuloPedido_Repository.findAll();
    }

}
