package wsdl.authenticationV8.ig.com.entrust;

public class AuthenticationServiceProxy implements wsdl.authenticationV8.ig.com.entrust.AuthenticationService_PortType {
  private String _endpoint = null;
  private wsdl.authenticationV8.ig.com.entrust.AuthenticationService_PortType authenticationService_PortType = null;
  
  public AuthenticationServiceProxy() {
    _initAuthenticationServiceProxy();
  }
  
  public AuthenticationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAuthenticationServiceProxy();
  }
  
  private void _initAuthenticationServiceProxy() {
    try {
      authenticationService_PortType = (new wsdl.authenticationV8.ig.com.entrust.AuthenticationService_ServiceLocator()).getAuthenticationService();
      if (authenticationService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)authenticationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)authenticationService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (authenticationService_PortType != null)
      ((javax.xml.rpc.Stub)authenticationService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public wsdl.authenticationV8.ig.com.entrust.AuthenticationService_PortType getAuthenticationService_PortType() {
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType;
  }
  
  public void ping(commonV8.ig.com.entrust.NameValue[] pingCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    authenticationService_PortType.ping(pingCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getAnonymousChallenge() throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getAnonymousChallenge();
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getAnonymousChallengeForGroup(wsdl.authenticationV8.ig.com.entrust.GetAnonymousChallengeForGroupCallParms getAnonymousChallengeForGroupCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getAnonymousChallengeForGroup(getAnonymousChallengeForGroupCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateAnonymousChallenge(wsdl.authenticationV8.ig.com.entrust.AuthenticateAnonymousChallengeCallParms authenticateAnonymousChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.authenticateAnonymousChallenge(authenticateAnonymousChallengeCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.AllowedAuthenticationTypes getAllowedAuthenticationTypes(wsdl.authenticationV8.ig.com.entrust.GetAllowedAuthenticationTypesCallParms getAllowedAuthenticationTypesCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getAllowedAuthenticationTypes(getAllowedAuthenticationTypesCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.AllowedAuthenticationTypes getAllowedAuthenticationTypesForGroup(wsdl.authenticationV8.ig.com.entrust.GetAllowedAuthenticationTypesForGroupCallParms getAllowedAuthenticationTypesForGroupCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getAllowedAuthenticationTypesForGroup(getAllowedAuthenticationTypesForGroupCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericChallenge getGenericChallenge(wsdl.authenticationV8.ig.com.entrust.GetGenericChallengeCallParms getGenericChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getGenericChallenge(getGenericChallengeCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericChallengeEx getGenericChallengeEx(wsdl.authenticationV8.ig.com.entrust.GetGenericChallengeExCallParms getGenericChallengeExCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.getGenericChallengeEx(getGenericChallengeExCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateGenericChallenge(wsdl.authenticationV8.ig.com.entrust.AuthenticateGenericChallengeCallParms authenticateGenericChallengeCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationPasswordChangeRequiredFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.authenticateGenericChallenge(authenticateGenericChallengeCallParms);
  }
  
  public wsdl.authenticationV8.ig.com.entrust.GenericAuthenticateResponse authenticateGenericChallengeEx(wsdl.authenticationV8.ig.com.entrust.AuthenticateGenericChallengeExCallParms authenticateGenericChallengeExCallParms) throws java.rmi.RemoteException, wsdl.authenticationV8.ig.com.entrust.AuthenticationPasswordChangeRequiredFaultEx, wsdl.authenticationV8.ig.com.entrust.AuthenticationSystemFault, wsdl.authenticationV8.ig.com.entrust.AuthenticationServiceFault{
    if (authenticationService_PortType == null)
      _initAuthenticationServiceProxy();
    return authenticationService_PortType.authenticateGenericChallengeEx(authenticateGenericChallengeExCallParms);
  }
  
  
}