/**
 * Archivo del Bean para el Manejo de los Estatus de Registro y Acceso de Usuarios
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

import java.sql.Timestamp;

/**
 * 
 *Clase para manejar los Estatus de Registro y Acceso de Usuarios
 *
 */
public class Usuario {
	
	/**
	 * Parámetro para manejar el Tipo de Documento de Identificación
	 */
	private String tipoCedula;
	
	/**
	 * Parámetro para manejar el Documento de Identificación
	 */
	private String cedula;
	
	/**
	 * Parámetro para manejar el Estatus Registro del Usuario 
	 */
	private String estatusRegistro;
	
	/**
	 * Parámetro para manejar el estatus Acceso del Usuario
	 */
	private String estatusAcceso;

	/**
	 * Parámetro para manejar el id del Usuario
	 */
	private int id;
	
	/*Incorporados para ser manejados por CHECK0USER*/
	/**
	 * Parámetro para manejar el tip RIF
	 */
	private String tipo_rif;
	
	/**
	 * Parámetro para menajar el número de RIF
	 */
	private String rif;
	//
	
	//Manejo de limites de transacciones
	/**
	 * Parámetro para el manejo de los límites internos general natural
	 */
	private double limiteInternasGeneralNatural;
	
	/**
	 * Parámetro para el manejo de los límites externos general juridico
	 */
	private double limiteExternasGeneralNatural;
	
	/**
	 * Parámetro para el manejo de los límites intenos juridicos
	 */
	private double limiteInternasGeneralJuridico;
	
	/**
	 * Parámetro para el manejo de los límites externos jurídicos.
	 */
	private double limiteExternasGeneralJuridico;
	//
	
	/**
	 * Parámetro para el majeno del acumulado del día
	 */
	private double acumulado;
			
	private String emailPrincipal;
	
	//Agregado 21/02/2014 para manejo de doble sesion
	private int estatusSesion;
        
        //Agregado 22/02/2018 para P2P
	private String login;
        
        //Agregado 22/02/2018 para P2P
	private Timestamp fechaHoraSesion;
        
        //Agregado 01/03/2018 para manejo del nombre del usuario
	private String nombreApellido;
        
        //Agregado 01/03/2018 para manejo de la ultima conexion
	private Timestamp fechaHoraUltimaconexion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getTipoCedula() {
		return tipoCedula;
	}

	public void setTipoCedula(String tipoCedula) {
		this.tipoCedula = tipoCedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo_rif() {
		return tipo_rif;
	}

	public void setTipo_rif(String tipo_rif) {
		this.tipo_rif = tipo_rif;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	/**
	 * @return the limiteInternasGeneralNatural
	 */
	public double getLimiteInternasGeneralNatural() {
		return limiteInternasGeneralNatural;
	}

	/**
	 * @param limiteInternasGeneralNatural the limiteInternasGeneralNatural to set
	 */
	public void setLimiteInternasGeneralNatural(double limiteInternasGeneralNatural) {
		this.limiteInternasGeneralNatural = limiteInternasGeneralNatural;
	}

	/**
	 * @return the limiteExternasGeneralNatural
	 */
	public double getLimiteExternasGeneralNatural() {
		return limiteExternasGeneralNatural;
	}

	/**
	 * @param limiteExternasGeneralNatural the limiteExternasGeneralNatural to set
	 */
	public void setLimiteExternasGeneralNatural(double limiteExternasGeneralNatural) {
		this.limiteExternasGeneralNatural = limiteExternasGeneralNatural;
	}

	/**
	 * @return the limiteInternasGeneralJuridico
	 */
	public double getLimiteInternasGeneralJuridico() {
		return limiteInternasGeneralJuridico;
	}

	/**
	 * @param limiteInternasGeneralJuridico the limiteInternasGeneralJuridico to set
	 */
	public void setLimiteInternasGeneralJuridico(
			double limiteInternasGeneralJuridico) {
		this.limiteInternasGeneralJuridico = limiteInternasGeneralJuridico;
	}

	/**
	 * @return the limiteExternasGeneralJuridico
	 */
	public double getLimiteExternasGeneralJuridico() {
		return limiteExternasGeneralJuridico;
	}

	/**
	 * @param limiteExternasGeneralJuridico the limiteExternasGeneralJuridico to set
	 */
	public void setLimiteExternasGeneralJuridico(
			double limiteExternasGeneralJuridico) {
		this.limiteExternasGeneralJuridico = limiteExternasGeneralJuridico;
	}

	/**
	 * @return the emailPrincipal
	 */
	public String getEmailPrincipal() {
		return emailPrincipal;
	}

	/**
	 * @param emailPrincipal the emailPrincipal to set
	 */
	public void setEmailPrincipal(String emailPrincipal) {
		this.emailPrincipal = emailPrincipal;
	}

	/**
	 * @return the acumulado
	 */
	public double getAcumulado() {
		return acumulado;
	}

	/**
	 * @param acumulado the acumulado to set
	 */
	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}	
	
	//Agregado el 21/02/2014 para manejo de doble sesión banca movil
	/**
	* @return estatusSesion Indica si la sesion del usuario esta activa en algun canal
	*/
	public int getEstatusSesion() {
		return estatusSesion;
	}

	/**
	* @param estatusSesion Indica si la sesion del usuario esta activa en algun canal
	*/
	public void setEstatusSesion(int estatusSesion) {
		this.estatusSesion = estatusSesion;
	}

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Timestamp getFechaHoraSesion() {
            return fechaHoraSesion;
        }

        public void setFechaHoraSesion(Timestamp fechaHoraSesion) {
            this.fechaHoraSesion = fechaHoraSesion;
        }

        public String getNombreApellido() {
            return nombreApellido;
        }

        public void setNombreApellido(String nombreApellido) {
            this.nombreApellido = nombreApellido;
        }

        public Timestamp getFechaHoraUltimaconexion() {
            return fechaHoraUltimaconexion;
        }

        public void setFechaHoraUltimaconexion(Timestamp fechaHoraUltimaconexion) {
            this.fechaHoraUltimaconexion = fechaHoraUltimaconexion;
        }
                
}
