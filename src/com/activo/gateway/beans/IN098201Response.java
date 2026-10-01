package com.activo.gateway.beans;

public class IN098201Response extends WSResponse{
	
	private IN098201Bean[] IN098201;

	private IMSSGDSJVBean[] IMSSGDSJV;

	public IN098201Bean[] getIN098201() {
		return IN098201;
	}

	public void setIN098201(IN098201Bean[] iN098201) {
		IN098201 = iN098201;
	}

	public IMSSGDSJVBean[] getIMSSGDSJV() {
		return IMSSGDSJV;
	}

	public void setIMSSGDSJV(IMSSGDSJVBean[] iMSSGDSJV) {
		IMSSGDSJV = iMSSGDSJV;
	}
	
	
	
}
