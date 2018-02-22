package hsenidmobile.sdp.ws.subscription;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by sampath on 2/8/18.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EligibilityResponse {

    @XmlElement(name = "StatusCode")
    private String statusCode;

    @XmlElement(name = "StatusDescription")
    private String statusDescription;

    @XmlElement(name = "Ext_Trx_ID")
    private String externalTrxId;

    @XmlElement(name = "TransactionId")
    private String transactionId;

    @XmlElement(name = "EligibilityStatus")
    private String eligibilityStatus;

    public String getEligibilityStatus() {
        return eligibilityStatus;
    }

    public void setEligibilityStatus(String eligibilityStatus) {
        this.eligibilityStatus = eligibilityStatus;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setExternalTrxId(String externalTrxId) {
        this.externalTrxId = externalTrxId;
    }

    public String getExternalTrxId() {
        return externalTrxId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
