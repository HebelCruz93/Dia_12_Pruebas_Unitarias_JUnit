package com.banregio.actividad.repository;
import org.springframework.data.repository.CrudRepository;
import com.banregio.actividad.models.entity.Categoria;


public interface ICategoria extends CrudRepository<Categoria,Integer>{

}
