# AWS LAMBDA IMPLEMENTATION WITH JAVA - CUSTOM TYPES
This project shows a Java implementation representing an AWS Lambda function. 

> This branch extends the [original project](https://github.com/gabrielcostasilva/aws-lambda-java.git) by wrapping content into custom types.

## Overview
This project covers scenarios that need custom types, like `Customer` or `Product`.

AWS Lambda automatically serialises and deserialises JSON into/from custom types. All you need is to use your custom types with your handler, like so: 

```java
(...)

public Output handleRequest(Input input) {
        return new Output(input.getMessage().toUpperCase());
}

(...)
```

`Input` and `Output` are custom types created to handle messages. Both objects are represented by the following JSON object:

```json
{
    "message": "Hello World!"
}
```

## Deploy
Please check out the main project for instructions on deploying this project.