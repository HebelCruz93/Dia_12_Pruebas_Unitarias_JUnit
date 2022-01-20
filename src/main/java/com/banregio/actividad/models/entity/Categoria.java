package com.banregio.actividad.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Table (name="brcatego", schema = "public")
@ApiModel("Model categoria")
public class Categoria implements Serializable {
	
	@Id	
	@Column(name = "cat_idcate")
	private int cat_idcate;
	
	@Column(name = "cat_nombre")
	private String cat_nombre;

	
	public String getCat_nombre() {
		return cat_nombre;
	}


	public void setCat_nombre(String cat_nombre) {
		this.cat_nombre = cat_nombre;
	}


	public int getCat_idcate() {
		return cat_idcate;
	}


	public void setCat_idcate(int cat_idcate) {
		this.cat_idcate = cat_idcate;
	}


	


	private static final long serialVersionUID = 1L;	
}
