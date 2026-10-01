package wsdl.adminV8.ig.com.entrust;

public class AdminServiceProxy implements wsdl.adminV8.ig.com.entrust.AdminService_PortType {
  private String _endpoint = null;
  private wsdl.adminV8.ig.com.entrust.AdminService_PortType adminService_PortType = null;
  
  public AdminServiceProxy() {
    _initAdminServiceProxy();
  }
  
  public AdminServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdminServiceProxy();
  }
  
  private void _initAdminServiceProxy() {
    try {
      adminService_PortType = (new wsdl.adminV8.ig.com.entrust.AdminService_ServiceLocator()).getAdminService();
      if (adminService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adminService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adminService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adminService_PortType != null)
      ((javax.xml.rpc.Stub)adminService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public wsdl.adminV8.ig.com.entrust.AdminService_PortType getAdminService_PortType() {
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType;
  }
  
  public wsdl.adminV8.ig.com.entrust.LoginResult login(wsdl.adminV8.ig.com.entrust.LoginCallParms loginCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminPasswordChangeRequiredFault, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.login(loginCallParms);
  }
  
  public void logout() throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.logout();
  }
  
  public wsdl.adminV8.ig.com.entrust.LoginResult changePassword(wsdl.adminV8.ig.com.entrust.ChangePasswordCallParms changePasswordCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.changePassword(changePasswordCallParms);
  }
  
  public void keepAlive(commonV8.ig.com.entrust.NameValue[] keepAliveCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.keepAlive(keepAliveCallParms);
  }
  
  public void ping(commonV8.ig.com.entrust.NameValue[] pingCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.ping(pingCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.LicenseInfo licenseGet(commonV8.ig.com.entrust.NameValue[] licenseGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.licenseGet(licenseGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.LicenseInfo licenseSet(wsdl.adminV8.ig.com.entrust.LicenseSetCallParms licenseSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.licenseSet(licenseSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.LicenseInfo licenseCheck(wsdl.adminV8.ig.com.entrust.LicenseCheckCallParms licenseCheckCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.licenseCheck(licenseCheckCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenLicenseInfo tokenLicenseGet(commonV8.ig.com.entrust.NameValue[] tokenLicenseGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenLicenseGet(tokenLicenseGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenLicenseInfo tokenLicenseSet(wsdl.adminV8.ig.com.entrust.TokenLicenseSetCallParms tokenLicenseSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenLicenseSet(tokenLicenseSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenLicenseInfo tokenLicenseCheck(wsdl.adminV8.ig.com.entrust.TokenLicenseCheckCallParms tokenLicenseCheckCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenLicenseCheck(tokenLicenseCheckCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLicenseInfo smartCredentialLicenseGet(commonV8.ig.com.entrust.NameValue[] smartCredentialLicenseGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLicenseGet(smartCredentialLicenseGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLicenseInfo smartCredentialLicenseSet(wsdl.adminV8.ig.com.entrust.SmartCredentialLicenseSetCallParms smartCredentialLicenseSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLicenseSet(smartCredentialLicenseSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLicenseInfo smartCredentialLicenseCheck(wsdl.adminV8.ig.com.entrust.SmartCredentialLicenseCheckCallParms smartCredentialLicenseCheckCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLicenseCheck(smartCredentialLicenseCheckCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SystemInfo systemInfoGet(commonV8.ig.com.entrust.NameValue[] systemInfoGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.systemInfoGet(systemInfoGetCallParms);
  }
  
  public void partitionCreate(wsdl.adminV8.ig.com.entrust.PartitionCreateCallParms partitionCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.partitionCreate(partitionCreateCallParms);
  }
  
  public void partitionDelete(wsdl.adminV8.ig.com.entrust.PartitionDeleteCallParms partitionDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.partitionDelete(partitionDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PartitionInfo partitionGet(wsdl.adminV8.ig.com.entrust.PartitionGetCallParms partitionGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.partitionGet(partitionGetCallParms);
  }
  
  public void partitionSet(wsdl.adminV8.ig.com.entrust.PartitionSetCallParms partitionSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.partitionSet(partitionSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PartitionInfoList partitionList(commonV8.ig.com.entrust.NameValue[] partitionListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.partitionList(partitionListCallParms);
  }
  
  public commonV8.ig.com.entrust.IPLocation ipLocationGet(wsdl.adminV8.ig.com.entrust.IPLocationGetCallParms ipLocationGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.ipLocationGet(ipLocationGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CountryInfo countryGet(wsdl.adminV8.ig.com.entrust.CountryGetCallParms countryGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.countryGet(countryGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CountryInfo[] countryList(commonV8.ig.com.entrust.NameValue[] countryListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.countryList(countryListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RegionInfo regionGet(wsdl.adminV8.ig.com.entrust.RegionGetCallParms regionGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.regionGet(regionGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RegionInfo[] regionList(wsdl.adminV8.ig.com.entrust.RegionListCallParms regionListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.regionList(regionListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenVendorInfo tokenVendorGet(wsdl.adminV8.ig.com.entrust.TokenVendorGetCallParms tokenVendorGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenVendorGet(tokenVendorGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenVendorInfo[] tokenVendorList(commonV8.ig.com.entrust.NameValue[] tokenVendorListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenVendorList(tokenVendorListCallParms);
  }
  
  public void policyCreate(wsdl.adminV8.ig.com.entrust.PolicyCreateCallParms policyCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.policyCreate(policyCreateCallParms);
  }
  
  public void policyDelete(wsdl.adminV8.ig.com.entrust.PolicyDeleteCallParms policyDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.policyDelete(policyDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PolicyInfo policyGet(wsdl.adminV8.ig.com.entrust.PolicyGetCallParms policyGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.policyGet(policyGetCallParms);
  }
  
  public void policySet(wsdl.adminV8.ig.com.entrust.PolicySetCallParms policySetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.policySet(policySetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PolicyInfoList policyList(commonV8.ig.com.entrust.NameValue[] policyListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.policyList(policyListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserSpecInfo userSpecGet(wsdl.adminV8.ig.com.entrust.UserSpecGetCallParms userSpecGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSpecGet(userSpecGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CardSpecInfo cardSpecGet(wsdl.adminV8.ig.com.entrust.CardSpecGetCallParms cardSpecGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.cardSpecGet(cardSpecGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PINSpecInfo pinSpecGet(wsdl.adminV8.ig.com.entrust.PinSpecGetCallParms pinSpecGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.pinSpecGet(pinSpecGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PasswordRulesInfo passwordRulesGet(wsdl.adminV8.ig.com.entrust.PasswordRulesGetCallParms passwordRulesGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.passwordRulesGet(passwordRulesGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PermissionsList permissionList(commonV8.ig.com.entrust.NameValue[] permissionListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.permissionList(permissionListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RoleInfoList ownRoleGet(commonV8.ig.com.entrust.NameValue[] ownRoleGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.ownRoleGet(ownRoleGetCallParms);
  }
  
  public void roleCreate(wsdl.adminV8.ig.com.entrust.RoleCreateCallParms roleCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.roleCreate(roleCreateCallParms);
  }
  
  public void roleDelete(wsdl.adminV8.ig.com.entrust.RoleDeleteCallParms roleDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.roleDelete(roleDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RoleInfo roleGet(wsdl.adminV8.ig.com.entrust.RoleGetCallParms roleGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.roleGet(roleGetCallParms);
  }
  
  public void roleSet(wsdl.adminV8.ig.com.entrust.RoleSetCallParms roleSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.roleSet(roleSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RoleInfoList roleList(wsdl.adminV8.ig.com.entrust.RoleListCallParms roleListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.roleList(roleListCallParms);
  }
  
  public void groupCreate(wsdl.adminV8.ig.com.entrust.GroupCreateCallParms groupCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.groupCreate(groupCreateCallParms);
  }
  
  public void groupDelete(wsdl.adminV8.ig.com.entrust.GroupDeleteCallParms groupDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.groupDelete(groupDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.GroupInfo groupGet(wsdl.adminV8.ig.com.entrust.GroupGetCallParms groupGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.groupGet(groupGetCallParms);
  }
  
  public void groupSet(wsdl.adminV8.ig.com.entrust.GroupSetCallParms groupSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.groupSet(groupSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.GroupInfoList groupList(wsdl.adminV8.ig.com.entrust.GroupListCallParms groupListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.groupList(groupListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ManagedCaUserInfo[] managedCaUserList(wsdl.adminV8.ig.com.entrust.ManagedCaUserListCallParms managedCaUserListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaUserList(managedCaUserListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CertificateResponse[] managedCaCertificateList(wsdl.adminV8.ig.com.entrust.ManagedCaCertificateListCallParms managedCaCertificateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaCertificateList(managedCaCertificateListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CertificateResponse managedCaScepRaEncryptionCertificateGet(wsdl.adminV8.ig.com.entrust.ManagedCaScepRaEncryptionCertificateGetCallParms managedCaScepRaEncryptionCertificateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaScepRaEncryptionCertificateGet(managedCaScepRaEncryptionCertificateGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CertificateResponse[] managedCaScepRaCertificateList(wsdl.adminV8.ig.com.entrust.ManagedCaScepRaCertificateListCallParms managedCaScepRaCertificateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaScepRaCertificateList(managedCaScepRaCertificateListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.DecryptedDataInfo managedCaScepRaDecryptData(wsdl.adminV8.ig.com.entrust.ManagedCaScepRaDecryptDataCallParms managedCaScepRaDecryptDataCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaScepRaDecryptData(managedCaScepRaDecryptDataCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ScepRaSignContentResult managedCaScepRaSignContent(wsdl.adminV8.ig.com.entrust.ManagedCaScepRaSignContentCallParms managedCaScepRaSignContentCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaScepRaSignContent(managedCaScepRaSignContentCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserRegistrationPasswordInfo userRegistrationPasswordGet(wsdl.adminV8.ig.com.entrust.UserRegistrationPasswordGetCallParms userRegistrationPasswordGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userRegistrationPasswordGet(userRegistrationPasswordGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserRegistrationPasswordResponse userRegistrationPasswordAuthenticate(wsdl.adminV8.ig.com.entrust.UserRegistrationPasswordAuthenticateCallParms userRegistrationPasswordAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userRegistrationPasswordAuthenticate(userRegistrationPasswordAuthenticateCallParms);
  }
  
  public void smartCredentialDefinitionCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionCreateCallParms smartCredentialDefinitionCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialDefinitionCreate(smartCredentialDefinitionCreateCallParms);
  }
  
  public void smartCredentialDefinitionDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionDeleteCallParms smartCredentialDefinitionDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialDefinitionDelete(smartCredentialDefinitionDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo smartCredentialDefinitionGet(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionGetCallParms smartCredentialDefinitionGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDefinitionGet(smartCredentialDefinitionGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfo smartCredentialDefinitionTemplateGet(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionTemplateGetCallParms smartCredentialDefinitionTemplateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDefinitionTemplateGet(smartCredentialDefinitionTemplateGetCallParms);
  }
  
  public void smartCredentialDefinitionSet(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionSetCallParms smartCredentialDefinitionSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialDefinitionSet(smartCredentialDefinitionSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfoList smartCredentialDefinitionList(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionListCallParms smartCredentialDefinitionListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDefinitionList(smartCredentialDefinitionListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionInfoList smartCredentialDefinitionTemplateList(wsdl.adminV8.ig.com.entrust.SmartCredentialDefinitionTemplateListCallParms smartCredentialDefinitionTemplateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDefinitionTemplateList(smartCredentialDefinitionTemplateListCallParms);
  }
  
  public void smartCredentialVariableCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableCreateCallParms smartCredentialVariableCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialVariableCreate(smartCredentialVariableCreateCallParms);
  }
  
  public void smartCredentialVariableDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableDeleteCallParms smartCredentialVariableDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialVariableDelete(smartCredentialVariableDeleteCallParms);
  }
  
  public void smartCredentialVariableSet(wsdl.adminV8.ig.com.entrust.SmartCredentialVariableSetCallParms smartCredentialVariableSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialVariableSet(smartCredentialVariableSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfo smartCredentialDeliveryGet(wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryGetCallParms smartCredentialDeliveryGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDeliveryGet(smartCredentialDeliveryGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialDeliveryInfoList smartCredentialDeliveryList(commonV8.ig.com.entrust.NameValue[] smartCredentialDeliveryListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialDeliveryList(smartCredentialDeliveryListCallParms);
  }
  
  public void smartCredentialAppletCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletCreateCallParms smartCredentialAppletCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialAppletCreate(smartCredentialAppletCreateCallParms);
  }
  
  public void smartCredentialAppletDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletDeleteCallParms smartCredentialAppletDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialAppletDelete(smartCredentialAppletDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialAppletInfo smartCredentialAppletGet(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletGetCallParms smartCredentialAppletGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialAppletGet(smartCredentialAppletGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialAppletInfo smartCredentialAppletTemplateGet(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletTemplateGetCallParms smartCredentialAppletTemplateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialAppletTemplateGet(smartCredentialAppletTemplateGetCallParms);
  }
  
  public void smartCredentialAppletSet(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletSetCallParms smartCredentialAppletSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialAppletSet(smartCredentialAppletSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialAppletInfoList smartCredentialAppletList(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletListCallParms smartCredentialAppletListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialAppletList(smartCredentialAppletListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialAppletInfoList smartCredentialAppletTemplateList(wsdl.adminV8.ig.com.entrust.SmartCredentialAppletTemplateListCallParms smartCredentialAppletTemplateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialAppletTemplateList(smartCredentialAppletTemplateListCallParms);
  }
  
  public void pacsCreate(wsdl.adminV8.ig.com.entrust.PACSCreateCallParms pacsCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.pacsCreate(pacsCreateCallParms);
  }
  
  public void pacsDelete(wsdl.adminV8.ig.com.entrust.PACSDeleteCallParms pacsDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.pacsDelete(pacsDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PACSInfo pacsGet(wsdl.adminV8.ig.com.entrust.PACSGetCallParms pacsGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.pacsGet(pacsGetCallParms);
  }
  
  public void pacsSet(wsdl.adminV8.ig.com.entrust.PACSSetCallParms pacsSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.pacsSet(pacsSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PACSInfoList pacsList(wsdl.adminV8.ig.com.entrust.PACSListCallParms pacsListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.pacsList(pacsListCallParms);
  }
  
  public void proxyCreate(wsdl.adminV8.ig.com.entrust.ProxyCreateCallParms proxyCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.proxyCreate(proxyCreateCallParms);
  }
  
  public void proxyDelete(wsdl.adminV8.ig.com.entrust.ProxyDeleteCallParms proxyDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.proxyDelete(proxyDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ProxyInfo proxyGet(wsdl.adminV8.ig.com.entrust.ProxyGetCallParms proxyGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.proxyGet(proxyGetCallParms);
  }
  
  public void proxySet(wsdl.adminV8.ig.com.entrust.ProxySetCallParms proxySetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.proxySet(proxySetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ProxyInfoList proxyList(wsdl.adminV8.ig.com.entrust.ProxyListCallParms proxyListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.proxyList(proxyListCallParms);
  }
  
  public void smartCredentialGraphicCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicCreateCallParms smartCredentialGraphicCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialGraphicCreate(smartCredentialGraphicCreateCallParms);
  }
  
  public void smartCredentialGraphicDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicDeleteCallParms smartCredentialGraphicDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialGraphicDelete(smartCredentialGraphicDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfo smartCredentialGraphicGet(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicGetCallParms smartCredentialGraphicGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialGraphicGet(smartCredentialGraphicGetCallParms);
  }
  
  public void smartCredentialGraphicSet(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicSetCallParms smartCredentialGraphicSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialGraphicSet(smartCredentialGraphicSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicInfoList smartCredentialGraphicList(wsdl.adminV8.ig.com.entrust.SmartCredentialGraphicListCallParms smartCredentialGraphicListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialGraphicList(smartCredentialGraphicListCallParms);
  }
  
  public void digitalIdConfigCreate(wsdl.adminV8.ig.com.entrust.DigitalIdConfigCreateCallParms digitalIdConfigCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.digitalIdConfigCreate(digitalIdConfigCreateCallParms);
  }
  
  public void digitalIdConfigDelete(wsdl.adminV8.ig.com.entrust.DigitalIdConfigDeleteCallParms digitalIdConfigDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.digitalIdConfigDelete(digitalIdConfigDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.DigitalIdConfigInfo digitalIdConfigGet(wsdl.adminV8.ig.com.entrust.DigitalIdConfigGetCallParms digitalIdConfigGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.digitalIdConfigGet(digitalIdConfigGetCallParms);
  }
  
  public void digitalIdConfigSet(wsdl.adminV8.ig.com.entrust.DigitalIdConfigSetCallParms digitalIdConfigSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.digitalIdConfigSet(digitalIdConfigSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.DigitalIdConfigInfoList digitalIdConfigList(wsdl.adminV8.ig.com.entrust.DigitalIdConfigListCallParms digitalIdConfigListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.digitalIdConfigList(digitalIdConfigListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.DigitalIdConfigInfoList digitalIdConfigTemplateList(wsdl.adminV8.ig.com.entrust.DigitalIdConfigTemplateListCallParms digitalIdConfigTemplateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.digitalIdConfigTemplateList(digitalIdConfigTemplateListCallParms);
  }
  
  public void smartCredentialLayoutCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutCreateCallParms smartCredentialLayoutCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialLayoutCreate(smartCredentialLayoutCreateCallParms);
  }
  
  public void smartCredentialLayoutDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutDeleteCallParms smartCredentialLayoutDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialLayoutDelete(smartCredentialLayoutDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo smartCredentialLayoutGet(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutGetCallParms smartCredentialLayoutGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLayoutGet(smartCredentialLayoutGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfo smartCredentialLayoutTemplateGet(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutTemplateGetCallParms smartCredentialLayoutTemplateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLayoutTemplateGet(smartCredentialLayoutTemplateGetCallParms);
  }
  
  public void smartCredentialLayoutSet(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutSetCallParms smartCredentialLayoutSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialLayoutSet(smartCredentialLayoutSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfoList smartCredentialLayoutList(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutListCallParms smartCredentialLayoutListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLayoutList(smartCredentialLayoutListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutInfoList smartCredentialLayoutTemplateList(wsdl.adminV8.ig.com.entrust.SmartCredentialLayoutTemplateListCallParms smartCredentialLayoutTemplateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLayoutTemplateList(smartCredentialLayoutTemplateListCallParms);
  }
  
  public void smartCredentialPrintModuleCreate(wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleCreateCallParms smartCredentialPrintModuleCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialPrintModuleCreate(smartCredentialPrintModuleCreateCallParms);
  }
  
  public void smartCredentialPrintModuleDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleDeleteCallParms smartCredentialPrintModuleDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialPrintModuleDelete(smartCredentialPrintModuleDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleInfo smartCredentialPrintModuleGet(wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleGetCallParms smartCredentialPrintModuleGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialPrintModuleGet(smartCredentialPrintModuleGetCallParms);
  }
  
  public void smartCredentialPrintModuleSet(wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleSetCallParms smartCredentialPrintModuleSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialPrintModuleSet(smartCredentialPrintModuleSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleInfoList smartCredentialPrintModuleList(commonV8.ig.com.entrust.NameValue[] smartCredentialPrintModuleListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialPrintModuleList(smartCredentialPrintModuleListCallParms);
  }
  
  public void smartCredentialPrintModuleWipe(wsdl.adminV8.ig.com.entrust.SmartCredentialPrintModuleWipeCallParms smartCredentialPrintModuleWipeCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialPrintModuleWipe(smartCredentialPrintModuleWipeCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RepositoryInfo repositoryGet(wsdl.adminV8.ig.com.entrust.RepositoryGetCallParms repositoryGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.repositoryGet(repositoryGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.RepositoryInfoList repositoryList(commonV8.ig.com.entrust.NameValue[] repositoryListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.repositoryList(repositoryListCallParms);
  }
  
  public void userCreate(wsdl.adminV8.ig.com.entrust.UserCreateCallParms userCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userCreate(userCreateCallParms);
  }
  
  public void userDelete(wsdl.adminV8.ig.com.entrust.UserDeleteCallParms userDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userDelete(userDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserInfo userGet(wsdl.adminV8.ig.com.entrust.UserGetCallParms userGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userGet(userGetCallParms);
  }
  
  public void userSet(wsdl.adminV8.ig.com.entrust.UserSetCallParms userSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSet(userSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserListResult userList(wsdl.adminV8.ig.com.entrust.UserListCallParms userListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userList(userListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserLockoutInfo userLockoutGet(wsdl.adminV8.ig.com.entrust.UserLockoutGetCallParms userLockoutGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userLockoutGet(userLockoutGetCallParms);
  }
  
  public void userLockoutSet(wsdl.adminV8.ig.com.entrust.UserLockoutSetCallParms userLockoutSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userLockoutSet(userLockoutSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserEnrollListResult userEnrollList(wsdl.adminV8.ig.com.entrust.UserEnrollListCallParms userEnrollListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userEnrollList(userEnrollListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.DeliveryConfigInfoList deliveryConfigList(commonV8.ig.com.entrust.NameValue[] deliveryConfigListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.deliveryConfigList(deliveryConfigListCallParms);
  }
  
  public void userContactInfoCreate(wsdl.adminV8.ig.com.entrust.UserContactInfoCreateCallParms userContactInfoCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userContactInfoCreate(userContactInfoCreateCallParms);
  }
  
  public int userContactInfoDelete(wsdl.adminV8.ig.com.entrust.UserContactInfoDeleteCallParms userContactInfoDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userContactInfoDelete(userContactInfoDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ContactInfo[] userContactInfoGet(wsdl.adminV8.ig.com.entrust.UserContactInfoGetCallParms userContactInfoGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userContactInfoGet(userContactInfoGetCallParms);
  }
  
  public void userContactInfoSet(wsdl.adminV8.ig.com.entrust.UserContactInfoSetCallParms userContactInfoSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userContactInfoSet(userContactInfoSetCallParms);
  }
  
  public void userPINCreate(wsdl.adminV8.ig.com.entrust.UserPINCreateCallParms userPINCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPINCreate(userPINCreateCallParms);
  }
  
  public void userPINDelete(wsdl.adminV8.ig.com.entrust.UserPINDeleteCallParms userPINDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPINDelete(userPINDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserPINInfo userPINGet(wsdl.adminV8.ig.com.entrust.UserPINGetCallParms userPINGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPINGet(userPINGetCallParms);
  }
  
  public void userPINSet(wsdl.adminV8.ig.com.entrust.UserPINSetCallParms userPINSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPINSet(userPINSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.MachineSecretInfo userMachineSecretCreate(wsdl.adminV8.ig.com.entrust.UserMachineSecretCreateCallParms userMachineSecretCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userMachineSecretCreate(userMachineSecretCreateCallParms);
  }
  
  public void userMachineSecretDelete(wsdl.adminV8.ig.com.entrust.UserMachineSecretDeleteCallParms userMachineSecretDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userMachineSecretDelete(userMachineSecretDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.MachineSecretInfo userMachineSecretGet(wsdl.adminV8.ig.com.entrust.UserMachineSecretGetCallParms userMachineSecretGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userMachineSecretGet(userMachineSecretGetCallParms);
  }
  
  public void userMachineSecretSet(wsdl.adminV8.ig.com.entrust.UserMachineSecretSetCallParms userMachineSecretSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userMachineSecretSet(userMachineSecretSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.MachineSecretInfo[] userMachineSecretList(wsdl.adminV8.ig.com.entrust.UserMachineSecretListCallParms userMachineSecretListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userMachineSecretList(userMachineSecretListCallParms);
  }
  
  public void userPreferenceCreate(wsdl.adminV8.ig.com.entrust.UserPreferenceCreateCallParms userPreferenceCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPreferenceCreate(userPreferenceCreateCallParms);
  }
  
  public void userPreferenceDelete(wsdl.adminV8.ig.com.entrust.UserPreferenceDeleteCallParms userPreferenceDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPreferenceDelete(userPreferenceDeleteCallParms);
  }
  
  public commonV8.ig.com.entrust.NameValue userPreferenceGet(wsdl.adminV8.ig.com.entrust.UserPreferenceGetCallParms userPreferenceGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPreferenceGet(userPreferenceGetCallParms);
  }
  
  public void userPreferenceSet(wsdl.adminV8.ig.com.entrust.UserPreferenceSetCallParms userPreferenceSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPreferenceSet(userPreferenceSetCallParms);
  }
  
  public commonV8.ig.com.entrust.NameValue[] userPreferenceList(wsdl.adminV8.ig.com.entrust.UserPreferenceListCallParms userPreferenceListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPreferenceList(userPreferenceListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserOTPInfo[] userOTPCreate(wsdl.adminV8.ig.com.entrust.UserOTPCreateCallParms userOTPCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userOTPCreate(userOTPCreateCallParms);
  }
  
  public int userOTPDelete(wsdl.adminV8.ig.com.entrust.UserOTPDeleteCallParms userOTPDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userOTPDelete(userOTPDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserOTPDeliverResult userOTPDeliver(wsdl.adminV8.ig.com.entrust.UserOTPDeliverCallParms userOTPDeliverCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userOTPDeliver(userOTPDeliverCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserOTPInfo[] userOTPGet(wsdl.adminV8.ig.com.entrust.UserOTPGetCallParms userOTPGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userOTPGet(userOTPGetCallParms);
  }
  
  public int userOTPSet(wsdl.adminV8.ig.com.entrust.UserOTPSetCallParms userOTPSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userOTPSet(userOTPSetCallParms);
  }
  
  public void userPasswordCreate(wsdl.adminV8.ig.com.entrust.UserPasswordCreateCallParms userPasswordCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordCreate(userPasswordCreateCallParms);
  }
  
  public void userPasswordSet(wsdl.adminV8.ig.com.entrust.UserPasswordSetCallParms userPasswordSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordSet(userPasswordSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserPasswordInfo userPasswordGet(wsdl.adminV8.ig.com.entrust.UserPasswordGetCallParms userPasswordGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPasswordGet(userPasswordGetCallParms);
  }
  
  public void userPasswordDelete(wsdl.adminV8.ig.com.entrust.UserPasswordDeleteCallParms userPasswordDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordDelete(userPasswordDeleteCallParms);
  }
  
  public void userPasswordCreateEx(wsdl.adminV8.ig.com.entrust.UserPasswordCreateExCallParms userPasswordCreateExCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordCreateEx(userPasswordCreateExCallParms);
  }
  
  public void userPasswordSetEx(wsdl.adminV8.ig.com.entrust.UserPasswordSetExCallParms userPasswordSetExCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordSetEx(userPasswordSetExCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserPasswordInfoEx userPasswordGetEx(wsdl.adminV8.ig.com.entrust.UserPasswordGetExCallParms userPasswordGetExCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPasswordGetEx(userPasswordGetExCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserPasswordInfoEx[] userPasswordListEx(wsdl.adminV8.ig.com.entrust.UserPasswordListExCallParms userPasswordListExCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPasswordListEx(userPasswordListExCallParms);
  }
  
  public void userPasswordDeleteEx(wsdl.adminV8.ig.com.entrust.UserPasswordDeleteExCallParms userPasswordDeleteExCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPasswordDeleteEx(userPasswordDeleteExCallParms);
  }
  
  public void userPVNCreate(wsdl.adminV8.ig.com.entrust.UserPVNCreateCallParms userPVNCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPVNCreate(userPVNCreateCallParms);
  }
  
  public void userPVNSet(wsdl.adminV8.ig.com.entrust.UserPVNSetCallParms userPVNSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPVNSet(userPVNSetCallParms);
  }
  
  public void userPVNDelete(wsdl.adminV8.ig.com.entrust.UserPVNDeleteCallParms userPVNDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userPVNDelete(userPVNDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserPVNInfo userPVNGet(wsdl.adminV8.ig.com.entrust.UserPVNGetCallParms userPVNGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userPVNGet(userPVNGetCallParms);
  }
  
  public void userCardCreate(wsdl.adminV8.ig.com.entrust.UserCardCreateCallParms userCardCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userCardCreate(userCardCreateCallParms);
  }
  
  public int userCardDelete(wsdl.adminV8.ig.com.entrust.UserCardDeleteCallParms userCardDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardDelete(userCardDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCardInfo[] userCardGet(wsdl.adminV8.ig.com.entrust.UserCardGetCallParms userCardGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardGet(userCardGetCallParms);
  }
  
  public int userCardSet(wsdl.adminV8.ig.com.entrust.UserCardSetCallParms userCardSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardSet(userCardSetCallParms);
  }
  
  public int userCardUnassign(wsdl.adminV8.ig.com.entrust.UserCardUnassignCallParms userCardUnassignCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardUnassign(userCardUnassignCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCardListResult userCardList(wsdl.adminV8.ig.com.entrust.UserCardListCallParms userCardListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardList(userCardListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CardExportResult userCardExport(wsdl.adminV8.ig.com.entrust.UserCardExportCallParms userCardExportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCardExport(userCardExportCallParms);
  }
  
  public void userTokenAssign(wsdl.adminV8.ig.com.entrust.UserTokenAssignCallParms userTokenAssignCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userTokenAssign(userTokenAssignCallParms);
  }
  
  public java.lang.String userTokenCreate(wsdl.adminV8.ig.com.entrust.UserTokenCreateCallParms userTokenCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenCreate(userTokenCreateCallParms);
  }
  
  public int userTokenDelete(wsdl.adminV8.ig.com.entrust.UserTokenDeleteCallParms userTokenDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenDelete(userTokenDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenInfo[] userTokenGet(wsdl.adminV8.ig.com.entrust.UserTokenGetCallParms userTokenGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenGet(userTokenGetCallParms);
  }
  
  public int userTokenSet(wsdl.adminV8.ig.com.entrust.UserTokenSetCallParms userTokenSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenSet(userTokenSetCallParms);
  }
  
  public int userTokenUnassign(wsdl.adminV8.ig.com.entrust.UserTokenUnassignCallParms userTokenUnassignCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenUnassign(userTokenUnassignCallParms);
  }
  
  public java.lang.String userTokenChallengeGet(wsdl.adminV8.ig.com.entrust.UserTokenChallengeGetCallParms userTokenChallengeGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenChallengeGet(userTokenChallengeGetCallParms);
  }
  
  public java.lang.String userTokenAuthenticate(wsdl.adminV8.ig.com.entrust.UserTokenAuthenticateCallParms userTokenAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenAuthenticate(userTokenAuthenticateCallParms);
  }
  
  public java.lang.String userTokenChallengeAuthenticate(wsdl.adminV8.ig.com.entrust.UserTokenChallengeAuthenticateCallParms userTokenChallengeAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenChallengeAuthenticate(userTokenChallengeAuthenticateCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenUnlockResult userTokenUnlock(wsdl.adminV8.ig.com.entrust.UserTokenUnlockCallParms userTokenUnlockCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenUnlock(userTokenUnlockCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenResponse userTokenResponseGet(wsdl.adminV8.ig.com.entrust.UserTokenResponseGetCallParms userTokenResponseGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenResponseGet(userTokenResponseGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenActivateResult userTokenActivate(wsdl.adminV8.ig.com.entrust.UserTokenActivateCallParms userTokenActivateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenActivate(userTokenActivateCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenActivateCompleteResult userTokenActivateComplete(wsdl.adminV8.ig.com.entrust.UserTokenActivateCompleteCallParms userTokenActivateCompleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenActivateComplete(userTokenActivateCompleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenListResult userTokenList(wsdl.adminV8.ig.com.entrust.UserTokenListCallParms userTokenListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userTokenList(userTokenListCallParms);
  }
  
  public java.lang.String userSmartCredentialCreate(wsdl.adminV8.ig.com.entrust.UserSmartCredentialCreateCallParms userSmartCredentialCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialCreate(userSmartCredentialCreateCallParms);
  }
  
  public void userSmartCredentialDelete(wsdl.adminV8.ig.com.entrust.UserSmartCredentialDeleteCallParms userSmartCredentialDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialDelete(userSmartCredentialDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserSmartCredentialInfo userSmartCredentialGet(wsdl.adminV8.ig.com.entrust.UserSmartCredentialGetCallParms userSmartCredentialGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialGet(userSmartCredentialGetCallParms);
  }
  
  public byte[] userSmartCredentialChallengeGet(wsdl.adminV8.ig.com.entrust.UserSmartCredentialChallengeGetCallParms userSmartCredentialChallengeGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialChallengeGet(userSmartCredentialChallengeGetCallParms);
  }
  
  public byte[] userSmartCredentialChallengeAuthenticate(wsdl.adminV8.ig.com.entrust.UserSmartCredentialChallengeAuthenticateCallParms userSmartCredentialChallengeAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialChallengeAuthenticate(userSmartCredentialChallengeAuthenticateCallParms);
  }
  
  public void userSmartCredentialSet(wsdl.adminV8.ig.com.entrust.UserSmartCredentialSetCallParms userSmartCredentialSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialSet(userSmartCredentialSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserSmartCredentialUnblockResult userSmartCredentialUnblock(wsdl.adminV8.ig.com.entrust.UserSmartCredentialUnblockCallParms userSmartCredentialUnblockCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialUnblock(userSmartCredentialUnblockCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserDigitalIdCreateRecoverResult userSmartCredentialDigitalIdCreateRecover(wsdl.adminV8.ig.com.entrust.UserSmartCredentialDigitalIdCreateRecoverCallParms userSmartCredentialDigitalIdCreateRecoverCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialDigitalIdCreateRecover(userSmartCredentialDigitalIdCreateRecoverCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserTokenInfo userSmartCredentialTokenCreate(wsdl.adminV8.ig.com.entrust.UserSmartCredentialTokenCreateCallParms userSmartCredentialTokenCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialTokenCreate(userSmartCredentialTokenCreateCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSGetResult userSmartCredentialPACSGet(wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSGetCallParms userSmartCredentialPACSGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialPACSGet(userSmartCredentialPACSGetCallParms);
  }
  
  public void userSmartCredentialPACSRegister(wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSRegisterCallParms userSmartCredentialPACSRegisterCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialPACSRegister(userSmartCredentialPACSRegisterCallParms);
  }
  
  public void userSmartCredentialPACSSuspend(wsdl.adminV8.ig.com.entrust.UserSmartCredentialPACSSuspendCallParms userSmartCredentialPACSSuspendCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialPACSSuspend(userSmartCredentialPACSSuspendCallParms);
  }
  
  public void userSmartCredentialUnassign(wsdl.adminV8.ig.com.entrust.UserSmartCredentialUnassignCallParms userSmartCredentialUnassignCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialUnassign(userSmartCredentialUnassignCallParms);
  }
  
  public void userSmartCredentialIssue(wsdl.adminV8.ig.com.entrust.UserSmartCredentialIssueCallParms userSmartCredentialIssueCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialIssue(userSmartCredentialIssueCallParms);
  }
  
  public void userSmartCredentialDeliver(wsdl.adminV8.ig.com.entrust.UserSmartCredentialDeliverCallParms userSmartCredentialDeliverCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userSmartCredentialDeliver(userSmartCredentialDeliverCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserSmartCredentialListResult userSmartCredentialList(wsdl.adminV8.ig.com.entrust.UserSmartCredentialListCallParms userSmartCredentialListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userSmartCredentialList(userSmartCredentialListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserDigitalIdCreateRecoverPolicyGetResult userDigitalIdCreateRecoverPolicyGet(wsdl.adminV8.ig.com.entrust.UserDigitalIdCreateRecoverPolicyGetCallParms userDigitalIdCreateRecoverPolicyGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdCreateRecoverPolicyGet(userDigitalIdCreateRecoverPolicyGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserDigitalIdCreateRecoverResult userDigitalIdCreateRecover(wsdl.adminV8.ig.com.entrust.UserDigitalIdCreateRecoverCallParms userDigitalIdCreateRecoverCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdCreateRecover(userDigitalIdCreateRecoverCallParms);
  }
  
  public void userDigitalIdDelete(wsdl.adminV8.ig.com.entrust.UserDigitalIdDeleteCallParms userDigitalIdDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userDigitalIdDelete(userDigitalIdDeleteCallParms);
  }
  
  public void userDigitalIdSet(wsdl.adminV8.ig.com.entrust.UserDigitalIdSetCallParms userDigitalIdSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userDigitalIdSet(userDigitalIdSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserDigitalIdInfo userDigitalIdGet(wsdl.adminV8.ig.com.entrust.UserDigitalIdGetCallParms userDigitalIdGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdGet(userDigitalIdGetCallParms);
  }
  
  public int userDigitalIdCancel(wsdl.adminV8.ig.com.entrust.UserDigitalIdCancelCallParms userDigitalIdCancelCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdCancel(userDigitalIdCancelCallParms);
  }
  
  public int userDigitalIdHold(wsdl.adminV8.ig.com.entrust.UserDigitalIdHoldCallParms userDigitalIdHoldCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdHold(userDigitalIdHoldCallParms);
  }
  
  public int userDigitalIdUnhold(wsdl.adminV8.ig.com.entrust.UserDigitalIdUnholdCallParms userDigitalIdUnholdCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdUnhold(userDigitalIdUnholdCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserDigitalIdListResult userDigitalIdList(wsdl.adminV8.ig.com.entrust.UserDigitalIdListCallParms userDigitalIdListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userDigitalIdList(userDigitalIdListCallParms);
  }
  
  public void userCertificateAssign(wsdl.adminV8.ig.com.entrust.UserCertificateAssignCallParms userCertificateAssignCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userCertificateAssign(userCertificateAssignCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCertificateAssignVerifyResult userCertificateAssignVerify(wsdl.adminV8.ig.com.entrust.UserCertificateAssignVerifyCallParms userCertificateAssignVerifyCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateAssignVerify(userCertificateAssignVerifyCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCertificateExportResult userCertificateExport(wsdl.adminV8.ig.com.entrust.UserCertificateExportCallParms userCertificateExportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateExport(userCertificateExportCallParms);
  }
  
  public int userCertificateDelete(wsdl.adminV8.ig.com.entrust.UserCertificateDeleteCallParms userCertificateDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateDelete(userCertificateDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCertificateInfo[] userCertificateGet(wsdl.adminV8.ig.com.entrust.UserCertificateGetCallParms userCertificateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateGet(userCertificateGetCallParms);
  }
  
  public int userCertificateSet(wsdl.adminV8.ig.com.entrust.UserCertificateSetCallParms userCertificateSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateSet(userCertificateSetCallParms);
  }
  
  public commonV8.ig.com.entrust.CertificateChallenge userCertificateChallenge(wsdl.adminV8.ig.com.entrust.UserCertificateChallengeCallParms userCertificateChallengeCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateChallenge(userCertificateChallengeCallParms);
  }
  
  public void userCertificateAuthenticate(wsdl.adminV8.ig.com.entrust.UserCertificateAuthenticateCallParms userCertificateAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userCertificateAuthenticate(userCertificateAuthenticateCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserCertificateListResult userCertificateList(wsdl.adminV8.ig.com.entrust.UserCertificateListCallParms userCertificateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userCertificateList(userCertificateListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PreproducedCardCreateResult preproducedCardCreate(wsdl.adminV8.ig.com.entrust.PreproducedCardCreateCallParms preproducedCardCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.preproducedCardCreate(preproducedCardCreateCallParms);
  }
  
  public void preproducedCardDelete(wsdl.adminV8.ig.com.entrust.PreproducedCardDeleteCallParms preproducedCardDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.preproducedCardDelete(preproducedCardDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PreproducedCardInfo preproducedCardGet(wsdl.adminV8.ig.com.entrust.PreproducedCardGetCallParms preproducedCardGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.preproducedCardGet(preproducedCardGetCallParms);
  }
  
  public void preproducedCardSet(wsdl.adminV8.ig.com.entrust.PreproducedCardSetCallParms preproducedCardSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.preproducedCardSet(preproducedCardSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PreproducedCardListResult preproducedCardList(wsdl.adminV8.ig.com.entrust.PreproducedCardListCallParms preproducedCardListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.preproducedCardList(preproducedCardListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CardExportResult preproducedCardExport(wsdl.adminV8.ig.com.entrust.PreproducedCardExportCallParms preproducedCardExportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.preproducedCardExport(preproducedCardExportCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenLoadResult tokenLoad(wsdl.adminV8.ig.com.entrust.TokenLoadCallParms tokenLoadCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenLoad(tokenLoadCallParms);
  }
  
  public void tokenDelete(wsdl.adminV8.ig.com.entrust.TokenDeleteCallParms tokenDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.tokenDelete(tokenDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenInfo tokenGet(wsdl.adminV8.ig.com.entrust.TokenGetCallParms tokenGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenGet(tokenGetCallParms);
  }
  
  public void tokenSet(wsdl.adminV8.ig.com.entrust.TokenSetCallParms tokenSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.tokenSet(tokenSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TokenListResult tokenList(wsdl.adminV8.ig.com.entrust.TokenListCallParms tokenListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.tokenList(tokenListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialLoadResult smartCredentialLoad(wsdl.adminV8.ig.com.entrust.SmartCredentialLoadCallParms smartCredentialLoadCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialLoad(smartCredentialLoadCallParms);
  }
  
  public void smartCredentialDelete(wsdl.adminV8.ig.com.entrust.SmartCredentialDeleteCallParms smartCredentialDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialDelete(smartCredentialDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialInfo smartCredentialGet(wsdl.adminV8.ig.com.entrust.SmartCredentialGetCallParms smartCredentialGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialGet(smartCredentialGetCallParms);
  }
  
  public byte[] smartCredentialChallengeGet(wsdl.adminV8.ig.com.entrust.SmartCredentialChallengeGetCallParms smartCredentialChallengeGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialChallengeGet(smartCredentialChallengeGetCallParms);
  }
  
  public byte[] smartCredentialChallengeAuthenticate(wsdl.adminV8.ig.com.entrust.SmartCredentialChallengeAuthenticateCallParms smartCredentialChallengeAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialChallengeAuthenticate(smartCredentialChallengeAuthenticateCallParms);
  }
  
  public void smartCredentialSet(wsdl.adminV8.ig.com.entrust.SmartCredentialSetCallParms smartCredentialSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.smartCredentialSet(smartCredentialSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.SmartCredentialListResult smartCredentialList(wsdl.adminV8.ig.com.entrust.SmartCredentialListCallParms smartCredentialListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.smartCredentialList(smartCredentialListCallParms);
  }
  
  public commonV8.ig.com.entrust.Challenge[] challengeGet(wsdl.adminV8.ig.com.entrust.ChallengeGetCallParms challengeGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.challengeGet(challengeGetCallParms);
  }
  
  public void challengeAuthenticate(wsdl.adminV8.ig.com.entrust.ChallengeAuthenticateCallParms challengeAuthenticateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.challengeAuthenticate(challengeAuthenticateCallParms);
  }
  
  public void ipListAdd(wsdl.adminV8.ig.com.entrust.IPListAddCallParms ipListAddCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.ipListAdd(ipListAddCallParms);
  }
  
  public void ipListDelete(wsdl.adminV8.ig.com.entrust.IPListDeleteCallParms ipListDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.ipListDelete(ipListDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.IPListEntry ipListGet(wsdl.adminV8.ig.com.entrust.IPListGetCallParms ipListGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.ipListGet(ipListGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.IPListListResult ipListList(wsdl.adminV8.ig.com.entrust.IPListListCallParms ipListListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.ipListList(ipListListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.AuditInfo auditGet(wsdl.adminV8.ig.com.entrust.AuditGetCallParms auditGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.auditGet(auditGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.AuditListResult auditList(wsdl.adminV8.ig.com.entrust.AuditListCallParms auditListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.auditList(auditListCallParms);
  }
  
  public void auditCreate(wsdl.adminV8.ig.com.entrust.AuditCreateCallParms auditCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.auditCreate(auditCreateCallParms);
  }
  
  public long auditDelete(wsdl.adminV8.ig.com.entrust.AuditDeleteCallParms auditDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.auditDelete(auditDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TransactionCertificateInfo transactionCertificateGet(wsdl.adminV8.ig.com.entrust.TransactionCertificateGetCallParms transactionCertificateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.transactionCertificateGet(transactionCertificateGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TransactionCertificateListResult transactionCertificateList(commonV8.ig.com.entrust.NameValue[] transactionCertificateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.transactionCertificateList(transactionCertificateListCallParms);
  }
  
  public void transactionCertificateCreate(wsdl.adminV8.ig.com.entrust.TransactionCertificateCreateCallParms transactionCertificateCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.transactionCertificateCreate(transactionCertificateCreateCallParms);
  }
  
  public void transactionCertificateSet(wsdl.adminV8.ig.com.entrust.TransactionCertificateSetCallParms transactionCertificateSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.transactionCertificateSet(transactionCertificateSetCallParms);
  }
  
  public void transactionCertificateDelete(wsdl.adminV8.ig.com.entrust.TransactionCertificateDeleteCallParms transactionCertificateDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.transactionCertificateDelete(transactionCertificateDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TransactionCertificateExportResult transactionCertificateExport(wsdl.adminV8.ig.com.entrust.TransactionCertificateExportCallParms transactionCertificateExportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.transactionCertificateExport(transactionCertificateExportCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.TransactionCertificateImportVerifyResult transactionCertificateImportVerify(wsdl.adminV8.ig.com.entrust.TransactionCertificateImportVerifyCallParms transactionCertificateImportVerifyCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.transactionCertificateImportVerify(transactionCertificateImportVerifyCallParms);
  }
  
  public void transactionCertificateImport(wsdl.adminV8.ig.com.entrust.TransactionCertificateImportCallParms transactionCertificateImportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.transactionCertificateImport(transactionCertificateImportCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CACertificateInfo caCertificateGet(wsdl.adminV8.ig.com.entrust.CACertificateGetCallParms caCertificateGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.caCertificateGet(caCertificateGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CACertificateListResult caCertificateList(commonV8.ig.com.entrust.NameValue[] caCertificateListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.caCertificateList(caCertificateListCallParms);
  }
  
  public void caCertificateLoad(wsdl.adminV8.ig.com.entrust.CACertificateLoadCallParms caCertificateLoadCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.caCertificateLoad(caCertificateLoadCallParms);
  }
  
  public void caCertificateSet(wsdl.adminV8.ig.com.entrust.CACertificateSetCallParms caCertificateSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.caCertificateSet(caCertificateSetCallParms);
  }
  
  public void caCertificateDelete(wsdl.adminV8.ig.com.entrust.CACertificateDeleteCallParms caCertificateDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.caCertificateDelete(caCertificateDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CACertificateExportResult caCertificateExport(wsdl.adminV8.ig.com.entrust.CACertificateExportCallParms caCertificateExportCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.caCertificateExport(caCertificateExportCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.CACertificateLoadVerifyResult caCertificateLoadVerify(wsdl.adminV8.ig.com.entrust.CACertificateLoadVerifyCallParms caCertificateLoadVerifyCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.caCertificateLoadVerify(caCertificateLoadVerifyCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ReportDefinitionInfo reportDefinitionGet(wsdl.adminV8.ig.com.entrust.ReportDefinitionGetCallParms reportDefinitionGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.reportDefinitionGet(reportDefinitionGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ReportDefinitionListResult reportDefinitionList(commonV8.ig.com.entrust.NameValue[] reportDefinitionListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.reportDefinitionList(reportDefinitionListCallParms);
  }
  
  public java.lang.String reportCreate(wsdl.adminV8.ig.com.entrust.ReportCreateCallParms reportCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.reportCreate(reportCreateCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ReportInfo reportGet(wsdl.adminV8.ig.com.entrust.ReportGetCallParms reportGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.reportGet(reportGetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ReportListResult reportList(wsdl.adminV8.ig.com.entrust.ReportListCallParms reportListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.reportList(reportListCallParms);
  }
  
  public void reportDelete(wsdl.adminV8.ig.com.entrust.ReportDeleteCallParms reportDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.reportDelete(reportDeleteCallParms);
  }
  
  public void userFederationCreate(wsdl.adminV8.ig.com.entrust.UserFederationCreateCallParms userFederationCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userFederationCreate(userFederationCreateCallParms);
  }
  
  public int userFederationDelete(wsdl.adminV8.ig.com.entrust.UserFederationDeleteCallParms userFederationDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userFederationDelete(userFederationDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserFederationInfo[] userFederationGet(wsdl.adminV8.ig.com.entrust.UserFederationGetCallParms userFederationGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userFederationGet(userFederationGetCallParms);
  }
  
  public void userFederationSet(wsdl.adminV8.ig.com.entrust.UserFederationSetCallParms userFederationSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.userFederationSet(userFederationSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.UserFederationListResult userFederationList(wsdl.adminV8.ig.com.entrust.UserFederationListCallParms userFederationListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.userFederationList(userFederationListCallParms);
  }
  
  public void managedCaCreate(wsdl.adminV8.ig.com.entrust.ManagedCaCreateCallParms managedCaCreateCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.managedCaCreate(managedCaCreateCallParms);
  }
  
  public void managedCaDelete(wsdl.adminV8.ig.com.entrust.ManagedCaDeleteCallParms managedCaDeleteCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.managedCaDelete(managedCaDeleteCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ManagedCaInfo managedCaGet(wsdl.adminV8.ig.com.entrust.ManagedCaGetCallParms managedCaGetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaGet(managedCaGetCallParms);
  }
  
  public void managedCaSet(wsdl.adminV8.ig.com.entrust.ManagedCaSetCallParms managedCaSetCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.managedCaSet(managedCaSetCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ManagedCaInfoList managedCaList(commonV8.ig.com.entrust.NameValue[] managedCaListCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaList(managedCaListCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.PivSignContentResult managedCaPivSignContent(wsdl.adminV8.ig.com.entrust.PivSignContentCallParms pivSignContentCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaPivSignContent(pivSignContentCallParms);
  }
  
  public boolean isMicrosoftCaSupportAvailable(commonV8.ig.com.entrust.NameValue[] microsoftCaSupportAvailableCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.isMicrosoftCaSupportAvailable(microsoftCaSupportAvailableCallParms);
  }
  
  public wsdl.adminV8.ig.com.entrust.ManagedCaIsCertRevokedResult managedCaIsCertRevoked(wsdl.adminV8.ig.com.entrust.ManagedCaIsCertRevokedCallParms managedCaIsCertRevokedCallParms) throws java.rmi.RemoteException, wsdl.adminV8.ig.com.entrust.AdminServiceFault{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.managedCaIsCertRevoked(managedCaIsCertRevokedCallParms);
  }
  
  
}