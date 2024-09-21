package com.example.MarketPlace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MarketPlace.dto.ArticuloDTO;
import com.example.MarketPlace.entity.Articulo;
import com.example.MarketPlace.repository.Articulo_Repository;

@Service
public class ArticuloService {
	@Autowired
	Articulo_Repository articulo_Repository;

    public List<ArticuloDTO> findAll() {

        List<ArticuloDTO> dtos = new ArrayList<ArticuloDTO>();
        List<Articulo> entities = articulo_Repository.findAll();

        for (Articulo articulo : entities) {
            ArticuloDTO dto = new ArticuloDTO();
            dto.setId_articulo(articulo.getId_articulo());
            dto.setNombre(articulo.getNombre());
            dto.setPrecio(articulo.getPrecio());
            dto.setStock(articulo.getStock());
            dtos.add(dto);
        }

        return dtos;

    }

    public Optional<ArticuloDTO> findById(Integer id_articulo) {

        ArticuloDTO dto = new ArticuloDTO();
        Articulo entity = articulo_Repository.findById(id_articulo).get();

        BeanUtils.copyProperties(entity, dto);

        return Optional.of(dto);

    }

    public void create(ArticuloDTO dto) {

        Articulo entity = new Articulo();
        entity.setNombre(dto.getNombre());
        entity.setPrecio(dto.getPrecio());
        entity.setStock(dto.getStock());

        articulo_Repository.save(entity);

    }

    public void update(ArticuloDTO dto) {

        Articulo entity = new Articulo();
        entity.setId_articulo(dto.getId_articulo());
        entity.setNombre(dto.getNombre());
        entity.setPrecio(dto.getPrecio());
        entity.setStock(dto.getStock());

        articulo_Repository.save(entity);

    }

}
