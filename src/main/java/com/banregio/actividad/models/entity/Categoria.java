package com.banregio.actividad.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@Table (name="brcatego")
@ApiModel("Model categoria")
public class Categoria implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@ApiModelProperty(value = "Es el id del usuario", required = true)
	private Long CAt_IdCate;
	
	private String Cat_Descri;

	public Long getCAt_IdCate() {
		return CAt_IdCate;
	}

	public void setCAt_IdCate(Long cAt_IdCate) {
		CAt_IdCate = cAt_IdCate;
	}

	public String getCat_Descri() {
		return Cat_Descri;
	}

	public void setCat_Descri(String pro_Descri) {
		Cat_Descri = pro_Descri;
	}
	
	private static final long serialVersionUID = 1L;	
}
