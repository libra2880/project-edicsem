package com.wgd.pe.dao.seguridad.bean;

import javax.ejb.Stateless;

import com.wgd.pe.dao.seguridad.SeguridadDAO;
@Stateless
public class SeguridadDAOBean implements SeguridadDAO{

	@Override
	public int login(String usuario, String contrasenia) throws Exception {
		// CONTRUCCION DEL CODIGO DEL NEGOCIO
		//ESTO ES UN EJEMPLO, ASI YO NO PROGRAMO XD!
		int resultado=0;
		if (usuario.equalsIgnoreCase("diego") && contrasenia.equalsIgnoreCase("123")) {
			resultado=1;
					
		}
		return resultado;
	}

}
