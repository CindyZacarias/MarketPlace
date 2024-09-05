package com.example.MarketPlace.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticuloDTO {
	
    private Integer id_articulo;

    private String nombre;

    private Long precio;

    private Integer stock;
    
}
