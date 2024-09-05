package com.example.MarketPlace.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoDTO {
	
    private Integer id_pedido;

    private String fecha;

    private String nombre;

    private Integer id_usuario;

}
