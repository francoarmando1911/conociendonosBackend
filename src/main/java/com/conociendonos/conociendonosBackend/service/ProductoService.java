package com.conociendonos.conociendonosBackend.service;

import com.conociendonos.conociendonosBackend.model.Producto;
import com.conociendonos.conociendonosBackend.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll(); // Obtiene todos los productos
    }

    public List<Producto> obtenerProductosPorCategoriaId(String categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId); // Busca productos por ID de categoría
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto); // Guarda el producto en la base de datos
    }

    public void eliminarProducto(String id) {
        productoRepository.deleteById(id); // Elimina el producto por ID
    }
}
