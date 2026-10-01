/**
 * Archivo del Bean para el manejo de las afiliaciones
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 * 
 */
package com.activo.gateway.beans;


/**
 * Clase para el manejo de los datos de las afiliaciones
 *
 */
public class Afiliaciones {
	
	/**
	 * Identificador de la afiliacion
	 */
	private String id_afiliacion;
	
	/**
	 * Alias de la afiliacion 
	 */
	private String alias;
	
	/**
	 * Numero de producto(cuenta, inevrsion, tarjeta, credito)
	 */
	private String numero_cuenta;
	
	/**
	 * Nombre del beneficiario de la afiliacion
	 */
	private String nombre_beneficiario;
	
	/**
	 * Número de Cedula de identidad
	 */
	private String cedula_beneficiaio;
	
	/**
	 * Identificador patra el tipo de documento de identificacion
	 */
	private String tipo_cedula_beneficiario;
	
	/**
	 * Tipo de rif del beneficiario
	 */
	private String tipo_rif_beneficiario;
	
	/**
	 * Numero de RIF del beneficiario
	 */
	private String rif_beneficiario;
	
	/**
	 * Email beneficiario
	 */
	private String email_beneficiario;
	
	/**
	 * Monto maximo asignado a la afiliacion
	 */
	private String monto_maximo;
	
	
	
	//Acumulados del usuario
	
	/**
	 * Manejo del acumulado para transacciones mismo titular
	 */
	private String acumulado_internas;
	
	/**
	 * Manejo del acumulado para transacciones terceros en Activo
	 */
	private String acumulado_internas_terceros;
	
	/**
	 * Manejo del acumulado para transacciones externas mismo titular
	 */
	private String acumulado_externas;
	
	/**
	 * Manejo del acumulado para transacciones externas terceros
	 */
	private String acumulado_externas_terceros;
	
	/**
	 * Manejo del acumulado total de  transacciones externas
	 */
	private String total_acumulado_externas;
	
	/**
	 * Obtiene el id de la afiliacion
	 * @return
	 */
	public String getId_afiliacion() {
		return id_afiliacion;
	}

	/**
	 * Asigna el id de la afiliacion
	 * @param id
	 */
	public void setId_afiliacion(String id_afiliacion) {
		this.id_afiliacion = id_afiliacion;
	}	
	
	/**
	 * Obtiene el alias de la afiliacion
	 * @return
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Asigna el alias de la afiliacion
	 * @param alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	/**
	 * Odtiene el numero de cuenta/producto
	 * @return numero_cuenta
	 */
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	
	/**
	 * Asigna el numero de cuenta/producto
	 * @param numero_cuenta
	 */
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	
	/**
	 * Obtiene el nombre del beneficiario
	 * @return nombre_beneficiario
	 */
	public String getNombre_beneficiario() {
		return nombre_beneficiario;
	}
	
	/**
	 * Asigna el nombre del beneficiario
	 * @param nombre_beneficiario
	 */
	public void setNombre_beneficiario(String nombre_beneficiario) {
		this.nombre_beneficiario = nombre_beneficiario;
	}
	
	/**
	 * Obtiene el numero de cedula del beneficiario
	 * @return cedula
	 */
	public String getCedula_beneficiaio() {
		return cedula_beneficiaio;
	}
	
	/**
	 * Asigna el numero de cedula del beneficiario
	 * @param cedula
	 */
	public void setCedula_beneficiaio(String cedula_beneficiaio) {
		this.cedula_beneficiaio = cedula_beneficiaio;
	}
	
	/**
	 * Obtiene el tipo de cedula del beneficiario
	 * @return tipo_cedula
	 */
	public String getTipo_cedula_beneficiario() {
		return tipo_cedula_beneficiario;
	}
	
	/**
	 * Asigna el tipo de cedula del beneficiario
	 * @param tipo_cedula
	 */
	public void setTipo_cedula_beneficiario(String tipo_cedula_beneficiario) {
		this.tipo_cedula_beneficiario = tipo_cedula_beneficiario;
	}	
	
	/**
	 * Obtiene el tipo rif del beneficiario
	 * @return
	 */
	public String getTipo_rif_beneficiario() {
		return tipo_rif_beneficiario;
	}

	/**
	 * Asigna el tipo de rif del beneficiario
	 * @param tipo_rif
	 */
	public void setTipo_rif_beneficiario(String tipo_rif_beneficiario) {
		this.tipo_rif_beneficiario = tipo_rif_beneficiario;
	}
	
	/**
	 * Obtiene el numero de RIF del beneficiario
	 * @return
	 */
	public String getRif_beneficiario() {
		return rif_beneficiario;
	}

	/**
	 * Asigna el RIF del beneficiario
	 * @param rif
	 */
	public void setRif_beneficiario(String rif_beneficiario) {
		this.rif_beneficiario = rif_beneficiario;
	}
	
	/**
	 * Obtiene el email del beneficiario
	 * @return email
	 */
	public String getEmail_beneficiario() {
		return email_beneficiario;
	}

	/**
	 * Asigna el email del beneficiario
	 * @param email
	 */
	public void setEmail_beneficiario(String email_beneficiario) {
		this.email_beneficiario = email_beneficiario;
	}
	
	/**
	 * Obtiene el monto maximo de la afiliacion
	 * @return monto_maximo
	 */
	public String getMonto_maximo() {
		return monto_maximo;
	}
	
	/**
	 * Asigna el monto maximo de la afiliacion
	 * @param monto_maximo
	 */
	public void setMonto_maximo(String monto_maximo) {
		this.monto_maximo = monto_maximo;
	}
	
	/**
	 * Obtiene el acumulado de transacciones internas mismo titular
	 * @return acumulado_internas
	 */
	public String getAcumulado_internas() {
		return acumulado_internas;
	}
	
	/**
	 * Asignma el acumulado de transacciones internas mismo titular
	 * @param acumulado_internas
	 */
	public void setAcumulado_internas(String acumulado_internas) {
		this.acumulado_internas = acumulado_internas;
	}
	
	/**
	 * Obtiene el acumulado de transacciones internas terceros
	 * @return acumulado_internas_terceros
	 */
	public String getAcumulado_internas_terceros() {
		return acumulado_internas_terceros;
	}
	
	/**
	 * Asigna el acumulado de transacciones internas terceros
	 * @param acumulado_internas_terceros
	 */
	public void setAcumulado_internas_terceros(String acumulado_internas_terceros) {
		this.acumulado_internas_terceros = acumulado_internas_terceros;
	}
	
	/**
	 * Obtiene el acumulado de transacciones externas mismo titular
	 * @return acumulado_externas
	 */
	public String getAcumulado_externas() {
		return acumulado_externas;
	}
	
	/**
	 * Asigna el acumulado de transacciones externas mismo titular
	 * @param acumulado_externas
	 */
	public void setAcumulado_externas(String acumulado_externas) {
		this.acumulado_externas = acumulado_externas;
	}
	
	/**
	 * Obtiene el acumulado de transacciones externas terceros
	 * @return
	 */
	public String getAcumulado_externas_terceros() {
		return acumulado_externas_terceros;
	}
	
	/**
	 * Asigna el acumulado de transacciones externas terceros
	 * @param acumulado_externas_terceros
	 */
	public void setAcumulado_externas_terceros(String acumulado_externas_terceros) {
		this.acumulado_externas_terceros = acumulado_externas_terceros;
	}

	/**
	 * @return the total_acumulado_externas
	 */
	public String getTotal_acumulado_externas() {
		return total_acumulado_externas;
	}

	/**
	 * @param total_acumulado_externas the total_acumulado_externas to set
	 */
	public void setTotal_acumulado_externas(String total_acumulado_externas) {
		this.total_acumulado_externas = total_acumulado_externas;
	}



	
}
