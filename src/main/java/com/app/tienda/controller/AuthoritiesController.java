package com.app.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.tienda.controller.service.AuthoritiesService;
import com.app.tienda.dao.dto.DtoAuthorities;



@Controller
public class AuthoritiesController {

	@Autowired
	AuthoritiesService authoritiesService;
	
	@GetMapping("/admin/authorities")
	public List<DtoAuthorities> getAuthorities(final Model model) {
       List<DtoAuthorities> listaAuthorities = authoritiesService.obtenerAhorities();
        model.addAttribute("listaAuthorities", listaAuthorities);        
        return listaAuthorities;
    }
	
	
}
