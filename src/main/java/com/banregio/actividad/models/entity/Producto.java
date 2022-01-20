package com.banregio.actividad.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="brproduc", schema = "public")
public class Producto  implements Serializable{

	@Id
	@Column(name = "pro_idprod")
	private int pro_idprod;
	
	@Column(name = "pro_descri")
	private String pro_descri;
	
	@Column(name = "pro_catego")
	private int pro_catego;		

		
	public int getPro_idprod() {
		return pro_idprod;
	}


	public void setPro_idprod(int pro_idprod) {
		this.pro_idprod = pro_idprod;
	}


	public String getPro_descri() {
		return pro_descri;
	}


	public void setPro_descri(String pro_descri) {
		this.pro_descri = pro_descri;
	}

	public int getPro_catego() {
		return pro_catego;
	}



	public void setPro_catego(int pro_catego) {
		this.pro_catego = pro_catego;
	}






	private static final long serialVersionUID = 1L;	
	
}
