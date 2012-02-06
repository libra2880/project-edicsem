package com.wgd.pe.jsf.kardex.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Kardex {
     
	public Kardex() {
		// TODO Auto-generated constructor stub
	}
	
	public String registroProducto(){
		return "/mantenimientoProducto";
	}
	
}
