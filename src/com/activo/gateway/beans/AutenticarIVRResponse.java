/**
 * Archivo del Bean para manejar el response de la Autenticación del Usuario
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

import java.sql.Timestamp;
import java.util.Date;


/**
 * 
 * Clase para manejar el response de la Autenticación del IVR
 *
 */
public class AutenticarIVRResponse extends WSResponse{
	
        /**
	 * Parámetro para el manejo del estatus del registro
	 */
	private String estatusRegistro;
        
        /**
	 * Parámetro para el manejo del estatus del acceso
	 */
	private String estatusAcceso;
        
        /**
	 * Parámetro para el manejo del estatus de la sesion
	 */
	private int estatusSesion;
        
	/**
	 * Parámetro para el manejo de la fecha de expiración de la clave
	 */
	private String fechaExpiracion;
        
        /**
	 * Parámetro para el manejo de la fecha de la ultima conexion del usuario
	 */
	private String fechaUltimaConexion;
        
        /**
	 * Parámetro para el manejo del nombre del usuario
	 */
	private String nombreApellido;
        
        /**
	 * Parámetro para el manejo de la identificacion del usuario
	 */
	private String identificacion;

        public String getEstatusRegistro() {
            return estatusRegistro;
        }

        public void setEstatusRegistro(String estatusRegistro) {
            this.estatusRegistro = estatusRegistro;
        }

        public String getEstatusAcceso() {
            return estatusAcceso;
        }

        public void setEstatusAcceso(String estatusAcceso) {
            this.estatusAcceso = estatusAcceso;
        }

        public int getEstatusSesion() {
            return estatusSesion;
        }

        public void setEstatusSesion(int estatusSesion) {
            this.estatusSesion = estatusSesion;
        }
	
	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

        public String getFechaUltimaConexion() {
            return fechaUltimaConexion;
        }

        public void setFechaUltimaConexion(String fechaUltimaConexion) {
            this.fechaUltimaConexion = fechaUltimaConexion;
        }

        public String getNombreApellido() {
            return nombreApellido;
        }

        public void setNombreApellido(String nombreApellido) {
            this.nombreApellido = nombreApellido;
        }

        public String getIdentificacion() {
            return identificacion;
        }

        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }
	
}
