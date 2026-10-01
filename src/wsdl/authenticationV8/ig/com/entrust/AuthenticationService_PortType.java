/**
 * AuthenticationService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.authenticationV8.ig.com.entrust;

public interface AuthenticationService_PortType extends java.rmi.Remote {
    public void ping(commonV8.ig.com.entrust.NameValue[] pingCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getAnonymousChallenge() throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getAnonymousChallengeForGroup(wsdl.authenticationV8.ig.com.entrust.GetAnonymousChallengeForGroupCallParms getAnonymousChallengeForGroupCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateAnonymousChallenge(wsdl.authenticationV8.ig.com.entrust.AuthenticateAnonymousChallengeCallParms authenticateAnonymousChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.AllowedAuthenticationTypes getAllowedAuthenticationTypes(wsdl.authenticationV8.ig.com.entrust.GetAllowedAuthenticationTypesCallParms getAllowedAuthenticationTypesCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.AllowedAuthenticationTypes getAllowedAuthenticationTypesForGroup(wsdl.authenticationV8.ig.com.entrust.GetAllowedAuthenticationTypesForGroupCallParms getAllowedAuthenticationTypesForGroupCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getGenericChallenge(wsdl.authenticationV8.ig.com.entrust.GetGenericChallengeCallParms getGenericChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericChallengeEx getGenericChallengeEx(wsdl.authenticationV8.ig.com.entrust.GetGenericChallengeExCallParms getGenericChallengeExCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateGenericChallenge(wsdl.authenticationV8.ig.com.entrust.AuthenticateGenericChallengeCallParms authenticateGenericChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationPasswordChangeRequiredFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
    public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateGenericChallengeEx(wsdl.authenticationV8.ig.com.entrust.AuthenticateGenericChallengeExCallParms authenticateGenericChallengeExCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationPasswordChangeRequiredFaultEx, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault;
}
