package com.producto.app.service;

import java.util.List;

import com.producto.app.model.Producto;

public interface ProductoService {

    Producto guardarProducto(Producto producto);

    List<Producto> obtenerProductos();

    List<Producto> buscarPorNombre(String nombre);

    List<Producto> buscarPorPrecio(Double precio);
}