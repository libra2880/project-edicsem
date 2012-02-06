/**
 * 
 */
package com.wgd.pe.jsf.cardex.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Jhonatan Rojas T.
 *
 */
@SessionScoped
@ManagedBean
public class Kardex {

	
	public Kardex() {
		// TODO Auto-generated constructor stub
	}
	
	//Mantenimiento de Productos-Registro de Producto
	public String registroProducto(){
		String resultado = "mantenimientoProducto";
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(resultado);
		return resultado;
	}
}
