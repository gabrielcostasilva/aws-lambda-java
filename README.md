# AWS LAMBDA IMPLEMENTATION WITH JAVA - TESTING
This project shows a Java implementation representing an AWS Lambda function. 

> This branch extends the [original project](https://github.com/gabrielcostasilva/aws-lambda-java.git) by exploring testing solutions.

## Overview
An AWS Lambda function is just a method in a class. Therefore, typical testing solutions work just fine - which includes [JUnit](https://junit.org) and [Mockito](https://site.mockito.org).

> Check out [this repository](https://github.com/gabrielcostasilva/sb-testing.git) for getting started testing with Spring Boot.

Therefore, a simple test could be as follows:

```java
@Test
public void test() {

    var handler = new SimpleHandler();
    assertNotNull(handler);

    assertEquals(
        "HELLO WORLD", 
        handler
            .handleRequest(new Input("hello world"))
            .getMessage());

}
```
> Of course, you need to add [JUnit as a dependency](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.3) to your [POM.xml](./pom.xml).

## How to Test the Lambda Function
JUnit and Mockito are useful to test business rules and workflows, but to test the Lambda function itself you would need to deploy the function and use the Lambda console.

Luckily, AWS SAM enables testing a Lambda function without the need for deployment.

> Check out [this repository](https://github.com/gabrielcostasilva/aws-lambda-java/tree/sam) if you are new to SAM.

First, run `sam build`. 

Then, run: `echo "{\"message\": \"hello\"}" | sam local invoke SimpleHandlerFunction -e -`

You should receive something like so:

```
Reading invoke payload from stdin (you can also pass it from file with --event)                                   
Invoking com.example.sblambda.SimpleHandler::handleRequest (java17)                                               
Local image was not found.                                                                                        
Removing rapid images for repo public.ecr.aws/sam/emulation-java17                                                
Building image...................................................................................................................................................................
Using local image: public.ecr.aws/lambda/java:17-rapid-arm64.                                                     
                                                                                                                  
Mounting /Users/gabriel/Downloads/aws-lambda-java/.aws-sam/build/SimpleHandlerFunction as /var/task:ro,delegated, 
inside runtime container                                                                                          
START RequestId: b77b5702-c8af-45e7-b05a-edcd61f1bbc2 Version: $LATEST
{"message":"HELLO"}END RequestId: f2cb0b29-a42f-4f35-ad29-7ed8f33c3fe7
REPORT RequestId: f2cb0b29-a42f-4f35-ad29-7ed8f33c3fe7	Init Duration: 0.03 ms	Duration: 147.97 ms	Billed Duration: 148 ms	Memory Size: 512 MB	Max Memory Used: 512 MB	
```

> SAM local requires Docker installed and running!

## Further References
- [Testing Functions](https://docs.aws.amazon.com/lambda/latest/dg/testing-guide.html) is the official AWS Lambda documentation section on testing.