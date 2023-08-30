package com.app.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.tienda.entity.Authorities;




@Repository
public interface AuthorityRepository extends JpaRepository<Authorities, Integer>{

}
