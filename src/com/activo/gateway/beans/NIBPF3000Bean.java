/**
 * Archivo del Bean para las Preguntas de Autenticación
 * 
 * @author Adverweb <http://www.adverweb.com>
 *
 */


/**
 * Contenedor de clases
 */
package com.activo.gateway.beans;

/**
 * 
 *Clase para manejar las Preguntas de Autenticación
 *
 */
public class NIBPF3000Bean extends ParamsGenerales{
	
	/**
	 * Parámetro para manejar la Nacionalidad del Usuario
	 */
	private String NACIONALIDAD;
	
	/**
	 * Parámetro para manejar El Número de Identificación del Usuario
	 */
	private String NROIDENTIFICACION;
	
	/**
	 * Parámetro para manejar el Número de Pregunta
	 */
	private String NROPREGUNTA;
	
	/**
	 * Parámetro para manejar el tipo de Respuesta
	 */
	private String TIPORESPUESTA;
	
	/**
	 * Parámetro para manejar la Respuesta
	 */
	private String RESPUESTA;
	
		
	//  1
	/**
	 * Parámetro para manejar la fecha de Nacimiento del Usuario
	 */
	private String fechaNacimiento;
	
	//  2
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Cuenta Corriente
	 */
	private String ultimos4CtaCte;
	
	/**
	 * Parámetro para manejar la Dirección de Estados de Cuenta
	 */
	private String dirEstadoCuenta;
	
	//  3
	/**
	 * Parámetro para manejar LA Franquicia
	 */
	private String franquicia;
	
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Tarjeta de Crédito
	 */
	private String ultimos4Tdc;
	
	/**
	 * Parámetro para manejar la Dirección de los Estados de Cuenta de la Tarjeta de Crédito
	 */
	private String dirEstadoCuentaTDC;
	
	//  4
	
	/**
	 * Parámetro para manejar el Número de la Cuenta de Ahorro
	 */
	private String nroCtaAhorro;
	
	/**
	 * Parámetro para manejar la Firma de Cotitulares en la Cuneta de Ahorro
	 */
	private String cotitularesCtaAhorro;
	
	//  5
	/**
	 * Parámetro para manejar el Número de Cuenta Corriente
	 */
	private String nroCtaCte;
	
	/**
	 * Parámetro para manejar la Firma de Cotitulares en la Cuenta Corriente
	 */
	private String cotitularesCtaCte;
	
	//  6
	/**
	 * Parámetro para manejar Si posee o no cuenta de Ahorro
	 */
	private String poseeCtaAhorro;
	
	// 6A
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Cuenta de Ahorro
	 */
	private String ultimos4CtaAhorro;
	
	// 6B
	/**
	 * Parámetro para manejar el Número de la Libreta de Ahorro
	 */
	private String nroLibreta;
	
	// 7
	/**
	 * Parámetro para manejar Si posee o no Cuenta Corriente
	 */
	private String poseeCtaCte;
	
	// 7A	
	//ultimos4CtaCte;
	
	// 7B
	/**
	 * Parámetro para manejar los Números de Cheques
	 */
	private String[] cheques = new String[]{};
	
	// 8
	/**
	 * Parámetro para manejar Si posee o no Tarjeta de Crédito Visa
	 */
	private String poseeTdcVisa;
	
	// 8A
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Tarjeta de Crédito Visa
	 */
	private String ultimos4TdcVisa;
	
	// 8B
	/**
	 * Parámetro para manejar la Fecha de Vencimiento de la Tarjeta de Crédito  Visa
	 */
	private String fechaVencTdcVisa;
	
	// 9
	/**
	 * Parámetro para manejar Si posee o no Tareta de Crédito Master
	 */
	private String poseeTdcMaster;
	
	// 9A
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Tarjeta de Crédito Master
	 */
	private String ultimos4TdcMaster;
	
	// 9B
	/**
	 * Parámetro para manejar la Fecha de Vencimiento de la Tarjeta de Crédito Master
	 */
	private String fechaVencTdcMaster;
	
	// 10
	/**
	 * Parámetro para manejar Si posee o no Tarjteta de Débito la Cuenta
	 */
	private String poseeCtaTdd;
	
	// 10A
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Tarjeta de Débito
	 */
	private String ultimos4Tdd;
	
	// 10B
	/**
	 * Parámetro para manejar la Fecha de Vencimiento de la Tarjeta de Débito
	 */
	private String fechaVecnTdd;
	
	// 11
	/**
	 * Parámetro para manejar el Número de Teléfono Celular
	 */
	private String nroTlfCelular;
	
	// 12
	/**
	 * Parámetro para manejar el Número de Teléfono de Oficina
	 */
	private String nroTlfOficina;
	
	// 13
	/**
	 * Parámetro para manejar el Número de de Teléfono de Residencia
	 */
	private String nroTlfResidencia;
	
	// 14
	/**
	 * Parámetro para manejar el Tipo de Producto
	 */
	private String tipoProducto;
	/**
	 * Parámetro para manejar los Últimos 4 Dígitos de la Cuenta
	 */
	private String ultimos4Cta;
	
	/**
	 * Parámetro para manejar el Nombre de la Oficina de Apertura de la Cuenta
	 */
	private String nombreOfcApertura;
	

	public String getNACIONALIDAD() {
		return NACIONALIDAD;
	}

	public void setNACIONALIDAD(String nACIONALIDAD) {
		NACIONALIDAD = nACIONALIDAD;
	}

	public String getNROIDENTIFICACION() {
		return NROIDENTIFICACION;
	}

	public void setNROIDENTIFICACION(String nROIDENTIFICACION) {
		NROIDENTIFICACION = nROIDENTIFICACION;
	}

	public String getNROPREGUNTA() {
		return NROPREGUNTA;
	}

	public void setNROPREGUNTA(String nROPREGUNTA) {
		NROPREGUNTA = nROPREGUNTA;
	}

	public String getTIPORESPUESTA() {
		return TIPORESPUESTA;
	}

	public void setTIPORESPUESTA(String tIPORESPUESTA) {
		TIPORESPUESTA = tIPORESPUESTA;
	}

	public String getRESPUESTA() {
		return RESPUESTA;
	}

	public void setRESPUESTA(String rESPUESTA) {
		RESPUESTA = rESPUESTA;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDirEstadoCuenta() {
		return dirEstadoCuenta;
	}

	public void setDirEstadoCuenta(String dirEstadoCuenta) {
		this.dirEstadoCuenta = dirEstadoCuenta;
	}

	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getUltimos4Tdc() {
		return ultimos4Tdc;
	}

	public void setUltimos4Tdc(String ultimos4Tdc) {
		this.ultimos4Tdc = ultimos4Tdc;
	}

	public String getDirEstadoCuentaTDC() {
		return dirEstadoCuentaTDC;
	}

	public void setDirEstadoCuentaTDC(String dirEstadoCuentaTDC) {
		this.dirEstadoCuentaTDC = dirEstadoCuentaTDC;
	}

	public String getNroCtaAhorro() {
		return nroCtaAhorro;
	}

	public void setNroCtaAhorro(String nroCtaAhorro) {
		this.nroCtaAhorro = nroCtaAhorro;
	}

	public String getCotitularesCtaAhorro() {
		return cotitularesCtaAhorro;
	}

	public void setCotitularesCtaAhorro(String cotitularesCtaAhorro) {
		this.cotitularesCtaAhorro = cotitularesCtaAhorro;
	}

	public String getNroCtaCte() {
		return nroCtaCte;
	}

	public void setNroCtaCte(String nroCtaCte) {
		this.nroCtaCte = nroCtaCte;
	}

	public String getCotitularesCtaCte() {
		return cotitularesCtaCte;
	}

	public void setCotitularesCtaCte(String cotitularesCtaCte) {
		this.cotitularesCtaCte = cotitularesCtaCte;
	}

	public String getPoseeCtaAhorro() {
		return poseeCtaAhorro;
	}

	public void setPoseeCtaAhorro(String poseeCtaAhorro) {
		this.poseeCtaAhorro = poseeCtaAhorro;
	}

	public String getUltimos4CtaAhorro() {
		return ultimos4CtaAhorro;
	}

	public void setUltimos4CtaAhorro(String ultimos4CtaAhorro) {
		this.ultimos4CtaAhorro = ultimos4CtaAhorro;
	}

	public String getNroLibreta() {
		return nroLibreta;
	}

	public void setNroLibreta(String nroLibreta) {
		this.nroLibreta = nroLibreta;
	}

	public String getPoseeCtaCte() {
		return poseeCtaCte;
	}

	public void setPoseeCtaCte(String poseeCtaCte) {
		this.poseeCtaCte = poseeCtaCte;
	}

	public String getUltimos4CtaCte() {
		return ultimos4CtaCte;
	}

	public void setUltimos4CtaCte(String ultimos4CtaCte) {
		this.ultimos4CtaCte = ultimos4CtaCte;
	}

	public String[] getCheques() {
		return cheques;
	}

	public void setCheques(String[] cheques) {
		this.cheques = cheques;
	}

	public String getPoseeTdcVisa() {
		return poseeTdcVisa;
	}

	public void setPoseeTdcVisa(String poseeTdcVisa) {
		this.poseeTdcVisa = poseeTdcVisa;
	}

	public String getUltimos4TdcVisa() {
		return ultimos4TdcVisa;
	}

	public void setUltimos4TdcVisa(String ultimos4TdcVisa) {
		this.ultimos4TdcVisa = ultimos4TdcVisa;
	}

	public String getFechaVencTdcVisa() {
		return fechaVencTdcVisa;
	}

	public void setFechaVencTdcVisa(String fechaVencTdcVisa) {
		this.fechaVencTdcVisa = fechaVencTdcVisa;
	}

	public String getPoseeTdcMaster() {
		return poseeTdcMaster;
	}

	public void setPoseeTdcMaster(String poseeTdcMaster) {
		this.poseeTdcMaster = poseeTdcMaster;
	}

	public String getUltimos4TdcMaster() {
		return ultimos4TdcMaster;
	}

	public void setUltimos4TdcMaster(String ultimos4TdcMaster) {
		this.ultimos4TdcMaster = ultimos4TdcMaster;
	}

	public String getFechaVencTdcMaster() {
		return fechaVencTdcMaster;
	}

	public void setFechaVencTdcMaster(String fechaVencTdcMaster) {
		this.fechaVencTdcMaster = fechaVencTdcMaster;
	}

	public String getPoseeCtaTdd() {
		return poseeCtaTdd;
	}

	public void setPoseeCtaTdd(String poseeCtaTdd) {
		this.poseeCtaTdd = poseeCtaTdd;
	}

	public String getUltimos4Tdd() {
		return ultimos4Tdd;
	}

	public void setUltimos4Tdd(String ultimos4Tdd) {
		this.ultimos4Tdd = ultimos4Tdd;
	}

	public String getFechaVecnTdd() {
		return fechaVecnTdd;
	}

	public void setFechaVecnTdd(String fechaVecnTdd) {
		this.fechaVecnTdd = fechaVecnTdd;
	}

	public String getNroTlfCelular() {
		return nroTlfCelular;
	}

	public void setNroTlfCelular(String nroTlfCelular) {
		this.nroTlfCelular = nroTlfCelular;
	}

	public String getNroTlfOficina() {
		return nroTlfOficina;
	}

	public void setNroTlfOficina(String nroTlfOficina) {
		this.nroTlfOficina = nroTlfOficina;
	}

	public String getNroTlfResidencia() {
		return nroTlfResidencia;
	}

	public void setNroTlfResidencia(String nroTlfResidencia) {
		this.nroTlfResidencia = nroTlfResidencia;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getUltimos4Cta() {
		return ultimos4Cta;
	}

	public void setUltimos4Cta(String ultimos4Cta) {
		this.ultimos4Cta = ultimos4Cta;
	}

	public String getNombreOfcApertura() {
		return nombreOfcApertura;
	}

	public void setNombreOfcApertura(String nombreOfcApertura) {
		this.nombreOfcApertura = nombreOfcApertura;
	}

}
