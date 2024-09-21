package com.example.MarketPlace.dto;

import java.util.List;

import com.example.MarketPlace.entity.ArticuloPedido;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PedidoDTO {

    @JsonProperty(value = "id")
    private Integer id_pedido;

    @JsonProperty(value = "nombre")
    private String nombre;

    @JsonProperty(value = "fecha")
    private String fecha;
    
    @JsonIgnore
    private Integer id_usuario;

    @JsonProperty(value = "articulos")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    private List<ArticuloPedido> articulos;
    
}
