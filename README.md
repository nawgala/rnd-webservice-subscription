# ReadMe

### Environment 

+ Maven 2.2.1
+ java 1.6 


### How to build 

    mvn clean install

### How to generate xsd and wsdl
    Build the project and execute following
    wsgen -verbose -keep -cp /path/to/subscription-x.x.jar hsenidmobile.sdp.ws.subscription.SubscriptionService  -wsdl
    
    
### References
    http://www.mkyong.com/webservices/jax-ws/jax-ws-wsgen-tool-example/?utm_source=mkyong&utm_medium=author&utm_campaign=related-post&utm_content=3
    
    JAX-WS + Spring integration example
    http://www.mkyong.com/webservices/jax-ws/jax-ws-spring-integration-example/
    
    JAX-WS + Java Web Application Integration Example
    http://www.mkyong.com/webservices/jax-ws/jax-ws-java-web-application-integration-example/
    
    
    
    
    