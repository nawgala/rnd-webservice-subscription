# ReadMe

### Environment 

+ Maven 2.2.1
+ java 1.6 


### How to build 

    mvn clean install

### How to generate xsd and wsdl
    Build the project and execute following
    wsgen -verbose -keep -cp /path/to/subscription-x.x.jar hsenidmobile.sdp.ws.subscription.SubscriptionService  -wsdl