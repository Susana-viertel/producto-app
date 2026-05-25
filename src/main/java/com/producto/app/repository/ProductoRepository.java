package com.producto.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producto.app.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByNombre(String nombre);
    
    List<Producto> findByPrecio(Double precio);

}