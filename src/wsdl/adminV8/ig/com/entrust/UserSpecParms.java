/**
 * UserSpecParms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsdl.adminV8.ig.com.entrust;

public class UserSpecParms  implements java.io.Serializable {
    private java.lang.Integer maxAliases;

    private java.lang.Integer maxContactInfoNumber;

    private java.lang.String lockoutMode;

    private java.lang.Integer maxFailures;

    private java.lang.Integer maxGlobalFailures;

    private java.lang.Integer maxCertificateFailures;

    private java.lang.Integer maxExternalFailures;

    private java.lang.Integer maxGridFailures;

    private java.lang.Integer maxTokenCRFailures;

    private java.lang.Integer maxTokenROFailures;

    private java.lang.Integer maxOTPFailures;

    private java.lang.Integer maxPasswordFailures;

    private java.lang.Integer maxQAFailures;

    private java.lang.Integer maxRBAIPAuthFailures;

    private java.lang.Integer maxRBAMachineAuthFailures;

    private java.lang.Integer maxRBACertificateAuthFailures;

    private java.lang.Integer lockoutTime;

    private java.lang.Integer maxSecretSize;

    private java.lang.Integer maxSecretNumber;

    private java.lang.String[] genericAuthType;

    private java.lang.String[] enhancedGenericAuthType;

    private java.lang.String[] machineAuthType;

    private java.lang.String[] authTypeCanViewSecrets;

    private java.lang.String[] authTypeCanModifySecrets;

    private java.lang.Integer maxMachineSecrets;

    private java.lang.Integer maxMachineSecretsSize;

    private java.lang.Boolean machineSecretRequiresMachineNonce;

    private java.lang.Boolean machineSecretRequiresSequenceNonce;

    private java.lang.Integer machineSecretRequiresAppData;

    private java.lang.Integer machineSecretAllowsBadAppData;

    private java.lang.Integer machineSecretLifetime;

    private java.lang.Boolean failedMachineAuthIncrementsLockout;

    private java.lang.Integer maxAuthSecrets;

    private java.lang.Integer maxAuthSecretsSize;

    private java.lang.Integer maxQuestions;

    private java.lang.Integer maxQASize;

    private java.lang.Integer QAChallengeSize;

    private java.lang.Integer minQAChallengeSize;

    private java.lang.Integer maxQAChallengeSize;

    private java.lang.Boolean disableQAChallengeRetention;

    private java.lang.Integer QAChallengeLifetime;

    private java.lang.Boolean updateLockoutForReplacedQAChallenge;

    private java.lang.Integer qaDefaultWrongAnswersAllowed;

    private java.lang.Integer qaMaximumWrongAnswersAllowed;

    private java.lang.Boolean qaInexactMatchAllowed;

    private java.lang.String[] OTPCellAlphabet;

    private wsdl.adminV8.ig.com.entrust.CellReplacement[] OTPCellReplacements;

    private java.lang.Integer OTPLifetime;

    private java.lang.Integer OTPLength;

    private java.lang.Boolean OTPDeliveryEnabled;

    private java.lang.Boolean OTPAlwaysGenerate;

    private java.lang.Boolean OTPDynamicRefresh;

    private java.lang.Integer OTPNumberOutstanding;

    private java.lang.Integer OTPRefreshThreshold;

    private java.lang.Boolean returnAuthSecretWithChall;

    private java.lang.Boolean autoUnassignTokens;

    private java.lang.Boolean autoMoveTokens;

    private java.lang.Boolean disableTokenChallengeRetention;

    private java.lang.Integer tokenChallengeLifetime;

    private java.lang.Boolean updateLockoutForReplacedTokenChallenge;

    private java.lang.Integer maxAllowedTokenSets;

    private java.lang.Boolean allowNONEAuthentication;

    private java.lang.Boolean considerTempPINLast;

    private java.lang.Boolean storeLastAuthInfo;

    private java.lang.Boolean allowCreateIfDisabledInRepository;

    private java.lang.Boolean allowCreateIfExpiredInRepository;

    private java.lang.Boolean allowAuthIfDisabledInRepository;

    private java.lang.Boolean allowAuthIfExpiredInRepository;

    private java.lang.String transactionSignatureType;

    private java.lang.Integer transactionLifetime;

    private java.lang.Integer maxNumTransactionDetails;

    private java.lang.Boolean allowSelfSignedUserCert;

    private java.lang.Boolean allowCertNotIssuedByRegisteredCA;

    private java.lang.Boolean allowAllRegisteredCAs;

    private java.lang.Boolean addAllowedRegisteredCAs;

    private java.lang.Boolean removeAllowedRegisteredCAs;

    private java.lang.String[] allowedRegisteredCAs;

    private java.lang.String certificateAuthenticationHashAlg;

    private java.lang.Integer certificateAuthenticationChallengeSize;

    private java.lang.Integer maxCertsPerUser;

    private java.lang.Boolean autoDeleteUserCerts;

    private java.lang.Boolean disableCertificateChallengeRetention;

    private java.lang.Integer certificateChallengeLifetime;

    private java.lang.Boolean updateLockoutForReplacedCertificateChallenge;

    private java.lang.Boolean allowAllSmartCredentialDefinitions;

    private java.lang.Boolean addAllowedSmartCredentialDefinitions;

    private java.lang.Boolean removeAllowedSmartCredentialDefinitions;

    private java.lang.String[] allowedSmartCredentialDefinitions;

    private java.lang.Integer maxSmartCredentialsPerUser;

    private java.lang.String smartCredentialIDPrefix;

    private java.lang.String smartCredentialTokenVendor;

    private java.lang.Boolean autoUnassignSmartCredentials;

    private java.lang.Boolean autoMoveSmartCredentials;

    private java.lang.Boolean autoRegisterSmartCredentialsToPACS;

    private java.lang.Boolean autoSuspendSmartCredentialsFromPACS;

    private java.lang.Boolean allowSoftwareSmartCredentials;

    private java.lang.Boolean allowAllDigitalIdConfigs;

    private java.lang.Boolean addAllowedDigitalIdConfigs;

    private java.lang.Boolean removeAllowedDigitalIdConfigs;

    private java.lang.String[] allowedDigitalIdConfigs;

    private java.lang.Integer maxDigitalIdsPerUser;

    private java.lang.Integer maxClientTypesPerDigitalId;

    private java.lang.Boolean autoCancelDigitalIds;

    private java.lang.Integer userRegistrationPasswordLifetime;

    private java.lang.Integer maxFederationsPerUser;

    private java.lang.Integer maxNumUserPreferences;

    private java.lang.Integer maxSizeUserPreference;

    private java.lang.Integer PVNLength;

    private java.lang.Boolean PVNChangeRequiredOnAdminReset;

    private java.lang.String[] authTypesRequiringPVN;

    private java.lang.Integer numDaysForActivation;

    private java.lang.String[] activationAuthTypes;

    private java.lang.Boolean checkIPAddressInLocationHistory;

    private java.lang.Integer maxLocationHistorySize;

    private java.lang.Integer locationHistoryLifetime;

    private java.lang.Integer maxVelocity;

    private java.lang.Boolean checkVelocity;

    private java.lang.String[] countryBlacklist;

    private java.lang.Boolean addCountryBlacklist;

    private java.lang.Boolean removeCountryBlacklist;

    private wsdl.adminV8.ig.com.entrust.ExpectedLocation[] expectedLocations;

    private java.lang.Boolean addExpectedLocations;

    private java.lang.Boolean removeExpectedLocations;

    private java.lang.Integer maxUserExpectedLocationsSize;

    private java.lang.Boolean normalRejectAdd;

    private java.lang.Boolean normalRejectRemove;

    private wsdl.adminV8.ig.com.entrust.RBAExpressionList normalReject;

    private java.lang.Boolean normalAuthenticatedAdd;

    private java.lang.Boolean normalAuthenticatedRemove;

    private wsdl.adminV8.ig.com.entrust.RBAExpressionList normalAuthenticated;

    private java.lang.Boolean enhancedRejectAdd;

    private java.lang.Boolean enhancedRejectRemove;

    private wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedReject;

    private java.lang.Boolean enhancedAuthenticatedAdd;

    private java.lang.Boolean enhancedAuthenticatedRemove;

    private wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedAuthenticated;

    private java.lang.Integer externalRiskScorePass;

    private java.lang.Integer externalRiskScoreFail;

    private java.lang.Boolean performTransactionDelivery;

    private java.lang.Boolean softTokenPINRequired;

    private java.lang.Integer softTokenOTPLength;

    private java.lang.String comment;

    public UserSpecParms() {
    }

    public UserSpecParms(
           java.lang.Integer maxAliases,
           java.lang.Integer maxContactInfoNumber,
           java.lang.String lockoutMode,
           java.lang.Integer maxFailures,
           java.lang.Integer maxGlobalFailures,
           java.lang.Integer maxCertificateFailures,
           java.lang.Integer maxExternalFailures,
           java.lang.Integer maxGridFailures,
           java.lang.Integer maxTokenCRFailures,
           java.lang.Integer maxTokenROFailures,
           java.lang.Integer maxOTPFailures,
           java.lang.Integer maxPasswordFailures,
           java.lang.Integer maxQAFailures,
           java.lang.Integer maxRBAIPAuthFailures,
           java.lang.Integer maxRBAMachineAuthFailures,
           java.lang.Integer maxRBACertificateAuthFailures,
           java.lang.Integer lockoutTime,
           java.lang.Integer maxSecretSize,
           java.lang.Integer maxSecretNumber,
           java.lang.String[] genericAuthType,
           java.lang.String[] enhancedGenericAuthType,
           java.lang.String[] machineAuthType,
           java.lang.String[] authTypeCanViewSecrets,
           java.lang.String[] authTypeCanModifySecrets,
           java.lang.Integer maxMachineSecrets,
           java.lang.Integer maxMachineSecretsSize,
           java.lang.Boolean machineSecretRequiresMachineNonce,
           java.lang.Boolean machineSecretRequiresSequenceNonce,
           java.lang.Integer machineSecretRequiresAppData,
           java.lang.Integer machineSecretAllowsBadAppData,
           java.lang.Integer machineSecretLifetime,
           java.lang.Boolean failedMachineAuthIncrementsLockout,
           java.lang.Integer maxAuthSecrets,
           java.lang.Integer maxAuthSecretsSize,
           java.lang.Integer maxQuestions,
           java.lang.Integer maxQASize,
           java.lang.Integer QAChallengeSize,
           java.lang.Integer minQAChallengeSize,
           java.lang.Integer maxQAChallengeSize,
           java.lang.Boolean disableQAChallengeRetention,
           java.lang.Integer QAChallengeLifetime,
           java.lang.Boolean updateLockoutForReplacedQAChallenge,
           java.lang.Integer qaDefaultWrongAnswersAllowed,
           java.lang.Integer qaMaximumWrongAnswersAllowed,
           java.lang.Boolean qaInexactMatchAllowed,
           java.lang.String[] OTPCellAlphabet,
           wsdl.adminV8.ig.com.entrust.CellReplacement[] OTPCellReplacements,
           java.lang.Integer OTPLifetime,
           java.lang.Integer OTPLength,
           java.lang.Boolean OTPDeliveryEnabled,
           java.lang.Boolean OTPAlwaysGenerate,
           java.lang.Boolean OTPDynamicRefresh,
           java.lang.Integer OTPNumberOutstanding,
           java.lang.Integer OTPRefreshThreshold,
           java.lang.Boolean returnAuthSecretWithChall,
           java.lang.Boolean autoUnassignTokens,
           java.lang.Boolean autoMoveTokens,
           java.lang.Boolean disableTokenChallengeRetention,
           java.lang.Integer tokenChallengeLifetime,
           java.lang.Boolean updateLockoutForReplacedTokenChallenge,
           java.lang.Integer maxAllowedTokenSets,
           java.lang.Boolean allowNONEAuthentication,
           java.lang.Boolean considerTempPINLast,
           java.lang.Boolean storeLastAuthInfo,
           java.lang.Boolean allowCreateIfDisabledInRepository,
           java.lang.Boolean allowCreateIfExpiredInRepository,
           java.lang.Boolean allowAuthIfDisabledInRepository,
           java.lang.Boolean allowAuthIfExpiredInRepository,
           java.lang.String transactionSignatureType,
           java.lang.Integer transactionLifetime,
           java.lang.Integer maxNumTransactionDetails,
           java.lang.Boolean allowSelfSignedUserCert,
           java.lang.Boolean allowCertNotIssuedByRegisteredCA,
           java.lang.Boolean allowAllRegisteredCAs,
           java.lang.Boolean addAllowedRegisteredCAs,
           java.lang.Boolean removeAllowedRegisteredCAs,
           java.lang.String[] allowedRegisteredCAs,
           java.lang.String certificateAuthenticationHashAlg,
           java.lang.Integer certificateAuthenticationChallengeSize,
           java.lang.Integer maxCertsPerUser,
           java.lang.Boolean autoDeleteUserCerts,
           java.lang.Boolean disableCertificateChallengeRetention,
           java.lang.Integer certificateChallengeLifetime,
           java.lang.Boolean updateLockoutForReplacedCertificateChallenge,
           java.lang.Boolean allowAllSmartCredentialDefinitions,
           java.lang.Boolean addAllowedSmartCredentialDefinitions,
           java.lang.Boolean removeAllowedSmartCredentialDefinitions,
           java.lang.String[] allowedSmartCredentialDefinitions,
           java.lang.Integer maxSmartCredentialsPerUser,
           java.lang.String smartCredentialIDPrefix,
           java.lang.String smartCredentialTokenVendor,
           java.lang.Boolean autoUnassignSmartCredentials,
           java.lang.Boolean autoMoveSmartCredentials,
           java.lang.Boolean autoRegisterSmartCredentialsToPACS,
           java.lang.Boolean autoSuspendSmartCredentialsFromPACS,
           java.lang.Boolean allowSoftwareSmartCredentials,
           java.lang.Boolean allowAllDigitalIdConfigs,
           java.lang.Boolean addAllowedDigitalIdConfigs,
           java.lang.Boolean removeAllowedDigitalIdConfigs,
           java.lang.String[] allowedDigitalIdConfigs,
           java.lang.Integer maxDigitalIdsPerUser,
           java.lang.Integer maxClientTypesPerDigitalId,
           java.lang.Boolean autoCancelDigitalIds,
           java.lang.Integer userRegistrationPasswordLifetime,
           java.lang.Integer maxFederationsPerUser,
           java.lang.Integer maxNumUserPreferences,
           java.lang.Integer maxSizeUserPreference,
           java.lang.Integer PVNLength,
           java.lang.Boolean PVNChangeRequiredOnAdminReset,
           java.lang.String[] authTypesRequiringPVN,
           java.lang.Integer numDaysForActivation,
           java.lang.String[] activationAuthTypes,
           java.lang.Boolean checkIPAddressInLocationHistory,
           java.lang.Integer maxLocationHistorySize,
           java.lang.Integer locationHistoryLifetime,
           java.lang.Integer maxVelocity,
           java.lang.Boolean checkVelocity,
           java.lang.String[] countryBlacklist,
           java.lang.Boolean addCountryBlacklist,
           java.lang.Boolean removeCountryBlacklist,
           wsdl.adminV8.ig.com.entrust.ExpectedLocation[] expectedLocations,
           java.lang.Boolean addExpectedLocations,
           java.lang.Boolean removeExpectedLocations,
           java.lang.Integer maxUserExpectedLocationsSize,
           java.lang.Boolean normalRejectAdd,
           java.lang.Boolean normalRejectRemove,
           wsdl.adminV8.ig.com.entrust.RBAExpressionList normalReject,
           java.lang.Boolean normalAuthenticatedAdd,
           java.lang.Boolean normalAuthenticatedRemove,
           wsdl.adminV8.ig.com.entrust.RBAExpressionList normalAuthenticated,
           java.lang.Boolean enhancedRejectAdd,
           java.lang.Boolean enhancedRejectRemove,
           wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedReject,
           java.lang.Boolean enhancedAuthenticatedAdd,
           java.lang.Boolean enhancedAuthenticatedRemove,
           wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedAuthenticated,
           java.lang.Integer externalRiskScorePass,
           java.lang.Integer externalRiskScoreFail,
           java.lang.Boolean performTransactionDelivery,
           java.lang.Boolean softTokenPINRequired,
           java.lang.Integer softTokenOTPLength,
           java.lang.String comment) {
           this.maxAliases = maxAliases;
           this.maxContactInfoNumber = maxContactInfoNumber;
           this.lockoutMode = lockoutMode;
           this.maxFailures = maxFailures;
           this.maxGlobalFailures = maxGlobalFailures;
           this.maxCertificateFailures = maxCertificateFailures;
           this.maxExternalFailures = maxExternalFailures;
           this.maxGridFailures = maxGridFailures;
           this.maxTokenCRFailures = maxTokenCRFailures;
           this.maxTokenROFailures = maxTokenROFailures;
           this.maxOTPFailures = maxOTPFailures;
           this.maxPasswordFailures = maxPasswordFailures;
           this.maxQAFailures = maxQAFailures;
           this.maxRBAIPAuthFailures = maxRBAIPAuthFailures;
           this.maxRBAMachineAuthFailures = maxRBAMachineAuthFailures;
           this.maxRBACertificateAuthFailures = maxRBACertificateAuthFailures;
           this.lockoutTime = lockoutTime;
           this.maxSecretSize = maxSecretSize;
           this.maxSecretNumber = maxSecretNumber;
           this.genericAuthType = genericAuthType;
           this.enhancedGenericAuthType = enhancedGenericAuthType;
           this.machineAuthType = machineAuthType;
           this.authTypeCanViewSecrets = authTypeCanViewSecrets;
           this.authTypeCanModifySecrets = authTypeCanModifySecrets;
           this.maxMachineSecrets = maxMachineSecrets;
           this.maxMachineSecretsSize = maxMachineSecretsSize;
           this.machineSecretRequiresMachineNonce = machineSecretRequiresMachineNonce;
           this.machineSecretRequiresSequenceNonce = machineSecretRequiresSequenceNonce;
           this.machineSecretRequiresAppData = machineSecretRequiresAppData;
           this.machineSecretAllowsBadAppData = machineSecretAllowsBadAppData;
           this.machineSecretLifetime = machineSecretLifetime;
           this.failedMachineAuthIncrementsLockout = failedMachineAuthIncrementsLockout;
           this.maxAuthSecrets = maxAuthSecrets;
           this.maxAuthSecretsSize = maxAuthSecretsSize;
           this.maxQuestions = maxQuestions;
           this.maxQASize = maxQASize;
           this.QAChallengeSize = QAChallengeSize;
           this.minQAChallengeSize = minQAChallengeSize;
           this.maxQAChallengeSize = maxQAChallengeSize;
           this.disableQAChallengeRetention = disableQAChallengeRetention;
           this.QAChallengeLifetime = QAChallengeLifetime;
           this.updateLockoutForReplacedQAChallenge = updateLockoutForReplacedQAChallenge;
           this.qaDefaultWrongAnswersAllowed = qaDefaultWrongAnswersAllowed;
           this.qaMaximumWrongAnswersAllowed = qaMaximumWrongAnswersAllowed;
           this.qaInexactMatchAllowed = qaInexactMatchAllowed;
           this.OTPCellAlphabet = OTPCellAlphabet;
           this.OTPCellReplacements = OTPCellReplacements;
           this.OTPLifetime = OTPLifetime;
           this.OTPLength = OTPLength;
           this.OTPDeliveryEnabled = OTPDeliveryEnabled;
           this.OTPAlwaysGenerate = OTPAlwaysGenerate;
           this.OTPDynamicRefresh = OTPDynamicRefresh;
           this.OTPNumberOutstanding = OTPNumberOutstanding;
           this.OTPRefreshThreshold = OTPRefreshThreshold;
           this.returnAuthSecretWithChall = returnAuthSecretWithChall;
           this.autoUnassignTokens = autoUnassignTokens;
           this.autoMoveTokens = autoMoveTokens;
           this.disableTokenChallengeRetention = disableTokenChallengeRetention;
           this.tokenChallengeLifetime = tokenChallengeLifetime;
           this.updateLockoutForReplacedTokenChallenge = updateLockoutForReplacedTokenChallenge;
           this.maxAllowedTokenSets = maxAllowedTokenSets;
           this.allowNONEAuthentication = allowNONEAuthentication;
           this.considerTempPINLast = considerTempPINLast;
           this.storeLastAuthInfo = storeLastAuthInfo;
           this.allowCreateIfDisabledInRepository = allowCreateIfDisabledInRepository;
           this.allowCreateIfExpiredInRepository = allowCreateIfExpiredInRepository;
           this.allowAuthIfDisabledInRepository = allowAuthIfDisabledInRepository;
           this.allowAuthIfExpiredInRepository = allowAuthIfExpiredInRepository;
           this.transactionSignatureType = transactionSignatureType;
           this.transactionLifetime = transactionLifetime;
           this.maxNumTransactionDetails = maxNumTransactionDetails;
           this.allowSelfSignedUserCert = allowSelfSignedUserCert;
           this.allowCertNotIssuedByRegisteredCA = allowCertNotIssuedByRegisteredCA;
           this.allowAllRegisteredCAs = allowAllRegisteredCAs;
           this.addAllowedRegisteredCAs = addAllowedRegisteredCAs;
           this.removeAllowedRegisteredCAs = removeAllowedRegisteredCAs;
           this.allowedRegisteredCAs = allowedRegisteredCAs;
           this.certificateAuthenticationHashAlg = certificateAuthenticationHashAlg;
           this.certificateAuthenticationChallengeSize = certificateAuthenticationChallengeSize;
           this.maxCertsPerUser = maxCertsPerUser;
           this.autoDeleteUserCerts = autoDeleteUserCerts;
           this.disableCertificateChallengeRetention = disableCertificateChallengeRetention;
           this.certificateChallengeLifetime = certificateChallengeLifetime;
           this.updateLockoutForReplacedCertificateChallenge = updateLockoutForReplacedCertificateChallenge;
           this.allowAllSmartCredentialDefinitions = allowAllSmartCredentialDefinitions;
           this.addAllowedSmartCredentialDefinitions = addAllowedSmartCredentialDefinitions;
           this.removeAllowedSmartCredentialDefinitions = removeAllowedSmartCredentialDefinitions;
           this.allowedSmartCredentialDefinitions = allowedSmartCredentialDefinitions;
           this.maxSmartCredentialsPerUser = maxSmartCredentialsPerUser;
           this.smartCredentialIDPrefix = smartCredentialIDPrefix;
           this.smartCredentialTokenVendor = smartCredentialTokenVendor;
           this.autoUnassignSmartCredentials = autoUnassignSmartCredentials;
           this.autoMoveSmartCredentials = autoMoveSmartCredentials;
           this.autoRegisterSmartCredentialsToPACS = autoRegisterSmartCredentialsToPACS;
           this.autoSuspendSmartCredentialsFromPACS = autoSuspendSmartCredentialsFromPACS;
           this.allowSoftwareSmartCredentials = allowSoftwareSmartCredentials;
           this.allowAllDigitalIdConfigs = allowAllDigitalIdConfigs;
           this.addAllowedDigitalIdConfigs = addAllowedDigitalIdConfigs;
           this.removeAllowedDigitalIdConfigs = removeAllowedDigitalIdConfigs;
           this.allowedDigitalIdConfigs = allowedDigitalIdConfigs;
           this.maxDigitalIdsPerUser = maxDigitalIdsPerUser;
           this.maxClientTypesPerDigitalId = maxClientTypesPerDigitalId;
           this.autoCancelDigitalIds = autoCancelDigitalIds;
           this.userRegistrationPasswordLifetime = userRegistrationPasswordLifetime;
           this.maxFederationsPerUser = maxFederationsPerUser;
           this.maxNumUserPreferences = maxNumUserPreferences;
           this.maxSizeUserPreference = maxSizeUserPreference;
           this.PVNLength = PVNLength;
           this.PVNChangeRequiredOnAdminReset = PVNChangeRequiredOnAdminReset;
           this.authTypesRequiringPVN = authTypesRequiringPVN;
           this.numDaysForActivation = numDaysForActivation;
           this.activationAuthTypes = activationAuthTypes;
           this.checkIPAddressInLocationHistory = checkIPAddressInLocationHistory;
           this.maxLocationHistorySize = maxLocationHistorySize;
           this.locationHistoryLifetime = locationHistoryLifetime;
           this.maxVelocity = maxVelocity;
           this.checkVelocity = checkVelocity;
           this.countryBlacklist = countryBlacklist;
           this.addCountryBlacklist = addCountryBlacklist;
           this.removeCountryBlacklist = removeCountryBlacklist;
           this.expectedLocations = expectedLocations;
           this.addExpectedLocations = addExpectedLocations;
           this.removeExpectedLocations = removeExpectedLocations;
           this.maxUserExpectedLocationsSize = maxUserExpectedLocationsSize;
           this.normalRejectAdd = normalRejectAdd;
           this.normalRejectRemove = normalRejectRemove;
           this.normalReject = normalReject;
           this.normalAuthenticatedAdd = normalAuthenticatedAdd;
           this.normalAuthenticatedRemove = normalAuthenticatedRemove;
           this.normalAuthenticated = normalAuthenticated;
           this.enhancedRejectAdd = enhancedRejectAdd;
           this.enhancedRejectRemove = enhancedRejectRemove;
           this.enhancedReject = enhancedReject;
           this.enhancedAuthenticatedAdd = enhancedAuthenticatedAdd;
           this.enhancedAuthenticatedRemove = enhancedAuthenticatedRemove;
           this.enhancedAuthenticated = enhancedAuthenticated;
           this.externalRiskScorePass = externalRiskScorePass;
           this.externalRiskScoreFail = externalRiskScoreFail;
           this.performTransactionDelivery = performTransactionDelivery;
           this.softTokenPINRequired = softTokenPINRequired;
           this.softTokenOTPLength = softTokenOTPLength;
           this.comment = comment;
    }


    /**
     * Gets the maxAliases value for this UserSpecParms.
     * 
     * @return maxAliases
     */
    public java.lang.Integer getMaxAliases() {
        return maxAliases;
    }


    /**
     * Sets the maxAliases value for this UserSpecParms.
     * 
     * @param maxAliases
     */
    public void setMaxAliases(java.lang.Integer maxAliases) {
        this.maxAliases = maxAliases;
    }


    /**
     * Gets the maxContactInfoNumber value for this UserSpecParms.
     * 
     * @return maxContactInfoNumber
     */
    public java.lang.Integer getMaxContactInfoNumber() {
        return maxContactInfoNumber;
    }


    /**
     * Sets the maxContactInfoNumber value for this UserSpecParms.
     * 
     * @param maxContactInfoNumber
     */
    public void setMaxContactInfoNumber(java.lang.Integer maxContactInfoNumber) {
        this.maxContactInfoNumber = maxContactInfoNumber;
    }


    /**
     * Gets the lockoutMode value for this UserSpecParms.
     * 
     * @return lockoutMode
     */
    public java.lang.String getLockoutMode() {
        return lockoutMode;
    }


    /**
     * Sets the lockoutMode value for this UserSpecParms.
     * 
     * @param lockoutMode
     */
    public void setLockoutMode(java.lang.String lockoutMode) {
        this.lockoutMode = lockoutMode;
    }


    /**
     * Gets the maxFailures value for this UserSpecParms.
     * 
     * @return maxFailures
     */
    public java.lang.Integer getMaxFailures() {
        return maxFailures;
    }


    /**
     * Sets the maxFailures value for this UserSpecParms.
     * 
     * @param maxFailures
     */
    public void setMaxFailures(java.lang.Integer maxFailures) {
        this.maxFailures = maxFailures;
    }


    /**
     * Gets the maxGlobalFailures value for this UserSpecParms.
     * 
     * @return maxGlobalFailures
     */
    public java.lang.Integer getMaxGlobalFailures() {
        return maxGlobalFailures;
    }


    /**
     * Sets the maxGlobalFailures value for this UserSpecParms.
     * 
     * @param maxGlobalFailures
     */
    public void setMaxGlobalFailures(java.lang.Integer maxGlobalFailures) {
        this.maxGlobalFailures = maxGlobalFailures;
    }


    /**
     * Gets the maxCertificateFailures value for this UserSpecParms.
     * 
     * @return maxCertificateFailures
     */
    public java.lang.Integer getMaxCertificateFailures() {
        return maxCertificateFailures;
    }


    /**
     * Sets the maxCertificateFailures value for this UserSpecParms.
     * 
     * @param maxCertificateFailures
     */
    public void setMaxCertificateFailures(java.lang.Integer maxCertificateFailures) {
        this.maxCertificateFailures = maxCertificateFailures;
    }


    /**
     * Gets the maxExternalFailures value for this UserSpecParms.
     * 
     * @return maxExternalFailures
     */
    public java.lang.Integer getMaxExternalFailures() {
        return maxExternalFailures;
    }


    /**
     * Sets the maxExternalFailures value for this UserSpecParms.
     * 
     * @param maxExternalFailures
     */
    public void setMaxExternalFailures(java.lang.Integer maxExternalFailures) {
        this.maxExternalFailures = maxExternalFailures;
    }


    /**
     * Gets the maxGridFailures value for this UserSpecParms.
     * 
     * @return maxGridFailures
     */
    public java.lang.Integer getMaxGridFailures() {
        return maxGridFailures;
    }


    /**
     * Sets the maxGridFailures value for this UserSpecParms.
     * 
     * @param maxGridFailures
     */
    public void setMaxGridFailures(java.lang.Integer maxGridFailures) {
        this.maxGridFailures = maxGridFailures;
    }


    /**
     * Gets the maxTokenCRFailures value for this UserSpecParms.
     * 
     * @return maxTokenCRFailures
     */
    public java.lang.Integer getMaxTokenCRFailures() {
        return maxTokenCRFailures;
    }


    /**
     * Sets the maxTokenCRFailures value for this UserSpecParms.
     * 
     * @param maxTokenCRFailures
     */
    public void setMaxTokenCRFailures(java.lang.Integer maxTokenCRFailures) {
        this.maxTokenCRFailures = maxTokenCRFailures;
    }


    /**
     * Gets the maxTokenROFailures value for this UserSpecParms.
     * 
     * @return maxTokenROFailures
     */
    public java.lang.Integer getMaxTokenROFailures() {
        return maxTokenROFailures;
    }


    /**
     * Sets the maxTokenROFailures value for this UserSpecParms.
     * 
     * @param maxTokenROFailures
     */
    public void setMaxTokenROFailures(java.lang.Integer maxTokenROFailures) {
        this.maxTokenROFailures = maxTokenROFailures;
    }


    /**
     * Gets the maxOTPFailures value for this UserSpecParms.
     * 
     * @return maxOTPFailures
     */
    public java.lang.Integer getMaxOTPFailures() {
        return maxOTPFailures;
    }


    /**
     * Sets the maxOTPFailures value for this UserSpecParms.
     * 
     * @param maxOTPFailures
     */
    public void setMaxOTPFailures(java.lang.Integer maxOTPFailures) {
        this.maxOTPFailures = maxOTPFailures;
    }


    /**
     * Gets the maxPasswordFailures value for this UserSpecParms.
     * 
     * @return maxPasswordFailures
     */
    public java.lang.Integer getMaxPasswordFailures() {
        return maxPasswordFailures;
    }


    /**
     * Sets the maxPasswordFailures value for this UserSpecParms.
     * 
     * @param maxPasswordFailures
     */
    public void setMaxPasswordFailures(java.lang.Integer maxPasswordFailures) {
        this.maxPasswordFailures = maxPasswordFailures;
    }


    /**
     * Gets the maxQAFailures value for this UserSpecParms.
     * 
     * @return maxQAFailures
     */
    public java.lang.Integer getMaxQAFailures() {
        return maxQAFailures;
    }


    /**
     * Sets the maxQAFailures value for this UserSpecParms.
     * 
     * @param maxQAFailures
     */
    public void setMaxQAFailures(java.lang.Integer maxQAFailures) {
        this.maxQAFailures = maxQAFailures;
    }


    /**
     * Gets the maxRBAIPAuthFailures value for this UserSpecParms.
     * 
     * @return maxRBAIPAuthFailures
     */
    public java.lang.Integer getMaxRBAIPAuthFailures() {
        return maxRBAIPAuthFailures;
    }


    /**
     * Sets the maxRBAIPAuthFailures value for this UserSpecParms.
     * 
     * @param maxRBAIPAuthFailures
     */
    public void setMaxRBAIPAuthFailures(java.lang.Integer maxRBAIPAuthFailures) {
        this.maxRBAIPAuthFailures = maxRBAIPAuthFailures;
    }


    /**
     * Gets the maxRBAMachineAuthFailures value for this UserSpecParms.
     * 
     * @return maxRBAMachineAuthFailures
     */
    public java.lang.Integer getMaxRBAMachineAuthFailures() {
        return maxRBAMachineAuthFailures;
    }


    /**
     * Sets the maxRBAMachineAuthFailures value for this UserSpecParms.
     * 
     * @param maxRBAMachineAuthFailures
     */
    public void setMaxRBAMachineAuthFailures(java.lang.Integer maxRBAMachineAuthFailures) {
        this.maxRBAMachineAuthFailures = maxRBAMachineAuthFailures;
    }


    /**
     * Gets the maxRBACertificateAuthFailures value for this UserSpecParms.
     * 
     * @return maxRBACertificateAuthFailures
     */
    public java.lang.Integer getMaxRBACertificateAuthFailures() {
        return maxRBACertificateAuthFailures;
    }


    /**
     * Sets the maxRBACertificateAuthFailures value for this UserSpecParms.
     * 
     * @param maxRBACertificateAuthFailures
     */
    public void setMaxRBACertificateAuthFailures(java.lang.Integer maxRBACertificateAuthFailures) {
        this.maxRBACertificateAuthFailures = maxRBACertificateAuthFailures;
    }


    /**
     * Gets the lockoutTime value for this UserSpecParms.
     * 
     * @return lockoutTime
     */
    public java.lang.Integer getLockoutTime() {
        return lockoutTime;
    }


    /**
     * Sets the lockoutTime value for this UserSpecParms.
     * 
     * @param lockoutTime
     */
    public void setLockoutTime(java.lang.Integer lockoutTime) {
        this.lockoutTime = lockoutTime;
    }


    /**
     * Gets the maxSecretSize value for this UserSpecParms.
     * 
     * @return maxSecretSize
     */
    public java.lang.Integer getMaxSecretSize() {
        return maxSecretSize;
    }


    /**
     * Sets the maxSecretSize value for this UserSpecParms.
     * 
     * @param maxSecretSize
     */
    public void setMaxSecretSize(java.lang.Integer maxSecretSize) {
        this.maxSecretSize = maxSecretSize;
    }


    /**
     * Gets the maxSecretNumber value for this UserSpecParms.
     * 
     * @return maxSecretNumber
     */
    public java.lang.Integer getMaxSecretNumber() {
        return maxSecretNumber;
    }


    /**
     * Sets the maxSecretNumber value for this UserSpecParms.
     * 
     * @param maxSecretNumber
     */
    public void setMaxSecretNumber(java.lang.Integer maxSecretNumber) {
        this.maxSecretNumber = maxSecretNumber;
    }


    /**
     * Gets the genericAuthType value for this UserSpecParms.
     * 
     * @return genericAuthType
     */
    public java.lang.String[] getGenericAuthType() {
        return genericAuthType;
    }


    /**
     * Sets the genericAuthType value for this UserSpecParms.
     * 
     * @param genericAuthType
     */
    public void setGenericAuthType(java.lang.String[] genericAuthType) {
        this.genericAuthType = genericAuthType;
    }


    /**
     * Gets the enhancedGenericAuthType value for this UserSpecParms.
     * 
     * @return enhancedGenericAuthType
     */
    public java.lang.String[] getEnhancedGenericAuthType() {
        return enhancedGenericAuthType;
    }


    /**
     * Sets the enhancedGenericAuthType value for this UserSpecParms.
     * 
     * @param enhancedGenericAuthType
     */
    public void setEnhancedGenericAuthType(java.lang.String[] enhancedGenericAuthType) {
        this.enhancedGenericAuthType = enhancedGenericAuthType;
    }


    /**
     * Gets the machineAuthType value for this UserSpecParms.
     * 
     * @return machineAuthType
     */
    public java.lang.String[] getMachineAuthType() {
        return machineAuthType;
    }


    /**
     * Sets the machineAuthType value for this UserSpecParms.
     * 
     * @param machineAuthType
     */
    public void setMachineAuthType(java.lang.String[] machineAuthType) {
        this.machineAuthType = machineAuthType;
    }


    /**
     * Gets the authTypeCanViewSecrets value for this UserSpecParms.
     * 
     * @return authTypeCanViewSecrets
     */
    public java.lang.String[] getAuthTypeCanViewSecrets() {
        return authTypeCanViewSecrets;
    }


    /**
     * Sets the authTypeCanViewSecrets value for this UserSpecParms.
     * 
     * @param authTypeCanViewSecrets
     */
    public void setAuthTypeCanViewSecrets(java.lang.String[] authTypeCanViewSecrets) {
        this.authTypeCanViewSecrets = authTypeCanViewSecrets;
    }


    /**
     * Gets the authTypeCanModifySecrets value for this UserSpecParms.
     * 
     * @return authTypeCanModifySecrets
     */
    public java.lang.String[] getAuthTypeCanModifySecrets() {
        return authTypeCanModifySecrets;
    }


    /**
     * Sets the authTypeCanModifySecrets value for this UserSpecParms.
     * 
     * @param authTypeCanModifySecrets
     */
    public void setAuthTypeCanModifySecrets(java.lang.String[] authTypeCanModifySecrets) {
        this.authTypeCanModifySecrets = authTypeCanModifySecrets;
    }


    /**
     * Gets the maxMachineSecrets value for this UserSpecParms.
     * 
     * @return maxMachineSecrets
     */
    public java.lang.Integer getMaxMachineSecrets() {
        return maxMachineSecrets;
    }


    /**
     * Sets the maxMachineSecrets value for this UserSpecParms.
     * 
     * @param maxMachineSecrets
     */
    public void setMaxMachineSecrets(java.lang.Integer maxMachineSecrets) {
        this.maxMachineSecrets = maxMachineSecrets;
    }


    /**
     * Gets the maxMachineSecretsSize value for this UserSpecParms.
     * 
     * @return maxMachineSecretsSize
     */
    public java.lang.Integer getMaxMachineSecretsSize() {
        return maxMachineSecretsSize;
    }


    /**
     * Sets the maxMachineSecretsSize value for this UserSpecParms.
     * 
     * @param maxMachineSecretsSize
     */
    public void setMaxMachineSecretsSize(java.lang.Integer maxMachineSecretsSize) {
        this.maxMachineSecretsSize = maxMachineSecretsSize;
    }


    /**
     * Gets the machineSecretRequiresMachineNonce value for this UserSpecParms.
     * 
     * @return machineSecretRequiresMachineNonce
     */
    public java.lang.Boolean getMachineSecretRequiresMachineNonce() {
        return machineSecretRequiresMachineNonce;
    }


    /**
     * Sets the machineSecretRequiresMachineNonce value for this UserSpecParms.
     * 
     * @param machineSecretRequiresMachineNonce
     */
    public void setMachineSecretRequiresMachineNonce(java.lang.Boolean machineSecretRequiresMachineNonce) {
        this.machineSecretRequiresMachineNonce = machineSecretRequiresMachineNonce;
    }


    /**
     * Gets the machineSecretRequiresSequenceNonce value for this UserSpecParms.
     * 
     * @return machineSecretRequiresSequenceNonce
     */
    public java.lang.Boolean getMachineSecretRequiresSequenceNonce() {
        return machineSecretRequiresSequenceNonce;
    }


    /**
     * Sets the machineSecretRequiresSequenceNonce value for this UserSpecParms.
     * 
     * @param machineSecretRequiresSequenceNonce
     */
    public void setMachineSecretRequiresSequenceNonce(java.lang.Boolean machineSecretRequiresSequenceNonce) {
        this.machineSecretRequiresSequenceNonce = machineSecretRequiresSequenceNonce;
    }


    /**
     * Gets the machineSecretRequiresAppData value for this UserSpecParms.
     * 
     * @return machineSecretRequiresAppData
     */
    public java.lang.Integer getMachineSecretRequiresAppData() {
        return machineSecretRequiresAppData;
    }


    /**
     * Sets the machineSecretRequiresAppData value for this UserSpecParms.
     * 
     * @param machineSecretRequiresAppData
     */
    public void setMachineSecretRequiresAppData(java.lang.Integer machineSecretRequiresAppData) {
        this.machineSecretRequiresAppData = machineSecretRequiresAppData;
    }


    /**
     * Gets the machineSecretAllowsBadAppData value for this UserSpecParms.
     * 
     * @return machineSecretAllowsBadAppData
     */
    public java.lang.Integer getMachineSecretAllowsBadAppData() {
        return machineSecretAllowsBadAppData;
    }


    /**
     * Sets the machineSecretAllowsBadAppData value for this UserSpecParms.
     * 
     * @param machineSecretAllowsBadAppData
     */
    public void setMachineSecretAllowsBadAppData(java.lang.Integer machineSecretAllowsBadAppData) {
        this.machineSecretAllowsBadAppData = machineSecretAllowsBadAppData;
    }


    /**
     * Gets the machineSecretLifetime value for this UserSpecParms.
     * 
     * @return machineSecretLifetime
     */
    public java.lang.Integer getMachineSecretLifetime() {
        return machineSecretLifetime;
    }


    /**
     * Sets the machineSecretLifetime value for this UserSpecParms.
     * 
     * @param machineSecretLifetime
     */
    public void setMachineSecretLifetime(java.lang.Integer machineSecretLifetime) {
        this.machineSecretLifetime = machineSecretLifetime;
    }


    /**
     * Gets the failedMachineAuthIncrementsLockout value for this UserSpecParms.
     * 
     * @return failedMachineAuthIncrementsLockout
     */
    public java.lang.Boolean getFailedMachineAuthIncrementsLockout() {
        return failedMachineAuthIncrementsLockout;
    }


    /**
     * Sets the failedMachineAuthIncrementsLockout value for this UserSpecParms.
     * 
     * @param failedMachineAuthIncrementsLockout
     */
    public void setFailedMachineAuthIncrementsLockout(java.lang.Boolean failedMachineAuthIncrementsLockout) {
        this.failedMachineAuthIncrementsLockout = failedMachineAuthIncrementsLockout;
    }


    /**
     * Gets the maxAuthSecrets value for this UserSpecParms.
     * 
     * @return maxAuthSecrets
     */
    public java.lang.Integer getMaxAuthSecrets() {
        return maxAuthSecrets;
    }


    /**
     * Sets the maxAuthSecrets value for this UserSpecParms.
     * 
     * @param maxAuthSecrets
     */
    public void setMaxAuthSecrets(java.lang.Integer maxAuthSecrets) {
        this.maxAuthSecrets = maxAuthSecrets;
    }


    /**
     * Gets the maxAuthSecretsSize value for this UserSpecParms.
     * 
     * @return maxAuthSecretsSize
     */
    public java.lang.Integer getMaxAuthSecretsSize() {
        return maxAuthSecretsSize;
    }


    /**
     * Sets the maxAuthSecretsSize value for this UserSpecParms.
     * 
     * @param maxAuthSecretsSize
     */
    public void setMaxAuthSecretsSize(java.lang.Integer maxAuthSecretsSize) {
        this.maxAuthSecretsSize = maxAuthSecretsSize;
    }


    /**
     * Gets the maxQuestions value for this UserSpecParms.
     * 
     * @return maxQuestions
     */
    public java.lang.Integer getMaxQuestions() {
        return maxQuestions;
    }


    /**
     * Sets the maxQuestions value for this UserSpecParms.
     * 
     * @param maxQuestions
     */
    public void setMaxQuestions(java.lang.Integer maxQuestions) {
        this.maxQuestions = maxQuestions;
    }


    /**
     * Gets the maxQASize value for this UserSpecParms.
     * 
     * @return maxQASize
     */
    public java.lang.Integer getMaxQASize() {
        return maxQASize;
    }


    /**
     * Sets the maxQASize value for this UserSpecParms.
     * 
     * @param maxQASize
     */
    public void setMaxQASize(java.lang.Integer maxQASize) {
        this.maxQASize = maxQASize;
    }


    /**
     * Gets the QAChallengeSize value for this UserSpecParms.
     * 
     * @return QAChallengeSize
     */
    public java.lang.Integer getQAChallengeSize() {
        return QAChallengeSize;
    }


    /**
     * Sets the QAChallengeSize value for this UserSpecParms.
     * 
     * @param QAChallengeSize
     */
    public void setQAChallengeSize(java.lang.Integer QAChallengeSize) {
        this.QAChallengeSize = QAChallengeSize;
    }


    /**
     * Gets the minQAChallengeSize value for this UserSpecParms.
     * 
     * @return minQAChallengeSize
     */
    public java.lang.Integer getMinQAChallengeSize() {
        return minQAChallengeSize;
    }


    /**
     * Sets the minQAChallengeSize value for this UserSpecParms.
     * 
     * @param minQAChallengeSize
     */
    public void setMinQAChallengeSize(java.lang.Integer minQAChallengeSize) {
        this.minQAChallengeSize = minQAChallengeSize;
    }


    /**
     * Gets the maxQAChallengeSize value for this UserSpecParms.
     * 
     * @return maxQAChallengeSize
     */
    public java.lang.Integer getMaxQAChallengeSize() {
        return maxQAChallengeSize;
    }


    /**
     * Sets the maxQAChallengeSize value for this UserSpecParms.
     * 
     * @param maxQAChallengeSize
     */
    public void setMaxQAChallengeSize(java.lang.Integer maxQAChallengeSize) {
        this.maxQAChallengeSize = maxQAChallengeSize;
    }


    /**
     * Gets the disableQAChallengeRetention value for this UserSpecParms.
     * 
     * @return disableQAChallengeRetention
     */
    public java.lang.Boolean getDisableQAChallengeRetention() {
        return disableQAChallengeRetention;
    }


    /**
     * Sets the disableQAChallengeRetention value for this UserSpecParms.
     * 
     * @param disableQAChallengeRetention
     */
    public void setDisableQAChallengeRetention(java.lang.Boolean disableQAChallengeRetention) {
        this.disableQAChallengeRetention = disableQAChallengeRetention;
    }


    /**
     * Gets the QAChallengeLifetime value for this UserSpecParms.
     * 
     * @return QAChallengeLifetime
     */
    public java.lang.Integer getQAChallengeLifetime() {
        return QAChallengeLifetime;
    }


    /**
     * Sets the QAChallengeLifetime value for this UserSpecParms.
     * 
     * @param QAChallengeLifetime
     */
    public void setQAChallengeLifetime(java.lang.Integer QAChallengeLifetime) {
        this.QAChallengeLifetime = QAChallengeLifetime;
    }


    /**
     * Gets the updateLockoutForReplacedQAChallenge value for this UserSpecParms.
     * 
     * @return updateLockoutForReplacedQAChallenge
     */
    public java.lang.Boolean getUpdateLockoutForReplacedQAChallenge() {
        return updateLockoutForReplacedQAChallenge;
    }


    /**
     * Sets the updateLockoutForReplacedQAChallenge value for this UserSpecParms.
     * 
     * @param updateLockoutForReplacedQAChallenge
     */
    public void setUpdateLockoutForReplacedQAChallenge(java.lang.Boolean updateLockoutForReplacedQAChallenge) {
        this.updateLockoutForReplacedQAChallenge = updateLockoutForReplacedQAChallenge;
    }


    /**
     * Gets the qaDefaultWrongAnswersAllowed value for this UserSpecParms.
     * 
     * @return qaDefaultWrongAnswersAllowed
     */
    public java.lang.Integer getQaDefaultWrongAnswersAllowed() {
        return qaDefaultWrongAnswersAllowed;
    }


    /**
     * Sets the qaDefaultWrongAnswersAllowed value for this UserSpecParms.
     * 
     * @param qaDefaultWrongAnswersAllowed
     */
    public void setQaDefaultWrongAnswersAllowed(java.lang.Integer qaDefaultWrongAnswersAllowed) {
        this.qaDefaultWrongAnswersAllowed = qaDefaultWrongAnswersAllowed;
    }


    /**
     * Gets the qaMaximumWrongAnswersAllowed value for this UserSpecParms.
     * 
     * @return qaMaximumWrongAnswersAllowed
     */
    public java.lang.Integer getQaMaximumWrongAnswersAllowed() {
        return qaMaximumWrongAnswersAllowed;
    }


    /**
     * Sets the qaMaximumWrongAnswersAllowed value for this UserSpecParms.
     * 
     * @param qaMaximumWrongAnswersAllowed
     */
    public void setQaMaximumWrongAnswersAllowed(java.lang.Integer qaMaximumWrongAnswersAllowed) {
        this.qaMaximumWrongAnswersAllowed = qaMaximumWrongAnswersAllowed;
    }


    /**
     * Gets the qaInexactMatchAllowed value for this UserSpecParms.
     * 
     * @return qaInexactMatchAllowed
     */
    public java.lang.Boolean getQaInexactMatchAllowed() {
        return qaInexactMatchAllowed;
    }


    /**
     * Sets the qaInexactMatchAllowed value for this UserSpecParms.
     * 
     * @param qaInexactMatchAllowed
     */
    public void setQaInexactMatchAllowed(java.lang.Boolean qaInexactMatchAllowed) {
        this.qaInexactMatchAllowed = qaInexactMatchAllowed;
    }


    /**
     * Gets the OTPCellAlphabet value for this UserSpecParms.
     * 
     * @return OTPCellAlphabet
     */
    public java.lang.String[] getOTPCellAlphabet() {
        return OTPCellAlphabet;
    }


    /**
     * Sets the OTPCellAlphabet value for this UserSpecParms.
     * 
     * @param OTPCellAlphabet
     */
    public void setOTPCellAlphabet(java.lang.String[] OTPCellAlphabet) {
        this.OTPCellAlphabet = OTPCellAlphabet;
    }


    /**
     * Gets the OTPCellReplacements value for this UserSpecParms.
     * 
     * @return OTPCellReplacements
     */
    public wsdl.adminV8.ig.com.entrust.CellReplacement[] getOTPCellReplacements() {
        return OTPCellReplacements;
    }


    /**
     * Sets the OTPCellReplacements value for this UserSpecParms.
     * 
     * @param OTPCellReplacements
     */
    public void setOTPCellReplacements(wsdl.adminV8.ig.com.entrust.CellReplacement[] OTPCellReplacements) {
        this.OTPCellReplacements = OTPCellReplacements;
    }


    /**
     * Gets the OTPLifetime value for this UserSpecParms.
     * 
     * @return OTPLifetime
     */
    public java.lang.Integer getOTPLifetime() {
        return OTPLifetime;
    }


    /**
     * Sets the OTPLifetime value for this UserSpecParms.
     * 
     * @param OTPLifetime
     */
    public void setOTPLifetime(java.lang.Integer OTPLifetime) {
        this.OTPLifetime = OTPLifetime;
    }


    /**
     * Gets the OTPLength value for this UserSpecParms.
     * 
     * @return OTPLength
     */
    public java.lang.Integer getOTPLength() {
        return OTPLength;
    }


    /**
     * Sets the OTPLength value for this UserSpecParms.
     * 
     * @param OTPLength
     */
    public void setOTPLength(java.lang.Integer OTPLength) {
        this.OTPLength = OTPLength;
    }


    /**
     * Gets the OTPDeliveryEnabled value for this UserSpecParms.
     * 
     * @return OTPDeliveryEnabled
     */
    public java.lang.Boolean getOTPDeliveryEnabled() {
        return OTPDeliveryEnabled;
    }


    /**
     * Sets the OTPDeliveryEnabled value for this UserSpecParms.
     * 
     * @param OTPDeliveryEnabled
     */
    public void setOTPDeliveryEnabled(java.lang.Boolean OTPDeliveryEnabled) {
        this.OTPDeliveryEnabled = OTPDeliveryEnabled;
    }


    /**
     * Gets the OTPAlwaysGenerate value for this UserSpecParms.
     * 
     * @return OTPAlwaysGenerate
     */
    public java.lang.Boolean getOTPAlwaysGenerate() {
        return OTPAlwaysGenerate;
    }


    /**
     * Sets the OTPAlwaysGenerate value for this UserSpecParms.
     * 
     * @param OTPAlwaysGenerate
     */
    public void setOTPAlwaysGenerate(java.lang.Boolean OTPAlwaysGenerate) {
        this.OTPAlwaysGenerate = OTPAlwaysGenerate;
    }


    /**
     * Gets the OTPDynamicRefresh value for this UserSpecParms.
     * 
     * @return OTPDynamicRefresh
     */
    public java.lang.Boolean getOTPDynamicRefresh() {
        return OTPDynamicRefresh;
    }


    /**
     * Sets the OTPDynamicRefresh value for this UserSpecParms.
     * 
     * @param OTPDynamicRefresh
     */
    public void setOTPDynamicRefresh(java.lang.Boolean OTPDynamicRefresh) {
        this.OTPDynamicRefresh = OTPDynamicRefresh;
    }


    /**
     * Gets the OTPNumberOutstanding value for this UserSpecParms.
     * 
     * @return OTPNumberOutstanding
     */
    public java.lang.Integer getOTPNumberOutstanding() {
        return OTPNumberOutstanding;
    }


    /**
     * Sets the OTPNumberOutstanding value for this UserSpecParms.
     * 
     * @param OTPNumberOutstanding
     */
    public void setOTPNumberOutstanding(java.lang.Integer OTPNumberOutstanding) {
        this.OTPNumberOutstanding = OTPNumberOutstanding;
    }


    /**
     * Gets the OTPRefreshThreshold value for this UserSpecParms.
     * 
     * @return OTPRefreshThreshold
     */
    public java.lang.Integer getOTPRefreshThreshold() {
        return OTPRefreshThreshold;
    }


    /**
     * Sets the OTPRefreshThreshold value for this UserSpecParms.
     * 
     * @param OTPRefreshThreshold
     */
    public void setOTPRefreshThreshold(java.lang.Integer OTPRefreshThreshold) {
        this.OTPRefreshThreshold = OTPRefreshThreshold;
    }


    /**
     * Gets the returnAuthSecretWithChall value for this UserSpecParms.
     * 
     * @return returnAuthSecretWithChall
     */
    public java.lang.Boolean getReturnAuthSecretWithChall() {
        return returnAuthSecretWithChall;
    }


    /**
     * Sets the returnAuthSecretWithChall value for this UserSpecParms.
     * 
     * @param returnAuthSecretWithChall
     */
    public void setReturnAuthSecretWithChall(java.lang.Boolean returnAuthSecretWithChall) {
        this.returnAuthSecretWithChall = returnAuthSecretWithChall;
    }


    /**
     * Gets the autoUnassignTokens value for this UserSpecParms.
     * 
     * @return autoUnassignTokens
     */
    public java.lang.Boolean getAutoUnassignTokens() {
        return autoUnassignTokens;
    }


    /**
     * Sets the autoUnassignTokens value for this UserSpecParms.
     * 
     * @param autoUnassignTokens
     */
    public void setAutoUnassignTokens(java.lang.Boolean autoUnassignTokens) {
        this.autoUnassignTokens = autoUnassignTokens;
    }


    /**
     * Gets the autoMoveTokens value for this UserSpecParms.
     * 
     * @return autoMoveTokens
     */
    public java.lang.Boolean getAutoMoveTokens() {
        return autoMoveTokens;
    }


    /**
     * Sets the autoMoveTokens value for this UserSpecParms.
     * 
     * @param autoMoveTokens
     */
    public void setAutoMoveTokens(java.lang.Boolean autoMoveTokens) {
        this.autoMoveTokens = autoMoveTokens;
    }


    /**
     * Gets the disableTokenChallengeRetention value for this UserSpecParms.
     * 
     * @return disableTokenChallengeRetention
     */
    public java.lang.Boolean getDisableTokenChallengeRetention() {
        return disableTokenChallengeRetention;
    }


    /**
     * Sets the disableTokenChallengeRetention value for this UserSpecParms.
     * 
     * @param disableTokenChallengeRetention
     */
    public void setDisableTokenChallengeRetention(java.lang.Boolean disableTokenChallengeRetention) {
        this.disableTokenChallengeRetention = disableTokenChallengeRetention;
    }


    /**
     * Gets the tokenChallengeLifetime value for this UserSpecParms.
     * 
     * @return tokenChallengeLifetime
     */
    public java.lang.Integer getTokenChallengeLifetime() {
        return tokenChallengeLifetime;
    }


    /**
     * Sets the tokenChallengeLifetime value for this UserSpecParms.
     * 
     * @param tokenChallengeLifetime
     */
    public void setTokenChallengeLifetime(java.lang.Integer tokenChallengeLifetime) {
        this.tokenChallengeLifetime = tokenChallengeLifetime;
    }


    /**
     * Gets the updateLockoutForReplacedTokenChallenge value for this UserSpecParms.
     * 
     * @return updateLockoutForReplacedTokenChallenge
     */
    public java.lang.Boolean getUpdateLockoutForReplacedTokenChallenge() {
        return updateLockoutForReplacedTokenChallenge;
    }


    /**
     * Sets the updateLockoutForReplacedTokenChallenge value for this UserSpecParms.
     * 
     * @param updateLockoutForReplacedTokenChallenge
     */
    public void setUpdateLockoutForReplacedTokenChallenge(java.lang.Boolean updateLockoutForReplacedTokenChallenge) {
        this.updateLockoutForReplacedTokenChallenge = updateLockoutForReplacedTokenChallenge;
    }


    /**
     * Gets the maxAllowedTokenSets value for this UserSpecParms.
     * 
     * @return maxAllowedTokenSets
     */
    public java.lang.Integer getMaxAllowedTokenSets() {
        return maxAllowedTokenSets;
    }


    /**
     * Sets the maxAllowedTokenSets value for this UserSpecParms.
     * 
     * @param maxAllowedTokenSets
     */
    public void setMaxAllowedTokenSets(java.lang.Integer maxAllowedTokenSets) {
        this.maxAllowedTokenSets = maxAllowedTokenSets;
    }


    /**
     * Gets the allowNONEAuthentication value for this UserSpecParms.
     * 
     * @return allowNONEAuthentication
     */
    public java.lang.Boolean getAllowNONEAuthentication() {
        return allowNONEAuthentication;
    }


    /**
     * Sets the allowNONEAuthentication value for this UserSpecParms.
     * 
     * @param allowNONEAuthentication
     */
    public void setAllowNONEAuthentication(java.lang.Boolean allowNONEAuthentication) {
        this.allowNONEAuthentication = allowNONEAuthentication;
    }


    /**
     * Gets the considerTempPINLast value for this UserSpecParms.
     * 
     * @return considerTempPINLast
     */
    public java.lang.Boolean getConsiderTempPINLast() {
        return considerTempPINLast;
    }


    /**
     * Sets the considerTempPINLast value for this UserSpecParms.
     * 
     * @param considerTempPINLast
     */
    public void setConsiderTempPINLast(java.lang.Boolean considerTempPINLast) {
        this.considerTempPINLast = considerTempPINLast;
    }


    /**
     * Gets the storeLastAuthInfo value for this UserSpecParms.
     * 
     * @return storeLastAuthInfo
     */
    public java.lang.Boolean getStoreLastAuthInfo() {
        return storeLastAuthInfo;
    }


    /**
     * Sets the storeLastAuthInfo value for this UserSpecParms.
     * 
     * @param storeLastAuthInfo
     */
    public void setStoreLastAuthInfo(java.lang.Boolean storeLastAuthInfo) {
        this.storeLastAuthInfo = storeLastAuthInfo;
    }


    /**
     * Gets the allowCreateIfDisabledInRepository value for this UserSpecParms.
     * 
     * @return allowCreateIfDisabledInRepository
     */
    public java.lang.Boolean getAllowCreateIfDisabledInRepository() {
        return allowCreateIfDisabledInRepository;
    }


    /**
     * Sets the allowCreateIfDisabledInRepository value for this UserSpecParms.
     * 
     * @param allowCreateIfDisabledInRepository
     */
    public void setAllowCreateIfDisabledInRepository(java.lang.Boolean allowCreateIfDisabledInRepository) {
        this.allowCreateIfDisabledInRepository = allowCreateIfDisabledInRepository;
    }


    /**
     * Gets the allowCreateIfExpiredInRepository value for this UserSpecParms.
     * 
     * @return allowCreateIfExpiredInRepository
     */
    public java.lang.Boolean getAllowCreateIfExpiredInRepository() {
        return allowCreateIfExpiredInRepository;
    }


    /**
     * Sets the allowCreateIfExpiredInRepository value for this UserSpecParms.
     * 
     * @param allowCreateIfExpiredInRepository
     */
    public void setAllowCreateIfExpiredInRepository(java.lang.Boolean allowCreateIfExpiredInRepository) {
        this.allowCreateIfExpiredInRepository = allowCreateIfExpiredInRepository;
    }


    /**
     * Gets the allowAuthIfDisabledInRepository value for this UserSpecParms.
     * 
     * @return allowAuthIfDisabledInRepository
     */
    public java.lang.Boolean getAllowAuthIfDisabledInRepository() {
        return allowAuthIfDisabledInRepository;
    }


    /**
     * Sets the allowAuthIfDisabledInRepository value for this UserSpecParms.
     * 
     * @param allowAuthIfDisabledInRepository
     */
    public void setAllowAuthIfDisabledInRepository(java.lang.Boolean allowAuthIfDisabledInRepository) {
        this.allowAuthIfDisabledInRepository = allowAuthIfDisabledInRepository;
    }


    /**
     * Gets the allowAuthIfExpiredInRepository value for this UserSpecParms.
     * 
     * @return allowAuthIfExpiredInRepository
     */
    public java.lang.Boolean getAllowAuthIfExpiredInRepository() {
        return allowAuthIfExpiredInRepository;
    }


    /**
     * Sets the allowAuthIfExpiredInRepository value for this UserSpecParms.
     * 
     * @param allowAuthIfExpiredInRepository
     */
    public void setAllowAuthIfExpiredInRepository(java.lang.Boolean allowAuthIfExpiredInRepository) {
        this.allowAuthIfExpiredInRepository = allowAuthIfExpiredInRepository;
    }


    /**
     * Gets the transactionSignatureType value for this UserSpecParms.
     * 
     * @return transactionSignatureType
     */
    public java.lang.String getTransactionSignatureType() {
        return transactionSignatureType;
    }


    /**
     * Sets the transactionSignatureType value for this UserSpecParms.
     * 
     * @param transactionSignatureType
     */
    public void setTransactionSignatureType(java.lang.String transactionSignatureType) {
        this.transactionSignatureType = transactionSignatureType;
    }


    /**
     * Gets the transactionLifetime value for this UserSpecParms.
     * 
     * @return transactionLifetime
     */
    public java.lang.Integer getTransactionLifetime() {
        return transactionLifetime;
    }


    /**
     * Sets the transactionLifetime value for this UserSpecParms.
     * 
     * @param transactionLifetime
     */
    public void setTransactionLifetime(java.lang.Integer transactionLifetime) {
        this.transactionLifetime = transactionLifetime;
    }


    /**
     * Gets the maxNumTransactionDetails value for this UserSpecParms.
     * 
     * @return maxNumTransactionDetails
     */
    public java.lang.Integer getMaxNumTransactionDetails() {
        return maxNumTransactionDetails;
    }


    /**
     * Sets the maxNumTransactionDetails value for this UserSpecParms.
     * 
     * @param maxNumTransactionDetails
     */
    public void setMaxNumTransactionDetails(java.lang.Integer maxNumTransactionDetails) {
        this.maxNumTransactionDetails = maxNumTransactionDetails;
    }


    /**
     * Gets the allowSelfSignedUserCert value for this UserSpecParms.
     * 
     * @return allowSelfSignedUserCert
     */
    public java.lang.Boolean getAllowSelfSignedUserCert() {
        return allowSelfSignedUserCert;
    }


    /**
     * Sets the allowSelfSignedUserCert value for this UserSpecParms.
     * 
     * @param allowSelfSignedUserCert
     */
    public void setAllowSelfSignedUserCert(java.lang.Boolean allowSelfSignedUserCert) {
        this.allowSelfSignedUserCert = allowSelfSignedUserCert;
    }


    /**
     * Gets the allowCertNotIssuedByRegisteredCA value for this UserSpecParms.
     * 
     * @return allowCertNotIssuedByRegisteredCA
     */
    public java.lang.Boolean getAllowCertNotIssuedByRegisteredCA() {
        return allowCertNotIssuedByRegisteredCA;
    }


    /**
     * Sets the allowCertNotIssuedByRegisteredCA value for this UserSpecParms.
     * 
     * @param allowCertNotIssuedByRegisteredCA
     */
    public void setAllowCertNotIssuedByRegisteredCA(java.lang.Boolean allowCertNotIssuedByRegisteredCA) {
        this.allowCertNotIssuedByRegisteredCA = allowCertNotIssuedByRegisteredCA;
    }


    /**
     * Gets the allowAllRegisteredCAs value for this UserSpecParms.
     * 
     * @return allowAllRegisteredCAs
     */
    public java.lang.Boolean getAllowAllRegisteredCAs() {
        return allowAllRegisteredCAs;
    }


    /**
     * Sets the allowAllRegisteredCAs value for this UserSpecParms.
     * 
     * @param allowAllRegisteredCAs
     */
    public void setAllowAllRegisteredCAs(java.lang.Boolean allowAllRegisteredCAs) {
        this.allowAllRegisteredCAs = allowAllRegisteredCAs;
    }


    /**
     * Gets the addAllowedRegisteredCAs value for this UserSpecParms.
     * 
     * @return addAllowedRegisteredCAs
     */
    public java.lang.Boolean getAddAllowedRegisteredCAs() {
        return addAllowedRegisteredCAs;
    }


    /**
     * Sets the addAllowedRegisteredCAs value for this UserSpecParms.
     * 
     * @param addAllowedRegisteredCAs
     */
    public void setAddAllowedRegisteredCAs(java.lang.Boolean addAllowedRegisteredCAs) {
        this.addAllowedRegisteredCAs = addAllowedRegisteredCAs;
    }


    /**
     * Gets the removeAllowedRegisteredCAs value for this UserSpecParms.
     * 
     * @return removeAllowedRegisteredCAs
     */
    public java.lang.Boolean getRemoveAllowedRegisteredCAs() {
        return removeAllowedRegisteredCAs;
    }


    /**
     * Sets the removeAllowedRegisteredCAs value for this UserSpecParms.
     * 
     * @param removeAllowedRegisteredCAs
     */
    public void setRemoveAllowedRegisteredCAs(java.lang.Boolean removeAllowedRegisteredCAs) {
        this.removeAllowedRegisteredCAs = removeAllowedRegisteredCAs;
    }


    /**
     * Gets the allowedRegisteredCAs value for this UserSpecParms.
     * 
     * @return allowedRegisteredCAs
     */
    public java.lang.String[] getAllowedRegisteredCAs() {
        return allowedRegisteredCAs;
    }


    /**
     * Sets the allowedRegisteredCAs value for this UserSpecParms.
     * 
     * @param allowedRegisteredCAs
     */
    public void setAllowedRegisteredCAs(java.lang.String[] allowedRegisteredCAs) {
        this.allowedRegisteredCAs = allowedRegisteredCAs;
    }


    /**
     * Gets the certificateAuthenticationHashAlg value for this UserSpecParms.
     * 
     * @return certificateAuthenticationHashAlg
     */
    public java.lang.String getCertificateAuthenticationHashAlg() {
        return certificateAuthenticationHashAlg;
    }


    /**
     * Sets the certificateAuthenticationHashAlg value for this UserSpecParms.
     * 
     * @param certificateAuthenticationHashAlg
     */
    public void setCertificateAuthenticationHashAlg(java.lang.String certificateAuthenticationHashAlg) {
        this.certificateAuthenticationHashAlg = certificateAuthenticationHashAlg;
    }


    /**
     * Gets the certificateAuthenticationChallengeSize value for this UserSpecParms.
     * 
     * @return certificateAuthenticationChallengeSize
     */
    public java.lang.Integer getCertificateAuthenticationChallengeSize() {
        return certificateAuthenticationChallengeSize;
    }


    /**
     * Sets the certificateAuthenticationChallengeSize value for this UserSpecParms.
     * 
     * @param certificateAuthenticationChallengeSize
     */
    public void setCertificateAuthenticationChallengeSize(java.lang.Integer certificateAuthenticationChallengeSize) {
        this.certificateAuthenticationChallengeSize = certificateAuthenticationChallengeSize;
    }


    /**
     * Gets the maxCertsPerUser value for this UserSpecParms.
     * 
     * @return maxCertsPerUser
     */
    public java.lang.Integer getMaxCertsPerUser() {
        return maxCertsPerUser;
    }


    /**
     * Sets the maxCertsPerUser value for this UserSpecParms.
     * 
     * @param maxCertsPerUser
     */
    public void setMaxCertsPerUser(java.lang.Integer maxCertsPerUser) {
        this.maxCertsPerUser = maxCertsPerUser;
    }


    /**
     * Gets the autoDeleteUserCerts value for this UserSpecParms.
     * 
     * @return autoDeleteUserCerts
     */
    public java.lang.Boolean getAutoDeleteUserCerts() {
        return autoDeleteUserCerts;
    }


    /**
     * Sets the autoDeleteUserCerts value for this UserSpecParms.
     * 
     * @param autoDeleteUserCerts
     */
    public void setAutoDeleteUserCerts(java.lang.Boolean autoDeleteUserCerts) {
        this.autoDeleteUserCerts = autoDeleteUserCerts;
    }


    /**
     * Gets the disableCertificateChallengeRetention value for this UserSpecParms.
     * 
     * @return disableCertificateChallengeRetention
     */
    public java.lang.Boolean getDisableCertificateChallengeRetention() {
        return disableCertificateChallengeRetention;
    }


    /**
     * Sets the disableCertificateChallengeRetention value for this UserSpecParms.
     * 
     * @param disableCertificateChallengeRetention
     */
    public void setDisableCertificateChallengeRetention(java.lang.Boolean disableCertificateChallengeRetention) {
        this.disableCertificateChallengeRetention = disableCertificateChallengeRetention;
    }


    /**
     * Gets the certificateChallengeLifetime value for this UserSpecParms.
     * 
     * @return certificateChallengeLifetime
     */
    public java.lang.Integer getCertificateChallengeLifetime() {
        return certificateChallengeLifetime;
    }


    /**
     * Sets the certificateChallengeLifetime value for this UserSpecParms.
     * 
     * @param certificateChallengeLifetime
     */
    public void setCertificateChallengeLifetime(java.lang.Integer certificateChallengeLifetime) {
        this.certificateChallengeLifetime = certificateChallengeLifetime;
    }


    /**
     * Gets the updateLockoutForReplacedCertificateChallenge value for this UserSpecParms.
     * 
     * @return updateLockoutForReplacedCertificateChallenge
     */
    public java.lang.Boolean getUpdateLockoutForReplacedCertificateChallenge() {
        return updateLockoutForReplacedCertificateChallenge;
    }


    /**
     * Sets the updateLockoutForReplacedCertificateChallenge value for this UserSpecParms.
     * 
     * @param updateLockoutForReplacedCertificateChallenge
     */
    public void setUpdateLockoutForReplacedCertificateChallenge(java.lang.Boolean updateLockoutForReplacedCertificateChallenge) {
        this.updateLockoutForReplacedCertificateChallenge = updateLockoutForReplacedCertificateChallenge;
    }


    /**
     * Gets the allowAllSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @return allowAllSmartCredentialDefinitions
     */
    public java.lang.Boolean getAllowAllSmartCredentialDefinitions() {
        return allowAllSmartCredentialDefinitions;
    }


    /**
     * Sets the allowAllSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @param allowAllSmartCredentialDefinitions
     */
    public void setAllowAllSmartCredentialDefinitions(java.lang.Boolean allowAllSmartCredentialDefinitions) {
        this.allowAllSmartCredentialDefinitions = allowAllSmartCredentialDefinitions;
    }


    /**
     * Gets the addAllowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @return addAllowedSmartCredentialDefinitions
     */
    public java.lang.Boolean getAddAllowedSmartCredentialDefinitions() {
        return addAllowedSmartCredentialDefinitions;
    }


    /**
     * Sets the addAllowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @param addAllowedSmartCredentialDefinitions
     */
    public void setAddAllowedSmartCredentialDefinitions(java.lang.Boolean addAllowedSmartCredentialDefinitions) {
        this.addAllowedSmartCredentialDefinitions = addAllowedSmartCredentialDefinitions;
    }


    /**
     * Gets the removeAllowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @return removeAllowedSmartCredentialDefinitions
     */
    public java.lang.Boolean getRemoveAllowedSmartCredentialDefinitions() {
        return removeAllowedSmartCredentialDefinitions;
    }


    /**
     * Sets the removeAllowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @param removeAllowedSmartCredentialDefinitions
     */
    public void setRemoveAllowedSmartCredentialDefinitions(java.lang.Boolean removeAllowedSmartCredentialDefinitions) {
        this.removeAllowedSmartCredentialDefinitions = removeAllowedSmartCredentialDefinitions;
    }


    /**
     * Gets the allowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @return allowedSmartCredentialDefinitions
     */
    public java.lang.String[] getAllowedSmartCredentialDefinitions() {
        return allowedSmartCredentialDefinitions;
    }


    /**
     * Sets the allowedSmartCredentialDefinitions value for this UserSpecParms.
     * 
     * @param allowedSmartCredentialDefinitions
     */
    public void setAllowedSmartCredentialDefinitions(java.lang.String[] allowedSmartCredentialDefinitions) {
        this.allowedSmartCredentialDefinitions = allowedSmartCredentialDefinitions;
    }


    /**
     * Gets the maxSmartCredentialsPerUser value for this UserSpecParms.
     * 
     * @return maxSmartCredentialsPerUser
     */
    public java.lang.Integer getMaxSmartCredentialsPerUser() {
        return maxSmartCredentialsPerUser;
    }


    /**
     * Sets the maxSmartCredentialsPerUser value for this UserSpecParms.
     * 
     * @param maxSmartCredentialsPerUser
     */
    public void setMaxSmartCredentialsPerUser(java.lang.Integer maxSmartCredentialsPerUser) {
        this.maxSmartCredentialsPerUser = maxSmartCredentialsPerUser;
    }


    /**
     * Gets the smartCredentialIDPrefix value for this UserSpecParms.
     * 
     * @return smartCredentialIDPrefix
     */
    public java.lang.String getSmartCredentialIDPrefix() {
        return smartCredentialIDPrefix;
    }


    /**
     * Sets the smartCredentialIDPrefix value for this UserSpecParms.
     * 
     * @param smartCredentialIDPrefix
     */
    public void setSmartCredentialIDPrefix(java.lang.String smartCredentialIDPrefix) {
        this.smartCredentialIDPrefix = smartCredentialIDPrefix;
    }


    /**
     * Gets the smartCredentialTokenVendor value for this UserSpecParms.
     * 
     * @return smartCredentialTokenVendor
     */
    public java.lang.String getSmartCredentialTokenVendor() {
        return smartCredentialTokenVendor;
    }


    /**
     * Sets the smartCredentialTokenVendor value for this UserSpecParms.
     * 
     * @param smartCredentialTokenVendor
     */
    public void setSmartCredentialTokenVendor(java.lang.String smartCredentialTokenVendor) {
        this.smartCredentialTokenVendor = smartCredentialTokenVendor;
    }


    /**
     * Gets the autoUnassignSmartCredentials value for this UserSpecParms.
     * 
     * @return autoUnassignSmartCredentials
     */
    public java.lang.Boolean getAutoUnassignSmartCredentials() {
        return autoUnassignSmartCredentials;
    }


    /**
     * Sets the autoUnassignSmartCredentials value for this UserSpecParms.
     * 
     * @param autoUnassignSmartCredentials
     */
    public void setAutoUnassignSmartCredentials(java.lang.Boolean autoUnassignSmartCredentials) {
        this.autoUnassignSmartCredentials = autoUnassignSmartCredentials;
    }


    /**
     * Gets the autoMoveSmartCredentials value for this UserSpecParms.
     * 
     * @return autoMoveSmartCredentials
     */
    public java.lang.Boolean getAutoMoveSmartCredentials() {
        return autoMoveSmartCredentials;
    }


    /**
     * Sets the autoMoveSmartCredentials value for this UserSpecParms.
     * 
     * @param autoMoveSmartCredentials
     */
    public void setAutoMoveSmartCredentials(java.lang.Boolean autoMoveSmartCredentials) {
        this.autoMoveSmartCredentials = autoMoveSmartCredentials;
    }


    /**
     * Gets the autoRegisterSmartCredentialsToPACS value for this UserSpecParms.
     * 
     * @return autoRegisterSmartCredentialsToPACS
     */
    public java.lang.Boolean getAutoRegisterSmartCredentialsToPACS() {
        return autoRegisterSmartCredentialsToPACS;
    }


    /**
     * Sets the autoRegisterSmartCredentialsToPACS value for this UserSpecParms.
     * 
     * @param autoRegisterSmartCredentialsToPACS
     */
    public void setAutoRegisterSmartCredentialsToPACS(java.lang.Boolean autoRegisterSmartCredentialsToPACS) {
        this.autoRegisterSmartCredentialsToPACS = autoRegisterSmartCredentialsToPACS;
    }


    /**
     * Gets the autoSuspendSmartCredentialsFromPACS value for this UserSpecParms.
     * 
     * @return autoSuspendSmartCredentialsFromPACS
     */
    public java.lang.Boolean getAutoSuspendSmartCredentialsFromPACS() {
        return autoSuspendSmartCredentialsFromPACS;
    }


    /**
     * Sets the autoSuspendSmartCredentialsFromPACS value for this UserSpecParms.
     * 
     * @param autoSuspendSmartCredentialsFromPACS
     */
    public void setAutoSuspendSmartCredentialsFromPACS(java.lang.Boolean autoSuspendSmartCredentialsFromPACS) {
        this.autoSuspendSmartCredentialsFromPACS = autoSuspendSmartCredentialsFromPACS;
    }


    /**
     * Gets the allowSoftwareSmartCredentials value for this UserSpecParms.
     * 
     * @return allowSoftwareSmartCredentials
     */
    public java.lang.Boolean getAllowSoftwareSmartCredentials() {
        return allowSoftwareSmartCredentials;
    }


    /**
     * Sets the allowSoftwareSmartCredentials value for this UserSpecParms.
     * 
     * @param allowSoftwareSmartCredentials
     */
    public void setAllowSoftwareSmartCredentials(java.lang.Boolean allowSoftwareSmartCredentials) {
        this.allowSoftwareSmartCredentials = allowSoftwareSmartCredentials;
    }


    /**
     * Gets the allowAllDigitalIdConfigs value for this UserSpecParms.
     * 
     * @return allowAllDigitalIdConfigs
     */
    public java.lang.Boolean getAllowAllDigitalIdConfigs() {
        return allowAllDigitalIdConfigs;
    }


    /**
     * Sets the allowAllDigitalIdConfigs value for this UserSpecParms.
     * 
     * @param allowAllDigitalIdConfigs
     */
    public void setAllowAllDigitalIdConfigs(java.lang.Boolean allowAllDigitalIdConfigs) {
        this.allowAllDigitalIdConfigs = allowAllDigitalIdConfigs;
    }


    /**
     * Gets the addAllowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @return addAllowedDigitalIdConfigs
     */
    public java.lang.Boolean getAddAllowedDigitalIdConfigs() {
        return addAllowedDigitalIdConfigs;
    }


    /**
     * Sets the addAllowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @param addAllowedDigitalIdConfigs
     */
    public void setAddAllowedDigitalIdConfigs(java.lang.Boolean addAllowedDigitalIdConfigs) {
        this.addAllowedDigitalIdConfigs = addAllowedDigitalIdConfigs;
    }


    /**
     * Gets the removeAllowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @return removeAllowedDigitalIdConfigs
     */
    public java.lang.Boolean getRemoveAllowedDigitalIdConfigs() {
        return removeAllowedDigitalIdConfigs;
    }


    /**
     * Sets the removeAllowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @param removeAllowedDigitalIdConfigs
     */
    public void setRemoveAllowedDigitalIdConfigs(java.lang.Boolean removeAllowedDigitalIdConfigs) {
        this.removeAllowedDigitalIdConfigs = removeAllowedDigitalIdConfigs;
    }


    /**
     * Gets the allowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @return allowedDigitalIdConfigs
     */
    public java.lang.String[] getAllowedDigitalIdConfigs() {
        return allowedDigitalIdConfigs;
    }


    /**
     * Sets the allowedDigitalIdConfigs value for this UserSpecParms.
     * 
     * @param allowedDigitalIdConfigs
     */
    public void setAllowedDigitalIdConfigs(java.lang.String[] allowedDigitalIdConfigs) {
        this.allowedDigitalIdConfigs = allowedDigitalIdConfigs;
    }


    /**
     * Gets the maxDigitalIdsPerUser value for this UserSpecParms.
     * 
     * @return maxDigitalIdsPerUser
     */
    public java.lang.Integer getMaxDigitalIdsPerUser() {
        return maxDigitalIdsPerUser;
    }


    /**
     * Sets the maxDigitalIdsPerUser value for this UserSpecParms.
     * 
     * @param maxDigitalIdsPerUser
     */
    public void setMaxDigitalIdsPerUser(java.lang.Integer maxDigitalIdsPerUser) {
        this.maxDigitalIdsPerUser = maxDigitalIdsPerUser;
    }


    /**
     * Gets the maxClientTypesPerDigitalId value for this UserSpecParms.
     * 
     * @return maxClientTypesPerDigitalId
     */
    public java.lang.Integer getMaxClientTypesPerDigitalId() {
        return maxClientTypesPerDigitalId;
    }


    /**
     * Sets the maxClientTypesPerDigitalId value for this UserSpecParms.
     * 
     * @param maxClientTypesPerDigitalId
     */
    public void setMaxClientTypesPerDigitalId(java.lang.Integer maxClientTypesPerDigitalId) {
        this.maxClientTypesPerDigitalId = maxClientTypesPerDigitalId;
    }


    /**
     * Gets the autoCancelDigitalIds value for this UserSpecParms.
     * 
     * @return autoCancelDigitalIds
     */
    public java.lang.Boolean getAutoCancelDigitalIds() {
        return autoCancelDigitalIds;
    }


    /**
     * Sets the autoCancelDigitalIds value for this UserSpecParms.
     * 
     * @param autoCancelDigitalIds
     */
    public void setAutoCancelDigitalIds(java.lang.Boolean autoCancelDigitalIds) {
        this.autoCancelDigitalIds = autoCancelDigitalIds;
    }


    /**
     * Gets the userRegistrationPasswordLifetime value for this UserSpecParms.
     * 
     * @return userRegistrationPasswordLifetime
     */
    public java.lang.Integer getUserRegistrationPasswordLifetime() {
        return userRegistrationPasswordLifetime;
    }


    /**
     * Sets the userRegistrationPasswordLifetime value for this UserSpecParms.
     * 
     * @param userRegistrationPasswordLifetime
     */
    public void setUserRegistrationPasswordLifetime(java.lang.Integer userRegistrationPasswordLifetime) {
        this.userRegistrationPasswordLifetime = userRegistrationPasswordLifetime;
    }


    /**
     * Gets the maxFederationsPerUser value for this UserSpecParms.
     * 
     * @return maxFederationsPerUser
     */
    public java.lang.Integer getMaxFederationsPerUser() {
        return maxFederationsPerUser;
    }


    /**
     * Sets the maxFederationsPerUser value for this UserSpecParms.
     * 
     * @param maxFederationsPerUser
     */
    public void setMaxFederationsPerUser(java.lang.Integer maxFederationsPerUser) {
        this.maxFederationsPerUser = maxFederationsPerUser;
    }


    /**
     * Gets the maxNumUserPreferences value for this UserSpecParms.
     * 
     * @return maxNumUserPreferences
     */
    public java.lang.Integer getMaxNumUserPreferences() {
        return maxNumUserPreferences;
    }


    /**
     * Sets the maxNumUserPreferences value for this UserSpecParms.
     * 
     * @param maxNumUserPreferences
     */
    public void setMaxNumUserPreferences(java.lang.Integer maxNumUserPreferences) {
        this.maxNumUserPreferences = maxNumUserPreferences;
    }


    /**
     * Gets the maxSizeUserPreference value for this UserSpecParms.
     * 
     * @return maxSizeUserPreference
     */
    public java.lang.Integer getMaxSizeUserPreference() {
        return maxSizeUserPreference;
    }


    /**
     * Sets the maxSizeUserPreference value for this UserSpecParms.
     * 
     * @param maxSizeUserPreference
     */
    public void setMaxSizeUserPreference(java.lang.Integer maxSizeUserPreference) {
        this.maxSizeUserPreference = maxSizeUserPreference;
    }


    /**
     * Gets the PVNLength value for this UserSpecParms.
     * 
     * @return PVNLength
     */
    public java.lang.Integer getPVNLength() {
        return PVNLength;
    }


    /**
     * Sets the PVNLength value for this UserSpecParms.
     * 
     * @param PVNLength
     */
    public void setPVNLength(java.lang.Integer PVNLength) {
        this.PVNLength = PVNLength;
    }


    /**
     * Gets the PVNChangeRequiredOnAdminReset value for this UserSpecParms.
     * 
     * @return PVNChangeRequiredOnAdminReset
     */
    public java.lang.Boolean getPVNChangeRequiredOnAdminReset() {
        return PVNChangeRequiredOnAdminReset;
    }


    /**
     * Sets the PVNChangeRequiredOnAdminReset value for this UserSpecParms.
     * 
     * @param PVNChangeRequiredOnAdminReset
     */
    public void setPVNChangeRequiredOnAdminReset(java.lang.Boolean PVNChangeRequiredOnAdminReset) {
        this.PVNChangeRequiredOnAdminReset = PVNChangeRequiredOnAdminReset;
    }


    /**
     * Gets the authTypesRequiringPVN value for this UserSpecParms.
     * 
     * @return authTypesRequiringPVN
     */
    public java.lang.String[] getAuthTypesRequiringPVN() {
        return authTypesRequiringPVN;
    }


    /**
     * Sets the authTypesRequiringPVN value for this UserSpecParms.
     * 
     * @param authTypesRequiringPVN
     */
    public void setAuthTypesRequiringPVN(java.lang.String[] authTypesRequiringPVN) {
        this.authTypesRequiringPVN = authTypesRequiringPVN;
    }


    /**
     * Gets the numDaysForActivation value for this UserSpecParms.
     * 
     * @return numDaysForActivation
     */
    public java.lang.Integer getNumDaysForActivation() {
        return numDaysForActivation;
    }


    /**
     * Sets the numDaysForActivation value for this UserSpecParms.
     * 
     * @param numDaysForActivation
     */
    public void setNumDaysForActivation(java.lang.Integer numDaysForActivation) {
        this.numDaysForActivation = numDaysForActivation;
    }


    /**
     * Gets the activationAuthTypes value for this UserSpecParms.
     * 
     * @return activationAuthTypes
     */
    public java.lang.String[] getActivationAuthTypes() {
        return activationAuthTypes;
    }


    /**
     * Sets the activationAuthTypes value for this UserSpecParms.
     * 
     * @param activationAuthTypes
     */
    public void setActivationAuthTypes(java.lang.String[] activationAuthTypes) {
        this.activationAuthTypes = activationAuthTypes;
    }


    /**
     * Gets the checkIPAddressInLocationHistory value for this UserSpecParms.
     * 
     * @return checkIPAddressInLocationHistory
     */
    public java.lang.Boolean getCheckIPAddressInLocationHistory() {
        return checkIPAddressInLocationHistory;
    }


    /**
     * Sets the checkIPAddressInLocationHistory value for this UserSpecParms.
     * 
     * @param checkIPAddressInLocationHistory
     */
    public void setCheckIPAddressInLocationHistory(java.lang.Boolean checkIPAddressInLocationHistory) {
        this.checkIPAddressInLocationHistory = checkIPAddressInLocationHistory;
    }


    /**
     * Gets the maxLocationHistorySize value for this UserSpecParms.
     * 
     * @return maxLocationHistorySize
     */
    public java.lang.Integer getMaxLocationHistorySize() {
        return maxLocationHistorySize;
    }


    /**
     * Sets the maxLocationHistorySize value for this UserSpecParms.
     * 
     * @param maxLocationHistorySize
     */
    public void setMaxLocationHistorySize(java.lang.Integer maxLocationHistorySize) {
        this.maxLocationHistorySize = maxLocationHistorySize;
    }


    /**
     * Gets the locationHistoryLifetime value for this UserSpecParms.
     * 
     * @return locationHistoryLifetime
     */
    public java.lang.Integer getLocationHistoryLifetime() {
        return locationHistoryLifetime;
    }


    /**
     * Sets the locationHistoryLifetime value for this UserSpecParms.
     * 
     * @param locationHistoryLifetime
     */
    public void setLocationHistoryLifetime(java.lang.Integer locationHistoryLifetime) {
        this.locationHistoryLifetime = locationHistoryLifetime;
    }


    /**
     * Gets the maxVelocity value for this UserSpecParms.
     * 
     * @return maxVelocity
     */
    public java.lang.Integer getMaxVelocity() {
        return maxVelocity;
    }


    /**
     * Sets the maxVelocity value for this UserSpecParms.
     * 
     * @param maxVelocity
     */
    public void setMaxVelocity(java.lang.Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
    }


    /**
     * Gets the checkVelocity value for this UserSpecParms.
     * 
     * @return checkVelocity
     */
    public java.lang.Boolean getCheckVelocity() {
        return checkVelocity;
    }


    /**
     * Sets the checkVelocity value for this UserSpecParms.
     * 
     * @param checkVelocity
     */
    public void setCheckVelocity(java.lang.Boolean checkVelocity) {
        this.checkVelocity = checkVelocity;
    }


    /**
     * Gets the countryBlacklist value for this UserSpecParms.
     * 
     * @return countryBlacklist
     */
    public java.lang.String[] getCountryBlacklist() {
        return countryBlacklist;
    }


    /**
     * Sets the countryBlacklist value for this UserSpecParms.
     * 
     * @param countryBlacklist
     */
    public void setCountryBlacklist(java.lang.String[] countryBlacklist) {
        this.countryBlacklist = countryBlacklist;
    }


    /**
     * Gets the addCountryBlacklist value for this UserSpecParms.
     * 
     * @return addCountryBlacklist
     */
    public java.lang.Boolean getAddCountryBlacklist() {
        return addCountryBlacklist;
    }


    /**
     * Sets the addCountryBlacklist value for this UserSpecParms.
     * 
     * @param addCountryBlacklist
     */
    public void setAddCountryBlacklist(java.lang.Boolean addCountryBlacklist) {
        this.addCountryBlacklist = addCountryBlacklist;
    }


    /**
     * Gets the removeCountryBlacklist value for this UserSpecParms.
     * 
     * @return removeCountryBlacklist
     */
    public java.lang.Boolean getRemoveCountryBlacklist() {
        return removeCountryBlacklist;
    }


    /**
     * Sets the removeCountryBlacklist value for this UserSpecParms.
     * 
     * @param removeCountryBlacklist
     */
    public void setRemoveCountryBlacklist(java.lang.Boolean removeCountryBlacklist) {
        this.removeCountryBlacklist = removeCountryBlacklist;
    }


    /**
     * Gets the expectedLocations value for this UserSpecParms.
     * 
     * @return expectedLocations
     */
    public wsdl.adminV8.ig.com.entrust.ExpectedLocation[] getExpectedLocations() {
        return expectedLocations;
    }


    /**
     * Sets the expectedLocations value for this UserSpecParms.
     * 
     * @param expectedLocations
     */
    public void setExpectedLocations(wsdl.adminV8.ig.com.entrust.ExpectedLocation[] expectedLocations) {
        this.expectedLocations = expectedLocations;
    }


    /**
     * Gets the addExpectedLocations value for this UserSpecParms.
     * 
     * @return addExpectedLocations
     */
    public java.lang.Boolean getAddExpectedLocations() {
        return addExpectedLocations;
    }


    /**
     * Sets the addExpectedLocations value for this UserSpecParms.
     * 
     * @param addExpectedLocations
     */
    public void setAddExpectedLocations(java.lang.Boolean addExpectedLocations) {
        this.addExpectedLocations = addExpectedLocations;
    }


    /**
     * Gets the removeExpectedLocations value for this UserSpecParms.
     * 
     * @return removeExpectedLocations
     */
    public java.lang.Boolean getRemoveExpectedLocations() {
        return removeExpectedLocations;
    }


    /**
     * Sets the removeExpectedLocations value for this UserSpecParms.
     * 
     * @param removeExpectedLocations
     */
    public void setRemoveExpectedLocations(java.lang.Boolean removeExpectedLocations) {
        this.removeExpectedLocations = removeExpectedLocations;
    }


    /**
     * Gets the maxUserExpectedLocationsSize value for this UserSpecParms.
     * 
     * @return maxUserExpectedLocationsSize
     */
    public java.lang.Integer getMaxUserExpectedLocationsSize() {
        return maxUserExpectedLocationsSize;
    }


    /**
     * Sets the maxUserExpectedLocationsSize value for this UserSpecParms.
     * 
     * @param maxUserExpectedLocationsSize
     */
    public void setMaxUserExpectedLocationsSize(java.lang.Integer maxUserExpectedLocationsSize) {
        this.maxUserExpectedLocationsSize = maxUserExpectedLocationsSize;
    }


    /**
     * Gets the normalRejectAdd value for this UserSpecParms.
     * 
     * @return normalRejectAdd
     */
    public java.lang.Boolean getNormalRejectAdd() {
        return normalRejectAdd;
    }


    /**
     * Sets the normalRejectAdd value for this UserSpecParms.
     * 
     * @param normalRejectAdd
     */
    public void setNormalRejectAdd(java.lang.Boolean normalRejectAdd) {
        this.normalRejectAdd = normalRejectAdd;
    }


    /**
     * Gets the normalRejectRemove value for this UserSpecParms.
     * 
     * @return normalRejectRemove
     */
    public java.lang.Boolean getNormalRejectRemove() {
        return normalRejectRemove;
    }


    /**
     * Sets the normalRejectRemove value for this UserSpecParms.
     * 
     * @param normalRejectRemove
     */
    public void setNormalRejectRemove(java.lang.Boolean normalRejectRemove) {
        this.normalRejectRemove = normalRejectRemove;
    }


    /**
     * Gets the normalReject value for this UserSpecParms.
     * 
     * @return normalReject
     */
    public wsdl.adminV8.ig.com.entrust.RBAExpressionList getNormalReject() {
        return normalReject;
    }


    /**
     * Sets the normalReject value for this UserSpecParms.
     * 
     * @param normalReject
     */
    public void setNormalReject(wsdl.adminV8.ig.com.entrust.RBAExpressionList normalReject) {
        this.normalReject = normalReject;
    }


    /**
     * Gets the normalAuthenticatedAdd value for this UserSpecParms.
     * 
     * @return normalAuthenticatedAdd
     */
    public java.lang.Boolean getNormalAuthenticatedAdd() {
        return normalAuthenticatedAdd;
    }


    /**
     * Sets the normalAuthenticatedAdd value for this UserSpecParms.
     * 
     * @param normalAuthenticatedAdd
     */
    public void setNormalAuthenticatedAdd(java.lang.Boolean normalAuthenticatedAdd) {
        this.normalAuthenticatedAdd = normalAuthenticatedAdd;
    }


    /**
     * Gets the normalAuthenticatedRemove value for this UserSpecParms.
     * 
     * @return normalAuthenticatedRemove
     */
    public java.lang.Boolean getNormalAuthenticatedRemove() {
        return normalAuthenticatedRemove;
    }


    /**
     * Sets the normalAuthenticatedRemove value for this UserSpecParms.
     * 
     * @param normalAuthenticatedRemove
     */
    public void setNormalAuthenticatedRemove(java.lang.Boolean normalAuthenticatedRemove) {
        this.normalAuthenticatedRemove = normalAuthenticatedRemove;
    }


    /**
     * Gets the normalAuthenticated value for this UserSpecParms.
     * 
     * @return normalAuthenticated
     */
    public wsdl.adminV8.ig.com.entrust.RBAExpressionList getNormalAuthenticated() {
        return normalAuthenticated;
    }


    /**
     * Sets the normalAuthenticated value for this UserSpecParms.
     * 
     * @param normalAuthenticated
     */
    public void setNormalAuthenticated(wsdl.adminV8.ig.com.entrust.RBAExpressionList normalAuthenticated) {
        this.normalAuthenticated = normalAuthenticated;
    }


    /**
     * Gets the enhancedRejectAdd value for this UserSpecParms.
     * 
     * @return enhancedRejectAdd
     */
    public java.lang.Boolean getEnhancedRejectAdd() {
        return enhancedRejectAdd;
    }


    /**
     * Sets the enhancedRejectAdd value for this UserSpecParms.
     * 
     * @param enhancedRejectAdd
     */
    public void setEnhancedRejectAdd(java.lang.Boolean enhancedRejectAdd) {
        this.enhancedRejectAdd = enhancedRejectAdd;
    }


    /**
     * Gets the enhancedRejectRemove value for this UserSpecParms.
     * 
     * @return enhancedRejectRemove
     */
    public java.lang.Boolean getEnhancedRejectRemove() {
        return enhancedRejectRemove;
    }


    /**
     * Sets the enhancedRejectRemove value for this UserSpecParms.
     * 
     * @param enhancedRejectRemove
     */
    public void setEnhancedRejectRemove(java.lang.Boolean enhancedRejectRemove) {
        this.enhancedRejectRemove = enhancedRejectRemove;
    }


    /**
     * Gets the enhancedReject value for this UserSpecParms.
     * 
     * @return enhancedReject
     */
    public wsdl.adminV8.ig.com.entrust.RBAExpressionList getEnhancedReject() {
        return enhancedReject;
    }


    /**
     * Sets the enhancedReject value for this UserSpecParms.
     * 
     * @param enhancedReject
     */
    public void setEnhancedReject(wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedReject) {
        this.enhancedReject = enhancedReject;
    }


    /**
     * Gets the enhancedAuthenticatedAdd value for this UserSpecParms.
     * 
     * @return enhancedAuthenticatedAdd
     */
    public java.lang.Boolean getEnhancedAuthenticatedAdd() {
        return enhancedAuthenticatedAdd;
    }


    /**
     * Sets the enhancedAuthenticatedAdd value for this UserSpecParms.
     * 
     * @param enhancedAuthenticatedAdd
     */
    public void setEnhancedAuthenticatedAdd(java.lang.Boolean enhancedAuthenticatedAdd) {
        this.enhancedAuthenticatedAdd = enhancedAuthenticatedAdd;
    }


    /**
     * Gets the enhancedAuthenticatedRemove value for this UserSpecParms.
     * 
     * @return enhancedAuthenticatedRemove
     */
    public java.lang.Boolean getEnhancedAuthenticatedRemove() {
        return enhancedAuthenticatedRemove;
    }


    /**
     * Sets the enhancedAuthenticatedRemove value for this UserSpecParms.
     * 
     * @param enhancedAuthenticatedRemove
     */
    public void setEnhancedAuthenticatedRemove(java.lang.Boolean enhancedAuthenticatedRemove) {
        this.enhancedAuthenticatedRemove = enhancedAuthenticatedRemove;
    }


    /**
     * Gets the enhancedAuthenticated value for this UserSpecParms.
     * 
     * @return enhancedAuthenticated
     */
    public wsdl.adminV8.ig.com.entrust.RBAExpressionList getEnhancedAuthenticated() {
        return enhancedAuthenticated;
    }


    /**
     * Sets the enhancedAuthenticated value for this UserSpecParms.
     * 
     * @param enhancedAuthenticated
     */
    public void setEnhancedAuthenticated(wsdl.adminV8.ig.com.entrust.RBAExpressionList enhancedAuthenticated) {
        this.enhancedAuthenticated = enhancedAuthenticated;
    }


    /**
     * Gets the externalRiskScorePass value for this UserSpecParms.
     * 
     * @return externalRiskScorePass
     */
    public java.lang.Integer getExternalRiskScorePass() {
        return externalRiskScorePass;
    }


    /**
     * Sets the externalRiskScorePass value for this UserSpecParms.
     * 
     * @param externalRiskScorePass
     */
    public void setExternalRiskScorePass(java.lang.Integer externalRiskScorePass) {
        this.externalRiskScorePass = externalRiskScorePass;
    }


    /**
     * Gets the externalRiskScoreFail value for this UserSpecParms.
     * 
     * @return externalRiskScoreFail
     */
    public java.lang.Integer getExternalRiskScoreFail() {
        return externalRiskScoreFail;
    }


    /**
     * Sets the externalRiskScoreFail value for this UserSpecParms.
     * 
     * @param externalRiskScoreFail
     */
    public void setExternalRiskScoreFail(java.lang.Integer externalRiskScoreFail) {
        this.externalRiskScoreFail = externalRiskScoreFail;
    }


    /**
     * Gets the performTransactionDelivery value for this UserSpecParms.
     * 
     * @return performTransactionDelivery
     */
    public java.lang.Boolean getPerformTransactionDelivery() {
        return performTransactionDelivery;
    }


    /**
     * Sets the performTransactionDelivery value for this UserSpecParms.
     * 
     * @param performTransactionDelivery
     */
    public void setPerformTransactionDelivery(java.lang.Boolean performTransactionDelivery) {
        this.performTransactionDelivery = performTransactionDelivery;
    }


    /**
     * Gets the softTokenPINRequired value for this UserSpecParms.
     * 
     * @return softTokenPINRequired
     */
    public java.lang.Boolean getSoftTokenPINRequired() {
        return softTokenPINRequired;
    }


    /**
     * Sets the softTokenPINRequired value for this UserSpecParms.
     * 
     * @param softTokenPINRequired
     */
    public void setSoftTokenPINRequired(java.lang.Boolean softTokenPINRequired) {
        this.softTokenPINRequired = softTokenPINRequired;
    }


    /**
     * Gets the softTokenOTPLength value for this UserSpecParms.
     * 
     * @return softTokenOTPLength
     */
    public java.lang.Integer getSoftTokenOTPLength() {
        return softTokenOTPLength;
    }


    /**
     * Sets the softTokenOTPLength value for this UserSpecParms.
     * 
     * @param softTokenOTPLength
     */
    public void setSoftTokenOTPLength(java.lang.Integer softTokenOTPLength) {
        this.softTokenOTPLength = softTokenOTPLength;
    }


    /**
     * Gets the comment value for this UserSpecParms.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserSpecParms.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSpecParms)) return false;
        UserSpecParms other = (UserSpecParms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxAliases==null && other.getMaxAliases()==null) || 
             (this.maxAliases!=null &&
              this.maxAliases.equals(other.getMaxAliases()))) &&
            ((this.maxContactInfoNumber==null && other.getMaxContactInfoNumber()==null) || 
             (this.maxContactInfoNumber!=null &&
              this.maxContactInfoNumber.equals(other.getMaxContactInfoNumber()))) &&
            ((this.lockoutMode==null && other.getLockoutMode()==null) || 
             (this.lockoutMode!=null &&
              this.lockoutMode.equals(other.getLockoutMode()))) &&
            ((this.maxFailures==null && other.getMaxFailures()==null) || 
             (this.maxFailures!=null &&
              this.maxFailures.equals(other.getMaxFailures()))) &&
            ((this.maxGlobalFailures==null && other.getMaxGlobalFailures()==null) || 
             (this.maxGlobalFailures!=null &&
              this.maxGlobalFailures.equals(other.getMaxGlobalFailures()))) &&
            ((this.maxCertificateFailures==null && other.getMaxCertificateFailures()==null) || 
             (this.maxCertificateFailures!=null &&
              this.maxCertificateFailures.equals(other.getMaxCertificateFailures()))) &&
            ((this.maxExternalFailures==null && other.getMaxExternalFailures()==null) || 
             (this.maxExternalFailures!=null &&
              this.maxExternalFailures.equals(other.getMaxExternalFailures()))) &&
            ((this.maxGridFailures==null && other.getMaxGridFailures()==null) || 
             (this.maxGridFailures!=null &&
              this.maxGridFailures.equals(other.getMaxGridFailures()))) &&
            ((this.maxTokenCRFailures==null && other.getMaxTokenCRFailures()==null) || 
             (this.maxTokenCRFailures!=null &&
              this.maxTokenCRFailures.equals(other.getMaxTokenCRFailures()))) &&
            ((this.maxTokenROFailures==null && other.getMaxTokenROFailures()==null) || 
             (this.maxTokenROFailures!=null &&
              this.maxTokenROFailures.equals(other.getMaxTokenROFailures()))) &&
            ((this.maxOTPFailures==null && other.getMaxOTPFailures()==null) || 
             (this.maxOTPFailures!=null &&
              this.maxOTPFailures.equals(other.getMaxOTPFailures()))) &&
            ((this.maxPasswordFailures==null && other.getMaxPasswordFailures()==null) || 
             (this.maxPasswordFailures!=null &&
              this.maxPasswordFailures.equals(other.getMaxPasswordFailures()))) &&
            ((this.maxQAFailures==null && other.getMaxQAFailures()==null) || 
             (this.maxQAFailures!=null &&
              this.maxQAFailures.equals(other.getMaxQAFailures()))) &&
            ((this.maxRBAIPAuthFailures==null && other.getMaxRBAIPAuthFailures()==null) || 
             (this.maxRBAIPAuthFailures!=null &&
              this.maxRBAIPAuthFailures.equals(other.getMaxRBAIPAuthFailures()))) &&
            ((this.maxRBAMachineAuthFailures==null && other.getMaxRBAMachineAuthFailures()==null) || 
             (this.maxRBAMachineAuthFailures!=null &&
              this.maxRBAMachineAuthFailures.equals(other.getMaxRBAMachineAuthFailures()))) &&
            ((this.maxRBACertificateAuthFailures==null && other.getMaxRBACertificateAuthFailures()==null) || 
             (this.maxRBACertificateAuthFailures!=null &&
              this.maxRBACertificateAuthFailures.equals(other.getMaxRBACertificateAuthFailures()))) &&
            ((this.lockoutTime==null && other.getLockoutTime()==null) || 
             (this.lockoutTime!=null &&
              this.lockoutTime.equals(other.getLockoutTime()))) &&
            ((this.maxSecretSize==null && other.getMaxSecretSize()==null) || 
             (this.maxSecretSize!=null &&
              this.maxSecretSize.equals(other.getMaxSecretSize()))) &&
            ((this.maxSecretNumber==null && other.getMaxSecretNumber()==null) || 
             (this.maxSecretNumber!=null &&
              this.maxSecretNumber.equals(other.getMaxSecretNumber()))) &&
            ((this.genericAuthType==null && other.getGenericAuthType()==null) || 
             (this.genericAuthType!=null &&
              java.util.Arrays.equals(this.genericAuthType, other.getGenericAuthType()))) &&
            ((this.enhancedGenericAuthType==null && other.getEnhancedGenericAuthType()==null) || 
             (this.enhancedGenericAuthType!=null &&
              java.util.Arrays.equals(this.enhancedGenericAuthType, other.getEnhancedGenericAuthType()))) &&
            ((this.machineAuthType==null && other.getMachineAuthType()==null) || 
             (this.machineAuthType!=null &&
              java.util.Arrays.equals(this.machineAuthType, other.getMachineAuthType()))) &&
            ((this.authTypeCanViewSecrets==null && other.getAuthTypeCanViewSecrets()==null) || 
             (this.authTypeCanViewSecrets!=null &&
              java.util.Arrays.equals(this.authTypeCanViewSecrets, other.getAuthTypeCanViewSecrets()))) &&
            ((this.authTypeCanModifySecrets==null && other.getAuthTypeCanModifySecrets()==null) || 
             (this.authTypeCanModifySecrets!=null &&
              java.util.Arrays.equals(this.authTypeCanModifySecrets, other.getAuthTypeCanModifySecrets()))) &&
            ((this.maxMachineSecrets==null && other.getMaxMachineSecrets()==null) || 
             (this.maxMachineSecrets!=null &&
              this.maxMachineSecrets.equals(other.getMaxMachineSecrets()))) &&
            ((this.maxMachineSecretsSize==null && other.getMaxMachineSecretsSize()==null) || 
             (this.maxMachineSecretsSize!=null &&
              this.maxMachineSecretsSize.equals(other.getMaxMachineSecretsSize()))) &&
            ((this.machineSecretRequiresMachineNonce==null && other.getMachineSecretRequiresMachineNonce()==null) || 
             (this.machineSecretRequiresMachineNonce!=null &&
              this.machineSecretRequiresMachineNonce.equals(other.getMachineSecretRequiresMachineNonce()))) &&
            ((this.machineSecretRequiresSequenceNonce==null && other.getMachineSecretRequiresSequenceNonce()==null) || 
             (this.machineSecretRequiresSequenceNonce!=null &&
              this.machineSecretRequiresSequenceNonce.equals(other.getMachineSecretRequiresSequenceNonce()))) &&
            ((this.machineSecretRequiresAppData==null && other.getMachineSecretRequiresAppData()==null) || 
             (this.machineSecretRequiresAppData!=null &&
              this.machineSecretRequiresAppData.equals(other.getMachineSecretRequiresAppData()))) &&
            ((this.machineSecretAllowsBadAppData==null && other.getMachineSecretAllowsBadAppData()==null) || 
             (this.machineSecretAllowsBadAppData!=null &&
              this.machineSecretAllowsBadAppData.equals(other.getMachineSecretAllowsBadAppData()))) &&
            ((this.machineSecretLifetime==null && other.getMachineSecretLifetime()==null) || 
             (this.machineSecretLifetime!=null &&
              this.machineSecretLifetime.equals(other.getMachineSecretLifetime()))) &&
            ((this.failedMachineAuthIncrementsLockout==null && other.getFailedMachineAuthIncrementsLockout()==null) || 
             (this.failedMachineAuthIncrementsLockout!=null &&
              this.failedMachineAuthIncrementsLockout.equals(other.getFailedMachineAuthIncrementsLockout()))) &&
            ((this.maxAuthSecrets==null && other.getMaxAuthSecrets()==null) || 
             (this.maxAuthSecrets!=null &&
              this.maxAuthSecrets.equals(other.getMaxAuthSecrets()))) &&
            ((this.maxAuthSecretsSize==null && other.getMaxAuthSecretsSize()==null) || 
             (this.maxAuthSecretsSize!=null &&
              this.maxAuthSecretsSize.equals(other.getMaxAuthSecretsSize()))) &&
            ((this.maxQuestions==null && other.getMaxQuestions()==null) || 
             (this.maxQuestions!=null &&
              this.maxQuestions.equals(other.getMaxQuestions()))) &&
            ((this.maxQASize==null && other.getMaxQASize()==null) || 
             (this.maxQASize!=null &&
              this.maxQASize.equals(other.getMaxQASize()))) &&
            ((this.QAChallengeSize==null && other.getQAChallengeSize()==null) || 
             (this.QAChallengeSize!=null &&
              this.QAChallengeSize.equals(other.getQAChallengeSize()))) &&
            ((this.minQAChallengeSize==null && other.getMinQAChallengeSize()==null) || 
             (this.minQAChallengeSize!=null &&
              this.minQAChallengeSize.equals(other.getMinQAChallengeSize()))) &&
            ((this.maxQAChallengeSize==null && other.getMaxQAChallengeSize()==null) || 
             (this.maxQAChallengeSize!=null &&
              this.maxQAChallengeSize.equals(other.getMaxQAChallengeSize()))) &&
            ((this.disableQAChallengeRetention==null && other.getDisableQAChallengeRetention()==null) || 
             (this.disableQAChallengeRetention!=null &&
              this.disableQAChallengeRetention.equals(other.getDisableQAChallengeRetention()))) &&
            ((this.QAChallengeLifetime==null && other.getQAChallengeLifetime()==null) || 
             (this.QAChallengeLifetime!=null &&
              this.QAChallengeLifetime.equals(other.getQAChallengeLifetime()))) &&
            ((this.updateLockoutForReplacedQAChallenge==null && other.getUpdateLockoutForReplacedQAChallenge()==null) || 
             (this.updateLockoutForReplacedQAChallenge!=null &&
              this.updateLockoutForReplacedQAChallenge.equals(other.getUpdateLockoutForReplacedQAChallenge()))) &&
            ((this.qaDefaultWrongAnswersAllowed==null && other.getQaDefaultWrongAnswersAllowed()==null) || 
             (this.qaDefaultWrongAnswersAllowed!=null &&
              this.qaDefaultWrongAnswersAllowed.equals(other.getQaDefaultWrongAnswersAllowed()))) &&
            ((this.qaMaximumWrongAnswersAllowed==null && other.getQaMaximumWrongAnswersAllowed()==null) || 
             (this.qaMaximumWrongAnswersAllowed!=null &&
              this.qaMaximumWrongAnswersAllowed.equals(other.getQaMaximumWrongAnswersAllowed()))) &&
            ((this.qaInexactMatchAllowed==null && other.getQaInexactMatchAllowed()==null) || 
             (this.qaInexactMatchAllowed!=null &&
              this.qaInexactMatchAllowed.equals(other.getQaInexactMatchAllowed()))) &&
            ((this.OTPCellAlphabet==null && other.getOTPCellAlphabet()==null) || 
             (this.OTPCellAlphabet!=null &&
              java.util.Arrays.equals(this.OTPCellAlphabet, other.getOTPCellAlphabet()))) &&
            ((this.OTPCellReplacements==null && other.getOTPCellReplacements()==null) || 
             (this.OTPCellReplacements!=null &&
              java.util.Arrays.equals(this.OTPCellReplacements, other.getOTPCellReplacements()))) &&
            ((this.OTPLifetime==null && other.getOTPLifetime()==null) || 
             (this.OTPLifetime!=null &&
              this.OTPLifetime.equals(other.getOTPLifetime()))) &&
            ((this.OTPLength==null && other.getOTPLength()==null) || 
             (this.OTPLength!=null &&
              this.OTPLength.equals(other.getOTPLength()))) &&
            ((this.OTPDeliveryEnabled==null && other.getOTPDeliveryEnabled()==null) || 
             (this.OTPDeliveryEnabled!=null &&
              this.OTPDeliveryEnabled.equals(other.getOTPDeliveryEnabled()))) &&
            ((this.OTPAlwaysGenerate==null && other.getOTPAlwaysGenerate()==null) || 
             (this.OTPAlwaysGenerate!=null &&
              this.OTPAlwaysGenerate.equals(other.getOTPAlwaysGenerate()))) &&
            ((this.OTPDynamicRefresh==null && other.getOTPDynamicRefresh()==null) || 
             (this.OTPDynamicRefresh!=null &&
              this.OTPDynamicRefresh.equals(other.getOTPDynamicRefresh()))) &&
            ((this.OTPNumberOutstanding==null && other.getOTPNumberOutstanding()==null) || 
             (this.OTPNumberOutstanding!=null &&
              this.OTPNumberOutstanding.equals(other.getOTPNumberOutstanding()))) &&
            ((this.OTPRefreshThreshold==null && other.getOTPRefreshThreshold()==null) || 
             (this.OTPRefreshThreshold!=null &&
              this.OTPRefreshThreshold.equals(other.getOTPRefreshThreshold()))) &&
            ((this.returnAuthSecretWithChall==null && other.getReturnAuthSecretWithChall()==null) || 
             (this.returnAuthSecretWithChall!=null &&
              this.returnAuthSecretWithChall.equals(other.getReturnAuthSecretWithChall()))) &&
            ((this.autoUnassignTokens==null && other.getAutoUnassignTokens()==null) || 
             (this.autoUnassignTokens!=null &&
              this.autoUnassignTokens.equals(other.getAutoUnassignTokens()))) &&
            ((this.autoMoveTokens==null && other.getAutoMoveTokens()==null) || 
             (this.autoMoveTokens!=null &&
              this.autoMoveTokens.equals(other.getAutoMoveTokens()))) &&
            ((this.disableTokenChallengeRetention==null && other.getDisableTokenChallengeRetention()==null) || 
             (this.disableTokenChallengeRetention!=null &&
              this.disableTokenChallengeRetention.equals(other.getDisableTokenChallengeRetention()))) &&
            ((this.tokenChallengeLifetime==null && other.getTokenChallengeLifetime()==null) || 
             (this.tokenChallengeLifetime!=null &&
              this.tokenChallengeLifetime.equals(other.getTokenChallengeLifetime()))) &&
            ((this.updateLockoutForReplacedTokenChallenge==null && other.getUpdateLockoutForReplacedTokenChallenge()==null) || 
             (this.updateLockoutForReplacedTokenChallenge!=null &&
              this.updateLockoutForReplacedTokenChallenge.equals(other.getUpdateLockoutForReplacedTokenChallenge()))) &&
            ((this.maxAllowedTokenSets==null && other.getMaxAllowedTokenSets()==null) || 
             (this.maxAllowedTokenSets!=null &&
              this.maxAllowedTokenSets.equals(other.getMaxAllowedTokenSets()))) &&
            ((this.allowNONEAuthentication==null && other.getAllowNONEAuthentication()==null) || 
             (this.allowNONEAuthentication!=null &&
              this.allowNONEAuthentication.equals(other.getAllowNONEAuthentication()))) &&
            ((this.considerTempPINLast==null && other.getConsiderTempPINLast()==null) || 
             (this.considerTempPINLast!=null &&
              this.considerTempPINLast.equals(other.getConsiderTempPINLast()))) &&
            ((this.storeLastAuthInfo==null && other.getStoreLastAuthInfo()==null) || 
             (this.storeLastAuthInfo!=null &&
              this.storeLastAuthInfo.equals(other.getStoreLastAuthInfo()))) &&
            ((this.allowCreateIfDisabledInRepository==null && other.getAllowCreateIfDisabledInRepository()==null) || 
             (this.allowCreateIfDisabledInRepository!=null &&
              this.allowCreateIfDisabledInRepository.equals(other.getAllowCreateIfDisabledInRepository()))) &&
            ((this.allowCreateIfExpiredInRepository==null && other.getAllowCreateIfExpiredInRepository()==null) || 
             (this.allowCreateIfExpiredInRepository!=null &&
              this.allowCreateIfExpiredInRepository.equals(other.getAllowCreateIfExpiredInRepository()))) &&
            ((this.allowAuthIfDisabledInRepository==null && other.getAllowAuthIfDisabledInRepository()==null) || 
             (this.allowAuthIfDisabledInRepository!=null &&
              this.allowAuthIfDisabledInRepository.equals(other.getAllowAuthIfDisabledInRepository()))) &&
            ((this.allowAuthIfExpiredInRepository==null && other.getAllowAuthIfExpiredInRepository()==null) || 
             (this.allowAuthIfExpiredInRepository!=null &&
              this.allowAuthIfExpiredInRepository.equals(other.getAllowAuthIfExpiredInRepository()))) &&
            ((this.transactionSignatureType==null && other.getTransactionSignatureType()==null) || 
             (this.transactionSignatureType!=null &&
              this.transactionSignatureType.equals(other.getTransactionSignatureType()))) &&
            ((this.transactionLifetime==null && other.getTransactionLifetime()==null) || 
             (this.transactionLifetime!=null &&
              this.transactionLifetime.equals(other.getTransactionLifetime()))) &&
            ((this.maxNumTransactionDetails==null && other.getMaxNumTransactionDetails()==null) || 
             (this.maxNumTransactionDetails!=null &&
              this.maxNumTransactionDetails.equals(other.getMaxNumTransactionDetails()))) &&
            ((this.allowSelfSignedUserCert==null && other.getAllowSelfSignedUserCert()==null) || 
             (this.allowSelfSignedUserCert!=null &&
              this.allowSelfSignedUserCert.equals(other.getAllowSelfSignedUserCert()))) &&
            ((this.allowCertNotIssuedByRegisteredCA==null && other.getAllowCertNotIssuedByRegisteredCA()==null) || 
             (this.allowCertNotIssuedByRegisteredCA!=null &&
              this.allowCertNotIssuedByRegisteredCA.equals(other.getAllowCertNotIssuedByRegisteredCA()))) &&
            ((this.allowAllRegisteredCAs==null && other.getAllowAllRegisteredCAs()==null) || 
             (this.allowAllRegisteredCAs!=null &&
              this.allowAllRegisteredCAs.equals(other.getAllowAllRegisteredCAs()))) &&
            ((this.addAllowedRegisteredCAs==null && other.getAddAllowedRegisteredCAs()==null) || 
             (this.addAllowedRegisteredCAs!=null &&
              this.addAllowedRegisteredCAs.equals(other.getAddAllowedRegisteredCAs()))) &&
            ((this.removeAllowedRegisteredCAs==null && other.getRemoveAllowedRegisteredCAs()==null) || 
             (this.removeAllowedRegisteredCAs!=null &&
              this.removeAllowedRegisteredCAs.equals(other.getRemoveAllowedRegisteredCAs()))) &&
            ((this.allowedRegisteredCAs==null && other.getAllowedRegisteredCAs()==null) || 
             (this.allowedRegisteredCAs!=null &&
              java.util.Arrays.equals(this.allowedRegisteredCAs, other.getAllowedRegisteredCAs()))) &&
            ((this.certificateAuthenticationHashAlg==null && other.getCertificateAuthenticationHashAlg()==null) || 
             (this.certificateAuthenticationHashAlg!=null &&
              this.certificateAuthenticationHashAlg.equals(other.getCertificateAuthenticationHashAlg()))) &&
            ((this.certificateAuthenticationChallengeSize==null && other.getCertificateAuthenticationChallengeSize()==null) || 
             (this.certificateAuthenticationChallengeSize!=null &&
              this.certificateAuthenticationChallengeSize.equals(other.getCertificateAuthenticationChallengeSize()))) &&
            ((this.maxCertsPerUser==null && other.getMaxCertsPerUser()==null) || 
             (this.maxCertsPerUser!=null &&
              this.maxCertsPerUser.equals(other.getMaxCertsPerUser()))) &&
            ((this.autoDeleteUserCerts==null && other.getAutoDeleteUserCerts()==null) || 
             (this.autoDeleteUserCerts!=null &&
              this.autoDeleteUserCerts.equals(other.getAutoDeleteUserCerts()))) &&
            ((this.disableCertificateChallengeRetention==null && other.getDisableCertificateChallengeRetention()==null) || 
             (this.disableCertificateChallengeRetention!=null &&
              this.disableCertificateChallengeRetention.equals(other.getDisableCertificateChallengeRetention()))) &&
            ((this.certificateChallengeLifetime==null && other.getCertificateChallengeLifetime()==null) || 
             (this.certificateChallengeLifetime!=null &&
              this.certificateChallengeLifetime.equals(other.getCertificateChallengeLifetime()))) &&
            ((this.updateLockoutForReplacedCertificateChallenge==null && other.getUpdateLockoutForReplacedCertificateChallenge()==null) || 
             (this.updateLockoutForReplacedCertificateChallenge!=null &&
              this.updateLockoutForReplacedCertificateChallenge.equals(other.getUpdateLockoutForReplacedCertificateChallenge()))) &&
            ((this.allowAllSmartCredentialDefinitions==null && other.getAllowAllSmartCredentialDefinitions()==null) || 
             (this.allowAllSmartCredentialDefinitions!=null &&
              this.allowAllSmartCredentialDefinitions.equals(other.getAllowAllSmartCredentialDefinitions()))) &&
            ((this.addAllowedSmartCredentialDefinitions==null && other.getAddAllowedSmartCredentialDefinitions()==null) || 
             (this.addAllowedSmartCredentialDefinitions!=null &&
              this.addAllowedSmartCredentialDefinitions.equals(other.getAddAllowedSmartCredentialDefinitions()))) &&
            ((this.removeAllowedSmartCredentialDefinitions==null && other.getRemoveAllowedSmartCredentialDefinitions()==null) || 
             (this.removeAllowedSmartCredentialDefinitions!=null &&
              this.removeAllowedSmartCredentialDefinitions.equals(other.getRemoveAllowedSmartCredentialDefinitions()))) &&
            ((this.allowedSmartCredentialDefinitions==null && other.getAllowedSmartCredentialDefinitions()==null) || 
             (this.allowedSmartCredentialDefinitions!=null &&
              java.util.Arrays.equals(this.allowedSmartCredentialDefinitions, other.getAllowedSmartCredentialDefinitions()))) &&
            ((this.maxSmartCredentialsPerUser==null && other.getMaxSmartCredentialsPerUser()==null) || 
             (this.maxSmartCredentialsPerUser!=null &&
              this.maxSmartCredentialsPerUser.equals(other.getMaxSmartCredentialsPerUser()))) &&
            ((this.smartCredentialIDPrefix==null && other.getSmartCredentialIDPrefix()==null) || 
             (this.smartCredentialIDPrefix!=null &&
              this.smartCredentialIDPrefix.equals(other.getSmartCredentialIDPrefix()))) &&
            ((this.smartCredentialTokenVendor==null && other.getSmartCredentialTokenVendor()==null) || 
             (this.smartCredentialTokenVendor!=null &&
              this.smartCredentialTokenVendor.equals(other.getSmartCredentialTokenVendor()))) &&
            ((this.autoUnassignSmartCredentials==null && other.getAutoUnassignSmartCredentials()==null) || 
             (this.autoUnassignSmartCredentials!=null &&
              this.autoUnassignSmartCredentials.equals(other.getAutoUnassignSmartCredentials()))) &&
            ((this.autoMoveSmartCredentials==null && other.getAutoMoveSmartCredentials()==null) || 
             (this.autoMoveSmartCredentials!=null &&
              this.autoMoveSmartCredentials.equals(other.getAutoMoveSmartCredentials()))) &&
            ((this.autoRegisterSmartCredentialsToPACS==null && other.getAutoRegisterSmartCredentialsToPACS()==null) || 
             (this.autoRegisterSmartCredentialsToPACS!=null &&
              this.autoRegisterSmartCredentialsToPACS.equals(other.getAutoRegisterSmartCredentialsToPACS()))) &&
            ((this.autoSuspendSmartCredentialsFromPACS==null && other.getAutoSuspendSmartCredentialsFromPACS()==null) || 
             (this.autoSuspendSmartCredentialsFromPACS!=null &&
              this.autoSuspendSmartCredentialsFromPACS.equals(other.getAutoSuspendSmartCredentialsFromPACS()))) &&
            ((this.allowSoftwareSmartCredentials==null && other.getAllowSoftwareSmartCredentials()==null) || 
             (this.allowSoftwareSmartCredentials!=null &&
              this.allowSoftwareSmartCredentials.equals(other.getAllowSoftwareSmartCredentials()))) &&
            ((this.allowAllDigitalIdConfigs==null && other.getAllowAllDigitalIdConfigs()==null) || 
             (this.allowAllDigitalIdConfigs!=null &&
              this.allowAllDigitalIdConfigs.equals(other.getAllowAllDigitalIdConfigs()))) &&
            ((this.addAllowedDigitalIdConfigs==null && other.getAddAllowedDigitalIdConfigs()==null) || 
             (this.addAllowedDigitalIdConfigs!=null &&
              this.addAllowedDigitalIdConfigs.equals(other.getAddAllowedDigitalIdConfigs()))) &&
            ((this.removeAllowedDigitalIdConfigs==null && other.getRemoveAllowedDigitalIdConfigs()==null) || 
             (this.removeAllowedDigitalIdConfigs!=null &&
              this.removeAllowedDigitalIdConfigs.equals(other.getRemoveAllowedDigitalIdConfigs()))) &&
            ((this.allowedDigitalIdConfigs==null && other.getAllowedDigitalIdConfigs()==null) || 
             (this.allowedDigitalIdConfigs!=null &&
              java.util.Arrays.equals(this.allowedDigitalIdConfigs, other.getAllowedDigitalIdConfigs()))) &&
            ((this.maxDigitalIdsPerUser==null && other.getMaxDigitalIdsPerUser()==null) || 
             (this.maxDigitalIdsPerUser!=null &&
              this.maxDigitalIdsPerUser.equals(other.getMaxDigitalIdsPerUser()))) &&
            ((this.maxClientTypesPerDigitalId==null && other.getMaxClientTypesPerDigitalId()==null) || 
             (this.maxClientTypesPerDigitalId!=null &&
              this.maxClientTypesPerDigitalId.equals(other.getMaxClientTypesPerDigitalId()))) &&
            ((this.autoCancelDigitalIds==null && other.getAutoCancelDigitalIds()==null) || 
             (this.autoCancelDigitalIds!=null &&
              this.autoCancelDigitalIds.equals(other.getAutoCancelDigitalIds()))) &&
            ((this.userRegistrationPasswordLifetime==null && other.getUserRegistrationPasswordLifetime()==null) || 
             (this.userRegistrationPasswordLifetime!=null &&
              this.userRegistrationPasswordLifetime.equals(other.getUserRegistrationPasswordLifetime()))) &&
            ((this.maxFederationsPerUser==null && other.getMaxFederationsPerUser()==null) || 
             (this.maxFederationsPerUser!=null &&
              this.maxFederationsPerUser.equals(other.getMaxFederationsPerUser()))) &&
            ((this.maxNumUserPreferences==null && other.getMaxNumUserPreferences()==null) || 
             (this.maxNumUserPreferences!=null &&
              this.maxNumUserPreferences.equals(other.getMaxNumUserPreferences()))) &&
            ((this.maxSizeUserPreference==null && other.getMaxSizeUserPreference()==null) || 
             (this.maxSizeUserPreference!=null &&
              this.maxSizeUserPreference.equals(other.getMaxSizeUserPreference()))) &&
            ((this.PVNLength==null && other.getPVNLength()==null) || 
             (this.PVNLength!=null &&
              this.PVNLength.equals(other.getPVNLength()))) &&
            ((this.PVNChangeRequiredOnAdminReset==null && other.getPVNChangeRequiredOnAdminReset()==null) || 
             (this.PVNChangeRequiredOnAdminReset!=null &&
              this.PVNChangeRequiredOnAdminReset.equals(other.getPVNChangeRequiredOnAdminReset()))) &&
            ((this.authTypesRequiringPVN==null && other.getAuthTypesRequiringPVN()==null) || 
             (this.authTypesRequiringPVN!=null &&
              java.util.Arrays.equals(this.authTypesRequiringPVN, other.getAuthTypesRequiringPVN()))) &&
            ((this.numDaysForActivation==null && other.getNumDaysForActivation()==null) || 
             (this.numDaysForActivation!=null &&
              this.numDaysForActivation.equals(other.getNumDaysForActivation()))) &&
            ((this.activationAuthTypes==null && other.getActivationAuthTypes()==null) || 
             (this.activationAuthTypes!=null &&
              java.util.Arrays.equals(this.activationAuthTypes, other.getActivationAuthTypes()))) &&
            ((this.checkIPAddressInLocationHistory==null && other.getCheckIPAddressInLocationHistory()==null) || 
             (this.checkIPAddressInLocationHistory!=null &&
              this.checkIPAddressInLocationHistory.equals(other.getCheckIPAddressInLocationHistory()))) &&
            ((this.maxLocationHistorySize==null && other.getMaxLocationHistorySize()==null) || 
             (this.maxLocationHistorySize!=null &&
              this.maxLocationHistorySize.equals(other.getMaxLocationHistorySize()))) &&
            ((this.locationHistoryLifetime==null && other.getLocationHistoryLifetime()==null) || 
             (this.locationHistoryLifetime!=null &&
              this.locationHistoryLifetime.equals(other.getLocationHistoryLifetime()))) &&
            ((this.maxVelocity==null && other.getMaxVelocity()==null) || 
             (this.maxVelocity!=null &&
              this.maxVelocity.equals(other.getMaxVelocity()))) &&
            ((this.checkVelocity==null && other.getCheckVelocity()==null) || 
             (this.checkVelocity!=null &&
              this.checkVelocity.equals(other.getCheckVelocity()))) &&
            ((this.countryBlacklist==null && other.getCountryBlacklist()==null) || 
             (this.countryBlacklist!=null &&
              java.util.Arrays.equals(this.countryBlacklist, other.getCountryBlacklist()))) &&
            ((this.addCountryBlacklist==null && other.getAddCountryBlacklist()==null) || 
             (this.addCountryBlacklist!=null &&
              this.addCountryBlacklist.equals(other.getAddCountryBlacklist()))) &&
            ((this.removeCountryBlacklist==null && other.getRemoveCountryBlacklist()==null) || 
             (this.removeCountryBlacklist!=null &&
              this.removeCountryBlacklist.equals(other.getRemoveCountryBlacklist()))) &&
            ((this.expectedLocations==null && other.getExpectedLocations()==null) || 
             (this.expectedLocations!=null &&
              java.util.Arrays.equals(this.expectedLocations, other.getExpectedLocations()))) &&
            ((this.addExpectedLocations==null && other.getAddExpectedLocations()==null) || 
             (this.addExpectedLocations!=null &&
              this.addExpectedLocations.equals(other.getAddExpectedLocations()))) &&
            ((this.removeExpectedLocations==null && other.getRemoveExpectedLocations()==null) || 
             (this.removeExpectedLocations!=null &&
              this.removeExpectedLocations.equals(other.getRemoveExpectedLocations()))) &&
            ((this.maxUserExpectedLocationsSize==null && other.getMaxUserExpectedLocationsSize()==null) || 
             (this.maxUserExpectedLocationsSize!=null &&
              this.maxUserExpectedLocationsSize.equals(other.getMaxUserExpectedLocationsSize()))) &&
            ((this.normalRejectAdd==null && other.getNormalRejectAdd()==null) || 
             (this.normalRejectAdd!=null &&
              this.normalRejectAdd.equals(other.getNormalRejectAdd()))) &&
            ((this.normalRejectRemove==null && other.getNormalRejectRemove()==null) || 
             (this.normalRejectRemove!=null &&
              this.normalRejectRemove.equals(other.getNormalRejectRemove()))) &&
            ((this.normalReject==null && other.getNormalReject()==null) || 
             (this.normalReject!=null &&
              this.normalReject.equals(other.getNormalReject()))) &&
            ((this.normalAuthenticatedAdd==null && other.getNormalAuthenticatedAdd()==null) || 
             (this.normalAuthenticatedAdd!=null &&
              this.normalAuthenticatedAdd.equals(other.getNormalAuthenticatedAdd()))) &&
            ((this.normalAuthenticatedRemove==null && other.getNormalAuthenticatedRemove()==null) || 
             (this.normalAuthenticatedRemove!=null &&
              this.normalAuthenticatedRemove.equals(other.getNormalAuthenticatedRemove()))) &&
            ((this.normalAuthenticated==null && other.getNormalAuthenticated()==null) || 
             (this.normalAuthenticated!=null &&
              this.normalAuthenticated.equals(other.getNormalAuthenticated()))) &&
            ((this.enhancedRejectAdd==null && other.getEnhancedRejectAdd()==null) || 
             (this.enhancedRejectAdd!=null &&
              this.enhancedRejectAdd.equals(other.getEnhancedRejectAdd()))) &&
            ((this.enhancedRejectRemove==null && other.getEnhancedRejectRemove()==null) || 
             (this.enhancedRejectRemove!=null &&
              this.enhancedRejectRemove.equals(other.getEnhancedRejectRemove()))) &&
            ((this.enhancedReject==null && other.getEnhancedReject()==null) || 
             (this.enhancedReject!=null &&
              this.enhancedReject.equals(other.getEnhancedReject()))) &&
            ((this.enhancedAuthenticatedAdd==null && other.getEnhancedAuthenticatedAdd()==null) || 
             (this.enhancedAuthenticatedAdd!=null &&
              this.enhancedAuthenticatedAdd.equals(other.getEnhancedAuthenticatedAdd()))) &&
            ((this.enhancedAuthenticatedRemove==null && other.getEnhancedAuthenticatedRemove()==null) || 
             (this.enhancedAuthenticatedRemove!=null &&
              this.enhancedAuthenticatedRemove.equals(other.getEnhancedAuthenticatedRemove()))) &&
            ((this.enhancedAuthenticated==null && other.getEnhancedAuthenticated()==null) || 
             (this.enhancedAuthenticated!=null &&
              this.enhancedAuthenticated.equals(other.getEnhancedAuthenticated()))) &&
            ((this.externalRiskScorePass==null && other.getExternalRiskScorePass()==null) || 
             (this.externalRiskScorePass!=null &&
              this.externalRiskScorePass.equals(other.getExternalRiskScorePass()))) &&
            ((this.externalRiskScoreFail==null && other.getExternalRiskScoreFail()==null) || 
             (this.externalRiskScoreFail!=null &&
              this.externalRiskScoreFail.equals(other.getExternalRiskScoreFail()))) &&
            ((this.performTransactionDelivery==null && other.getPerformTransactionDelivery()==null) || 
             (this.performTransactionDelivery!=null &&
              this.performTransactionDelivery.equals(other.getPerformTransactionDelivery()))) &&
            ((this.softTokenPINRequired==null && other.getSoftTokenPINRequired()==null) || 
             (this.softTokenPINRequired!=null &&
              this.softTokenPINRequired.equals(other.getSoftTokenPINRequired()))) &&
            ((this.softTokenOTPLength==null && other.getSoftTokenOTPLength()==null) || 
             (this.softTokenOTPLength!=null &&
              this.softTokenOTPLength.equals(other.getSoftTokenOTPLength()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMaxAliases() != null) {
            _hashCode += getMaxAliases().hashCode();
        }
        if (getMaxContactInfoNumber() != null) {
            _hashCode += getMaxContactInfoNumber().hashCode();
        }
        if (getLockoutMode() != null) {
            _hashCode += getLockoutMode().hashCode();
        }
        if (getMaxFailures() != null) {
            _hashCode += getMaxFailures().hashCode();
        }
        if (getMaxGlobalFailures() != null) {
            _hashCode += getMaxGlobalFailures().hashCode();
        }
        if (getMaxCertificateFailures() != null) {
            _hashCode += getMaxCertificateFailures().hashCode();
        }
        if (getMaxExternalFailures() != null) {
            _hashCode += getMaxExternalFailures().hashCode();
        }
        if (getMaxGridFailures() != null) {
            _hashCode += getMaxGridFailures().hashCode();
        }
        if (getMaxTokenCRFailures() != null) {
            _hashCode += getMaxTokenCRFailures().hashCode();
        }
        if (getMaxTokenROFailures() != null) {
            _hashCode += getMaxTokenROFailures().hashCode();
        }
        if (getMaxOTPFailures() != null) {
            _hashCode += getMaxOTPFailures().hashCode();
        }
        if (getMaxPasswordFailures() != null) {
            _hashCode += getMaxPasswordFailures().hashCode();
        }
        if (getMaxQAFailures() != null) {
            _hashCode += getMaxQAFailures().hashCode();
        }
        if (getMaxRBAIPAuthFailures() != null) {
            _hashCode += getMaxRBAIPAuthFailures().hashCode();
        }
        if (getMaxRBAMachineAuthFailures() != null) {
            _hashCode += getMaxRBAMachineAuthFailures().hashCode();
        }
        if (getMaxRBACertificateAuthFailures() != null) {
            _hashCode += getMaxRBACertificateAuthFailures().hashCode();
        }
        if (getLockoutTime() != null) {
            _hashCode += getLockoutTime().hashCode();
        }
        if (getMaxSecretSize() != null) {
            _hashCode += getMaxSecretSize().hashCode();
        }
        if (getMaxSecretNumber() != null) {
            _hashCode += getMaxSecretNumber().hashCode();
        }
        if (getGenericAuthType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGenericAuthType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGenericAuthType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnhancedGenericAuthType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnhancedGenericAuthType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnhancedGenericAuthType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMachineAuthType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMachineAuthType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMachineAuthType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthTypeCanViewSecrets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthTypeCanViewSecrets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthTypeCanViewSecrets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthTypeCanModifySecrets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthTypeCanModifySecrets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthTypeCanModifySecrets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxMachineSecrets() != null) {
            _hashCode += getMaxMachineSecrets().hashCode();
        }
        if (getMaxMachineSecretsSize() != null) {
            _hashCode += getMaxMachineSecretsSize().hashCode();
        }
        if (getMachineSecretRequiresMachineNonce() != null) {
            _hashCode += getMachineSecretRequiresMachineNonce().hashCode();
        }
        if (getMachineSecretRequiresSequenceNonce() != null) {
            _hashCode += getMachineSecretRequiresSequenceNonce().hashCode();
        }
        if (getMachineSecretRequiresAppData() != null) {
            _hashCode += getMachineSecretRequiresAppData().hashCode();
        }
        if (getMachineSecretAllowsBadAppData() != null) {
            _hashCode += getMachineSecretAllowsBadAppData().hashCode();
        }
        if (getMachineSecretLifetime() != null) {
            _hashCode += getMachineSecretLifetime().hashCode();
        }
        if (getFailedMachineAuthIncrementsLockout() != null) {
            _hashCode += getFailedMachineAuthIncrementsLockout().hashCode();
        }
        if (getMaxAuthSecrets() != null) {
            _hashCode += getMaxAuthSecrets().hashCode();
        }
        if (getMaxAuthSecretsSize() != null) {
            _hashCode += getMaxAuthSecretsSize().hashCode();
        }
        if (getMaxQuestions() != null) {
            _hashCode += getMaxQuestions().hashCode();
        }
        if (getMaxQASize() != null) {
            _hashCode += getMaxQASize().hashCode();
        }
        if (getQAChallengeSize() != null) {
            _hashCode += getQAChallengeSize().hashCode();
        }
        if (getMinQAChallengeSize() != null) {
            _hashCode += getMinQAChallengeSize().hashCode();
        }
        if (getMaxQAChallengeSize() != null) {
            _hashCode += getMaxQAChallengeSize().hashCode();
        }
        if (getDisableQAChallengeRetention() != null) {
            _hashCode += getDisableQAChallengeRetention().hashCode();
        }
        if (getQAChallengeLifetime() != null) {
            _hashCode += getQAChallengeLifetime().hashCode();
        }
        if (getUpdateLockoutForReplacedQAChallenge() != null) {
            _hashCode += getUpdateLockoutForReplacedQAChallenge().hashCode();
        }
        if (getQaDefaultWrongAnswersAllowed() != null) {
            _hashCode += getQaDefaultWrongAnswersAllowed().hashCode();
        }
        if (getQaMaximumWrongAnswersAllowed() != null) {
            _hashCode += getQaMaximumWrongAnswersAllowed().hashCode();
        }
        if (getQaInexactMatchAllowed() != null) {
            _hashCode += getQaInexactMatchAllowed().hashCode();
        }
        if (getOTPCellAlphabet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOTPCellAlphabet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOTPCellAlphabet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOTPCellReplacements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOTPCellReplacements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOTPCellReplacements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOTPLifetime() != null) {
            _hashCode += getOTPLifetime().hashCode();
        }
        if (getOTPLength() != null) {
            _hashCode += getOTPLength().hashCode();
        }
        if (getOTPDeliveryEnabled() != null) {
            _hashCode += getOTPDeliveryEnabled().hashCode();
        }
        if (getOTPAlwaysGenerate() != null) {
            _hashCode += getOTPAlwaysGenerate().hashCode();
        }
        if (getOTPDynamicRefresh() != null) {
            _hashCode += getOTPDynamicRefresh().hashCode();
        }
        if (getOTPNumberOutstanding() != null) {
            _hashCode += getOTPNumberOutstanding().hashCode();
        }
        if (getOTPRefreshThreshold() != null) {
            _hashCode += getOTPRefreshThreshold().hashCode();
        }
        if (getReturnAuthSecretWithChall() != null) {
            _hashCode += getReturnAuthSecretWithChall().hashCode();
        }
        if (getAutoUnassignTokens() != null) {
            _hashCode += getAutoUnassignTokens().hashCode();
        }
        if (getAutoMoveTokens() != null) {
            _hashCode += getAutoMoveTokens().hashCode();
        }
        if (getDisableTokenChallengeRetention() != null) {
            _hashCode += getDisableTokenChallengeRetention().hashCode();
        }
        if (getTokenChallengeLifetime() != null) {
            _hashCode += getTokenChallengeLifetime().hashCode();
        }
        if (getUpdateLockoutForReplacedTokenChallenge() != null) {
            _hashCode += getUpdateLockoutForReplacedTokenChallenge().hashCode();
        }
        if (getMaxAllowedTokenSets() != null) {
            _hashCode += getMaxAllowedTokenSets().hashCode();
        }
        if (getAllowNONEAuthentication() != null) {
            _hashCode += getAllowNONEAuthentication().hashCode();
        }
        if (getConsiderTempPINLast() != null) {
            _hashCode += getConsiderTempPINLast().hashCode();
        }
        if (getStoreLastAuthInfo() != null) {
            _hashCode += getStoreLastAuthInfo().hashCode();
        }
        if (getAllowCreateIfDisabledInRepository() != null) {
            _hashCode += getAllowCreateIfDisabledInRepository().hashCode();
        }
        if (getAllowCreateIfExpiredInRepository() != null) {
            _hashCode += getAllowCreateIfExpiredInRepository().hashCode();
        }
        if (getAllowAuthIfDisabledInRepository() != null) {
            _hashCode += getAllowAuthIfDisabledInRepository().hashCode();
        }
        if (getAllowAuthIfExpiredInRepository() != null) {
            _hashCode += getAllowAuthIfExpiredInRepository().hashCode();
        }
        if (getTransactionSignatureType() != null) {
            _hashCode += getTransactionSignatureType().hashCode();
        }
        if (getTransactionLifetime() != null) {
            _hashCode += getTransactionLifetime().hashCode();
        }
        if (getMaxNumTransactionDetails() != null) {
            _hashCode += getMaxNumTransactionDetails().hashCode();
        }
        if (getAllowSelfSignedUserCert() != null) {
            _hashCode += getAllowSelfSignedUserCert().hashCode();
        }
        if (getAllowCertNotIssuedByRegisteredCA() != null) {
            _hashCode += getAllowCertNotIssuedByRegisteredCA().hashCode();
        }
        if (getAllowAllRegisteredCAs() != null) {
            _hashCode += getAllowAllRegisteredCAs().hashCode();
        }
        if (getAddAllowedRegisteredCAs() != null) {
            _hashCode += getAddAllowedRegisteredCAs().hashCode();
        }
        if (getRemoveAllowedRegisteredCAs() != null) {
            _hashCode += getRemoveAllowedRegisteredCAs().hashCode();
        }
        if (getAllowedRegisteredCAs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedRegisteredCAs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedRegisteredCAs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificateAuthenticationHashAlg() != null) {
            _hashCode += getCertificateAuthenticationHashAlg().hashCode();
        }
        if (getCertificateAuthenticationChallengeSize() != null) {
            _hashCode += getCertificateAuthenticationChallengeSize().hashCode();
        }
        if (getMaxCertsPerUser() != null) {
            _hashCode += getMaxCertsPerUser().hashCode();
        }
        if (getAutoDeleteUserCerts() != null) {
            _hashCode += getAutoDeleteUserCerts().hashCode();
        }
        if (getDisableCertificateChallengeRetention() != null) {
            _hashCode += getDisableCertificateChallengeRetention().hashCode();
        }
        if (getCertificateChallengeLifetime() != null) {
            _hashCode += getCertificateChallengeLifetime().hashCode();
        }
        if (getUpdateLockoutForReplacedCertificateChallenge() != null) {
            _hashCode += getUpdateLockoutForReplacedCertificateChallenge().hashCode();
        }
        if (getAllowAllSmartCredentialDefinitions() != null) {
            _hashCode += getAllowAllSmartCredentialDefinitions().hashCode();
        }
        if (getAddAllowedSmartCredentialDefinitions() != null) {
            _hashCode += getAddAllowedSmartCredentialDefinitions().hashCode();
        }
        if (getRemoveAllowedSmartCredentialDefinitions() != null) {
            _hashCode += getRemoveAllowedSmartCredentialDefinitions().hashCode();
        }
        if (getAllowedSmartCredentialDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedSmartCredentialDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedSmartCredentialDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxSmartCredentialsPerUser() != null) {
            _hashCode += getMaxSmartCredentialsPerUser().hashCode();
        }
        if (getSmartCredentialIDPrefix() != null) {
            _hashCode += getSmartCredentialIDPrefix().hashCode();
        }
        if (getSmartCredentialTokenVendor() != null) {
            _hashCode += getSmartCredentialTokenVendor().hashCode();
        }
        if (getAutoUnassignSmartCredentials() != null) {
            _hashCode += getAutoUnassignSmartCredentials().hashCode();
        }
        if (getAutoMoveSmartCredentials() != null) {
            _hashCode += getAutoMoveSmartCredentials().hashCode();
        }
        if (getAutoRegisterSmartCredentialsToPACS() != null) {
            _hashCode += getAutoRegisterSmartCredentialsToPACS().hashCode();
        }
        if (getAutoSuspendSmartCredentialsFromPACS() != null) {
            _hashCode += getAutoSuspendSmartCredentialsFromPACS().hashCode();
        }
        if (getAllowSoftwareSmartCredentials() != null) {
            _hashCode += getAllowSoftwareSmartCredentials().hashCode();
        }
        if (getAllowAllDigitalIdConfigs() != null) {
            _hashCode += getAllowAllDigitalIdConfigs().hashCode();
        }
        if (getAddAllowedDigitalIdConfigs() != null) {
            _hashCode += getAddAllowedDigitalIdConfigs().hashCode();
        }
        if (getRemoveAllowedDigitalIdConfigs() != null) {
            _hashCode += getRemoveAllowedDigitalIdConfigs().hashCode();
        }
        if (getAllowedDigitalIdConfigs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedDigitalIdConfigs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedDigitalIdConfigs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxDigitalIdsPerUser() != null) {
            _hashCode += getMaxDigitalIdsPerUser().hashCode();
        }
        if (getMaxClientTypesPerDigitalId() != null) {
            _hashCode += getMaxClientTypesPerDigitalId().hashCode();
        }
        if (getAutoCancelDigitalIds() != null) {
            _hashCode += getAutoCancelDigitalIds().hashCode();
        }
        if (getUserRegistrationPasswordLifetime() != null) {
            _hashCode += getUserRegistrationPasswordLifetime().hashCode();
        }
        if (getMaxFederationsPerUser() != null) {
            _hashCode += getMaxFederationsPerUser().hashCode();
        }
        if (getMaxNumUserPreferences() != null) {
            _hashCode += getMaxNumUserPreferences().hashCode();
        }
        if (getMaxSizeUserPreference() != null) {
            _hashCode += getMaxSizeUserPreference().hashCode();
        }
        if (getPVNLength() != null) {
            _hashCode += getPVNLength().hashCode();
        }
        if (getPVNChangeRequiredOnAdminReset() != null) {
            _hashCode += getPVNChangeRequiredOnAdminReset().hashCode();
        }
        if (getAuthTypesRequiringPVN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthTypesRequiringPVN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthTypesRequiringPVN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumDaysForActivation() != null) {
            _hashCode += getNumDaysForActivation().hashCode();
        }
        if (getActivationAuthTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivationAuthTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivationAuthTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCheckIPAddressInLocationHistory() != null) {
            _hashCode += getCheckIPAddressInLocationHistory().hashCode();
        }
        if (getMaxLocationHistorySize() != null) {
            _hashCode += getMaxLocationHistorySize().hashCode();
        }
        if (getLocationHistoryLifetime() != null) {
            _hashCode += getLocationHistoryLifetime().hashCode();
        }
        if (getMaxVelocity() != null) {
            _hashCode += getMaxVelocity().hashCode();
        }
        if (getCheckVelocity() != null) {
            _hashCode += getCheckVelocity().hashCode();
        }
        if (getCountryBlacklist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryBlacklist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryBlacklist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddCountryBlacklist() != null) {
            _hashCode += getAddCountryBlacklist().hashCode();
        }
        if (getRemoveCountryBlacklist() != null) {
            _hashCode += getRemoveCountryBlacklist().hashCode();
        }
        if (getExpectedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddExpectedLocations() != null) {
            _hashCode += getAddExpectedLocations().hashCode();
        }
        if (getRemoveExpectedLocations() != null) {
            _hashCode += getRemoveExpectedLocations().hashCode();
        }
        if (getMaxUserExpectedLocationsSize() != null) {
            _hashCode += getMaxUserExpectedLocationsSize().hashCode();
        }
        if (getNormalRejectAdd() != null) {
            _hashCode += getNormalRejectAdd().hashCode();
        }
        if (getNormalRejectRemove() != null) {
            _hashCode += getNormalRejectRemove().hashCode();
        }
        if (getNormalReject() != null) {
            _hashCode += getNormalReject().hashCode();
        }
        if (getNormalAuthenticatedAdd() != null) {
            _hashCode += getNormalAuthenticatedAdd().hashCode();
        }
        if (getNormalAuthenticatedRemove() != null) {
            _hashCode += getNormalAuthenticatedRemove().hashCode();
        }
        if (getNormalAuthenticated() != null) {
            _hashCode += getNormalAuthenticated().hashCode();
        }
        if (getEnhancedRejectAdd() != null) {
            _hashCode += getEnhancedRejectAdd().hashCode();
        }
        if (getEnhancedRejectRemove() != null) {
            _hashCode += getEnhancedRejectRemove().hashCode();
        }
        if (getEnhancedReject() != null) {
            _hashCode += getEnhancedReject().hashCode();
        }
        if (getEnhancedAuthenticatedAdd() != null) {
            _hashCode += getEnhancedAuthenticatedAdd().hashCode();
        }
        if (getEnhancedAuthenticatedRemove() != null) {
            _hashCode += getEnhancedAuthenticatedRemove().hashCode();
        }
        if (getEnhancedAuthenticated() != null) {
            _hashCode += getEnhancedAuthenticated().hashCode();
        }
        if (getExternalRiskScorePass() != null) {
            _hashCode += getExternalRiskScorePass().hashCode();
        }
        if (getExternalRiskScoreFail() != null) {
            _hashCode += getExternalRiskScoreFail().hashCode();
        }
        if (getPerformTransactionDelivery() != null) {
            _hashCode += getPerformTransactionDelivery().hashCode();
        }
        if (getSoftTokenPINRequired() != null) {
            _hashCode += getSoftTokenPINRequired().hashCode();
        }
        if (getSoftTokenOTPLength() != null) {
            _hashCode += getSoftTokenOTPLength().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSpecParms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "UserSpecParms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAliases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxContactInfoNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxContactInfoNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxGlobalFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxGlobalFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCertificateFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCertificateFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxExternalFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxExternalFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxGridFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxGridFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTokenCRFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTokenCRFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTokenROFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTokenROFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxOTPFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxOTPFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPasswordFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPasswordFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQAFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQAFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRBAIPAuthFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRBAIPAuthFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRBAMachineAuthFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRBAMachineAuthFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRBACertificateAuthFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRBACertificateAuthFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockoutTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lockoutTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSecretSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxSecretSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSecretNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxSecretNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedGenericAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedGenericAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineAuthType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineAuthType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authTypeCanViewSecrets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authTypeCanViewSecrets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authTypeCanModifySecrets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authTypeCanModifySecrets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMachineSecrets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxMachineSecrets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMachineSecretsSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxMachineSecretsSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSecretRequiresMachineNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineSecretRequiresMachineNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSecretRequiresSequenceNonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineSecretRequiresSequenceNonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSecretRequiresAppData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineSecretRequiresAppData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSecretAllowsBadAppData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineSecretAllowsBadAppData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machineSecretLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machineSecretLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedMachineAuthIncrementsLockout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedMachineAuthIncrementsLockout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAuthSecrets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAuthSecrets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAuthSecretsSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAuthSecretsSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuestions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQuestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQASize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQASize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QAChallengeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QAChallengeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minQAChallengeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minQAChallengeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQAChallengeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQAChallengeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableQAChallengeRetention");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableQAChallengeRetention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QAChallengeLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QAChallengeLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateLockoutForReplacedQAChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateLockoutForReplacedQAChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qaDefaultWrongAnswersAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qaDefaultWrongAnswersAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qaMaximumWrongAnswersAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qaMaximumWrongAnswersAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qaInexactMatchAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qaInexactMatchAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPCellAlphabet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPCellAlphabet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPCellReplacements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPCellReplacements"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "CellReplacement"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPDeliveryEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPDeliveryEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPAlwaysGenerate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPAlwaysGenerate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPDynamicRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPDynamicRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPNumberOutstanding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPNumberOutstanding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTPRefreshThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTPRefreshThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAuthSecretWithChall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReturnAuthSecretWithChall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoUnassignTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoUnassignTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoMoveTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoMoveTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableTokenChallengeRetention");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableTokenChallengeRetention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenChallengeLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenChallengeLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateLockoutForReplacedTokenChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateLockoutForReplacedTokenChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAllowedTokenSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAllowedTokenSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNONEAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowNONEAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considerTempPINLast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConsiderTempPINLast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeLastAuthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storeLastAuthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreateIfDisabledInRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowCreateIfDisabledInRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreateIfExpiredInRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowCreateIfExpiredInRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAuthIfDisabledInRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowAuthIfDisabledInRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAuthIfExpiredInRepository");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowAuthIfExpiredInRepository"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSignatureType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionSignatureType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumTransactionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxNumTransactionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSelfSignedUserCert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowSelfSignedUserCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCertNotIssuedByRegisteredCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowCertNotIssuedByRegisteredCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllRegisteredCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowAllRegisteredCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAllowedRegisteredCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddAllowedRegisteredCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllowedRegisteredCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveAllowedRegisteredCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedRegisteredCAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedRegisteredCAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateAuthenticationHashAlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertificateAuthenticationHashAlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateAuthenticationChallengeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertificateAuthenticationChallengeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCertsPerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxCertsPerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoDeleteUserCerts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoDeleteUserCerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableCertificateChallengeRetention");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableCertificateChallengeRetention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateChallengeLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateChallengeLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateLockoutForReplacedCertificateChallenge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updateLockoutForReplacedCertificateChallenge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllSmartCredentialDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowAllSmartCredentialDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAllowedSmartCredentialDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddAllowedSmartCredentialDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllowedSmartCredentialDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveAllowedSmartCredentialDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedSmartCredentialDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedSmartCredentialDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSmartCredentialsPerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxSmartCredentialsPerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialIDPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialIDPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCredentialTokenVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCredentialTokenVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoUnassignSmartCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoUnassignSmartCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoMoveSmartCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoMoveSmartCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRegisterSmartCredentialsToPACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoRegisterSmartCredentialsToPACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSuspendSmartCredentialsFromPACS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoSuspendSmartCredentialsFromPACS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowSoftwareSmartCredentials");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowSoftwareSmartCredentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllDigitalIdConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowAllDigitalIdConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAllowedDigitalIdConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddAllowedDigitalIdConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAllowedDigitalIdConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RemoveAllowedDigitalIdConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedDigitalIdConfigs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedDigitalIdConfigs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDigitalIdsPerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxDigitalIdsPerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxClientTypesPerDigitalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxClientTypesPerDigitalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCancelDigitalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoCancelDigitalIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRegistrationPasswordLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserRegistrationPasswordLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFederationsPerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxFederationsPerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumUserPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxNumUserPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSizeUserPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxSizeUserPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVNLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVNLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PVNChangeRequiredOnAdminReset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PVNChangeRequiredOnAdminReset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authTypesRequiringPVN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authTypesRequiringPVN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDaysForActivation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numDaysForActivation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationAuthTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActivationAuthTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:commonV8", "AuthenticationType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkIPAddressInLocationHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkIPAddressInLocationHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLocationHistorySize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxLocationHistorySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationHistoryLifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationHistoryLifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVelocity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxVelocity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkVelocity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkVelocity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryBlacklist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryBlacklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCountryBlacklist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addCountryBlacklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeCountryBlacklist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeCountryBlacklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expectedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "ExpectedLocation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addExpectedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addExpectedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeExpectedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removeExpectedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxUserExpectedLocationsSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxUserExpectedLocationsSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalRejectAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalRejectAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalRejectRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalRejectRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalReject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalReject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RBAExpressionList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalAuthenticatedAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalAuthenticatedAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalAuthenticatedRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalAuthenticatedRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalAuthenticated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalAuthenticated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RBAExpressionList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedRejectAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedRejectAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedRejectRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedRejectRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedReject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedReject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RBAExpressionList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedAuthenticatedAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedAuthenticatedAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedAuthenticatedRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedAuthenticatedRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedAuthenticated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedAuthenticated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:entrust.com:ig:adminV8:wsdl", "RBAExpressionList"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRiskScorePass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalRiskScorePass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRiskScoreFail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExternalRiskScoreFail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performTransactionDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PerformTransactionDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softTokenPINRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftTokenPINRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softTokenOTPLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftTokenOTPLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
