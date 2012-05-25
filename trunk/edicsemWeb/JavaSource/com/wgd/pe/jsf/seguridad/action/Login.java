package com.wgd.pe.jsf.seguridad.action;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.wgd.pe.facade.seguridad.SeguridadFacade;

@SessionScoped
@ManagedBean
public class Login {

	private String usuario;
	private String contrasenia;
	
	@EJB private SeguridadFacade objFacadeSeguridad; 

	public Login() {
		usuario = "";
		contrasenia = "";

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	//MI ACTION
	public String ingresar(){
		String resultado="";
		try {
			// CUARTO DE DIEGO 6506432
			if (objFacadeSeguridad.login(usuario, contrasenia)==1) {
				resultado="result";
			}else {
				resultado="login";
				FacesContext.getCurrentInstance().addMessage
				(null, new FacesMessage( FacesMessage.SEVERITY_WARN,"Mensaje de error" 
						,"El usuario insertado es incorrecto. Por favor ingrese nuevamente el usuario."));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado; 
	}
	public String ingreso(){
		return "/loginNext";
	}
}
