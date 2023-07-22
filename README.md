# AWS LAMBDA IMPLEMENTATION WITH JAVA
This project shows a Java implementation representing an AWS Lambda function. 

> This branch extends the [original project](https://github.com/gabrielcostasilva/aws-lambda-java.git) by introducing [AWS core library](https://docs.aws.amazon.com/lambda/latest/dg/lambda-java.html), that gives access to the Context object.

## Overview
This project requires the `com.amazonaws.aws-lambda-java-core` library, which give access to the `com.amazonaws.services.lambda.runtime.RequestHandler` interface and the `Context` object. The `Context` object gives access to function's metadata.

The code snippet below uses the `Context` object to log the current Java version to CloudWatch.

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
Please check out the main project for instructions on deploying this project.