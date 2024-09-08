package com.example.MarketPlace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticuloDTO {

    @JsonProperty(value = "id")
    private Integer id_articulo;

    @JsonProperty(value = "nombre")
    private String nombre;

    @JsonProperty(value = "precio")
    private Double precio;

    @JsonProperty(value = "stock")
    private Integer stock;

}
