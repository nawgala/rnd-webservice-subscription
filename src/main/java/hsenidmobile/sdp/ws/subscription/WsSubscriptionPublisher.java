package hsenidmobile.sdp.ws.subscription;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class WsSubscriptionPublisher {

    public static void main(String[] args) {
        String url = "http://localhost:8888/subscription/service";
        Endpoint.publish(url, new SubscriptionServiceImpl());

        System.out.println("Service is published! " + url + " ");
    }

}