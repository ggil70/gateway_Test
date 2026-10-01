package com.activo.gateway.beans;

/**
 *
 * @author P018364128
 */
public class SUMDSJV3Response extends WSResponse{
    
    private SUMDSJV3Bean[] SUMDSJV3;

    public SUMDSJV3Bean[] getSUMDSJV3() {
        return SUMDSJV3;
    }

    public void setSUMDSJV3(SUMDSJV3Bean[] SUMDSJV3) {
        this.SUMDSJV3 = SUMDSJV3;
    }
}
