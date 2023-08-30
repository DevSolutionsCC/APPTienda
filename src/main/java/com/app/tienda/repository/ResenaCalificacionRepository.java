package com.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tienda.entity.ResenaCalificacion;

@Repository
public interface ResenaCalificacionRepository extends JpaRepository<ResenaCalificacion, Long>{

}
