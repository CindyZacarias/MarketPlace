package com.example.MarketPlace.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "articulo")
public class Articulo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_articulo;
    @Column
    private String nombre;
    @Column
    private Long precio;
    @Column
    private Integer stock;

}
