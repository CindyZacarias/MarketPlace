package com.example.MarketPlace.service;

import com.example.MarketPlace.dto.ArticuloPedidoDTO;
import com.example.MarketPlace.entity.ArticuloPedido;
import com.example.MarketPlace.repository.ArticuloPedido_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticuloPedidoService {
    @Autowired
    ArticuloPedido_Repository articuloPedido_Repository;

    public List<ArticuloPedidoDTO> findAll() {

        List<ArticuloPedidoDTO> dtos = new ArrayList<ArticuloPedidoDTO>();
        List<ArticuloPedido> entities = articuloPedido_Repository.findAll();

        for (ArticuloPedido articuloPedido : entities) {
            ArticuloPedidoDTO dto = new ArticuloPedidoDTO();
            dto.setId_articulo_pedido(articuloPedido.getId_articulo_pedido());
            dto.setCantidad(articuloPedido.getCantidad());
            dto.setId_articulo(articuloPedido.getId_articulo());
            dto.setId_pedido(articuloPedido.getId_pedido());
            dtos.add(dto);
        }

        return dtos;

    }

}
