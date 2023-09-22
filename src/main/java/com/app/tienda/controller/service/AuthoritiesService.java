package com.app.tienda.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.tienda.dao.IDaoAuthorities;
import com.app.tienda.dao.dto.DtoAuthorities;


@Service
public class AuthoritiesService {

	@Autowired
	IDaoAuthorities dao;
	
	public List<DtoAuthorities> obtenerAhorities(){
		return dao.obtenerAhorities();		
	}
	
}
