package com.activo.gateway.beans;

import java.util.ArrayList;
import java.util.List;

public class MovimientosExtraCreditoResponse extends WSResponse {
	List<MovimientoExtracreditoBean> movimientos = new ArrayList<MovimientoExtracreditoBean>();

	public List<MovimientoExtracreditoBean> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<MovimientoExtracreditoBean> movimientos) {
		this.movimientos = movimientos;
	}
	
}
