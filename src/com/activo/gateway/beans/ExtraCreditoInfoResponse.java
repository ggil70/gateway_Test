package com.activo.gateway.beans;

import java.util.ArrayList;
import java.util.List;

public class ExtraCreditoInfoResponse extends WSResponse {
	private List<ExtraCreditoInfoBean> extInfo = new ArrayList<ExtraCreditoInfoBean>();

	public List<ExtraCreditoInfoBean> getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(List<ExtraCreditoInfoBean> extracreditos) {
		this.extInfo = extracreditos;
	}	
}
