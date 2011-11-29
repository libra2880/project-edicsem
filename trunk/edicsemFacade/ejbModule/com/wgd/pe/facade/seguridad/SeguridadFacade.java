package com.wgd.pe.facade.seguridad;

import javax.ejb.Local;

@Local
public interface SeguridadFacade {
	
	public abstract int login(String usuario, String contrasenia)throws Exception;
}
