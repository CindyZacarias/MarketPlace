package com.example.MarketPlace.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "pedido")
@Getter
@Setter
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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pedido")
    private List<ArticuloPedido> articulos;

}
