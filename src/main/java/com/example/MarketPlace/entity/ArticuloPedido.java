package com.example.MarketPlace.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulo_pedido")
@Getter
@Setter
public class ArticuloPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id_articulo_pedido;
    @Column
    @JsonIgnore
    private Integer id_pedido;
    @JsonProperty(value = "id")
    @Column
    private Integer id_articulo;
    @Column
    @JsonProperty(value = "cantidad")
    private Integer cantidad;

}
