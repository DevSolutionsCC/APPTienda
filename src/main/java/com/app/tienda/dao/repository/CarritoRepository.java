package com.app.tienda.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tienda.dao.entity.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}
