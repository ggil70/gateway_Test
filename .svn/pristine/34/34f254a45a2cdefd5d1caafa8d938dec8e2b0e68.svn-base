package com.activo.gateway.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;


public class Parametros implements CallbackHandler {
	private Properties prop;
	
	public Parametros(){
		try {
			InputStream in = this.getClass().getClassLoader().getResourceAsStream("parametros.properties");
			this.prop = new Properties();
			this.prop.load(in);
			in.close();
		} catch (Exception e) {
			System.out.println("No se encontro el archivo de parametros");
		}
	}
	
	public String getString(String key){
		return this.prop.getProperty(key);
	}
	
	public int getInt(String key){
		return Integer.parseInt(this.prop.getProperty(key));
	}

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

                /*
                 * here call a function/method to lookup the password for
                 * the given identifier (e.g. a user name or keystore alias)
                 * e.g.: pc.setPassword(passStore.getPassword(pc.getIdentfifier))
                 * for festing we supply a fixed name here.
                 */
                pc.setPassword(Crypto.decrypt(getString("Idg_pwd")));
            } else {
                throw new UnsupportedCallbackException(callbacks[i],
                        "Unrecognized Callback");
            }
        }
		
	}
}
