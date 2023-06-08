# AWS LAMBDA IMPLEMENTATION WITH JAVA
This project shows a Java implementation representing an AWS Lambda function. The project is based on Dan Vega's [video on Spring Functions](https://www.youtube.com/watch?v=bxK4GscuVgs).

> Please notice that this project does NOT use Spring framework

## Overview
A _Lambda_ function is a unit of code that implements a single computational task. For instance, a CRUD application could be implemented as a set of four _Lambda_ functions - one for each CRUD task.

This project requires the `com.amazonaws.aws-lambda-java-core` library, which give access to the `com.amazonaws.services.lambda.runtime.RequestHandler` interface. This interface is key to accessing input and output values.

The code snippet below summarises the project:

```java
public class SimpleHandler 
    implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("JDK version: " + System.getProperty("java.version"));
        
        return input.toUpperCase();
    }
    
}
```

## Deploy
As Mr Vega shows in the video, you still need to create a _Lambda_ function using the AWS console to deploying the code in this project.
