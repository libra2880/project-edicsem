package com.wgd.pe.jsf.kardex.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Kardex {
     
	public Kardex() {

	}
	public int numero;
	public String registroProducto(){
		return "/loginNext";
	}
	
	public String registroOrdenReposicion(){
		return "/registroOrdenReposicion";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
