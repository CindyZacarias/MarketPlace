package com.example.MarketPlace.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pedido;
    @Column
    private String fecha;
    @Column
    private String nombre;
    @Column
    private Integer id_usuario;
}
