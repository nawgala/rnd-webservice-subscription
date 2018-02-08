package hsenidmobile.sdp.ws.subscription;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by sampath on 2/8/18.
 */
@WebService
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    @WebMethod(operationName = "SendEligibilityRequest")
    @WebResult(name = "SubscriberEligibilityResponseElement")
    public EligibilityResponse isEligible(@WebParam(header = true, name = "RequestHeaderElement")  RequestHeader header,
                                   @WebParam(name = "EligibilityRequestElement") EligibilityRequest request) {        EligibilityResponse response = new EligibilityResponse();
        response.setStatusCode("S1000");
        response.setStatusDescription("Success");
        response.setExternalTrxId("1286234618482464");
        response.setTransactionId("1273475007304815");
        return response;
    }


    @Override
    @WebMethod(operationName = "SendSubscriptionRequest")
    @WebResult(name = "SubscriberPackResponseElement")
    public SubscriptionResponse subscribe(@WebParam(header = true,
            name = "RequestHeaderElement") RequestHeader header, @WebParam(name = "SubscriptionRequestElement") SubscriptionRequest request) {
        SubscriptionResponse response = new SubscriptionResponse();
        response.setStatusCode("S1000");
        response.setStatusDescription("Success");
        response.setExternalTrxId("1286234618482464");
        response.setTransactionId("1273475007304815");
        return response;
    }
}
