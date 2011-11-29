package com.wgd.pe.dao.seguridad;

import javax.ejb.Local;

@Local
public interface SeguridadDAO {
	
	public abstract int login(String usuario, String contrasenia)throws Exception;
	
}
