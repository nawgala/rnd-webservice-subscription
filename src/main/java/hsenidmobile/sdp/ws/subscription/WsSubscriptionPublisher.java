package hsenidmobile.sdp.ws.subscription;

import hsenidmobile.sdp.test.ServerInfo;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class WsSubscriptionPublisher {
 
	public static void main(String[] args) {
		String url = "http://localhost:8888/subscription/service";
		Endpoint.publish(url, new SubscriptionService());
	   
	   System.out.println("Service is published! " + url + " ");
    }
 
}