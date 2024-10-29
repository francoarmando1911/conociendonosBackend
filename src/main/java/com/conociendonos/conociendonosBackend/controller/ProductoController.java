package com.conociendonos.conociendonosBackend.controller;

import com.conociendonos.conociendonosBackend.model.Producto;
import com.conociendonos.conociendonosBackend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos(); // Obtiene todos los productos
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Producto> obtenerProductosPorCategoriaId(@PathVariable String categoriaId) {
        List<Producto> productos = productoService.obtenerProductosPorCategoriaId(categoriaId);
        if (productos.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontraron productos para la categoría: " + categoriaId);
        }
        return productos;
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto); // Guarda un nuevo producto
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable String id) {
        productoService.eliminarProducto(id); // Elimina un producto por ID
    }
}
