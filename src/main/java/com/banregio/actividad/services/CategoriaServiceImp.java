package com.banregio.actividad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.banregio.actividad.models.entity.Categoria;
import com.banregio.actividad.repository.ICategoria;



@Service
public class CategoriaServiceImp implements ICategoriaService{

	@Autowired
	private ICategoria catRepository;
	//Metodos del servicio

	/*Parametros de entrada: Ninguno
	  Descripción: Muestra todoS los productos
	  Retorno: Lista de productos
	  Limitante de transaccion: Solo lectura
	  */
	
	@Override

	@Transactional(readOnly = true)
	public List<Categoria> findAll() {		
		return (List<Categoria>) catRepository.findAll();
	
	}
	
	/*Parametros de entrada: id
	  Descripción: Muestra una categoria por id
	  Retorno: categoria del id
	  Limitante de transaccion: Solo lectura
	  */
	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		
		return catRepository.findById(id).orElse(null);
	}
	

	/*Parametros de entrada: Objeto categoria
	  Descripción: Guarda la categoria
	  Retorno: Sentencia guardada
	  Limitante de transaccion: Ninguna
	  */
	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		
		return catRepository.save(categoria) ;
	}
	
	/*Parametros de entrada: id
	  Descripción: Elimina la categoria
	  Retorno: categoria eliminada
	  Limitante de transaccion: Ninguna
	  */
	@Override
	@Transactional
	public void delete(Long id) {
		
		catRepository.deleteById(id);
	}
	
	

	
}
