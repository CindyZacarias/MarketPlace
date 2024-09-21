package com.example.MarketPlace.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloPedidoDTO {

    @JsonIgnore
    private Integer id_articulo_pedido;

    @JsonProperty(value = "id")
    private Integer id_articulo;

    @JsonProperty(value = "cantidad")
    private Integer cantidad;

    @JsonIgnore
    private Integer id_pedido;

}
