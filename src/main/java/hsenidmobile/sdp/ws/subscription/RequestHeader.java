package hsenidmobile.sdp.ws.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by sampath on 2/8/18.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestHeader {

    @XmlElement(name = "Auth", required = true)
    private Auth auth;

    @XmlElement(name = "Application", required = true)
    private Application application;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
