# ReadMe

### Environment 

+ Maven 2.2.1
+ java 1.6 


### How to build 

    mvn clean install

### How to generate xsd and wsdl
    Build the project and execute following
    wsgen -verbose -keep -cp  /home/sampath/project/rnd/webservice/rnd-webservice-subscription/target/subscription-1.0.0-SNAPSHOT.jar hsenidmobile.sdp.ws.subscription.SubscriptionServiceImpl -wsdl
    
### References
    http://www.mkyong.com/webservices/jax-ws/jax-ws-wsgen-tool-example/?utm_source=mkyong&utm_medium=author&utm_campaign=related-post&utm_content=3
    
    JAX-WS + Spring integration example
    http://www.mkyong.com/webservices/jax-ws/jax-ws-spring-integration-example/
    
    JAX-WS + Java Web Application Integration Example
    http://www.mkyong.com/webservices/jax-ws/jax-ws-java-web-application-integration-example/
    
    
    
    
    