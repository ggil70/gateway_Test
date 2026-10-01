package com.activo.gateway.beans;

/**
 *
 * @author P018364128
 */
public class IN096201Response extends WSResponse {
    
    private IN096201Bean IN096201;
    
    private IMSSGDSJVBean[] IMSSGDSJV;

    public IN096201Bean getIN096201() {
        return IN096201;
    }

    public void setIN096201(IN096201Bean IN096201) {
        this.IN096201 = IN096201;
    }

    public IMSSGDSJVBean[] getIMSSGDSJV() {
        return IMSSGDSJV;
    }

    public void setIMSSGDSJV(IMSSGDSJVBean[] IMSSGDSJV) {
        this.IMSSGDSJV = IMSSGDSJV;
    }
}
