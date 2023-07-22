# AWS LAMBDA IMPLEMENTATION WITH JAVA
This project shows a minimal Java implementation for a AWS Lambda function. 

## Other Branches

This original project is extended in other branches, as follows:

- [`core-library`](https://github.com/gabrielcostasilva/aws-lambda-java/tree/core-library) shows benefits of using AWS core library when implementing your functions.
- [`custom-types`](https://github.com/gabrielcostasilva/aws-lambda-java/tree/custom-types) creates custom types to handle messages.
- [`sam`](https://github.com/gabrielcostasilva/aws-lambda-java/tree/sam) uses AWS SAM to simplify deployment.

## Overview
A _Lambda_ function is a unit of code that implements a single computational task. For instance, a CRUD application could be implemented as a set of four _Lambda_ functions - one for each CRUD task.

This project does not rely on any external dependency. It basically sets a method that reads and returns a `String`, like so:

```java
package com.example.sblambda;

public class SimpleHandler {

    public String handleRequest(String input) {
        return input.toUpperCase();
    }
    
}
```

AWS Lambda hand out requests to the `handleRequest` method. 

## Deploy & Test
You need to create a Lambda function using the AWS Lambda console, CLI or any other tool, like SAM. Then you package your code (`mvn package`), and deploy it. Please check out [reference links in this repository](https://github.com/gabrielcostasilva/aws-lambda-java-playground.git) you need assistance with this process.

> Do not forget to set the handler to this particular class.
