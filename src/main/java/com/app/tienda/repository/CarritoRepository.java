package com.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.tienda.entity.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}
