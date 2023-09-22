package com.app.tienda.dao.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.tienda.dao.IDaoAuthorities;
import com.app.tienda.dao.dto.DtoAuthorities;
import com.app.tienda.dao.entity.Authorities;
import com.app.tienda.dao.repository.AuthorityRepository;


@Repository
public class DaoAuthorities implements IDaoAuthorities{
	
	
	@Autowired
	AuthorityRepository authorityRepository;

	@Override
	public List<DtoAuthorities> ontenerAhorities() {
		List<DtoAuthorities> retorno= new ArrayList<DtoAuthorities>();
		for(Authorities ahtorities :authorityRepository.findAll())
			retorno.add(new DtoAuthorities(ahtorities.getId(), ahtorities.getAuthority(),
					ahtorities.getUsername() ));
		return retorno;
	}
	
	
	
	

}
