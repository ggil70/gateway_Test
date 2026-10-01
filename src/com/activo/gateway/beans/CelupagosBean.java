package com.activo.gateway.beans;

/**
 *
 * @author P018364128
 */
public class CelupagosBean {
    private String reference = " ";
    private double current;
    private double expired;
    private double total;
    private String contractId = " ";
    private String contractType = " ";
    private String owner = " ";
    private String documentNumber = " ";
    private double rent;
    private double Importe;
    private double importPerContDay;
    private String errorCode = " ";
    private String message = " ";
    private String referenciab = " ";
    private String statusCode;
    private String error;
    
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getExpired() {
        return expired;
    }

    public void setExpired(double expired) {
        this.expired = expired;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double importe) {
        this.Importe = importe;
    }

    public double getImportPerContDay() {
        return importPerContDay;
    }

    public void setImportPerContDay(double importPerContDay) {
        this.importPerContDay = importPerContDay;
    }
    
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReferenciab() {
        return referenciab;
    }

    public void setReferenciab(String referenciab) {
        this.referenciab = referenciab;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
