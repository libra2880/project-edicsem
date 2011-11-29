package com.wgd.pe.facade.seguridad.bean;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.wgd.pe.dao.seguridad.SeguridadDAO;
import com.wgd.pe.facade.seguridad.SeguridadFacade;

@Stateless
public class SeguridadFacadeBean implements SeguridadFacade{
	@EJB
	private SeguridadDAO objSeguridad;
	
	@Override
	public int login(String usuario, String contrasenia) throws Exception {
		return objSeguridad.login(usuario, contrasenia);
	}

}
