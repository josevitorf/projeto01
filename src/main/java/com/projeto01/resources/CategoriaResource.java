package com.projeto01.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto01.domain.Categoria;


@RestController
@RequestMapping(value="/categoria")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> lista(){
        
    	Categoria cat1 = new Categoria(1,"informatica");
    	Categoria cat2 = new Categoria(2, "escritoria");
    	
    	List<Categoria> lista = new ArrayList<>();
    	lista.add(cat2);
    	lista.add(cat1);
    	
    	return lista;
    }

}
 