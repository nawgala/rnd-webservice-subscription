package hsenidmobile.sdp.ws.subscription;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class SubscriptionService {

    @WebMethod(operationName = "SendEligibilityRequest")
    @WebResult(name = "SubscriberEligibilityResponseElement")
    public EligibilityResponse isEligible(@WebParam(header = true, name = "RequestHeaderElement")  RequestHeader header,
                                          @WebParam(header = false, name = "EligibilityRequestElement") EligibilityRequest request) {
        EligibilityResponse response = new EligibilityResponse();
        response.setStatusCode("S1000");
        response.setStatusDescription("Success");
        response.setExternalTrxId("1286234618482464");
        response.setTransactionId("1273475007304815");
        return response;
    }


    @WebMethod(operationName = "SendSubscriptionRequest")
    @WebResult(name = "SubscriberPackResponseElement")
    public SubscriptionResponse subscribe(@WebParam(header = true,
            name = "RequestHeaderElement") RequestHeader header, @WebParam(header = false, name = "SubscriptionRequestElement") SubscriptionRequest request) {
        SubscriptionResponse response = new SubscriptionResponse();
        response.setStatusCode("S1000");
        response.setStatusDescription("Success");
        response.setExternalTrxId("1286234618482464");
        response.setTransactionId("1273475007304815");
        return response;
    }
}
