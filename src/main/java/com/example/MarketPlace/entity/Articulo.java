package com.example.MarketPlace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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
