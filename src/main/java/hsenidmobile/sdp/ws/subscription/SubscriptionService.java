package hsenidmobile.sdp.ws.subscription;

public interface SubscriptionService {

    EligibilityResponse isEligible(RequestHeader header, EligibilityRequest request) ;

    SubscriptionResponse subscribe(RequestHeader header, SubscriptionRequest request);
}
