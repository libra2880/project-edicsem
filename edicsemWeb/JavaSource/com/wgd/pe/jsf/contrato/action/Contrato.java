package com.wgd.pe.jsf.contrato.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Contrato {
     
	public Contrato() {
		// TODO Auto-generated constructor stub
	}
	
	public String registroContrato(){
		return "/registroContrato";
	}

	
}
