package com.banregio.actividad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.banregio.actividad.models.entity.Categoria;
import com.banregio.actividad.models.entity.Producto;
import com.banregio.actividad.services.ICategoriaService;
import com.banregio.actividad.services.IProductoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/app")
@Api(value = "Controladores", description = "Controladores de categoria y producto")
public class appController {

	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IProductoService productoService;

	/*Parametros de entrada: Ninguno
	  Descripción: Metodo que muestra todas las categorias
	  Retorno: categorias
	  */
	@CrossOrigin
	@RequestMapping(value="/categorias",method=RequestMethod.GET)	
	 @ApiOperation(value = "Encuentra todas las categorias" )
	public List<Categoria> obtenerCategoria(){
		return categoriaService.findAll();		
	}
	
	/*Parametros de entrada: Ninguno
	  Descripción: Metodo que muestra todos los productos
	  Retorno: Productos
	  */	
	@CrossOrigin
	@RequestMapping(value="/productos",method=RequestMethod.GET)
	 @ApiOperation(value = "Encuentra todos los productos" )
	public List<Producto> obtenerProducto(){
		return productoService.findAll();
	}	

	/*Parametros de entrada: id
	  Descripción: Metodo que muestra una categoria por id
	  Retorno: categoria
	  */
	@CrossOrigin
	@GetMapping("/categoria/{id}")
	 @ApiOperation(value = "Encuentra todas las categorias por ID" )
	public Categoria mostrarCategoria (@PathVariable int id) {
		return categoriaService.findById(id);
	}
	
	/*Parametros de entrada: id
	  Descripción: Metodo que muestra un producto por id
	  Retorno: producto
	  */
	@CrossOrigin
	@GetMapping("/producto/{id}")
	 @ApiOperation(value = "Encuentra todos los productos por ID" )
	public Producto mostrarProducto (@PathVariable int id) {
		return productoService.findById(id);
	}
	
	/*Parametros de entrada: Objeto categoria
	  Descripción: Crea una categoria
	  Retorno: Guardado de la categoria
	  */
	@CrossOrigin
	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	 @ApiOperation(value = "Crea una categoria" )
	public Categoria crearCategoria (@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	/*Parametros de entrada: Objeto producto
	  Descripción: Crea un producto
	  Retorno: Guardado del producto
	  */
	@CrossOrigin
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Crea un producto" )
	public Producto crearProducto (@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	/*Parametros de entrada: Objeto categoria , id
	  Descripción: Realiza update por medio de PUT
	  Retorno: Actualiza la categoria
	  */
	@CrossOrigin
	@PutMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Modifica una categoria por medio de PUT" )
	public Categoria updateCategoria(@RequestBody Categoria categoria, @PathVariable int id) {		
		Categoria categoriaActual = categoriaService.findById(id);	 
		categoriaActual.setCat_nombre(categoria.getCat_nombre());
	 return categoriaService.save(categoria);
		
	}
	
	/*Parametros de entrada: Objeto producto , id
	  Descripción: Realiza update por medio de PUT
	  Retorno: Actualiza el producto
	  */
	@CrossOrigin
	@PutMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Modifica un producto por medio de PUT" )
	public Producto updateProducto(@RequestBody Producto producto, @PathVariable int id) {		
		Producto productoActual = productoService.findById(id);	 
		productoActual.setPro_descri(producto.getPro_descri());
	 return productoService.save(producto);		
	}
	
	/*Parametros de entrada: Objeto categoria , id
	  Descripción: Realiza update por medio de PATCH
	  Retorno: Actualiza la categoria
	  */
	@CrossOrigin
	@PatchMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Modifica una categoria por medio de PATCH" )
	public Categoria updateParcialCategoria(@RequestBody Categoria categoria, @PathVariable int id) {		
		Categoria categoriaActual = categoriaService.findById(id);	 
		categoriaActual.setCat_nombre(categoria.getCat_nombre());
	 return categoriaService.save(categoria);	 		
	}
	
	/*Parametros de entrada: Objeto producto , id
	  Descripción: Realiza update por medio de PATCH
	  Retorno: Actualiza el producto
	  */	
	@CrossOrigin
	@PatchMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Modifica un producto por medio de PATCH" )
	public Producto updateParcialProducto(@RequestBody Producto producto, @PathVariable int id) {		
		Producto productoActual = productoService.findById(id);	 
		productoActual.setPro_descri(producto.getPro_descri());
	 return productoService.save(producto);	 		
	}
	/*Parametros de entrada:  id
	  Descripción: Elimina una categoria
	  Retorno: Ninguno
	  */
	@CrossOrigin
	@DeleteMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Borra una categoria" )
	public void deleteCategoria(@PathVariable int id) {
		categoriaService.delete(id);
	}	
	/*Parametros de entrada:  id
	  Descripción: Elimina un producto
	  Retorno: Ninguno
	  */
	@CrossOrigin
	@DeleteMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Borra un producto" )
	public void deleteProducto(@PathVariable int id) {
		productoService.delete(id);
	}
	
}
