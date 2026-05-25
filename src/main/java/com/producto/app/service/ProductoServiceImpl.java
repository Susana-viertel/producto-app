package com.producto.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producto.app.model.Producto;
import com.producto.app.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto(Producto producto) {

        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {

        return productoRepository.findAll();
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {

        return productoRepository.findByNombre(nombre);
    }

    @Override
    public List<Producto> buscarPorPrecio(Double precio) {

        return productoRepository.findByPrecio(precio);
    }
}
