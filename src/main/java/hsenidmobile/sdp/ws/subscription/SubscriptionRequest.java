package hsenidmobile.sdp.ws.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by sampath on 2/8/18.
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class SubscriptionRequest {

    @XmlElement(name = "MSISDN", required = true)
    private String msisdn;

    @XmlElement(name = "SiteId", required = true)
    private String siteId;

    @XmlElement(name = "PackNam", required = true)
    private String packName;

    @XmlElement(name = "EffectiveDate", required = false)
    private String effectiveDate;

    @XmlElement(name = "ExtTrxId", required = true)
    private String externalTrxId;


    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExternalTrxId() {
        return externalTrxId;
    }

    public void setExternalTrxId(String externalTrxId) {
        this.externalTrxId = externalTrxId;
    }
}
