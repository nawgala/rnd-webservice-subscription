package hsenidmobile.sdp.ws.subscription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by sampath on 2/8/18.
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Auth {

    @XmlElement(name = "Password", required = true)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
