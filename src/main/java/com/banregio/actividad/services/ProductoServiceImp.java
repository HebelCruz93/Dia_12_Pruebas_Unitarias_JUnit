package com.banregio.actividad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.banregio.actividad.models.entity.Producto;
import com.banregio.actividad.repository.IProducto;

@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	private IProducto proRepository;
	//Metodos del servicio

	/*Parametros de entrada: Ninguno
	  Descripción: Muestra todas las categorias
	  Retorno: Lista de categorias
	  Limitante de transaccion: Solo lectura
	  */	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {		
		return (List<Producto>) proRepository.findAll();
	}	
	/*Parametros de entrada: id
	  Descripción: Muestra una categoria por id
	  Retorno: categoria del id
	  Limitante de transaccion: Solo lectura
	  */
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {		
		return proRepository.findById(id).orElse(null);
	}
	

	/*Parametros de entrada: Objeto categoria
	  Descripción: Guarda la categoria
	  Retorno: Sentencia guardada
	  Limitante de transaccion: Ninguna
	  */
	@Override
	@Transactional
	public Producto save(Producto producto) {		
		return proRepository.save(producto) ;
	}
	
	/*Parametros de entrada: id
	  Descripción: Elimina la categoria
	  Retorno: categoria eliminada
	  Limitante de transaccion: Ninguna
	  */
	@Override
	@Transactional
	public void delete(Long id) {		
		proRepository.deleteById(id);
	}
	
}
