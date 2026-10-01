package com.activo.gateway.interfaces;

import java.util.List;

import com.activo.gateway.beans.ExtraCreditoInfoBean;
import com.activo.gateway.beans.MovimientoExtracreditoBean;


/**
 * Interfaz que especifica los metodos a implementar por los repoitorios de información de extracreditos
 * 
 * @author P011203513
 *
 */
public interface IExtraCreditoRepo {
    /**
     * Extrae los extacreditos
     * 
     * Dada una tarjeta de credito, devuelve un listado de todos los extracreditos activos y pendientes 
     * en dicha tarjeta
     * 
     * @param numTarjeta
     * @return List
     * @throws Exception
     */
    List<ExtraCreditoInfoBean> getExtraCreditos(String numTarjeta) throws Exception;
    
    
    /**
     * Extrae los moviemientos de un extracredito
     * 
     * Dado un extracredito, devuelve un listado con todos los movivmientos realizados en ese extracredito
     * 
     * @param ext
     * @return List
     * @throws Exception
     */
    List<MovimientoExtracreditoBean> getMovimientosExtraCredito(ExtraCreditoInfoBean ext) throws Exception;
}
