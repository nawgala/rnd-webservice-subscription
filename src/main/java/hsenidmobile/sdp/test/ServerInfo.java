package hsenidmobile.sdp.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Hello world!
 */
@WebService
public class ServerInfo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @WebMethod
    public String getIpAddress() {

        return "10.10.10.10";

    }
}
