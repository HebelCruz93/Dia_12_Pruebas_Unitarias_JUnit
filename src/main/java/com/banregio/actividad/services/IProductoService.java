package com.banregio.actividad.services;

import java.util.List;


import com.banregio.actividad.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	
	public Producto findById (int id);
	
	public Producto save (Producto producto);
		
	public void delete (int id);
}
