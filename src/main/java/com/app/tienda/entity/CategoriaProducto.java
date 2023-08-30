package com.app.tienda.entity;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "categorias_productos")
public class CategoriaProducto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable =  false, unique = true)
    private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
}
