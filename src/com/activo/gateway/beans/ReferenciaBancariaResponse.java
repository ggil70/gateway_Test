package com.activo.gateway.beans;

import org.apache.xml.security.utils.Base64;

public class ReferenciaBancariaResponse extends WSResponse {
	
	private ReferenciaBancariaBean referencia;
	private String referenciaPDF;

	public ReferenciaBancariaBean getReferencia() {
		return referencia;
	}

	public void setReferencia(ReferenciaBancariaBean referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the referenciaPDF
	 */
	public String getReferenciaPDF() {
		return referenciaPDF;
	}

	/**
	 * @param referenciaPDF the referenciaPDF to set
	 */
	public void setReferenciaPDF(String referenciaPDF) {
		this.referenciaPDF = referenciaPDF;
	}	
	
}
