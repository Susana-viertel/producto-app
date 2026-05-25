package com.producto.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.producto.app.model.Producto;
import com.producto.app.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {

        return productoService.guardarProducto(producto);
    }

    @GetMapping
    public List<Producto> obtenerProductos() {

        return productoService.obtenerProductos();
    }

    @GetMapping("/buscar")
    public List<Producto> buscarPorNombre(@RequestParam String nombre) {

        return productoService.buscarPorNombre(nombre);
    }

    @GetMapping("/precio")
    public List<Producto> buscarPorPrecio(@RequestParam Double precio) {

        return productoService.buscarPorPrecio(precio);
    }
}