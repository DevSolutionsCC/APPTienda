package com.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tienda.entity.Promocion;

@Repository
public interface PromocionRepository extends JpaRepository<Promocion, Long>{

}
