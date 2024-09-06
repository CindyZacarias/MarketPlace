package com.example.MarketPlace.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "articulo_pedido")
public class ArticuloPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_articulo_pedido;
    @Column
    private Integer cantidad;
    @Column
    private Integer id_pedido;
    @Column
    private Integer id_articulo;

}
