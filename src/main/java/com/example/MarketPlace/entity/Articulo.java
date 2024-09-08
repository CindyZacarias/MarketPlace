package com.example.MarketPlace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "articulo")
@Getter
@Setter
public class Articulo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_articulo;
    @Column
    private String nombre;
    @Column
    private Double precio;
    @Column
    private Integer stock;

}
