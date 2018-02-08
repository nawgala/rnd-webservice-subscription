package hsenidmobile.sdp.ws.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;

/**
 * Created by sampath on 2/8/18.
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Application {

    @XmlElement(name = "ApplicationId", required = true)
    private String applicationId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
