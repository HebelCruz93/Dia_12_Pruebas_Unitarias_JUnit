package com.banregio.actividad.services;

import java.util.List;

import com.banregio.actividad.models.entity.Categoria;


public interface ICategoriaService {
	public List<Categoria> findAll();
	
	public Categoria findById (int id);
	
	public Categoria save (Categoria categoria);
		
	public void delete (int id);

}
