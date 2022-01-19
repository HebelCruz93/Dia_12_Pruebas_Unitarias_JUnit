package com.banregio.actividad.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="brproduc")
public class Producto  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Pro_IdProd;
	
	private String Pro_Descri;
	
	private int Pro_Catego;
	
	public Long getPro_IdProd() {
		return Pro_IdProd;
	}


	public void setPro_IdProd(Long pro_IdProd) {
		Pro_IdProd = pro_IdProd;
	}


	public String getPro_Descri() {
		return Pro_Descri;
	}


	public void setPro_Descri(String pro_Descri) {
		Pro_Descri = pro_Descri;
	}


	public int getPro_Catego() {
		return Pro_Catego;
	}


	public void setPro_Catego(int pro_Catego) {
		Pro_Catego = pro_Catego;
	}



	
	private static final long serialVersionUID = 1L;	
	
}
