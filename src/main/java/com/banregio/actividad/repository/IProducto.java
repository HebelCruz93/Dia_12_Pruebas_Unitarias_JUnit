package com.banregio.actividad.repository;
import org.springframework.data.repository.CrudRepository;
import com.banregio.actividad.models.entity.Producto;


public interface IProducto extends CrudRepository<Producto,Integer> {

}
