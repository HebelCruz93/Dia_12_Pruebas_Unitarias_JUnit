package com.banregio.actividad;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.banregio.actividad.controller.appController;
import com.banregio.actividad.models.entity.Producto;


@SpringBootTest
class Actividad9ApplicationTests {


	@Autowired
	appController productoController;
	
	@Test
	public void buscarProductos() {
		List<Producto> pruducto;
		pruducto = productoController.obtenerProducto();
		assertNotNull(pruducto);
	}
	
	@Test
	public void ingresarProducto() {
		Producto pruducto=new Producto();
		pruducto.setPro_idprod(3);
		pruducto.setPro_descri("Seguro");
		pruducto.setPro_catego(1);		
		productoController.crearProducto(pruducto);
		
		
	}
	
	@Test
	public void modificarProducto() {
		Producto pruducto=new Producto();
		pruducto.setPro_idprod(3);
		pruducto.setPro_descri("Debito");
		pruducto.setPro_catego(1);	
		productoController.updateProducto(pruducto, 3);
		
	}
	
	@Test
	public void deleteProducto() {
		productoController.deleteProducto(3);
		
	}
	

}
