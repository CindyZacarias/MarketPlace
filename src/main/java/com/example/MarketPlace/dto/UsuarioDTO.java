package com.example.MarketPlace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {

    @JsonProperty(value = "id")
    private Integer id_usuario;

    @JsonProperty(value = "nombre")
    private String nombre;

    @JsonProperty(value = "password")
    private String password;

}
