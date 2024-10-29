package com.conociendonos.conociendonosBackend.repository;

import com.conociendonos.conociendonosBackend.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends MongoRepository<Producto, String> {
    List<Producto> findByCategoriaId(String categoriaId); // Busca productos por ID de categoría
}
