
package hsenidmobile.sdp.test.ws;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "getIpAddressResponse", namespace = "http://ws.mkyong.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIpAddressResponse", namespace = "http://ws.mkyong.com/")
public class GetIpAddessResponse {

    @XmlElement(name = "Result", namespace = "")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
